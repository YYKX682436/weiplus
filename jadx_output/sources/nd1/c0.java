package nd1;

/* loaded from: classes7.dex */
public final class c0 extends nd1.r {

    /* renamed from: g, reason: collision with root package name */
    public static final nd1.s f336273g = new nd1.s(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f336274h = kz5.z.D0(new java.lang.String[]{"halfEnable", "height", "enableFullScreenGesture", "autoFullScreenWhenTap", "usePushAnimation", "forbidSlidingUpGesture", "forbidGestureWhenFullScreen", "forceLightMode", "showBgMask", "shapeConfig"});

    public static final void D(nd1.c0 c0Var, com.tencent.mm.plugin.appbrand.o6 o6Var, boolean z17) {
        c0Var.getClass();
        com.tencent.mm.plugin.appbrand.hc hcVar = o6Var.f74796e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = hcVar instanceof com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC ? (com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) hcVar : null;
        if (appBrandRuntimeContainerWC != null) {
            appBrandRuntimeContainerWC.b0();
        }
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = o6Var.H2.f91198d;
        if (f0Var != null) {
            f0Var.Y();
        }
        if (z17) {
            boolean R = o6Var.R();
            o6Var.f74817x1 = false;
            o6Var.S();
            o6Var.f74817x1 = R;
        } else {
            o6Var.S();
        }
        if (appBrandRuntimeContainerWC != null) {
            appBrandRuntimeContainerWC.i0();
        }
    }

    @Override // nd1.r, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.y service, org.json.JSONObject data, int i17) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        if (service.t3() instanceof com.tencent.mm.plugin.appbrand.o6) {
            java.lang.String optString = data.optString("url");
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = null;
            try {
                jSONObject = data.getJSONObject("singlePageUiParams");
            } catch (org.json.JSONException unused) {
                jSONObject = null;
            }
            if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.e(service.t3()) && jSONObject != null) {
                java.util.Set set = f336274h;
                boolean z17 = false;
                if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                    java.util.Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (jSONObject.has((java.lang.String) it.next())) {
                            z17 = true;
                            break;
                        }
                    }
                }
                if (z17) {
                    kotlin.jvm.internal.o.d(optString);
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = service.t3();
                    kotlin.jvm.internal.o.e(t37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
                    com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) t37;
                    android.app.Activity r07 = o6Var.r0();
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = o6Var.u0();
                    if (u08 != null && (appBrandStatObject = u08.f47269b2) != null && appBrandStatObject.f87790f == 1038) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToWC", "use getLastStatObjectIgnoreFromOtherWeAppBack");
                        appBrandStatObject = o6Var.f471747g2;
                    }
                    o6Var.N.a(new nd1.w(o6Var, new nd1.b0(r07, this, jSONObject, optString, u07, appBrandStatObject, service, i17)));
                    o6Var.m(new nd1.y(o6Var, this));
                    return;
                }
            }
        }
        super.A(service, data, i17);
    }

    public final android.os.Bundle E(org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String valueOf = java.lang.String.valueOf(keys.next());
            java.lang.Object opt = jSONObject.opt(valueOf);
            if (opt instanceof java.lang.Integer) {
                bundle.putInt(valueOf, ((java.lang.Number) opt).intValue());
            } else if (opt instanceof java.lang.String) {
                bundle.putString(valueOf, (java.lang.String) opt);
            } else if (opt instanceof java.lang.Long) {
                bundle.putLong(valueOf, ((java.lang.Number) opt).longValue());
            } else if (opt instanceof java.lang.Boolean) {
                bundle.putBoolean(valueOf, ((java.lang.Boolean) opt).booleanValue());
            } else if (opt instanceof org.json.JSONObject) {
                bundle.putBundle(valueOf, E((org.json.JSONObject) opt));
            }
        }
        return bundle;
    }
}
