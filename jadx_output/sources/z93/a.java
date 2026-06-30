package z93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiChangeW1wPersonalMsgSwitch", "changeW1wPersonalMsgSwitch called");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("fromUsername") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("toUsername") : null;
        java.lang.Boolean valueOf = jSONObject != null ? java.lang.Boolean.valueOf(jSONObject.optBoolean("canRecvMsg")) : null;
        if (jSONObject != null) {
            boolean z18 = true;
            if (!(optString == null || optString.length() == 0)) {
                if (optString2 != null && optString2.length() != 0) {
                    z18 = false;
                }
                if (!z18 && valueOf != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiChangeW1wPersonalMsgSwitch", "LiteAppJsApiChangeW1wPersonalMsgSwitch fromUsername:" + optString + ", toUsername:" + optString2 + ", canRecvMsg:" + valueOf);
                    try {
                        gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
                        java.lang.String str2 = ((fr4.g0) fVar).f265829p;
                        kotlin.jvm.internal.o.d(str2);
                        fr4.g0 g0Var = (fr4.g0) fVar;
                        g0Var.ij(str2, optString2, optString, g0Var.Vi().y0(str2).field_status, valueOf.booleanValue(), g0Var.Ri(str2));
                        com.tencent.mm.plugin.lite.api.o oVar = this.f143443f;
                        if (oVar != null) {
                            oVar.d(false);
                            return;
                        }
                        return;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiChangeW1wPersonalMsgSwitch", "Error updating session canRecvMsg", e17);
                        com.tencent.mm.plugin.lite.api.o oVar2 = this.f143443f;
                        if (oVar2 != null) {
                            oVar2.a("Error: " + e17.getMessage());
                            return;
                        }
                        return;
                    }
                }
            }
        }
        com.tencent.mm.plugin.lite.api.o oVar3 = this.f143443f;
        if (oVar3 != null) {
            oVar3.a("LiteAppJsApiChangeW1wPersonalMsgSwitch missing params");
        }
    }
}
