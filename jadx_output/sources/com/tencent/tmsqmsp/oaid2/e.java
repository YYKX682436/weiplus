package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static android.content.Context f215577a;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String packageName;
        if (context == null) {
            return "";
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null && !android.text.TextUtils.isEmpty(applicationInfo.packageName)) {
                packageName = applicationInfo.packageName;
            } else {
                packageName = b().getPackageName();
            }
            return packageName;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static android.content.Context b() {
        android.content.Context context;
        synchronized (com.tencent.tmsqmsp.oaid2.e.class) {
            if (f215577a == null) {
                f215577a = c();
            }
            context = f215577a;
        }
        return context;
    }

    public static android.content.Context c() {
        try {
            return (android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static boolean a() {
        return (android.text.TextUtils.isEmpty(a("ro.build.version.emui")) && android.text.TextUtils.isEmpty(a("hw_sc.build.platform.version"))) ? false : true;
    }

    public static java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getDeclaredMethod("get", java.lang.String.class).invoke(null, str);
        } catch (java.lang.Throwable unused) {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }
}
