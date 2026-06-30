package tv2;

/* loaded from: classes10.dex */
public final class x extends pv2.n {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f422349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, int i17) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f422349e = finderObj;
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422349e;
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 18L, 1L);
        if (isLongVideo) {
            g0Var.C(1523L, 18L, 1L);
        }
        mv2.f0 f0Var = mv2.f0.f331561a;
        pm0.v.X(new mv2.v(finderItem.getLocalId(), false));
    }
}
