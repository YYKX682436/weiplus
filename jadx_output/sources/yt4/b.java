package yt4;

/* loaded from: classes9.dex */
public class b extends op5.a {
    public b(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("old_pin", str);
        hashMap.put("new_pin", "" + str2);
        setRequestData(hashMap);
    }

    @Override // op5.a
    public int H() {
        return 2;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
