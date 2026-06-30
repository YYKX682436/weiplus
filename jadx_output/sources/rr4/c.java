package rr4;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f399226d;

    public c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4) {
        this.f399226d = false;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", "" + i17);
        hashMap.put("passwd", str);
        hashMap.put("req_key", str3);
        hashMap.put("verify_code", str2);
        hashMap.put("pay_scene", "" + i18);
        hashMap.put("ignore_bind", str4);
        if ("0".equals(str4)) {
            this.f399226d = true;
        }
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            hashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.model.i1.f213916c);
            hashMap2.put("bindcard_scene", "" + com.tencent.mm.wallet_core.model.i1.f213915b);
        }
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1506;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 76;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/verifybind";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        jSONObject.optString("req_key");
    }
}
