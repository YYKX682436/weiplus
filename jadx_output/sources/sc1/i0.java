package sc1;

/* loaded from: classes7.dex */
public class i0 implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405681d;

    public i0(sc1.x0 x0Var, com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView) {
        this.f405681d = appBrandLivePusherView;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = this.f405681d;
        sc1.k1 f17 = ((sc1.q1) appBrandLivePusherView.f81570i).f(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "onBackground code:%d info:%s", java.lang.Integer.valueOf(f17.f405688a), f17.f405689b);
        appBrandLivePusherView.f81565d.disable();
    }
}
