package yf;

/* loaded from: classes7.dex */
public class t0 implements com.tencent.rtmp.ITXLivePushListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461462b;

    public t0(yf.i0 i0Var) {
        this.f461462b = i0Var;
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onNetStatus(android.os.Bundle bundle) {
        yf.i0 i0Var = this.f461462b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f461364n;
            int i17 = i0Var.f252497d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.p pVar = new bg1.p(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i17);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bundle != null) {
                    for (java.lang.String str : bundle.keySet()) {
                        jSONObject2.put(str, bundle.get(str));
                    }
                }
                jSONObject.put("info", jSONObject2);
                qVar.a(pVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherNetStatus fail", e17);
            }
        }
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    public void onPushEvent(int i17, android.os.Bundle bundle) {
        if (this.f461462b.H()) {
            yf.i0 i0Var = this.f461462b;
            zf.d dVar = i0Var.f461364n;
            int i18 = i0Var.f252497d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.o oVar = new bg1.o(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("errCode", i17);
                jSONObject.put("errMsg", bundle == null ? "" : bundle.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION));
                qVar.a(oVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherEvent fail", e17);
            }
        }
        yf.i0 i0Var2 = this.f461462b;
        zf.c cVar = i0Var2.f461365o;
        if (cVar != null) {
            if (i17 != 1002 && i17 != 1003 && i17 != 1018) {
                if (i17 == -1307) {
                    ((bg1.h) cVar).f(i0Var2, i0Var2.f461366p);
                    return;
                }
                return;
            }
            if (i0Var2.G) {
                return;
            }
            yf.i0 i0Var3 = this.f461462b;
            zf.c cVar2 = i0Var3.f461365o;
            sf.f fVar = i0Var3.f461366p;
            bg1.h hVar = (bg1.h) cVar2;
            hVar.f19894e = true;
            hVar.f19895f = tf1.h.a(fVar);
            hVar.a();
            java.lang.String w17 = i0Var3.w();
            fb1.e.f260836e.F3(fb1.d.f260833h, true, w17);
            java.lang.String appId = fVar.getAppId();
            bg1.a aVar = new bg1.a(hVar, w17, i0Var3, fVar);
            hVar.f19897h = aVar;
            com.tencent.mm.plugin.appbrand.x0.a(appId, aVar);
            if (hVar.f19892c) {
                xf1.i d17 = hVar.d(fVar);
                if (d17 != null) {
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = tf1.h.a(fVar);
                    com.tencent.mars.xlog.Log.i(d17.f454237d, "onPushBegin, runtime:%s, LivePusher:%s", a17.f74803n, i0Var3.g());
                    d17.c(a17, 1);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "pushBegin, not voip mode");
            }
            tf.m0 m0Var = hVar.f19899j;
            if (m0Var == null) {
                hVar.f19900k = hVar.f19901l ? 2 : 3;
            } else {
                m0Var.l();
                hVar.f19899j.e(hVar.f19901l);
            }
        }
    }
}
