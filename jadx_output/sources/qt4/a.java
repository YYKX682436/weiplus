package qt4;

/* loaded from: classes9.dex */
public class a extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f366650d;

    public a(double d17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("total_fee", "" + java.lang.Math.round(d17 * 100.0d));
        hashMap.put("fee_type", str);
        setRequestData(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 20;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f366650d = jSONObject.optString("prepayid");
    }
}
