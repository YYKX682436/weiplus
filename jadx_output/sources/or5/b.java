package or5;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f347703a;

    static {
        int i17;
        int i18 = 7;
        int i19 = 6;
        while (true) {
            int i27 = i19;
            i17 = i18;
            i18 = i27;
            if (i18 < 2 || !android.util.Log.isLoggable("HTTPDNS", i18)) {
                break;
            } else {
                i19 = i18 - 1;
            }
        }
        f347703a = i17;
    }

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        c(3, null, str, objArr);
    }

    public static void b(java.lang.String str, java.lang.Object... objArr) {
        c(6, null, str, objArr);
    }

    public static void c(int i17, java.lang.Throwable th6, java.lang.String str, java.lang.Object... objArr) {
        try {
            if (i17 >= f347703a) {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, str, objArr);
                java.util.Iterator it = ((java.util.ArrayList) or5.d.f347704a).iterator();
                while (it.hasNext()) {
                    ((or5.c) it.next()).a(i17, "HTTPDNS", format, th6);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        c(2, null, str, objArr);
    }

    public static void e(java.lang.String str, java.lang.Object... objArr) {
        c(5, null, str, objArr);
    }
}
