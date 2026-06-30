package ww1;

/* loaded from: classes9.dex */
public class x1 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public boolean f450333d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f450334e;

    /* renamed from: f, reason: collision with root package name */
    public int f450335f;

    /* renamed from: g, reason: collision with root package name */
    public final int f450336g;

    /* renamed from: h, reason: collision with root package name */
    public int f450337h;

    /* renamed from: i, reason: collision with root package name */
    public int f450338i;

    /* renamed from: m, reason: collision with root package name */
    public long f450339m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f450340n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f450341o;

    public x1(int i17, long j17, int i18, int i19, int i27) {
        this.f450333d = false;
        this.f450334e = false;
        this.f450341o = new java.util.ArrayList();
        this.f450336g = i18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", "" + i17);
        hashMap.put("from_timestamp", "" + j17);
        hashMap.put("direction_flag", "" + i18);
        hashMap.put("num", "" + i19);
        hashMap.put("choose_flag", "" + i27);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1993;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/f2frcvrcdhissta";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        jSONObject.toString();
        this.f450335f = jSONObject.optInt("choose_flag", 0);
        this.f450339m = jSONObject.optLong("from_timestamp", -1L);
        this.f450337h = jSONObject.optInt("finish_flag", 0);
        this.f450338i = jSONObject.optInt("try_num", 0);
        this.f450340n = jSONObject.optString("retmsg", "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("records");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "empty records");
        } else {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                try {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                    ww1.n1 n1Var = new ww1.n1();
                    n1Var.f450248a = jSONObject2.optInt("type", 0);
                    n1Var.f450249b = jSONObject2.optLong("from_timestamp", 0L);
                    n1Var.f450250c = jSONObject2.optInt("total_num", 0);
                    n1Var.f450251d = jSONObject2.optInt("total_amt", 0);
                    this.f450341o.add(n1Var);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTenpayF2fHistoryRecordList", e17, "", new java.lang.Object[0]);
                }
            }
        }
        if (this.f450337h == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "finish query");
            this.f450333d = true;
        }
    }

    public x1(int i17, long j17, int i18, int i19, int i27, int i28) {
        this.f450333d = false;
        this.f450334e = false;
        this.f450341o = new java.util.ArrayList();
        this.f450334e = true;
        this.f450336g = i18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", "" + i17);
        hashMap.put("from_timestamp", "" + j17);
        hashMap.put("direction_flag", "" + i18);
        hashMap.put("num", "" + i19);
        hashMap.put("choose_flag", "" + i27);
        hashMap.put("try_num", "" + i28);
        setRequestData(hashMap);
    }
}
