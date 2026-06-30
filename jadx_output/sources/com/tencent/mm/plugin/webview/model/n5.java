package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public abstract class n5 {
    public static java.lang.String a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKConstants", "genLocalIdByFilePath, file path is ：%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("weixin://resourceid/");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKConstants", "gen local id by filepath, filepath : %s, localid : %s", str, sb7);
        return sb7;
    }
}
