package tj;

/* loaded from: classes7.dex */
public final class d extends gb1.d {
    public static final int CTRL_INDEX = 1194;
    public static final java.lang.String NAME = "insertMiniProgramPlayableView";

    @Override // gb1.d, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "invoke");
        java.lang.String optString = data.optString("appId");
        java.lang.String optString2 = data.optString("moduleName");
        boolean z17 = false;
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                int optInt = data.optInt("versionType");
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "appId:" + optString + " moduleName:" + optString2 + " versionType:" + optInt);
                kotlin.jvm.internal.o.d(optString);
                kotlin.jvm.internal.o.d(optString2);
                uj.k kVar = uj.k.f428161a;
                com.tencent.mars.xlog.Log.i("MagicPlayablePkgRecordMgr", "setWxaPkgInfo appId:" + optString + " moduleName:" + optString2 + " versionType:" + optInt + '!');
                kVar.a().D("AppID", optString);
                kVar.a().D("ModuleName", optString2);
                kVar.a().A("VersionType", optInt);
                com.tencent.mm.plugin.appbrand.appcache.n9 b17 = kVar.b();
                if (b17 != null && com.tencent.mm.vfs.w6.j(b17.field_pkgPath)) {
                    z17 = true;
                }
                if (!z17) {
                    component.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 2, "fail:insert view failed pkg not exist", null));
                    return;
                } else {
                    ((com.tencent.mm.plugin.appbrand.y) component).getRuntime().N.a(tj.b.f419673d);
                    B(component, data, i17, component.getF147808e());
                    return;
                }
            }
        }
        component.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 1, "fail:insert view failed appId or moduleName null!", null));
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.optInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t component, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "inflateView");
        android.content.Context f147807d = component.getF147807d();
        android.content.Context f147807d2 = component.getF147807d();
        kotlin.jvm.internal.o.f(f147807d2, "getContext(...)");
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(f147807d, new com.tencent.mm.adplayable.jsapi.MagicPlayableContainer(f147807d2, null, 0, 6, null));
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t component, int i17, android.view.View view, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView viewId:" + i17);
        com.tencent.mm.adplayable.jsapi.MagicPlayableContainer magicPlayableContainer = (com.tencent.mm.adplayable.jsapi.MagicPlayableContainer) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.adplayable.jsapi.MagicPlayableContainer.class);
        if (magicPlayableContainer == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView playableContainerView fail");
            x31.b[] bVarArr = x31.b.f451599d;
            java.lang.String P = P(2, "");
            com.tencent.mm.plugin.appbrand.e9 v37 = ((com.tencent.mm.plugin.appbrand.page.v5) component).v3();
            tj.e eVar = new tj.e();
            eVar.f82374f = P;
            v37.p(eVar);
            return;
        }
        tj.c cVar = new tj.c(this, component);
        com.tencent.mars.xlog.Log.i("MagicPlayableMgr", "startPlayableService");
        uj.p pVar = new uj.p();
        uj.f.f428153b = pVar;
        pVar.f428172g = cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "setContainerView");
        pVar.f428170e = magicPlayableContainer;
        bf3.p pVar2 = pVar.f428174i;
        if (pVar2 != null) {
            pVar2.a(magicPlayableContainer);
        }
        android.content.Context context = magicPlayableContainer.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.adplayable.jsapi.MagicPlayableContainer magicPlayableContainer2 = new com.tencent.mm.adplayable.jsapi.MagicPlayableContainer(context, null, 0, 6, null);
        pVar.f428171f = magicPlayableContainer2;
        magicPlayableContainer2.setLayoutParams(magicPlayableContainer.getLayoutParams());
        magicPlayableContainer.addView(pVar.f428171f);
        uj.p pVar3 = uj.f.f428153b;
        if (pVar3 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "start");
            com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            bf3.p Di = ((com.tencent.mm.plugin.magicbrush.m5) d4Var).Di(context2);
            pVar3.f428174i = Di;
            jc3.j0 wi6 = ((com.tencent.mm.plugin.magicbrush.b6) ((com.tencent.mm.plugin.magicbrush.p4) i95.n0.c(com.tencent.mm.plugin.magicbrush.p4.class))).wi("MagicAdPlayable");
            rc3.w0 w0Var = (rc3.w0) wi6;
            w0Var.w(pVar3);
            com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
            mBBuildConfig.f147834x = pVar3;
            mBBuildConfig.f147828r = pVar3;
            mBBuildConfig.f147831u = Di;
            mBBuildConfig.f147833w = true;
            mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.1f);
            mBBuildConfig.a(pVar3.f428175m);
            mBBuildConfig.f147821h = z65.c.a();
            w0Var.W(mBBuildConfig);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "MagicBrush setUp");
            pVar3.f428169d = wi6;
            uj.m mVar = uj.m.f428165a;
            java.lang.String sessionId = java.lang.String.valueOf(pVar3.hashCode());
            synchronized (mVar) {
                kotlin.jvm.internal.o.g(sessionId, "sessionId");
                uj.l lVar = new uj.l(0L, 0L, 3, null);
                lVar.f428163a = java.lang.System.currentTimeMillis();
                uj.m.f428166b.put(sessionId, lVar);
                com.tencent.mars.xlog.Log.i("MagicPlayableReporter", "markInitTime sessionId:" + sessionId + " initTime:" + lVar.f428163a);
                i95.m c17 = i95.n0.c(je3.i.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                je3.i.La((je3.i) c17, sessionId, "MagicPlayable", "", com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.Start, 0L, null, null, 96, null);
            }
        }
    }

    public final java.lang.String P(int i17, java.lang.String status) {
        kotlin.jvm.internal.o.g(status, "status");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", java.lang.Integer.valueOf(i17));
        hashMap.put("status", status);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return gVar;
    }
}
