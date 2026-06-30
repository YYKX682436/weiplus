package gf;

/* loaded from: classes7.dex */
public class d0 extends com.tencent.mm.plugin.appbrand.page.wc implements ni1.b {
    public final java.util.Set H;
    public final com.tencent.skyline.ISkylineScrollViewChange I;

    public d0(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        super(bVar);
        this.H = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.I = new gf.c0(this);
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void A() {
        gf.a2 f07 = f0();
        if (f07 != null) {
            f07.s();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a
    public com.tencent.mm.plugin.appbrand.page.fb S(android.content.Context context) {
        return new gf.a2(this, context);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public com.tencent.mm.plugin.appbrand.page.i T() {
        return new gf.u0();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public com.tencent.mm.plugin.appbrand.page.ob U() {
        return new gf.v0();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public boolean Z() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, ni1.d
    public boolean a(int i17, java.lang.String str) {
        if (F() == null || !((com.tencent.luggage.sdk.jsapi.component.b) F()).isRunning()) {
            return true;
        }
        ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().a(i17, str);
        return true;
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public boolean b() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc
    /* renamed from: b0 */
    public com.tencent.mm.plugin.appbrand.page.dd S(android.content.Context context) {
        return new gf.a2(this, context);
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void c(xi1.g gVar) {
        if (f0() != null) {
            f0().F(gVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a, ni1.d
    public boolean d(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (F() != null && ((com.tencent.luggage.sdk.jsapi.component.b) F()).isRunning()) {
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().e(str, str2, ((com.tencent.luggage.sdk.jsapi.component.b) F()).getComponentId());
            if (!android.text.TextUtils.isEmpty(str) && com.tencent.mm.plugin.appbrand.page.vd.f87185a.contains(str)) {
                e(str, str2, ((com.tencent.luggage.sdk.jsapi.component.b) F()).getComponentId());
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a, ni1.d
    public boolean e(java.lang.String str, java.lang.String str2, int i17) {
        if (F() == null || ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3() == null || !((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().isRunning()) {
            return true;
        }
        ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().S0(str, str2, i17, ((com.tencent.luggage.sdk.jsapi.component.b) F()).getComponentId());
        return true;
    }

    public com.tencent.skyline.SkylineRuntime g0() {
        if (F() == null) {
            com.tencent.mars.xlog.Log.i("Luggage.MPPageRendererSkylineImpl", "getSkylineRuntime fail, component is null");
            return null;
        }
        if (((com.tencent.luggage.sdk.jsapi.component.b) F()).v3() == null) {
            com.tencent.mars.xlog.Log.i("Luggage.MPPageRendererSkylineImpl", "getService fail, component is null");
            return null;
        }
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl != null) {
            return appServiceSkylineExtensionImpl.f47708d;
        }
        com.tencent.mars.xlog.Log.i("Luggage.MPPageRendererSkylineImpl", "getService fail, extension is null");
        return null;
    }

    public final void h0() {
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) F();
        if (bVar != null) {
            android.util.Pair c17 = ((com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) bVar.v3().z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class)).c();
            g0().updatePlatformBrightnessConfig(((com.tencent.skyline.ColorScheme) c17.second).getValue(), ((java.lang.Boolean) c17.first).booleanValue());
        }
        g0().updateAccessibilityEnable(df.h.f229478i.get());
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final gf.a2 f0() {
        return (gf.a2) ((com.tencent.mm.plugin.appbrand.page.dd) this.f86372g);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, com.tencent.mm.plugin.appbrand.page.a, com.tencent.mm.plugin.appbrand.page.d7
    public boolean j(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        try {
            h0();
            return super.j(str, wdVar);
        } finally {
            df.w1 t17 = f0().t();
            if (t17 != null) {
                ((com.tencent.luggage.sdk.jsapi.component.b) F()).j2();
                t17.s();
                t17.y(new df.k1(t17));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void m() {
        super.m();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.wc, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void u(java.util.Map map, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        super.u(map, wdVar);
        map.put("renderer", "skyline");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, com.tencent.mm.plugin.appbrand.page.d7
    public void z(android.view.View view) {
        super.z(view);
        view.addOnAttachStateChangeListener(new gf.b0(this, view));
    }
}
