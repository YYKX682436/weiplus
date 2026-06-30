package kw4;

/* loaded from: classes8.dex */
public class r implements com.tencent.mm.pluginsdk.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView f313188d;

    public r(com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView) {
        this.f313188d = ftsWebVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onVideoEnded");
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313188d;
        lw4.j jVar = ftsWebVideoView.H;
        if (jVar != null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = jVar.f321659b;
            if (b4Var != null) {
                b4Var.d();
            }
            try {
                jVar.j(jVar.g(3, null));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
            }
        }
        if (ftsWebVideoView.E) {
            ftsWebVideoView.j(0, true);
            return;
        }
        ftsWebVideoView.j(0, false);
        ftsWebVideoView.i();
        android.view.View view = ftsWebVideoView.f182071h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = ftsWebVideoView.f182072i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = ftsWebVideoView.f182079s;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ftsWebVideoView.l();
        ftsWebVideoView.f182078r.setImageResource(com.tencent.mm.R.drawable.c6e);
        ftsWebVideoView.f182070g.setVisibility(8);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onGetVideoSize width=%d height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313188d;
        if (ftsWebVideoView.f182067d == kw4.u.AUTO) {
            kw4.u uVar = i17 < i18 ? kw4.u.PORTRAIT : kw4.u.LANDSCAPE;
            ftsWebVideoView.f182067d = uVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onGetVideoSize adjust direction from AUTO to %s", uVar);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onError errorMsg=%s what=%d extra=%d", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313188d;
        g0Var.d(14911, valueOf, valueOf2, ftsWebVideoView.P, com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(ftsWebVideoView.getContext()));
        lw4.j jVar = ftsWebVideoView.H;
        if (jVar != null) {
            jVar.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiVideoCallback", "onError what %d, extra %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            jVar.f();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("errCode", i17);
                jSONObject.put("errMsg", i18 + "");
                jVar.j(jVar.g(7, jSONObject));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
            }
        }
        ftsWebVideoView.i();
        ftsWebVideoView.o(ftsWebVideoView.getContext().getString(com.tencent.mm.R.string.f493443k73, i17 + ":" + i18), ftsWebVideoView.getContext().getString(com.tencent.mm.R.string.f493446k80), null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onVideoWaiting");
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313188d;
        ftsWebVideoView.f182070g.f162476i.setVisibility(8);
        ftsWebVideoView.M = true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onVideoPause");
        lw4.j jVar = this.f313188d.H;
        if (jVar != null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = jVar.f321659b;
            if (b4Var != null) {
                b4Var.d();
            }
            try {
                jVar.j(jVar.g(2, null));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        int i17 = com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.V;
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313188d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onVideoPlay, isLive:%b", java.lang.Boolean.valueOf(ftsWebVideoView.e()));
        lw4.j jVar = ftsWebVideoView.H;
        if (jVar != null) {
            jVar.f321660c = 0;
            if (jVar.f321659b == null) {
                jVar.f321659b = new com.tencent.mm.sdk.platformtools.b4(new lw4.i(jVar), true);
            }
            jVar.f321659b.c(250L, 250L);
            try {
                jVar.j(jVar.g(1, null));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
            }
        }
        long j17 = ftsWebVideoView.Q;
        if (j17 <= 0 || j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - ftsWebVideoView.Q;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14909, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(currentTimeMillis), com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(ftsWebVideoView.getContext()), ftsWebVideoView.P);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onVideoWaitingEnd");
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313188d;
        ftsWebVideoView.M = false;
        ftsWebVideoView.f182070g.f162476i.setVisibility(0);
        ftsWebVideoView.f182070g.x();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onPrepared");
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313188d;
        kw4.e eVar = ftsWebVideoView.B;
        eVar.f313172i = -1;
        eVar.f313173j = 0;
        eVar.f313171h = 0.0f;
        ftsWebVideoView.f182070g.z(ftsWebVideoView.M);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
