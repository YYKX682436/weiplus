package hm4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final hm4.c f282293a = new hm4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f282294b;

    /* renamed from: c, reason: collision with root package name */
    public static w71.m1 f282295c;

    static {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        copyOnWriteArraySet.add(new hm4.b());
        f282294b = copyOnWriteArraySet;
        f70.e eVar = (f70.e) i95.n0.c(f70.e.class);
        em4.a aVar = new em4.a();
        ((h70.a) eVar).getClass();
        w71.l1.f443418a.add(aVar);
        ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).Ai();
    }

    public final w71.m1 a() {
        if (f282295c == null) {
            w71.m1 wi6 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reddotSyncManager: ");
            sb6.append(wi6 != null ? java.lang.Integer.valueOf(wi6.hashCode()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingSyncExtension", sb6.toString());
            f282295c = wi6;
        }
        return f282295c;
    }

    public final boolean b() {
        ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).getClass();
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingDiscoverRedDotSyncDisable()) == 1;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "disableTingDiscoverEntryRedDotSync");
        }
        if (!z17) {
            return ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi();
        }
        w71.m1 a17 = a();
        if (a17 != null) {
            urgen.ur_C563.UR_379F.UR_434A(((w71.n1) a17).getCppPointer(), 10);
        }
        return false;
    }
}
