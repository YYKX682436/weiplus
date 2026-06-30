package yw;

/* loaded from: classes11.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.l0 f466389a = new yw.l0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f466390b = true;

    public final com.tencent.wechat.mm.biz.g1 a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration");
        f466390b = false;
        java.util.List<com.tencent.mm.storage.s1> d17 = r01.q3.nj().d1(285212721, 100);
        if (d17.isEmpty()) {
            f466390b = true;
            jx3.f.INSTANCE.w(1971L, 23L, 1L);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration infoList is empty");
            com.tencent.wechat.mm.biz.g1 g1Var = com.tencent.wechat.mm.biz.g1.f218065i;
            kotlin.jvm.internal.o.f(g1Var, "getDefaultInstance(...)");
            return g1Var;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) d17;
        long j17 = (((com.tencent.mm.storage.s1) linkedList.get(0)).field_orderFlag & (-4294967296L)) >> 32;
        com.tencent.wechat.mm.biz.g1 g1Var2 = new com.tencent.wechat.mm.biz.g1();
        for (com.tencent.mm.storage.s1 s1Var : d17) {
            if (s1Var.v0()) {
                g1Var2.f218066d.add(yw.q3.f466437a.a(s1Var, ((s1Var.field_orderFlag & (-4294967296L)) >> 32) == j17));
                g1Var2.f218070h[1] = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration size = " + linkedList.size());
        f466390b = true;
        return g1Var2;
    }
}
