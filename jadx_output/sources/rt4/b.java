package rt4;

/* loaded from: classes9.dex */
public class b extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f399541d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement f399542e;

    public b(java.lang.String str) {
        this.f399541d = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_number", str);
        setRequestData(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 22;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement netScenePayUElementQuery$PayUBankcardElement = new com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement();
        this.f399542e = netScenePayUElementQuery$PayUBankcardElement;
        netScenePayUElementQuery$PayUBankcardElement.f181228d = jSONObject.optString("bin");
        this.f399542e.f181229e = jSONObject.optString("bank_name");
        this.f399542e.f181230f = jSONObject.optString("issuer_type");
        this.f399542e.f181231g = jSONObject.optString("card_type");
        this.f399542e.f181232h = jSONObject.optString("payu_reference");
    }
}
