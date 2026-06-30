package sc1;

/* loaded from: classes7.dex */
public class j0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405684e;

    public j0(sc1.x0 x0Var, com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405683d = appBrandLivePusherView;
        this.f405684e = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mm.plugin.appbrand.x0.e(this.f405684e.getAppId(), this);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = this.f405683d;
        appBrandLivePusherView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "onAppBrandPause pauseType:%s", w0Var);
        if (w0Var == com.tencent.mm.plugin.appbrand.w0.BACK || w0Var == com.tencent.mm.plugin.appbrand.w0.CLOSE || w0Var == com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM) {
            ((sc1.q1) appBrandLivePusherView.f81570i).f(true);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        ((sc1.q1) this.f405683d.f81570i).c();
    }
}
