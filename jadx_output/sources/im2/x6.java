package im2;

/* loaded from: classes3.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.n f292612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.aa f292613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(km2.n nVar, com.tencent.mm.plugin.finder.live.viewmodel.aa aaVar) {
        super(0);
        this.f292612d = nVar;
        this.f292613e = aaVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "FinderProductTraceUIC save lastGMsgId");
        com.tencent.mm.plugin.finder.live.viewmodel.aa aaVar = this.f292613e;
        java.lang.String str = aaVar.f116906d;
        km2.n nVar = this.f292612d;
        nVar.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        nVar.f309162n = str;
        nVar.f309163o = aaVar.f116907e;
        return jz5.f0.f302826a;
    }
}
