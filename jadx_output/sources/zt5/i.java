package zt5;

/* loaded from: classes9.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static zt5.e f475602a;

    public static void a(int i17, java.lang.String str) {
        if (f475602a != null) {
            zt5.h.c("Soter.SReporter", "reporter errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), str);
            ((re4.e0) f475602a).a(i17, str);
        }
    }

    public static void b(int i17, java.lang.String str, java.lang.Exception exc) {
        if (f475602a != null) {
            zt5.h.c("Soter.SReporter", "reporter errCode:%s errMsg:%s exception:%s", java.lang.Integer.valueOf(i17), str, exc.getMessage());
            ((re4.e0) f475602a).a(i17, str + " Exception: " + android.util.Log.getStackTraceString(exc));
        }
    }
}
