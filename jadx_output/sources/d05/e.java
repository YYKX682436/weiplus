package d05;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f225588d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225589e;

    /* renamed from: f, reason: collision with root package name */
    public int f225590f;

    public e(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bind_serialno", str);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 59;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            this.f225589e = jSONObject.getString("session_key");
            this.f225590f = jSONObject.optInt("answer_times_left", -1);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Array");
            if (jSONArray == null || jSONArray.length() <= 0) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                d05.l lVar = new d05.l();
                lVar.f225610b = jSONObject2.getString("qt_id");
                lVar.f225612d = jSONObject2.getString("parent_id");
                jSONObject2.getString("qt_type");
                lVar.f225613e = jSONObject2.getString("qt_cont");
                jSONObject2.getInt("ans_len");
                lVar.f225614f = jSONObject2.getString("wording");
                lVar.f225615g = jSONObject2.getInt(ya.b.LEVEL);
                if (!hashMap.containsKey(lVar.f225612d) || "0".equals(lVar.f225612d)) {
                    hashMap.put(lVar.f225610b, lVar);
                } else {
                    ((d05.l) hashMap.get(lVar.f225612d)).f225616h = lVar;
                }
            }
            this.f225588d = new java.util.ArrayList(hashMap.values());
            hashMap.clear();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", e17, "", new java.lang.Object[0]);
        }
    }
}
