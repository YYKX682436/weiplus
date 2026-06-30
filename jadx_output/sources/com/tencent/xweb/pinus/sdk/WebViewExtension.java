package com.tencent.xweb.pinus.sdk;

/* loaded from: classes8.dex */
public class WebViewExtension {
    private static final java.lang.String TAG = "WebViewExtension";

    public static int getHostByName(java.lang.String str, java.util.List<java.lang.String> list) {
        by5.t0 t0Var = org.xwalk.core.XWalkEnvironment.f347982o;
        if (t0Var == null) {
            return 0;
        }
        java.lang.Object a17 = t0Var.a("getHostByName", str, list);
        if (a17 instanceof java.lang.Integer) {
            return ((java.lang.Integer) a17).intValue();
        }
        return 0;
    }

    public static int getHostByNameFromHttp(java.lang.String str, java.util.List<java.lang.String> list) {
        by5.t0 t0Var = org.xwalk.core.XWalkEnvironment.f347982o;
        if (t0Var == null) {
            return 0;
        }
        java.lang.Object a17 = t0Var.a("getHostByNameFromHttp", str, list);
        if (a17 instanceof java.lang.Integer) {
            return ((java.lang.Integer) a17).intValue();
        }
        return 0;
    }

    public static int getHostByNameFromSimple(java.lang.String str, java.util.List<java.lang.String> list) {
        by5.t0 t0Var = org.xwalk.core.XWalkEnvironment.f347982o;
        if (t0Var == null) {
            return 0;
        }
        java.lang.Object a17 = t0Var.a("getHostByNameFromSimple", str, list);
        if (a17 instanceof java.lang.Integer) {
            return ((java.lang.Integer) a17).intValue();
        }
        return 0;
    }

    public static java.lang.Object onMiscCallBack(java.lang.String str, java.lang.Object... objArr) {
        by5.t0 t0Var = org.xwalk.core.XWalkEnvironment.f347982o;
        if (t0Var != null) {
            return t0Var.a(str, objArr);
        }
        return null;
    }
}
