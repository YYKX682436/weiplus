package sc1;

/* loaded from: classes7.dex */
public class h0 implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405678d;

    public h0(sc1.x0 x0Var, com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView) {
        this.f405678d = appBrandLivePusherView;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = this.f405678d;
        sc1.k1 c17 = ((sc1.q1) appBrandLivePusherView.f81570i).c();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePusherView", "onForeground code:%d info:%s", java.lang.Integer.valueOf(c17.f405688a), c17.f405689b);
        appBrandLivePusherView.f81565d.enable();
    }
}
