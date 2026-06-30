package ww1;

/* loaded from: classes9.dex */
public class y1 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public int f450360d;

    /* renamed from: e, reason: collision with root package name */
    public int f450361e;

    /* renamed from: f, reason: collision with root package name */
    public long f450362f;

    /* renamed from: g, reason: collision with root package name */
    public int f450363g;

    /* renamed from: i, reason: collision with root package name */
    public final int f450365i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f450364h = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f450366m = false;

    public y1(int i17, long j17, java.lang.String str, int i18) {
        this.f450365i = i18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", java.lang.String.valueOf(i17));
        hashMap.put("from_timestamp", java.lang.String.valueOf(j17));
        hashMap.put("last_bill_id", str);
        hashMap.put("num", java.lang.String.valueOf(i18));
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1963;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/f2frcvdlist";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f450360d = jSONObject.optInt("total_num");
        this.f450361e = jSONObject.optInt("total_amt");
        this.f450362f = jSONObject.optLong("from_timestamp", 0L);
        this.f450363g = jSONObject.optInt("type", 0);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("records");
        java.util.List list = this.f450364h;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayF2fRecordList", "empty records");
        } else {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                try {
                    ((java.util.ArrayList) list).add(ww1.g.a(optJSONArray.getJSONObject(i18)));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTenpayF2fRecordList", e17, "", new java.lang.Object[0]);
                }
            }
        }
        if (((java.util.ArrayList) list).size() < this.f450365i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayF2fRecordList", "finish query");
            this.f450366m = true;
        }
    }
}
