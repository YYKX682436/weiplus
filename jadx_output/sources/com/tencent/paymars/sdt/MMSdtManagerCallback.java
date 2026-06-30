package com.tencent.paymars.sdt;

/* loaded from: classes12.dex */
public class MMSdtManagerCallback implements com.tencent.paymars.sdt.MMSdtManager.CallBack {
    private static final java.lang.String TAG = "MicroMsg.PaySdtManagerCallback";

    @Override // com.tencent.paymars.sdt.MMSdtManager.CallBack
    public void startTraceRoute(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "startTraceRoute");
    }
}
