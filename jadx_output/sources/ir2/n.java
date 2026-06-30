package ir2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.o f294184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f294185e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ir2.o oVar, long j17) {
        super(0);
        this.f294184d = oVar;
        this.f294185e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ir2.o oVar = this.f294184d;
        int i17 = 0;
        for (java.lang.Object obj : oVar.f294188d.f294091d) {
            int i18 = i17 + 1;
            so2.j5 j5Var = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var2 = (so2.j5) obj;
            if (j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2;
                long localId = baseFinderFeed.getFeedObject().getLocalId();
                long j17 = this.f294185e;
                if (localId == j17) {
                    com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(j17);
                    if (f17 != null) {
                        boolean showLikeTips = baseFinderFeed.getShowLikeTips();
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed e17 = oVar.e(f17);
                        e17.V1(showLikeTips);
                        e17.X1(baseFinderFeed.getShowShareSns());
                        j5Var = e17;
                    }
                    com.tencent.mars.xlog.Log.i("Finder.DefaultLoaderActions", "updateProgressByLoalId " + baseFinderFeed.getFeedObject().getLocalId());
                    oVar.f(i17, 1, new jz5.l(2, 1), j5Var);
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
