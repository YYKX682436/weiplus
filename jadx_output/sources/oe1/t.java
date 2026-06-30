package oe1;

/* loaded from: classes15.dex */
public class t implements oe1.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f344740d;

    public t(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView) {
        this.f344740d = appBrandVideoView;
    }

    @Override // oe1.h1
    public void E(java.lang.String str, java.lang.String str2) {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.o("onVideoEnded", new java.lang.Object[0]);
        com.tencent.mm.sdk.platformtools.b4 b4Var = appBrandVideoView.f83552y1;
        if (b4Var != null) {
            b4Var.d();
        }
        appBrandVideoView.f83530g.setVisibility(8);
        appBrandVideoView.f83532i.setIsPlay(false);
        if (appBrandVideoView.f83532i.isShow() && appBrandVideoView.f83532i.m()) {
            appBrandVideoView.f83532i.hide();
        }
        if (appBrandVideoView.f83546w.getVisibility() == 0) {
            appBrandVideoView.f83546w.setVisibility(8);
        }
        if (appBrandVideoView.n() || !appBrandVideoView.R) {
            android.view.View view = appBrandVideoView.f83535n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = appBrandVideoView.f83534m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (appBrandVideoView.K <= 0) {
                appBrandVideoView.f83536o.setText(appBrandVideoView.h(appBrandVideoView.f83529f.getVideoDurationSec()));
            }
            android.view.View view3 = appBrandVideoView.f83535n;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = appBrandVideoView.f83534m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoEnded", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        xe1.p pVar = appBrandVideoView.C;
        if (pVar != null) {
            try {
                pVar.a(new xe1.d(null), pVar.b());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "OnVideoEnded e=%s", e17);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = pVar.f453830f;
            if (b4Var2 != null) {
                b4Var2.d();
            }
        }
        if (appBrandVideoView.I) {
            appBrandVideoView.u(0.0d, true);
        }
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.E(str, str2);
        }
    }

    @Override // oe1.h1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        int i19 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.o("onGetVideoSize width=%d height=%d", objArr);
        if (appBrandVideoView.f83527d == -1) {
            int i27 = i17 < i18 ? 0 : 90;
            appBrandVideoView.f83527d = i27;
            appBrandVideoView.o("onGetVideoSize adjust direction from AUTO to %s", java.lang.Integer.valueOf(i27));
        }
        xe1.p pVar = appBrandVideoView.C;
        if (pVar != null) {
            int duration = appBrandVideoView.getDuration();
            pVar.getClass();
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoLoadedMetaData, width:%d, height:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(duration));
                org.json.JSONObject b17 = pVar.b();
                b17.put("width", i17);
                b17.put("height", i18);
                b17.put("duration", (duration * 1.0d) / 1000.0d);
                pVar.a(new xe1.g(null), b17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoLoadedMetaData e=%s", e17);
            }
        }
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.I(str, str2, i17, i18);
        }
    }

    @Override // oe1.h1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        java.lang.Object[] objArr = {str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        int i19 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.o("onError errorMsg=%s what=%d extra=%d", objArr);
        xe1.p pVar = appBrandVideoView.C;
        if (pVar != null) {
            pVar.f453829e.K(pVar);
            com.tencent.mm.sdk.platformtools.b4 b4Var = pVar.f453830f;
            if (b4Var != null) {
                b4Var.d();
            }
            try {
                org.json.JSONObject b17 = pVar.b();
                b17.put("errMsg", str3);
                b17.put("what", i17);
                b17.put("extra", i18);
                pVar.a(new xe1.e(null), b17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "onError e=%s", e17);
            }
        }
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.N(str, str2, str3, i17, i18);
        }
    }

    @Override // oe1.h1
    public void f(java.lang.String str, java.lang.String str2) {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.o("onVideoWaiting", new java.lang.Object[0]);
        xe1.p pVar = appBrandVideoView.C;
        if (pVar != null) {
            pVar.getClass();
            try {
                org.json.JSONObject b17 = pVar.b();
                b17.put("timeStamp", java.lang.System.currentTimeMillis());
                pVar.a(new xe1.o(null), b17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoWaiting e=%s", e17);
            }
        }
        appBrandVideoView.V = true;
        appBrandVideoView.i();
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.f(str, str2);
        }
    }

    @Override // oe1.h1
    public void i(java.lang.String str, java.lang.String str2) {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.o("onVideoPause", new java.lang.Object[0]);
        xe1.p pVar = appBrandVideoView.C;
        if (pVar != null) {
            try {
                pVar.a(new xe1.h(null), pVar.b());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "OnVideoPause e=%s", e17);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = pVar.f453830f;
            if (b4Var != null) {
                b4Var.d();
            }
        }
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.i(str, str2);
        }
    }

    @Override // oe1.h1
    public void k(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.V = false;
        appBrandVideoView.f83532i.f();
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.k(str, str2);
        }
    }

    @Override // oe1.h1
    public void l(java.lang.String str, java.lang.String str2) {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.o("onVideoPlay, isLive:%b", java.lang.Boolean.valueOf(appBrandVideoView.n()));
        if (appBrandVideoView.K <= 0 && !appBrandVideoView.n()) {
            appBrandVideoView.f83536o.setText(appBrandVideoView.h(appBrandVideoView.f83529f.getVideoDurationSec()));
        }
        boolean n17 = appBrandVideoView.n();
        appBrandVideoView.o("updateLiveUI isLive:%b", java.lang.Boolean.valueOf(n17));
        appBrandVideoView.f83532i.setShowProgress((appBrandVideoView.P || appBrandVideoView.Q) && !n17);
        if (appBrandVideoView.B) {
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.a(appBrandVideoView);
        }
        xe1.p pVar = appBrandVideoView.C;
        if (pVar != null) {
            try {
                pVar.f453831g = 0;
                org.json.JSONObject b17 = pVar.b();
                b17.put("timeStamp", java.lang.System.currentTimeMillis());
                pVar.a(new xe1.i(null), b17);
                if (pVar.f453830f == null) {
                    pVar.f453830f = new com.tencent.mm.sdk.platformtools.b4(new xe1.a(pVar), true);
                }
                pVar.f453830f.c(250L, 250L);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "OnVideoPlay e=%s", e17);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = appBrandVideoView.f83553z;
        if (lVar != null) {
            oe1.b2.a(lVar.getAppId());
        }
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.l(str, str2);
        }
        android.view.View view = appBrandVideoView.f83534m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // oe1.h1
    public void n(java.lang.String str, long j17) {
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j17)};
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.o("onPreloadedMetaData preloadSize:%d", objArr);
        xe1.p pVar = appBrandVideoView.C;
        if (pVar != null) {
            pVar.getClass();
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoPreloadedMetaData, preloadSize:%d", java.lang.Long.valueOf(j17));
                org.json.JSONObject b17 = pVar.b();
                b17.put("preloadSize", j17);
                pVar.a(new xe1.j(null), b17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoPreloadedMetaData e=%s", e17);
            }
        }
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.n(str, j17);
        }
    }

    @Override // oe1.h1
    public void o(java.lang.String str, java.lang.String str2) {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.E1;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344740d;
        appBrandVideoView.o("onPrepared", new java.lang.Object[0]);
        appBrandVideoView.f83554z1 = 0;
        if (appBrandVideoView.f83552y1 == null) {
            appBrandVideoView.f83552y1 = new com.tencent.mm.sdk.platformtools.b4(new oe1.n(appBrandVideoView), true);
        }
        appBrandVideoView.f83552y1.c(500L, 500L);
        appBrandVideoView.f83539p1 = true;
        if (appBrandVideoView.f83549x1) {
            appBrandVideoView.x();
        }
        ef1.e eVar = appBrandVideoView.F;
        eVar.f252397i = -1;
        eVar.f252398j = 0;
        eVar.f252396h = 0.0f;
        xe1.p pVar = appBrandVideoView.C;
        if (pVar != null) {
            pVar.getClass();
        }
        oe1.h1 h1Var = appBrandVideoView.B1;
        if (h1Var != null) {
            h1Var.o(str, str2);
        }
    }
}
