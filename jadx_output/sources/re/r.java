package re;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public int f394288b;

    /* renamed from: c, reason: collision with root package name */
    public int f394289c;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f394293g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f394287a = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f394290d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f394291e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f394292f = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.y0 f394294h = new com.tencent.mm.plugin.appbrand.jsapi.y0();

    public r(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f394293g = v5Var;
    }

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.y0 y0Var) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f394293g;
        k91.f M1 = v5Var.M1();
        if (M1 == null) {
            return;
        }
        int[] a17 = com.tencent.mm.plugin.appbrand.utils.f5.a(v5Var.v3());
        java.util.Map map = this.f394291e;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        ((java.util.HashMap) map).clear();
        java.lang.String Z1 = v5Var.Z1();
        java.lang.String str = M1.f305724m;
        if (!android.text.TextUtils.isEmpty(str) || !android.text.TextUtils.isEmpty(Z1)) {
            hashMap.put("originalPageOrientation", str);
            hashMap.put("lastPageOrientation", Z1);
        }
        int componentId = v5Var.getComponentId();
        int width = v5Var.getPageArea().getWidth();
        int height = v5Var.getPageArea().getHeight();
        int i17 = a17[0];
        int i18 = a17[1];
        xi1.o a18 = v5Var.getWindowAndroid().getOrientationHandler().a();
        y0Var.getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap(10);
        hashMap2.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(width)));
        hashMap2.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(height)));
        hashMap2.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(i17)));
        hashMap2.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(i18)));
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("size", hashMap2);
        hashMap3.put("changedWebviewIds", new int[]{componentId});
        if (u46.a.b(xi1.o.f454710n, a18)) {
            hashMap3.put("deviceOrientation", "landscape");
        } else if (xi1.o.PORTRAIT == a18) {
            hashMap3.put("deviceOrientation", "portrait");
        }
        if (!hashMap.isEmpty()) {
            hashMap3.put("pageOrientation", new java.util.HashMap(hashMap));
        }
        java.lang.String jSONObject = new org.json.JSONObject(hashMap3).toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnViewDidResize[pageOrientation]", "dispatch(%s) with page(%s:%s) data(%s)", y0Var.k(), v5Var.getAppId(), v5Var.X1(), jSONObject);
        y0Var.f82374f = jSONObject;
        y0Var.v(v5Var, v5Var.getComponentId());
        y0Var.m();
        y0Var.f82374f = jSONObject;
        y0Var.v(v5Var.v3(), v5Var.getComponentId());
        y0Var.m();
    }

    public final boolean b(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f394293g;
        xi1.o a17 = v5Var.C1() != null ? v5Var.C1().a() : null;
        if (a17 == null) {
            a17 = xi1.o.d(v5Var.Z1());
        }
        xi1.o oVar = xi1.o.PORTRAIT;
        if (a17 == null) {
            a17 = oVar;
        }
        boolean z17 = false;
        if (u46.a.b(xi1.o.f454710n, a17)) {
            return i17 > i18;
        }
        if (oVar != a17) {
            return true;
        }
        if (i18 > i17) {
            return true;
        }
        if ((v5Var.getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) && v5Var.v1() != null && v5Var.v1().isInMultiWindowMode()) {
            if (v5Var.getWindowAndroid().getOrientationHandler().a() == oVar || v5Var.v1().getRequestedOrientation() == 1) {
                if ((i17 > 0) & (i18 > 0)) {
                    z17 = true;
                }
            }
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "isViewSizeMatchedByRequestedOrientation, activityInMultiWindowMode width[%d] height[%d] ret[%b]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public final void c() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f394293g;
        if (v5Var.isRunning()) {
            if (!this.f394292f) {
                a(this.f394294h);
                return;
            }
            a(new re.q(null));
            this.f394292f = false;
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "tryDispatchViewDidResize, appId[%s], url[%s], now_orientation[%s], send onAppRouteResized instead", v5Var.getAppId(), v5Var.X1(), v5Var.Z1());
        }
    }
}
