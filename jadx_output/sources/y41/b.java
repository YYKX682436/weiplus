package y41;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f459341a;

    static {
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("OpenImKefuContactUpdateInterval_Second", 86400);
        if (b17 > 0) {
            f459341a = b17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuConfigManager", "initOpenImKefuConfig configUpdateInterval: " + b17 + ", finalUpdateInterval: " + f459341a);
    }
}
