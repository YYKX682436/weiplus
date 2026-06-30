package zd;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 395;
    public static final java.lang.String NAME = "setDeviceOrientation";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        android.app.Activity activity;
        final com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        try {
            xi1.p orientationHandler = e9Var.getWindowAndroid().getOrientationHandler();
            if (orientationHandler == null) {
                throw new java.lang.NullPointerException();
            }
            xi1.o d17 = xi1.o.d(jSONObject.optString("value", null));
            if (d17 == null) {
                e9Var.a(i17, o("fail:invalid data"));
                return;
            }
            if (e9Var.t3() == null || e9Var.t3().r0() == null) {
                e9Var.a(i17, o("fail"));
                return;
            }
            ni1.e eVar = (ni1.e) e9Var.V0().B1(ni1.e.class);
            if (eVar == null) {
                e9Var.a(i17, o("fail: extension not found"));
                return;
            }
            eVar.f(jSONObject.optString("value", null));
            xi1.g windowAndroid = e9Var.getWindowAndroid();
            if (windowAndroid instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
                activity = ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) windowAndroid).w();
            } else {
                if (windowAndroid instanceof xi1.q) {
                    xi1.g gVar = ((xi1.q) windowAndroid).f454713d;
                    if (gVar instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
                        activity = ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) gVar).w();
                    }
                }
                activity = null;
            }
            if (activity == null) {
                orientationHandler.b(d17, new xi1.n() { // from class: zd.d$$a
                    @Override // xi1.n
                    public final void e(xi1.o oVar, boolean z17) {
                        zd.d dVar = zd.d.this;
                        com.tencent.mm.plugin.appbrand.e9 e9Var2 = e9Var;
                        int i18 = i17;
                        if (z17) {
                            e9Var2.a(i18, dVar.o("ok"));
                        } else {
                            e9Var2.a(i18, dVar.o("fail"));
                        }
                    }
                });
                return;
            }
            android.view.View decorView = activity.getWindow() != null ? activity.getWindow().getDecorView() : null;
            if (decorView == null || !decorView.getViewTreeObserver().isAlive()) {
                e9Var.a(i17, o("fail: no decorView"));
                return;
            }
            final boolean[] zArr = {false};
            final zd.e eVar2 = new zd.e(this, e9Var, com.tencent.mm.plugin.appbrand.utils.f5.a(e9Var), zArr, i17, decorView);
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(eVar2);
            final android.view.View view = decorView;
            orientationHandler.b(d17, new xi1.n() { // from class: zd.d$$b
                @Override // xi1.n
                public final void e(xi1.o oVar, boolean z17) {
                    final zd.d dVar = zd.d.this;
                    final android.view.View view2 = view;
                    final android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = eVar2;
                    final com.tencent.mm.plugin.appbrand.e9 e9Var2 = e9Var;
                    final int i18 = i17;
                    final boolean[] zArr2 = zArr;
                    dVar.getClass();
                    if (!z17) {
                        view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        e9Var2.a(i18, dVar.o("fail: requestDeviceOrientation fail"));
                        return;
                    }
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: zd.d$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            zd.d dVar2 = zd.d.this;
                            dVar2.getClass();
                            if (zArr2[0]) {
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetDeviceOrientation", "setDeviceOrientation layout timeout");
                            e9Var2.a(i18, dVar2.o("ok"));
                            view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                            dVar2.C();
                        }
                    };
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(runnable, 500L, false);
                }
            });
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiSetDeviceOrientation", e17, "require WindowOrientationHandler NPE", new java.lang.Object[0]);
            e9Var.a(i17, o("fail:internal error"));
        }
    }

    public void C() {
    }
}
