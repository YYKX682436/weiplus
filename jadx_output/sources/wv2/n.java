package wv2;

/* loaded from: classes10.dex */
public final class n extends pv2.n {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f450032e;

    /* renamed from: f, reason: collision with root package name */
    public final int f450033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, int i17) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f450032e = finderObj;
        this.f450033f = i17;
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        int i17 = this.f450033f;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f450032e;
        if (i17 != 1) {
            boolean isLongVideo = finderItem.isLongVideo();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1253L, 18L, 1L);
            if (isLongVideo) {
                g0Var.C(1523L, 18L, 1L);
            }
        }
        mv2.f0 f0Var = mv2.f0.f331561a;
        pm0.v.X(new mv2.v(finderItem.getLocalId(), false));
    }
}
