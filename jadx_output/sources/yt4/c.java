package yt4;

/* loaded from: classes9.dex */
public class c extends op5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465749d = "";

    public c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pin", str);
        setRequestData(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 3;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f465749d = jSONObject.optString("payu_reference");
    }
}
