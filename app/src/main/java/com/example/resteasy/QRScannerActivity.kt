package com.example.resteasy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.ResultPoint
import com.journeyapps.barcodescanner.BarcodeCallback
import com.journeyapps.barcodescanner.BarcodeResult
import com.journeyapps.barcodescanner.DecoratedBarcodeView
import kotlin.math.log


class QRScannerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_scanner)
        val barcodeView : DecoratedBarcodeView = findViewById (R.id.view_scanner);
        barcodeView.setStatusText("");
        barcodeView.decodeContinuous(callback);
    }

    private val callback: BarcodeCallback = object : BarcodeCallback {
        override fun barcodeResult(result: BarcodeResult) {
            val resultString = result.text
            Log.d("QR SCanner", "barcodeResult: $resultString")
        }

        override fun possibleResultPoints(resultPoints: List<ResultPoint>) {}
    }

}