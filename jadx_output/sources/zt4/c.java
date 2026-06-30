package zt4;

/* loaded from: classes9.dex */
public class c extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f475598d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475599e;

    public c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hashMap.put("payu_reference", str == null ? "" : str);
        setRequestData(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 23;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f475598d = jSONObject.optString(dm.i4.COL_ID);
        this.f475599e = jSONObject.optString("description");
    }
}
