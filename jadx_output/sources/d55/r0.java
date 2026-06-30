package d55;

/* loaded from: classes12.dex */
public class r0 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile d55.r0 f226613d;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f226614a;

    /* renamed from: b, reason: collision with root package name */
    public d55.k0 f226615b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f226616c = new java.util.HashMap();

    public static d55.r0 a() {
        if (f226613d == null) {
            synchronized (d55.r0.class) {
                if (f226613d == null) {
                    f226613d = new d55.r0();
                }
            }
        }
        return f226613d;
    }

    public static boolean d(android.content.Context context) {
        try {
            if (!new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "Weixin/recovery_quit").exists()) {
                return false;
            }
            d55.o0.a(5, "MicroMsg.recovery", "skip recovery for quit flag");
            return true;
        } catch (java.lang.Exception e17) {
            d55.o0.a(5, "MicroMsg.recovery", "check recovery quit flag err: " + e17.getMessage());
            return false;
        }
    }

    public android.content.Context b() {
        if (this.f226614a == null) {
            if (d55.l0.f226599a == null) {
                android.app.Application application = null;
                try {
                    try {
                        java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.AppGlobals").getDeclaredMethod("getInitialApplication", new java.lang.Class[0]);
                        declaredMethod.setAccessible(true);
                        application = (android.app.Application) declaredMethod.invoke(null, new java.lang.Object[0]);
                    } catch (java.lang.Exception unused) {
                    }
                } catch (java.lang.Exception unused2) {
                    java.lang.reflect.Method declaredMethod2 = java.lang.Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new java.lang.Class[0]);
                    declaredMethod2.setAccessible(true);
                    application = (android.app.Application) declaredMethod2.invoke(null, new java.lang.Object[0]);
                }
                d55.l0.f226599a = application;
            }
            android.content.Context applicationContext = d55.l0.f226599a.getApplicationContext();
            this.f226614a = applicationContext;
            if (applicationContext == null) {
                throw new java.lang.RuntimeException("Context should not be null");
            }
        }
        return this.f226614a;
    }

    public void c(int i17) {
        if (!d55.n0.c(b(), "")) {
            d55.o0.a(4, "MicroMsg.recovery", "not main proc, skip");
            return;
        }
        d55.k0 k0Var = this.f226615b;
        if (k0Var instanceof d55.j0) {
            ((d55.j0) k0Var).j(i17);
            return;
        }
        if (!(k0Var instanceof d55.d0)) {
            new d55.j0(b()).j(i17);
            return;
        }
        d55.d0 d0Var = (d55.d0) k0Var;
        synchronized (d0Var) {
            if (d0Var.f226580t == null) {
                d0Var.f226580t = d0Var.k();
            }
            d0Var.f226580t.j(i17);
        }
    }

    public void e(java.lang.String str, d55.s sVar) {
        java.util.Map map = this.f226616c;
        try {
            if (!((java.util.HashMap) map).containsKey(str)) {
                sVar.a();
                ((java.util.HashMap) map).put(str, sVar);
            } else {
                throw new java.lang.IllegalArgumentException(str + " has been registered! target = " + ((java.util.HashMap) map).get(str));
            }
        } catch (java.lang.Throwable th6) {
            d55.q0.a("MicroMsg.recovery", "register actions fail", th6);
        }
    }

    public void f() {
        d55.k0 k0Var = this.f226615b;
        if (k0Var != null) {
            d55.d0 d0Var = (d55.d0) k0Var;
            synchronized (d0Var) {
                d55.g0 g0Var = d0Var.f226579s;
                if (g0Var != null) {
                    g0Var.k();
                }
            }
        }
    }
}
