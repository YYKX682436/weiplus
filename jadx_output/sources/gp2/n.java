package gp2;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f274275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f274277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f274278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274279i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.q84 f274280m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f274281n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, so2.j5 j5Var, gp2.l0 l0Var, int i17, com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView, android.view.View view, r45.q84 q84Var, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f274274d = str;
        this.f274275e = j5Var;
        this.f274276f = l0Var;
        this.f274277g = i17;
        this.f274278h = nearbyLivePreviewView;
        this.f274279i = view;
        this.f274280m = q84Var;
        this.f274281n = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        mn0.b0 b0Var;
        mn0.b0 b0Var2;
        java.lang.String liveUrl = this.f274274d;
        kotlin.jvm.internal.o.f(liveUrl, "$liveUrl");
        so2.h1 h1Var = (so2.h1) this.f274275e;
        gp2.l0 l0Var = this.f274276f;
        int i17 = this.f274277g;
        gp2.a aVar = new gp2.a(liveUrl, h1Var, l0Var.A(i17));
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f274278h;
        nearbyLivePreviewView.setMediaSource(aVar);
        android.view.View view = this.f274279i;
        android.widget.FrameLayout frameLayout = view != null ? (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.icp) : null;
        int hashCode = frameLayout != null ? frameLayout.hashCode() : 0;
        java.util.Iterator it = l0Var.A.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            gp2.g gVar = (gp2.g) obj;
            if (gVar.f274220a == i17 && gVar.f274221b == hashCode) {
                break;
            }
        }
        gp2.g gVar2 = (gp2.g) obj;
        boolean z17 = gVar2 != null ? gVar2.f274222c : true;
        gp2.l0 l0Var2 = this.f274276f;
        android.view.View view2 = this.f274279i;
        so2.j5 j5Var = this.f274275e;
        gp2.m mVar = new gp2.m(l0Var2, view2, j5Var, this.f274277g, this.f274278h);
        ig2.h a17 = ig2.m.f291393a.a(((so2.h1) j5Var).getItemId());
        boolean z18 = a17.f291381b;
        nearbyLivePreviewView.setIsReuse(z18);
        ig2.j jVar = a17.f291382c;
        if (z18) {
            if (jVar != null && (b0Var2 = jVar.f291409h) != null) {
                ((mn0.y) b0Var2).G(z17);
            }
            nearbyLivePreviewView.u(a17, mVar, null, null);
        } else {
            if (((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh() && jVar != null && (b0Var = jVar.f291409h) != null) {
                mn0.b0.C(b0Var, false, false, false, 6, null);
            }
            nearbyLivePreviewView.setMute(z17);
            ws5.f.j(this.f274278h, mVar, null, null, null, null, null, 62, null);
        }
        mn0.b0 player = nearbyLivePreviewView.getPlayer();
        if (player != null) {
            ((mn0.y) player).K(l0Var.f274251j, l0Var.f274252k);
        }
        com.tencent.mars.xlog.Log.i(l0Var.t(), "checkAutoPlay canReusePlayer:" + z18 + " view:" + nearbyLivePreviewView + ",previewTimeLimit:" + this.f274280m.getInteger(2));
        ne2.k kVar = (ne2.k) this.f274281n.f310123d;
        if (kVar != null) {
            r45.nw1 liveInfo = h1Var.getFeedObject().getFeedObject().getLiveInfo();
            kVar.c(liveInfo != null ? (r45.td2) liveInfo.getCustom(27) : null);
        }
        com.tencent.mars.xlog.Log.i(l0Var.t(), "checkAutoPlay pos:" + i17 + " startCountDown!");
        return jz5.f0.f302826a;
    }
}
