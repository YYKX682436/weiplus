package im2;

/* loaded from: classes3.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.aa f292625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.plugin.finder.live.viewmodel.aa aaVar) {
        super(0);
        this.f292625d = aaVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "FinderProductTraceUIC restore lastGMsgId");
        km2.n nVar = dk2.ef.H;
        if (nVar != null) {
            this.f292625d.V6(nVar.f309162n, nVar.f309163o);
        }
        return jz5.f0.f302826a;
    }
}
