package zd1;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f471548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zd1.o f471549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f471550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f471551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.appbrand.y yVar, zd1.o oVar, int i17, int i18) {
        super(0);
        this.f471548d = yVar;
        this.f471549e = oVar;
        this.f471550f = i17;
        this.f471551g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.y yVar = this.f471548d;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = a17 instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) a17 : null;
        int i17 = this.f471550f;
        zd1.o oVar = this.f471549e;
        if (n7Var == null) {
            oVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, oVar.u(str2, jSONObject));
        } else {
            of1.w1 s37 = n7Var.s3();
            if (s37 != null) {
                if (s37.getCoverViewId() == this.f471551g) {
                    if (s37.getWebView().z0()) {
                        zd1.m mVar = new zd1.m(yVar, i17, oVar);
                        oVar.getClass();
                        android.graphics.Bitmap bitmap = s37.getWebView().getBitmap();
                        if (bitmap == null) {
                            s37.I();
                        } else {
                            if (s37.f345048v == null) {
                                android.view.View view = new android.view.View(s37.getContext());
                                s37.f345048v = view;
                                s37.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
                            }
                            android.view.View view2 = s37.f345048v;
                            if (view2 != null) {
                                view2.bringToFront();
                            }
                            android.view.View view3 = s37.f345048v;
                            if (view3 != null) {
                                view3.setBackground(new android.graphics.drawable.BitmapDrawable(s37.getContext().getResources(), bitmap));
                            }
                        }
                        androidx.lifecycle.y lifecycleOwner = n7Var.getLifecycleOwner();
                        kotlinx.coroutines.y0 a18 = lifecycleOwner != null ? androidx.lifecycle.z.a(lifecycleOwner) : kotlinx.coroutines.z0.b();
                        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                        kotlinx.coroutines.l.d(a18, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new zd1.k(s37, mVar, null), 2, null);
                    } else {
                        oVar.getClass();
                        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi not supported" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put("errno", 100);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        yVar.a(i17, oVar.u(str2, jSONObject2));
                    }
                }
            }
            yVar.a(i17, oVar.o("fail: htmlId not found"));
        }
        return jz5.f0.f302826a;
    }
}
