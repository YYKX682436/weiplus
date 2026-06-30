package rt4;

/* loaded from: classes9.dex */
public class c extends op5.a {
    public c(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bind_serial", str);
        hashMap.put("payu_reference", "" + str2);
        setRequestData(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 6;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
