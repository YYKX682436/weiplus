package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public abstract class a {
    public static final boolean a(android.content.Context context) {
        try {
            return ik1.b.a(context, "com.tencent.mobileqq") != null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQQSupportShare(), e : %s.", e17.getMessage());
            return false;
        }
    }

    public static final boolean b(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageInfo a17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        try {
            a17 = ik1.b.a(context, "com.tencent.weread");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQzoneSupportShare(), e : %s.", e17.getMessage());
        }
        if (a17 != null && android.net.Uri.parse(str).getHost().startsWith(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9))) {
            return a17.versionCode > 2000812;
        }
        return false;
    }
}
