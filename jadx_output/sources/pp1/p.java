package pp1;

/* loaded from: classes14.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView f357434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f357435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pp1.z zVar, com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView, com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        super(0);
        this.f357433d = zVar;
        this.f357434e = contentFloatBallRecyclerView;
        this.f357435f = contentFloatBallView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pp1.z zVar = this.f357433d;
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f357434e;
        zVar.f357446d = contentFloatBallRecyclerView;
        if (contentFloatBallRecyclerView != null) {
            contentFloatBallRecyclerView.setClipChildren(false);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView2 = zVar.f357446d;
        if (contentFloatBallRecyclerView2 != null) {
            contentFloatBallRecyclerView2.setClipToPadding(false);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView3 = zVar.f357446d;
        jz5.g gVar = zVar.f357459t;
        if (contentFloatBallRecyclerView3 != null) {
            contentFloatBallRecyclerView3.setAdapter((xm3.t0) ((jz5.n) gVar).getValue());
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView4 = zVar.f357446d;
        if (contentFloatBallRecyclerView4 != null) {
            contentFloatBallRecyclerView4.setLayoutManager(zVar.f());
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView5 = zVar.f357446d;
        if (contentFloatBallRecyclerView5 != null) {
            contentFloatBallRecyclerView5.setItemViewCacheSize(5);
        }
        ((xm3.t0) ((jz5.n) gVar).getValue()).B = (pp1.w) ((jz5.n) zVar.f357461v).getValue();
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView6 = zVar.f357446d;
        if (contentFloatBallRecyclerView6 != null) {
            contentFloatBallRecyclerView6.setClickable(true);
        }
        zVar.f357448f = this.f357435f;
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView7 = zVar.f357446d;
        if (contentFloatBallRecyclerView7 != null) {
            contentFloatBallRecyclerView7.setOverScrollHorizontallyListener(new pp1.r(zVar));
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView8 = zVar.f357446d;
        if (contentFloatBallRecyclerView8 != null) {
            contentFloatBallRecyclerView8.setChildDrawingOrderCallback(new pp1.q(zVar));
        }
        return jz5.f0.f302826a;
    }
}
