package gm0;

/* loaded from: classes12.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f273171a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile gm0.b2 f273172b;

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f273172b != null) {
            ((gm0.l1) f273172b).getClass();
            com.tencent.mars.xlog.Log.i(str, str2, objArr);
        }
    }

    public static long b(java.lang.String str) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - f273171a;
        com.tencent.mars.xlog.Log.i("Blink-LOG", "since startup %s : %s", str, java.lang.Long.valueOf(elapsedRealtime));
        java.lang.String.format("since startup %s : %s", str, java.lang.Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }
}
