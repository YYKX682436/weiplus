package com.tencent.paymars.sdt;

/* loaded from: classes12.dex */
public class SdtManagerCallback implements com.tencent.paymars.sdt.SdtManager.CallBack {
    private static final java.lang.String TAG = "MicroMsg.SdtManagerCallback";

    @Override // com.tencent.paymars.sdt.SdtManager.CallBack
    public void reportSignalDetectResults(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "reportSignalDetectResults");
    }
}
