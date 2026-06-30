package wx5;

/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f450589a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f450590b = new java.util.ArrayList();

    public static synchronized void a(android.content.Context context) {
        synchronized (wx5.e.class) {
            if (f450589a) {
                return;
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    org.xwalk.core.XWalkEnvironment.b(context).registerReceiver(new wx5.d(null), new android.content.IntentFilter("com.tencent.xweb.remotedebug"), 4);
                } else {
                    org.xwalk.core.XWalkEnvironment.b(context).registerReceiver(new wx5.d(null), new android.content.IntentFilter("com.tencent.xweb.remotedebug"));
                }
                f450589a = true;
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebRemoteDebugBroadcastManager", "init, registerReceiver error", th6);
            }
        }
    }

    public static synchronized void b(android.content.Context context, wx5.a aVar) {
        synchronized (wx5.e.class) {
            a(context);
            if (aVar == null) {
                return;
            }
            java.util.List list = f450590b;
            if (((java.util.ArrayList) list).contains(aVar)) {
                return;
            }
            by5.c4.f("XWebRemoteDebugBroadcastManager", "registerListener, listener: " + aVar);
            ((java.util.ArrayList) list).add(aVar);
        }
    }
}
