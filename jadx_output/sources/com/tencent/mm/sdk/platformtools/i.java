package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static android.app.Application f192730a;

    /* renamed from: b, reason: collision with root package name */
    public static android.app.Application f192731b;

    public static synchronized android.app.Application a() {
        synchronized (com.tencent.mm.sdk.platformtools.i.class) {
            android.app.Application application = f192730a;
            if (application != null) {
                return application;
            }
            android.app.Application application2 = f192731b;
            if (application2 != null) {
                return application2;
            }
            android.app.Application b17 = b();
            f192731b = b17;
            if (b17 != null) {
                return b17;
            }
            throw new java.lang.IllegalStateException("Please make sure you do not call Applications#context() before or inside Application#attachBaseContext(Context). If you have to, please call Applications#attach(Application) first.");
        }
    }

    public static android.app.Application b() {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.AppGlobals").getDeclaredMethod("getInitialApplication", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            return (android.app.Application) declaredMethod.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            try {
                java.lang.reflect.Method declaredMethod2 = java.lang.Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new java.lang.Class[0]);
                declaredMethod2.setAccessible(true);
                return (android.app.Application) declaredMethod2.invoke(null, new java.lang.Object[0]);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.sdk.ApplicationGlobal", "get activity thread fail, error = " + e17.getMessage() + " & " + e18.getMessage());
                return null;
            }
        }
    }
}
