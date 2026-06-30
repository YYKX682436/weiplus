package pa1;

/* loaded from: classes7.dex */
public final class o extends com.tencent.mm.plugin.appbrand.page.n7 {

    /* renamed from: m2, reason: collision with root package name */
    public boolean f352964m2;

    public o() {
        super(pa1.t.class);
        this.f352964m2 = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public java.lang.String J1() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void V2() {
        T0(new pa1.l(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void Z2(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void c3(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (android.text.TextUtils.isEmpty(str) || str.startsWith("onAppRoute")) {
            return;
        }
        if (getRuntime() == null || getRuntime().C0() == null) {
            com.tencent.mars.xlog.Log.w("AppBrandGame.WAGamePageView", "publish runtime destroyed, event %s", str);
        } else {
            getRuntime().C0().e(str, str2, getComponentId());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void d3(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void e3(java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5
    public void f2(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        super.f2(context, appBrandRuntime);
        setInterceptor(new pa1.n(null));
        com.tencent.mars.xlog.Log.i("AppBrandGame.WAGamePageView", "[damonlei] WAGamePageView init cost [%d]ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void f3(java.lang.String str) {
        T0(new pa1.k(this, str));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    public pa1.t o4() {
        return (pa1.t) Q1();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b
    public km5.d u3() {
        return ((km5.q) km5.u.d()).n(new pa1.m(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.n7, com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }
}
