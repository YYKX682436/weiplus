package y45;

/* loaded from: classes12.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.HandlerThread f459392a = new android.os.HandlerThread("RecoveryWorker");

    /* renamed from: b, reason: collision with root package name */
    public static boolean f459393b = false;

    /* renamed from: c, reason: collision with root package name */
    public static android.os.Handler f459394c;

    public static android.os.Handler a() {
        synchronized (y45.u.class) {
            if (!f459393b) {
                f459393b = true;
                android.os.HandlerThread handlerThread = f459392a;
                handlerThread.start();
                f459394c = new android.os.Handler(handlerThread.getLooper());
            }
        }
        return f459394c;
    }
}
