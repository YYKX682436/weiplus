package mt5;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final mt5.c f331311a = new mt5.c();

    public static final boolean b() {
        mt5.c cVar = f331311a;
        java.lang.String a17 = cVar.a("ro.build.freeme.label");
        java.lang.String a18 = cVar.a("ro.build.freemeos_label");
        if (!(a17 != null && r26.i0.p(a17, "FreemeOS", true))) {
            if (!(a18 != null && r26.i0.p(a18, "FreemeOS", true))) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String a(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.Object invoke = cls.getMethod("get", java.lang.String.class).invoke(cls, str);
            if (invoke instanceof java.lang.String) {
                return (java.lang.String) invoke;
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
