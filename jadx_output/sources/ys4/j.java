package ys4;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465244d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465245e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465246f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465247g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f465248h;

    public j(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("channel", i17 + "");
        setRequestData(hashMap);
        this.f465248h = str;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1630;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1630;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/realnameguidequery";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0 || jSONObject == null) {
            return;
        }
        this.f465244d = jSONObject.optString("guide_flag");
        this.f465245e = jSONObject.optString("guide_wording");
        this.f465246f = jSONObject.optString("left_button_wording");
        this.f465247g = jSONObject.optString("right_button_wording");
    }
}
