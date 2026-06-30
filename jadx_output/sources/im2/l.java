package im2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC f292419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ng2.g f292420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ig2.n f292421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment f292422g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, ng2.g gVar, ig2.n nVar, com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment finderLiveVisitorFragment) {
        super(0);
        this.f292419d = finderLiveExitAnimateOpUIC;
        this.f292420e = gVar;
        this.f292421f = nVar;
        this.f292422g = finderLiveVisitorFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar;
        co0.s liveCore;
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f292419d;
        java.lang.String str = finderLiveExitAnimateOpUIC.f116981d;
        ng2.g gVar = this.f292420e;
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment fragment = this.f292422g;
        if (fragment != null) {
            ig2.n nVar = this.f292421f;
            if (nVar.f291409h != null) {
                ok2.a Q6 = ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).Q6();
                fo0.n nVar2 = (Q6 == null || (cVar = ((um2.x5) Q6).f19606c) == null || (liveCore = cVar.getLiveCore()) == null) ? null : liveCore.f420767p;
                if (nVar2 != null) {
                    android.view.View view = nVar2.f264827n;
                    if (view instanceof mo0.a) {
                        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.live.core.view.FluentSwitchRelativeLayout");
                        mo0.a aVar = (mo0.a) view;
                        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = new com.tencent.rtmp.ui.TXCloudVideoView(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        aVar.addView(tXCloudVideoView);
                        mn0.b0 b0Var = nVar.f291409h;
                        if (b0Var != null) {
                            ((mn0.y) b0Var).Q(0);
                        }
                        mn0.b0 b0Var2 = nVar.f291409h;
                        if (b0Var2 != null) {
                            mn0.b0.B(b0Var2, tXCloudVideoView, null, 2, null);
                        }
                        com.tencent.mars.xlog.Log.i(str, "attachToWindow visibility : " + aVar.getVisibility() + ", player:" + nVar.f291409h);
                        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                        aVar.setNotifyVisibilityFunction(new im2.c(finderLiveExitAnimateOpUIC, c0Var, gVar, aVar));
                        pm0.v.V(150L, new im2.d(finderLiveExitAnimateOpUIC, c0Var, gVar));
                        kotlin.jvm.internal.o.g(fragment, "fragment");
                        ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).U6();
                        ig2.m.f291397e = true;
                        finderLiveExitAnimateOpUIC.P6("onWindowExit");
                        return jz5.f0.f302826a;
                    }
                }
                gVar.a();
                ig2.m.f291393a.d();
                kotlin.jvm.internal.o.g(fragment, "fragment");
                ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).U6();
                ig2.m.f291397e = true;
                finderLiveExitAnimateOpUIC.P6("onWindowExit");
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.e(str, "start attachToWindow data = null");
        gVar.a();
        ig2.m.f291393a.d();
        kotlin.jvm.internal.o.g(fragment, "fragment");
        ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).U6();
        ig2.m.f291397e = true;
        finderLiveExitAnimateOpUIC.P6("onWindowExit");
        return jz5.f0.f302826a;
    }
}
