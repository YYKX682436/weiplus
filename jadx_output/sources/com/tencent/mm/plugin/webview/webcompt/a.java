package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f187737a = new java.util.HashMap();

    public static final java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            return host == null ? "unknow" : host;
        } catch (java.lang.Exception unused) {
            return "unknow";
        }
    }

    public static final int b(com.tencent.mm.plugin.appbrand.appcache.u3 u3Var) {
        kotlin.jvm.internal.o.g(u3Var, "<this>");
        java.util.HashMap hashMap = f187737a;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(u3Var.b());
        if (num == null) {
            num = java.lang.Integer.valueOf(new cl0.g(com.tencent.mm.plugin.appbrand.appcache.v3.a(u3Var, "/meta.json")).optInt("version"));
            int intValue = num.intValue();
            java.lang.String b17 = u3Var.b();
            kotlin.jvm.internal.o.f(b17, "getPkgPath(...)");
            hashMap.put(b17, java.lang.Integer.valueOf(intValue));
            com.tencent.mars.xlog.Log.i("pkgVersion", "getPkgVersion pkgPath=" + u3Var.b() + ", pkgVersion=" + intValue);
        }
        return num.intValue();
    }

    public static final java.lang.String c(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return "'" + u46.k.a(str) + '\'';
    }
}
