package k5;

/* loaded from: classes13.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f304147a = a5.a0.e("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f304148b = new java.util.WeakHashMap();

    public static android.os.PowerManager.WakeLock a(android.content.Context context, java.lang.String str) {
        java.lang.String str2 = "WorkManager: " + str;
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        java.util.WeakHashMap weakHashMap = f304148b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
