package sc1;

/* loaded from: classes7.dex */
public class k0 implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v0 f405687f;

    public k0(sc1.x0 x0Var, com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView, com.tencent.mm.plugin.appbrand.jsapi.t tVar, com.tencent.mm.plugin.appbrand.v0 v0Var) {
        this.f405685d = appBrandLivePusherView;
        this.f405686e = tVar;
        this.f405687f = v0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        this.f405685d.e();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f405686e;
        tVar.K(this);
        com.tencent.mm.plugin.appbrand.x0.e(tVar.getAppId(), this.f405687f);
    }
}
