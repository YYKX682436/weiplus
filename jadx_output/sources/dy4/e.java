package dy4;

/* loaded from: classes8.dex */
public final class e implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.j f244617d;

    public e(dy4.j jVar) {
        this.f244617d = jVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        dy4.j jVar = this.f244617d;
        sf.f fVar = jVar.f244671n;
        if (fVar == null) {
            return;
        }
        nw4.g gVar = ((dy4.d) fVar).f244613a.f340863d;
        boolean z17 = gVar instanceof nw4.n;
        nw4.n nVar = (z17 && z17) ? (nw4.n) gVar : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", jVar.f252497d);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (bundle != null) {
            for (java.lang.String str : bundle.keySet()) {
                if ((bundle.get(str) instanceof java.lang.String) || (bundle.get(str) instanceof java.lang.Integer) || (bundle.get(str) instanceof java.lang.Float) || (bundle.get(str) instanceof java.lang.Double)) {
                    jSONObject2.put(str, bundle.get(str));
                }
            }
        }
        jSONObject.put("info", jSONObject2);
        if (nVar != null) {
            nVar.p("onXWebLivePlayerNetStatus", jSONObject);
        }
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        java.lang.String str;
        dy4.j jVar = this.f244617d;
        sf.f fVar = jVar.f244671n;
        if (fVar == null) {
            return;
        }
        nw4.g gVar = ((dy4.d) fVar).f244613a.f340863d;
        boolean z17 = gVar instanceof nw4.n;
        nw4.n nVar = (z17 && z17) ? (nw4.n) gVar : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", jVar.f252497d);
        jSONObject.put("errCode", i17);
        if (bundle == null || (str = bundle.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION)) == null) {
            str = "";
        }
        jSONObject.put("errMsg", str);
        if (nVar != null) {
            nVar.p("onXWebLivePlayerEvent", jSONObject);
        }
    }
}
