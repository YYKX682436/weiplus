package xk5;

/* loaded from: classes14.dex */
public abstract class c {
    public static final void a(android.view.Window window, xk5.b styleInfo) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(window, "<this>");
        kotlin.jvm.internal.o.g(styleInfo, "styleInfo");
        new n3.m3(window, window.getDecorView());
        window.setStatusBarColor(styleInfo.f455069c);
        window.setNavigationBarColor(styleInfo.f455070d);
        xk5.a aVar = styleInfo.f455075i;
        if (aVar != null) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getViewRootImpl", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                java.lang.Object invoke = declaredMethod.invoke(window.getDecorView(), new java.lang.Object[0]);
                java.lang.reflect.Field declaredField = invoke.getClass().getDeclaredField("mWindowAttributes");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(invoke);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) obj;
                java.lang.reflect.Field declaredField2 = layoutParams.getClass().getDeclaredField("privateFlags");
                declaredField2.setAccessible(true);
                declaredField2.set(layoutParams, java.lang.Integer.valueOf(aVar.f455065a));
                java.lang.reflect.Field declaredField3 = layoutParams.getClass().getDeclaredField("insetsFlags");
                declaredField3.setAccessible(true);
                java.lang.Object obj2 = declaredField3.get(layoutParams);
                java.lang.reflect.Field declaredField4 = obj2.getClass().getDeclaredField("appearance");
                declaredField4.setAccessible(true);
                declaredField4.set(obj2, java.lang.Integer.valueOf(aVar.f455066b));
            } catch (java.lang.Throwable unused) {
            }
        }
        window.getDecorView().setSystemUiVisibility(styleInfo.f455067a);
        window.setFlags(styleInfo.f455068b, -1);
        if (android.os.Build.VERSION.SDK_INT < 26 || (num = styleInfo.f455074h) == null) {
            return;
        }
        window.setColorMode(num.intValue());
    }

    public static final xk5.b b(android.view.Window window, boolean z17) {
        java.lang.String d17;
        android.view.WindowInsetsController insetsController;
        kotlin.jvm.internal.o.g(window, "<this>");
        try {
            n3.l3 l3Var = new n3.m3(window, window.getDecorView()).f334374a;
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            int i17 = systemUiVisibility & 8192;
            int i18 = android.os.Build.VERSION.SDK_INT;
            java.lang.Integer valueOf = i18 >= 26 ? java.lang.Integer.valueOf(window.getColorMode()) : null;
            int i19 = window.getAttributes().flags;
            int statusBarColor = window.getStatusBarColor();
            int navigationBarColor = window.getNavigationBarColor();
            java.lang.Integer valueOf2 = (i18 < 30 || (insetsController = window.getInsetsController()) == null) ? null : java.lang.Integer.valueOf(insetsController.getSystemBarsAppearance());
            boolean c17 = l3Var.c();
            boolean b17 = l3Var.b();
            xk5.a c18 = c(window);
            if (!com.tencent.mars.xlog.Log.isDebug() && !z17) {
                d17 = null;
                return new xk5.b(systemUiVisibility, i19, statusBarColor, navigationBarColor, valueOf2, c17, b17, valueOf, c18, d17);
            }
            d17 = d(window);
            return new xk5.b(systemUiVisibility, i19, statusBarColor, navigationBarColor, valueOf2, c17, b17, valueOf, c18, d17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WindowStyleInfo", th6, "getStyleInfo err", new java.lang.Object[0]);
            return new xk5.b(0, 0, 0, 0, null, false, false, null, null, null, 1023, null);
        }
    }

    public static final xk5.a c(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "<this>");
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getViewRootImpl", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object invoke = declaredMethod.invoke(window.getDecorView(), new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = invoke.getClass().getDeclaredField("mWindowAttributes");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(invoke);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) obj;
            java.lang.reflect.Field declaredField2 = layoutParams.getClass().getDeclaredField("privateFlags");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(layoutParams);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj2).intValue();
            java.lang.reflect.Field declaredField3 = layoutParams.getClass().getDeclaredField("insetsFlags");
            declaredField3.setAccessible(true);
            java.lang.Object obj3 = declaredField3.get(layoutParams);
            java.lang.reflect.Field declaredField4 = obj3.getClass().getDeclaredField("appearance");
            declaredField4.setAccessible(true);
            java.lang.Object obj4 = declaredField4.get(obj3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
            return new xk5.a(intValue, ((java.lang.Integer) obj4).intValue());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final java.lang.String d(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "<this>");
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("getViewRootImpl", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object invoke = declaredMethod.invoke(window.getDecorView(), new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = invoke.getClass().getDeclaredField("mWindowAttributes");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(invoke);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            return ((android.view.WindowManager.LayoutParams) obj).toString();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
