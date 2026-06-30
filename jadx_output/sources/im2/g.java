package im2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig2.r f292334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC f292335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment f292336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ig2.r rVar, com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment finderLiveVisitorFragment) {
        super(0);
        this.f292334d = rVar;
        this.f292335e = finderLiveExitAnimateOpUIC;
        this.f292336f = finderLiveVisitorFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kn0.i iVar;
        boolean z17 = this.f292334d instanceof ig2.i;
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f292335e;
        if (z17) {
            com.tencent.mm.autogen.events.FinderSquareLiveViewLayoutEvent finderSquareLiveViewLayoutEvent = new com.tencent.mm.autogen.events.FinderSquareLiveViewLayoutEvent();
            finderSquareLiveViewLayoutEvent.f54325g.f6552a = finderLiveExitAnimateOpUIC.f116985h;
            finderSquareLiveViewLayoutEvent.e();
        }
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        kn0.g gVar = (e1Var == null || (iVar = e1Var.f328990t) == null) ? null : iVar.f309558b;
        if (gVar != null && gVar.f309545l == 1) {
            co0.s u07 = efVar.u0();
            hn0.r rVar = u07 != null ? u07.R1 : null;
            if (rVar != null) {
                je2.z zVar = (je2.z) efVar.i(je2.z.class);
                rVar.b(zVar != null ? zVar.P6() : null);
            }
            com.tencent.mars.xlog.Log.i(finderLiveExitAnimateOpUIC.f116981d, "onDirectorExit need reSwitch to video");
        }
        com.tencent.mars.xlog.Log.i(finderLiveExitAnimateOpUIC.f116981d, "onDirectorExit start finish");
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment fragment = this.f292336f;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        ok2.a Q6 = ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).Q6();
        if (Q6 != null) {
            um2.x5 x5Var = (um2.x5) Q6;
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(x5Var.f19605b)) {
                x5Var.f429049k1 = true;
            }
        }
        finderLiveExitAnimateOpUIC.P6("onDirectorExit");
        return jz5.f0.f302826a;
    }
}
