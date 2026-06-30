package ir2;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f294178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f294179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.o f294180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, ir2.o oVar) {
        super(1);
        this.f294178d = baseFinderFeed;
        this.f294179e = z17;
        this.f294180f = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List dataList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        int i17 = 0;
        for (java.lang.Object obj2 : dataList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj2;
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                long localId = baseFinderFeed.getFeedObject().getLocalId();
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f294178d;
                if (localId == baseFinderFeed2.getFeedObject().getLocalId()) {
                    baseFinderFeed2.V1(baseFinderFeed.getShowLikeTips());
                    baseFinderFeed2.X1(baseFinderFeed.getShowShareSns());
                    if (this.f294179e) {
                        com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "updateByLocalId " + baseFinderFeed2.getFeedObject().getLocalId());
                        ir2.o oVar = this.f294180f;
                        oVar.getClass();
                        oVar.f(i17, 1, 1, baseFinderFeed2);
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
