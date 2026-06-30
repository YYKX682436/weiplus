package sc1;

/* loaded from: classes10.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f405697a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f405698b;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f405698b = null;
    }

    public static void a() {
        if (f405697a) {
            return;
        }
        com.tencent.live2.V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig = new com.tencent.live2.V2TXLiveDef.V2TXLiveLogConfig();
        v2TXLiveLogConfig.enableObserver = true;
        v2TXLiveLogConfig.logLevel = 1;
        v2TXLiveLogConfig.enableConsole = false;
        v2TXLiveLogConfig.enableLogFile = false;
        com.tencent.live2.V2TXLivePremier.setLogConfig(v2TXLiveLogConfig);
        com.tencent.live2.V2TXLivePremier.setObserver(new sc1.l1());
        java.util.List list = f405698b;
        if (list == null || list.isEmpty()) {
            f405698b = null;
        } else {
            java.util.Iterator it = f405698b.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            f405698b.clear();
            f405698b = null;
        }
        f405697a = true;
    }
}
