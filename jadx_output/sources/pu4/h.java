package pu4;

/* loaded from: classes12.dex */
public class h extends p13.t {
    public h(pu4.i iVar, p13.u uVar) {
        super(uVar);
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchAIHistoryTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        vVar.f351160e = new java.util.ArrayList();
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        if (eVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "execSearch AIHistoryService not ready");
            vVar.f351158c = -2;
            return;
        }
        p13.u uVar = this.f351135n;
        java.lang.String str = uVar.f351141c;
        if (str == null || str.isEmpty()) {
            vVar.f351158c = 0;
            return;
        }
        java.util.HashMap hashMap = o13.n.f342241a;
        java.lang.String c17 = o13.s.c(str.toLowerCase());
        if (c17 != null && !c17.isEmpty()) {
            p13.r b17 = p13.r.b(c17, true);
            if (!b17.a()) {
                vVar.f351159d = b17;
            }
        }
        int i17 = uVar.f351147i;
        java.lang.String Ni = ((pu4.a) eVar).Ni(str, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "execSearch query=%s resultJson length=%d", str, java.lang.Integer.valueOf(Ni.length()));
        if (Ni.isEmpty() || "[]".equals(Ni)) {
            vVar.f351158c = 0;
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray(Ni);
        for (int i18 = 0; i18 < jSONArray.length(); i18++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
            p13.z zVar = new p13.z();
            zVar.f351184b = 720896;
            zVar.f351187e = jSONObject.optString("searchId", "");
            zVar.f351188f = jSONObject.optLong("timeStamp", 0L);
            zVar.f351190h = jSONObject.optString("query", "");
            zVar.f351193k = jSONObject.optString("boxFTS", "");
            zVar.f351185c = jSONObject.optInt("matchSubtype", 1);
            if (!zVar.f351187e.isEmpty()) {
                vVar.f351160e.add(zVar);
            }
        }
        java.util.Comparator comparator = uVar.f351150l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f351160e, comparator);
        }
        if (vVar.f351160e.size() > i17) {
            vVar.f351160e = new java.util.ArrayList(vVar.f351160e.subList(0, i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "execSearch resultSize=%d", java.lang.Integer.valueOf(vVar.f351160e.size()));
        vVar.f351158c = 0;
    }
}
