package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class s1 implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.core.q1 f181972a = new com.tencent.mm.plugin.webview.core.q1(null);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f181973b = jz5.h.b(com.tencent.mm.plugin.webview.core.p1.f181906d);

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        com.tencent.mm.plugin.webview.core.q1 q1Var = f181972a;
        if (!q1Var.a()) {
            return false;
        }
        java.util.Iterator a17 = strArr != null ? kotlin.jvm.internal.c.a(strArr) : null;
        if (!kotlin.jvm.internal.o.b(a17 != null ? (java.lang.String) ((kotlin.jvm.internal.b) a17).next() : null, "//webview")) {
            return false;
        }
        java.lang.String lowerCase = ((java.lang.String) ((kotlin.jvm.internal.b) a17).next()).toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -2001485438:
                if (!lowerCase.equals("debugmanifest") || strArr.length <= 2) {
                    return false;
                }
                if (kotlin.jvm.internal.o.b(strArr[2], "null")) {
                    com.tencent.mm.plugin.webview.core.t1.a().remove("DebugManifest");
                } else {
                    com.tencent.mm.plugin.webview.core.t1.a().putString("DebugManifest", strArr[2]);
                }
                return true;
            case -1938441725:
                if (!lowerCase.equals("opensnapoauth") || strArr.length <= 2) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().putInt("openSnapOauth", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
                return true;
            case -1825077803:
                if (!lowerCase.equals("debugpatch") || strArr.length <= 2) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().putInt("debugPatchEnable", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
                return true;
            case -1820984396:
                if (!lowerCase.equals("debugtoast") || strArr.length <= 2) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().putInt("showDebugToast", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
                return true;
            case -1379409117:
                if (!lowerCase.equals("disablewxjscodecache") || strArr.length <= 2) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().putInt("disablewxjscodecache", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
                return true;
            case -1354815177:
                if (!lowerCase.equals("commit") || strArr.length <= 2) {
                    return false;
                }
                java.lang.String str2 = strArr[2];
                if (kotlin.jvm.internal.o.b(str2, "test")) {
                    com.tencent.mm.plugin.webview.core.t1.a().putBoolean("webview_page_commit_mock", true);
                    if (q1Var.a()) {
                        pm0.v.X(new com.tencent.mm.plugin.webview.core.r1("commit mock enable"));
                        com.tencent.mars.xlog.Log.i("WebViewCommand", "commit mock enable");
                    }
                } else {
                    if (!kotlin.jvm.internal.o.b(str2, "reset")) {
                        return false;
                    }
                    com.tencent.mm.plugin.webview.core.t1.a().putBoolean("webview_page_commit_mock", false);
                    if (q1Var.a()) {
                        pm0.v.X(new com.tencent.mm.plugin.webview.core.r1("commit mock reset"));
                        com.tencent.mars.xlog.Log.i("WebViewCommand", "commit mock reset");
                    }
                }
                return true;
            case -1269849018:
                if (!lowerCase.equals("clearwuid")) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.n1 n1Var = com.tencent.mm.plugin.webview.core.n1.f181891a;
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.webview.core.n1.f181894d).getValue()).W("AdWUID");
                return true;
            case -1102227849:
                if (!lowerCase.equals("debugcookie") || strArr.length <= 2) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().putInt("debugCookie", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
                return true;
            case -851227842:
                if (!lowerCase.equals("debugtransfer") || strArr.length <= 2) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().putInt("debugTransfer", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
                return true;
            case -630973766:
                if (!lowerCase.equals("opensdkopenfacedetect")) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().A("OpenSdkOpenFaceDetect", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 1));
                com.tencent.mm.plugin.webview.core.t1.a();
                return true;
            case -318798133:
                if (!lowerCase.equals("preauth") || strArr.length <= 2) {
                    return false;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = strArr.length;
                for (int i17 = 2; i17 < length; i17++) {
                    java.lang.String str3 = strArr[i17];
                    zq1.i0 i0Var = new zq1.i0();
                    i0Var.f474983a = str3;
                    i0Var.f474985c = ce1.f.CTRL_INDEX;
                    i0Var.f474992j = 10001;
                    arrayList.add(i0Var);
                }
                com.tencent.mars.cdn.CronetLogic.setUserCertVerify(true);
                com.tencent.mm.plugin.webview.core.t1.a().putBoolean("webview_use_a8key_lite_header", true);
                ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
                return true;
            case 1541692090:
                if (!lowerCase.equals("debugip") || strArr.length <= 2) {
                    return false;
                }
                if (kotlin.jvm.internal.o.b(strArr[2], "null")) {
                    com.tencent.mm.plugin.webview.core.t1.a().remove("DebugLocalIP");
                } else {
                    com.tencent.mm.plugin.webview.core.t1.a().putString("DebugLocalIP", strArr[2]);
                }
                return true;
            case 1836011748:
                if (!lowerCase.equals("forcesharecard") || strArr.length <= 2) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().putInt("forcesharecard", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
                return true;
            case 2045106293:
                if (!lowerCase.equals("prefetchpkg") || strArr.length <= 2) {
                    return false;
                }
                com.tencent.mm.plugin.webview.core.t1.a().putInt("prefetchUsePkg", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
                return true;
            case 2111305731:
                if (!lowerCase.equals("debugpatchinfo") || strArr.length <= 2) {
                    return false;
                }
                if (kotlin.jvm.internal.o.b(strArr[2], "null")) {
                    com.tencent.mm.plugin.webview.core.t1.a().putString("debugPatchInfo", "");
                } else {
                    com.tencent.mm.plugin.webview.core.t1.a().putString("debugPatchInfo", strArr[2]);
                }
                return true;
            default:
                return false;
        }
    }
}
