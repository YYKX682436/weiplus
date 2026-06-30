package im2;

/* loaded from: classes3.dex */
public final class k extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f292407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp1.v f292408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fo0.n f292409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f292410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment f292411i;

    public k(gp1.v vVar, fo0.n nVar, mn0.b0 b0Var, com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment finderLiveVisitorFragment) {
        this.f292408f = vVar;
        this.f292409g = nVar;
        this.f292410h = b0Var;
        this.f292411i = finderLiveVisitorFragment;
    }

    @Override // ug5.h
    public void a(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.a(animation, performer);
        this.f292407e = true;
        h(performer.f427659b, performer);
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.g(context, performer);
        android.view.View view = this.f292409g.f264827n;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.live.core.view.FluentSwitchRelativeLayout");
        mo0.a aVar = (mo0.a) view;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = new com.tencent.mm.live.core.view.LiveVideoView(context2);
        aVar.addView(liveVideoView);
        mn0.y yVar = (mn0.y) this.f292410h;
        yVar.Q(0);
        yVar.O(liveVideoView, new im2.j(aVar, this, performer));
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment fragment = this.f292411i;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).U6();
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var == null || w0Var.O() == null) {
            return;
        }
        fo0.c cVar = fo0.c.f264798a;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d;
        if (ballInfo != null) {
            performer.f("key_ball_info", ballInfo);
            gp1.v vVar = this.f292408f;
            if (vVar != null) {
                vVar.k(ballInfo, 0.001f);
            }
        }
    }

    public final void h(android.view.View view, ug5.v vVar) {
        gp1.v vVar2;
        java.lang.Object d17 = vVar.d("key_ball_info");
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = d17 instanceof com.tencent.mm.plugin.ball.model.BallInfo ? (com.tencent.mm.plugin.ball.model.BallInfo) d17 : null;
        if (ballInfo != null && (vVar2 = this.f292408f) != null) {
            vVar2.k(ballInfo, 1.0f);
        }
        if (view != null) {
            view.post(new im2.h(vVar));
        } else {
            vVar.b(false);
        }
    }
}
