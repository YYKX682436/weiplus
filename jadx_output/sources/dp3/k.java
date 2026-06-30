package dp3;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f242215d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f242216e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f242217f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f242218g;

    public k(int i17, int i18, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Limit", i17 + "");
        hashMap.put("Offset", i18 + "");
        hashMap.put("Extbuf", str);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 105;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f242215d = new java.util.LinkedList();
        try {
            this.f242217f = jSONObject.getInt("TotalNum");
            jSONObject.getInt("RecNum");
            this.f242218g = jSONObject.optString("Extbuf");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("UserRollList");
            if (jSONArray != null) {
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    dp3.o oVar = new dp3.o();
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                    oVar.f242232o = jSONObject2.optInt("PayType");
                    oVar.f242224d = jSONObject2.optString("Transid");
                    oVar.f242225e = jSONObject2.optDouble("TotalFee");
                    oVar.f242226f = jSONObject2.optString("GoodsName");
                    oVar.f242227g = jSONObject2.optInt("CreateTime");
                    oVar.f242229i = jSONObject2.optInt("ModifyTime");
                    oVar.f242230m = jSONObject2.optString("FeeType");
                    oVar.f242236s = jSONObject2.optString("AppThumbUrl");
                    oVar.f242228h = jSONObject2.optString("TradeStateName");
                    oVar.f242241x = jSONObject2.optString("StatusColor");
                    oVar.f242242y = jSONObject2.optString("FeeColor");
                    oVar.f242243z = jSONObject2.optDouble("ActualPayFee");
                    oVar.A = jSONObject2.optString("BillId");
                    this.f242215d.add(oVar);
                }
            }
            this.f242216e = new java.util.LinkedList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("month_info");
            if (optJSONArray != null) {
                for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                    org.json.JSONObject jSONObject3 = optJSONArray.getJSONObject(i19);
                    dp3.j jVar = new dp3.j();
                    jVar.f242212d = jSONObject3.optInt("year");
                    jVar.f242213e = jSONObject3.optInt("month");
                    jVar.f242214f = jSONObject3.optString("feetext");
                    this.f242216e.add(jVar);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetScenePatchQueryUserRoll", "Parse Json exp:" + e17.getLocalizedMessage());
        }
    }
}
