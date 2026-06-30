package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public class t6 implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f143786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f143787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.q6 f143788c;

    public t6(com.tencent.mm.plugin.lite.jsapi.comms.q6 q6Var, java.util.HashMap hashMap, org.json.JSONObject jSONObject) {
        this.f143788c = q6Var;
        this.f143786a = hashMap;
        this.f143787b = jSONObject;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 n1Var) {
        org.json.JSONObject jSONObject = this.f143787b;
        java.util.Objects.toString(n1Var.f71103a);
        com.tencent.mm.modelcdntran.m1 m1Var = n1Var.f71103a;
        int ordinal = m1Var.ordinal();
        java.util.HashMap hashMap = this.f143786a;
        com.tencent.mm.plugin.lite.jsapi.comms.q6 q6Var = this.f143788c;
        if (ordinal != 3) {
            if (ordinal == 4) {
                dn.h hVar = n1Var.f71108f;
                if (hVar != null) {
                    try {
                        jSONObject.put("cdnthumburl", hVar.field_fileId);
                        jSONObject.put("cdnthumbmd5", hVar.field_filemd5);
                        jSONObject.put("cdnthumblength", hVar.field_thumbimgLength);
                        jSONObject.put("cdnthumbaeskey", hVar.field_aesKey);
                        q6Var.f143732i.put("oldImageInfo", jSONObject.toString());
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", e17.getMessage());
                    }
                    hashMap.put("oldImageInfo", jSONObject.toString());
                }
                q6Var.A(q6Var.f143732i, hashMap);
                return;
            }
            if (ordinal != 16 && ordinal != 17) {
                switch (ordinal) {
                    case 12:
                    case 13:
                    case 14:
                        break;
                    default:
                        return;
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, q6Var.C(q6Var.f143730g, java.lang.String.format("[uploadOldImageInfo] upload cdn error with action %s", m1Var)));
        q6Var.A(q6Var.f143732i, hashMap);
    }
}
