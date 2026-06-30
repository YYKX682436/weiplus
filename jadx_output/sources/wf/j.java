package wf;

/* loaded from: classes7.dex */
public class j implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf.b f445470d;

    public j(wf.b bVar) {
        this.f445470d = bVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        wf.b bVar = this.f445470d;
        xf.b bVar2 = bVar.f445420n;
        if (bVar2 != null) {
            int i17 = bVar.f252497d;
            yf1.k kVar = (yf1.k) bVar2;
            kVar.getClass();
            yf1.j jVar = new yf1.j(null);
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
                kVar.a(jVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerNetStatus fail", e17);
            }
        }
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        if (2006 == i17 || -2301 == i17) {
            this.f445470d.L(new java.lang.Runnable() { // from class: wf.j$$a
                @Override // java.lang.Runnable
                public final void run() {
                    wf.a aVar = wf.j.this.f445470d.f445418i;
                    if (aVar != null) {
                        aVar.n("stop", null);
                    }
                }
            });
        }
        wf.b bVar = this.f445470d;
        xf.b bVar2 = bVar.f445420n;
        if (bVar2 != null) {
            int i18 = bVar.f252497d;
            yf1.k kVar = (yf1.k) bVar2;
            kVar.getClass();
            yf1.i iVar = new yf1.i(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("errCode", i17);
                jSONObject.put("errMsg", bundle == null ? "" : bundle.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION));
                kVar.a(iVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerEvent fail", e17);
            }
        }
        wf.b bVar3 = this.f445470d;
        xf.a aVar = bVar3.f445421o;
        if (aVar != null) {
            ((yf1.e) aVar).c(bVar3.f252497d, i17, bundle);
        }
        if (i17 == -2301) {
            wf.b bVar4 = this.f445470d;
            tf.m0 m0Var = bVar4.N;
            if (m0Var != null) {
                m0Var.onStop();
            } else {
                bVar4.P = 6;
            }
            com.tencent.mars.xlog.Log.i(this.f445470d.w(), "onStop, abandonFocus");
            this.f445470d.f445434z.a();
            return;
        }
        if (i17 != 2003) {
            if (i17 == 2006) {
                wf.b bVar5 = this.f445470d;
                tf.m0 m0Var2 = bVar5.N;
                if (m0Var2 != null) {
                    m0Var2.f();
                } else {
                    bVar5.P = 7;
                }
                com.tencent.mars.xlog.Log.i(this.f445470d.w(), "onPlayEnd, abandonFocus");
                this.f445470d.f445434z.a();
                return;
            }
            if (i17 != 2007) {
                return;
            }
            wf.b bVar6 = this.f445470d;
            tf.m0 m0Var3 = bVar6.N;
            if (m0Var3 != null) {
                m0Var3.j();
                return;
            } else {
                bVar6.P = 0;
                return;
            }
        }
        wf.b bVar7 = this.f445470d;
        tf.m0 m0Var4 = bVar7.N;
        if (m0Var4 != null) {
            m0Var4.l();
            wf.b bVar8 = this.f445470d;
            bVar8.N.e(bVar8.Q);
        } else {
            bVar7.P = bVar7.Q ? 2 : 3;
        }
        this.f445470d.w();
        boolean z17 = this.f445470d.H;
        wf.b bVar9 = this.f445470d;
        boolean z18 = bVar9.G;
        if (bVar9.H) {
            return;
        }
        wf.b bVar10 = this.f445470d;
        if (bVar10.G || bVar10.y()) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f445470d.w(), "onPlayEvent play, requestFocus");
        if (this.f445470d.f445434z.requestFocus()) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f445470d.w(), "onPlayEvent play, can not play");
        wf.b.r(this.f445470d);
    }
}
