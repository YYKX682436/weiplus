package ww1;

/* loaded from: classes9.dex */
public class w1 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public int f450321d;

    /* renamed from: e, reason: collision with root package name */
    public int f450322e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f450323f;

    public w1(java.lang.String str, int i17, long j17) {
        this.f450323f = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bill_id", str);
        hashMap.put("type", java.lang.String.valueOf(i17));
        hashMap.put("from_timestamp", java.lang.String.valueOf(j17));
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1964;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/f2frmrcvdrcd";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f450321d = jSONObject.optInt("total_num", 0);
        this.f450322e = jSONObject.optInt("total_amt", 0);
        jSONObject.optInt("type", 0);
        jSONObject.optLong("from_timestamp", 0L);
    }
}
