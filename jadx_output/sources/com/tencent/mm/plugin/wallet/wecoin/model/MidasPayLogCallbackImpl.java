package com.tencent.mm.plugin.wallet.wecoin.model;

/* loaded from: classes8.dex */
public class MidasPayLogCallbackImpl implements com.tencent.midas.api.IMidasLogCallback {
    private static final int LOG_LEVEL_DEBUG = 2;
    private static final int LOG_LEVEL_ERROR = 5;
    private static final int LOG_LEVEL_INFO = 3;
    private static final int LOG_LEVEL_VERBOSE = 1;
    private static final int LOG_LEVEL_WARN = 4;
    private static final java.lang.String TAG = "MicroMsg.MidasPayLogCallbackImpl";

    @Override // com.tencent.midas.api.IMidasLogCallback
    public void onLogging(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i(TAG, "tag:%s msg:%s", str, str2);
        } else if (i17 == 4) {
            com.tencent.mars.xlog.Log.w(TAG, "tag:%s msg:%s", str, str2);
        } else {
            if (i17 != 5) {
                return;
            }
            com.tencent.mars.xlog.Log.e(TAG, "tag:%s msg:%s", str, str2);
        }
    }
}
