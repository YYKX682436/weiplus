package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes3.dex */
public final class y3 {
    public y3(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (android.os.Build.VERSION.SDK_INT > 28) {
            try {
                java.lang.Object invoke = java.lang.Class.forName("android.view.WindowManagerGlobal").getMethod("getWindowManagerService", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                java.lang.Class<?> cls = invoke.getClass();
                java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
                kotlin.jvm.internal.o.d(cls2);
                java.lang.Object invoke2 = cls.getMethod("hasNavigationBar", cls2).invoke(invoke, context.getClass().getMethod("getDisplayId", new java.lang.Class[0]).invoke(context, new java.lang.Object[0]));
                kotlin.jvm.internal.o.e(invoke2, "null cannot be cast to non-null type kotlin.Boolean");
                return ((java.lang.Boolean) invoke2).booleanValue();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewBottomNavigatorHelper", "checkDeviceHasNavigationBar Q ex:%s", th6.getMessage());
            }
        } else {
            try {
                java.lang.Object invoke3 = java.lang.Class.forName("android.view.WindowManagerGlobal").getMethod("getWindowManagerService", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                java.lang.Object invoke4 = invoke3.getClass().getMethod("hasNavigationBar", new java.lang.Class[0]).invoke(invoke3, new java.lang.Object[0]);
                kotlin.jvm.internal.o.e(invoke4, "null cannot be cast to non-null type kotlin.Boolean");
                return ((java.lang.Boolean) invoke4).booleanValue();
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewBottomNavigatorHelper", "checkDeviceHasNavigationBar ex:%s", th7.getMessage());
            }
        }
        return false;
    }

    public final boolean b(android.content.Context context) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", com.eclipsesource.mmv8.Platform.ANDROID);
        boolean z17 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.Object invoke = cls.getMethod("get", java.lang.String.class).invoke(cls, "qemu.hw.mainkeys");
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.String");
            str = (java.lang.String) invoke;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewBottomNavigatorHelper", "hasNavigationBar ex:%s", th6.getMessage());
        }
        if (kotlin.jvm.internal.o.b("1", str)) {
            return false;
        }
        if (kotlin.jvm.internal.o.b("0", str)) {
            return true;
        }
        return z17;
    }
}
