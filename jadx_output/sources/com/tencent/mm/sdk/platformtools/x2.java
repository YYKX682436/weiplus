package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.Context f193071a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f193072b = "com.tencent.mm";

    /* renamed from: c, reason: collision with root package name */
    public static boolean f193073c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f193074d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile android.content.res.Resources f193075e;

    /* renamed from: f, reason: collision with root package name */
    public static android.app.ActivityManager f193076f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f193077g;

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f193078h = {-1};

    public static int a(int i17) {
        return b3.l.getColor(f193071a, i17);
    }

    public static android.content.Context b() {
        return f193071a;
    }

    public static java.lang.String c() {
        return f193072b + "_debugEnv";
    }

    public static android.content.SharedPreferences d() {
        android.content.Context context = f193071a;
        if (context != null) {
            return context.getSharedPreferences(e(), 0);
        }
        return null;
    }

    public static java.lang.String e() {
        return f193072b + "_preferences";
    }

    public static java.lang.String f() {
        return f193072b;
    }

    public static java.lang.String g(int i17) {
        return f193075e.getString(i17);
    }

    public static java.lang.String h(int i17, java.lang.Object... objArr) {
        return f193075e.getString(i17, objArr);
    }

    public static android.content.SharedPreferences i() {
        android.content.Context context = f193071a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(f193072b + "_preferences_tools", 0);
    }

    public static boolean j() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f193072b;
        }
        return a17.startsWith(f193072b + ":appbrand");
    }

    public static boolean k() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f193072b;
        }
        return (f193072b + ":exdevice").equalsIgnoreCase(a17);
    }

    public static boolean l() {
        int[] iArr = f193078h;
        if (iArr[0] == -1) {
            synchronized (iArr) {
                if (iArr[0] == -1) {
                    iArr[0] = new java.io.File(f193071a.getFilesDir(), ".launched").exists() ? 0 : 1;
                }
            }
        }
        return iArr[0] == 1;
    }

    public static boolean m() {
        return o(f193072b);
    }

    public static boolean n() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f193072b;
        }
        return f193072b.equals(a17);
    }

    public static boolean o(java.lang.String str) {
        android.content.Context context = f193071a;
        if (context != null && f193072b != null) {
            if (f193076f == null) {
                f193076f = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            }
            try {
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = f193076f.getRunningAppProcesses().iterator();
                while (it.hasNext()) {
                    if (it.next().processName.equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (java.lang.Error e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMApplicationContext", "isMMProcessExist Error: " + e17.toString());
                return false;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMApplicationContext", "isMMProcessExist Exception: " + e18.toString());
            }
        }
        return false;
    }

    public static boolean p() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f193072b;
        }
        return (f193072b + ":push").equalsIgnoreCase(a17);
    }

    public static boolean q() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f193072b;
        }
        return (f193072b + ":sandbox").equalsIgnoreCase(a17);
    }

    public static boolean r() {
        java.lang.String a17 = bm5.f1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMApplicationContext", "isToolsIsolatedProcess, processName:" + a17);
        if (a17 == null || a17.length() == 0) {
            a17 = f193072b;
        }
        if (!(f193072b + ":isolated_process0").equalsIgnoreCase(a17)) {
            if (!(f193072b + ":isolated_process1").equalsIgnoreCase(a17)) {
                if (!(f193072b + ":isolated_process2").equalsIgnoreCase(a17)) {
                    if (!a17.contains(f193072b + ":xweb_sandboxed_process")) {
                        if (!a17.contains(f193072b + ":xweb_sandboxed_process_ex")) {
                            if (!a17.contains(f193072b + ":xweb_privileged_process")) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean s() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            a17 = f193072b;
        }
        return (f193072b + ":tools").equalsIgnoreCase(a17);
    }

    public static void t() {
        boolean z17;
        int[] iArr = f193078h;
        synchronized (iArr) {
            int i17 = iArr[0];
            z17 = true;
            if (i17 != -1) {
                z17 = i17 == 1;
            }
        }
        if (z17) {
            java.io.File file = new java.io.File(f193071a.getFilesDir(), ".launched");
            if (file.exists()) {
                return;
            }
            try {
                file.createNewFile();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void u(android.content.Context context) {
        f193071a = context;
        f193072b = context.getPackageName();
        if (context instanceof android.app.Application) {
            android.app.Application application = (android.app.Application) context;
            synchronized (com.tencent.mm.sdk.platformtools.i.class) {
                if (com.tencent.mm.sdk.platformtools.i.f192730a == null) {
                    com.tencent.mm.sdk.platformtools.i.f192730a = application;
                }
            }
        }
        ak0.o.f5543b = context;
    }
}
