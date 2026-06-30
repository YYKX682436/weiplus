package com.tencent.paymars.mm;

/* loaded from: classes12.dex */
public class AppManagerCallback implements com.tencent.paymars.app.AppManager.CallBack {
    private static final java.lang.String TAG = "AppCallBack";
    private android.content.Context context;
    com.tencent.paymars.app.AppManager.DeviceInfo info = new com.tencent.paymars.app.AppManager.DeviceInfo(o45.wf.f343026d, wo.q.f447780a);

    public AppManagerCallback(android.content.Context context) {
        this.context = null;
        this.context = context;
    }

    private static java.lang.String exception2String(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.tencent.paymars.app.AppManager.CallBack
    public com.tencent.paymars.app.AppManager.AccountInfo getAccountInfo() {
        com.tencent.paymars.app.AppManager.AccountInfo accountInfo = new com.tencent.paymars.app.AppManager.AccountInfo();
        if (com.tencent.mm.network.x2.c() != null && com.tencent.mm.network.x2.c().f71993n != null) {
            try {
                accountInfo.uin = com.tencent.mm.network.x2.c().f71993n.f71902o;
                java.lang.String str = com.tencent.mm.network.x2.c().f71993n.f71906s;
                accountInfo.userName = str;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    accountInfo.userName = com.tencent.mm.network.x2.c().f71993n.f71895e;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return accountInfo;
    }

    @Override // com.tencent.paymars.app.AppManager.CallBack
    public java.lang.String getAppFilePath() {
        if (this.context == null) {
            com.tencent.paymars.mm.Assert.assertTrue(false);
            return null;
        }
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.context.getFilesDir().getPath() + "/pay");
            if (!r6Var.m()) {
                r6Var.J();
            }
            return r6Var.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.paymars.mm.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return "";
        }
    }

    @Override // com.tencent.paymars.app.AppManager.CallBack
    public java.lang.String getClientConfig(java.lang.String str, java.lang.String str2) {
        return j62.e.g().j(str, str2, true, true);
    }

    @Override // com.tencent.paymars.app.AppManager.CallBack
    public int getClientVersion() {
        return o45.wf.f343029g;
    }

    @Override // com.tencent.paymars.app.AppManager.CallBack
    public com.tencent.paymars.app.AppManager.DeviceInfo getDeviceType() {
        return this.info;
    }
}
