package fg1;

/* loaded from: classes7.dex */
public class b0 implements dg.e {

    /* renamed from: a, reason: collision with root package name */
    public bg.f f261842a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.extendplugin.b f261843b;

    /* renamed from: c, reason: collision with root package name */
    public double f261844c;

    /* renamed from: d, reason: collision with root package name */
    public int f261845d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f261846e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261847f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f261848g = false;

    /* renamed from: h, reason: collision with root package name */
    public bg.b f261849h = null;

    /* renamed from: i, reason: collision with root package name */
    public tf.m0 f261850i = null;

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.l m17;
        if (n5Var != null) {
            if (!(n5Var instanceof fg1.n0) && !(n5Var instanceof fg1.l0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "dispatch event:%s, data:%s", n5Var.k(), jSONObject.toString());
            }
            com.tencent.mm.plugin.appbrand.jsapi.n5 r17 = n5Var.r(jSONObject.toString());
            com.tencent.mm.plugin.appbrand.extendplugin.b bVar = this.f261843b;
            if (bVar == null || (m17 = bVar.m()) == null) {
                return;
            }
            if (!(m17 instanceof com.tencent.mm.plugin.appbrand.e9)) {
                if (m17 instanceof com.tencent.mm.plugin.appbrand.page.v5) {
                    ((com.tencent.mm.plugin.appbrand.page.v5) m17).i(r17, null);
                    return;
                } else {
                    m17.i(r17, null);
                    return;
                }
            }
            com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) m17;
            e9Var.i(r17, null);
            com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
            if (V0 != null) {
                V0.i(r17, null);
            }
        }
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f261847f);
        return jSONObject;
    }

    public final void c(boolean z17) {
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar;
        if (this.f261842a == null || (bVar = this.f261843b) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayPauseOrStop, pluginHandler or invokeContext is null");
            return;
        }
        tf1.f a17 = tf.k.a(bVar);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayPauseOrStop, audioOfVideoBackgroundPlayManager is null");
        } else {
            a17.m(this.f261842a, z17);
        }
    }

    public void d(boolean z17) {
        try {
            org.json.JSONObject b17 = b();
            b17.put("playInBackground", z17);
            a(new fg1.e0(null), b17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoBackgroundPlaybackChange fail", e17);
        }
    }

    public void e(int i17, int i18, int i19) {
        try {
            org.json.JSONObject b17 = b();
            b17.put("width", i17);
            b17.put("height", i18);
            double d17 = (i19 * 1.0d) / 1000.0d;
            this.f261844c = d17;
            b17.put("duration", d17);
            a(new fg1.h0(null), b17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoLoadedMetaData width = " + i17 + " height = " + i18 + " duration = " + i19);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoLoadedMetaData fail", e17);
        }
    }

    public void f(boolean z17) {
        try {
            a(new fg1.i0(null), b());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoPause fail", e17);
        }
        k();
        com.tencent.mm.sdk.platformtools.u3.h(new fg1.d0(this));
        c(false);
        tf.m0 m0Var = this.f261850i;
        if (m0Var != null) {
            if (z17) {
                m0Var.onStop();
            } else {
                m0Var.onPause();
            }
        }
    }

    public void g(boolean z17) {
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar;
        this.f261848g = false;
        try {
            this.f261845d = 0;
            org.json.JSONObject b17 = b();
            b17.put("timeStamp", java.lang.System.currentTimeMillis());
            a(new fg1.j0(null), b17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onXWebVideoPlay isAutoPlay = " + z17);
            j();
            com.tencent.mm.sdk.platformtools.u3.h(new fg1.c0(this));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoPlay fail", e17);
        }
        if (this.f261842a == null || (bVar = this.f261843b) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayStart, mPluginHandler or mInvokeContext is null");
        } else {
            tf1.f a17 = tf.k.a(bVar);
            if (a17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandVideoEventHandler", "markVideoPlayStart, audioOfVideoBackgroundPlayManager is null");
            } else {
                a17.n(this.f261842a);
            }
        }
        tf.m0 m0Var = this.f261850i;
        if (m0Var != null) {
            m0Var.e(z17);
        }
    }

    public void h(int i17, int i18) {
        if (this.f261848g) {
            return;
        }
        try {
            if (java.lang.Math.abs(i17 - this.f261845d) < 250) {
                return;
            }
            bg.b bVar = this.f261849h;
            if (bVar != null) {
                ((fg1.y0) bVar).a(i17, i18);
            }
            this.f261845d = i17;
            double doubleValue = new java.math.BigDecimal((i17 * 1.0d) / 1000.0d).setScale(3, 4).doubleValue();
            org.json.JSONObject b17 = b();
            b17.put("position", doubleValue);
            b17.put("duration", (i18 * 1.0d) / 1000.0d);
            a(new fg1.n0(null), b17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoTimeUpdate fail", e17);
        }
    }

    public void i() {
        this.f261848g = true;
        try {
            org.json.JSONObject b17 = b();
            b17.put("timeStamp", java.lang.System.currentTimeMillis());
            a(new fg1.p0(null), b17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoWaiting fail", e17);
        }
        tf.m0 m0Var = this.f261850i;
        if (m0Var != null) {
            m0Var.j();
        }
    }

    public final void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "start video update timer");
        if (this.f261846e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "start video update timer, create new timer");
            this.f261846e = new com.tencent.mm.sdk.platformtools.b4("AppBrandVideoEventHandler_HandlerThread#" + hashCode(), new com.tencent.mm.sdk.platformtools.a4() { // from class: fg1.b0$$a
                @Override // com.tencent.mm.sdk.platformtools.a4
                public final boolean onTimerExpired() {
                    fg1.b0 b0Var = fg1.b0.this;
                    bg.f fVar = b0Var.f261842a;
                    if (fVar == null) {
                        return true;
                    }
                    ye1.e eVar = fVar.f19764h;
                    b0Var.h(eVar != null ? eVar.getCurrentPosition() : 0, (int) (b0Var.f261844c * 1000.0d));
                    return true;
                }
            }, true);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f261846e;
        if (b4Var != null) {
            b4Var.c(0L, 250L);
        }
        com.tencent.mm.plugin.appbrand.extendplugin.b bVar = this.f261843b;
        if (bVar != null) {
            oe1.b2.a(bVar.f78023e);
        }
    }

    public final void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoEventHandler", "stop video update timer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f261846e;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
