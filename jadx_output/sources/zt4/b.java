package zt4;

/* loaded from: classes9.dex */
public class b extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f475596d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475597e;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_ID, str2);
        hashMap.put("answer", str3);
        hashMap.put("payu_reference", str);
        setRequestData(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 18;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f475596d = jSONObject.optBoolean("verified");
        this.f475597e = jSONObject.optString("payu_reference");
    }
}
