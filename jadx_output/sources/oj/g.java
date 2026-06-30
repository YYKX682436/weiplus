package oj;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static volatile android.os.HandlerThread f345701a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile android.os.Handler f345702b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile android.os.Handler f345703c = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashSet f345704d = new java.util.HashSet();

    public static android.os.Handler a() {
        if (f345702b == null) {
            b();
        }
        return f345702b;
    }

    public static android.os.HandlerThread b() {
        android.os.HandlerThread handlerThread;
        synchronized (oj.g.class) {
            if (f345701a == null) {
                f345701a = new android.os.HandlerThread("default_matrix_thread");
                f345701a.start();
                f345702b = new android.os.Handler(f345701a.getLooper());
                f345701a.getLooper().setMessageLogging(null);
                oj.j.f("Matrix.HandlerThread", "create default handler thread, we should use these thread normal, isDebug:%s", java.lang.Boolean.FALSE);
            }
            handlerThread = f345701a;
        }
        return handlerThread;
    }

    public static synchronized android.os.HandlerThread c(java.lang.String str, int i17) {
        android.os.HandlerThread handlerThread;
        synchronized (oj.g.class) {
            java.util.Iterator it = f345704d.iterator();
            while (it.hasNext()) {
                if (!((android.os.HandlerThread) it.next()).isAlive()) {
                    it.remove();
                    oj.j.f("Matrix.HandlerThread", "warning: remove dead handler thread with name %s", str);
                }
            }
            handlerThread = new android.os.HandlerThread(str);
            handlerThread.setPriority(i17);
            handlerThread.start();
            java.util.HashSet hashSet = f345704d;
            hashSet.add(handlerThread);
            oj.j.f("Matrix.HandlerThread", "warning: create new handler thread with name %s, alive thread size:%d", str, java.lang.Integer.valueOf(hashSet.size()));
        }
        return handlerThread;
    }
}
