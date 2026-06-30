package zx5;

/* loaded from: classes13.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f477250a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f477251b = new java.util.ArrayList();

    public static synchronized void a(android.content.Context context) {
        synchronized (zx5.n.class) {
            if (f477250a) {
                return;
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    org.xwalk.core.XWalkEnvironment.b(context).registerReceiver(new zx5.m(null), new android.content.IntentFilter("com.tencent.xweb.update"), 4);
                } else {
                    org.xwalk.core.XWalkEnvironment.b(context).registerReceiver(new zx5.m(null), new android.content.IntentFilter("com.tencent.xweb.update"));
                }
                f477250a = true;
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebBroadcastListenerManager", "init, registerReceiver error", th6);
            }
        }
    }

    public static synchronized void b(android.content.Context context, zx5.a aVar) {
        synchronized (zx5.n.class) {
            a(context);
            if (aVar == null) {
                return;
            }
            java.util.List list = f477251b;
            if (((java.util.ArrayList) list).contains(aVar)) {
                return;
            }
            by5.c4.f("XWebBroadcastListenerManager", "registerListener, listener: " + aVar);
            ((java.util.ArrayList) list).add(aVar);
        }
    }
}
