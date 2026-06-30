package jq;

/* loaded from: classes8.dex */
public class f implements com.tencent.mm.modelbase.i1 {
    @Override // com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        return c01.ad.f37061a.b1(p0Var);
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
        r45.tp tpVar;
        com.tencent.mm.protobuf.g gVar;
        if (r0Var != null) {
            java.lang.Object obj = r0Var.f70759c;
            if ((obj instanceof qk.h6) && (tpVar = ((qk.h6) obj).field_businessInfo) != null && (gVar = tpVar.f386637e) != null) {
                try {
                    java.lang.String i17 = gVar.i();
                    com.tencent.mars.xlog.Log.i("FunctionMsg.NewXmlMsgExtension", "bussinessInfo:%s", i17);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(i17);
                    r0Var.f70761e = jSONObject.optString("msgid");
                    r0Var.f70760d = jSONObject.optString("msgtype");
                } catch (org.json.JSONException unused) {
                }
            }
        }
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.x5(r0Var);
    }
}
