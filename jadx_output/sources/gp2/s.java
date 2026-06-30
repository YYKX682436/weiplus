package gp2;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f274312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f274313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f274315h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f274316i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f274318n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f274319o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, so2.h1 h1Var, com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView, gp2.l0 l0Var, kotlin.jvm.internal.h0 h0Var, yz5.a aVar, android.view.View view, yz5.a aVar2, yz5.p pVar) {
        super(0);
        this.f274311d = str;
        this.f274312e = h1Var;
        this.f274313f = nearbyLivePreviewView;
        this.f274314g = l0Var;
        this.f274315h = h0Var;
        this.f274316i = aVar;
        this.f274317m = view;
        this.f274318n = aVar2;
        this.f274319o = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String liveUrl = this.f274311d;
        kotlin.jvm.internal.o.f(liveUrl, "$liveUrl");
        so2.h1 h1Var = this.f274312e;
        gp2.a aVar = new gp2.a(liveUrl, h1Var, true);
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f274313f;
        nearbyLivePreviewView.setMediaSource(aVar);
        yz5.a aVar2 = this.f274316i;
        android.view.View view = this.f274317m;
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView2 = this.f274313f;
        gp2.l0 l0Var = this.f274314g;
        so2.h1 h1Var2 = this.f274312e;
        gp2.q qVar = new gp2.q(aVar2, view, nearbyLivePreviewView2, l0Var, h1Var2);
        gp2.p pVar = new gp2.p(this.f274318n, l0Var, h1Var2);
        gp2.r rVar = new gp2.r(this.f274319o, l0Var, h1Var2);
        ig2.h a17 = ig2.m.f291393a.a(h1Var2.getItemId());
        boolean z17 = a17.f291381b;
        nearbyLivePreviewView.setIsReuse(z17);
        if (z17) {
            ig2.j jVar = a17.f291382c;
            mn0.b0 b0Var = jVar != null ? jVar.f291409h : null;
            kotlin.jvm.internal.o.d(b0Var);
            ((mn0.y) b0Var).G(true);
            nearbyLivePreviewView.u(a17, qVar, pVar, rVar);
        } else {
            nearbyLivePreviewView.setMute(true);
            ws5.f.j(this.f274313f, qVar, pVar, rVar, null, null, null, 56, null);
        }
        mn0.b0 player = nearbyLivePreviewView.getPlayer();
        gp2.l0 l0Var2 = this.f274314g;
        if (player != null) {
            ((mn0.y) player).K(l0Var2.f274251j, l0Var2.f274252k);
        }
        ne2.k kVar = (ne2.k) this.f274315h.f310123d;
        if (kVar != null) {
            r45.nw1 liveInfo = h1Var.getFeedObject().getFeedObject().getLiveInfo();
            kVar.c(liveInfo != null ? (r45.td2) liveInfo.getCustom(27) : null);
        }
        com.tencent.mars.xlog.Log.i(l0Var2.t(), "checkAutoPlayByOutside: canReusePlayer:" + z17 + " view:" + nearbyLivePreviewView);
        return jz5.f0.f302826a;
    }
}
