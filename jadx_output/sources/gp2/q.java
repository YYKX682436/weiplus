package gp2;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f274291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f274293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f274295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yz5.a aVar, android.view.View view, com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView, gp2.l0 l0Var, so2.h1 h1Var) {
        super(0);
        this.f274291d = aVar;
        this.f274292e = view;
        this.f274293f = nearbyLivePreviewView;
        this.f274294g = l0Var;
        this.f274295h = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f274291d;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!this.f274293f.f121533q);
        android.view.View view = this.f274292e;
        view.setTag(com.tencent.mm.R.id.k67, valueOf);
        view.setTag(com.tencent.mm.R.id.f486100k62, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        boolean z17 = gp2.l0.N;
        gp2.l0 l0Var = this.f274294g;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "checkAutoPlayByOutside: onFirstFrameRendStartCallback feed=" + this.f274295h + " tabId:" + l0Var.f274246e);
        return jz5.f0.f302826a;
    }
}
