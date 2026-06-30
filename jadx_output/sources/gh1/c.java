package gh1;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "postMessageToMiniprogram";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        fh1.i iVar;
        com.tencent.mm.plugin.appbrand.service.c0 C0;
        kotlin.jvm.internal.o.g(data, "data");
        fh1.x0 x0Var = (fh1.x0) this.f317890a;
        if (x0Var == null || (iVar = x0Var.f262622x) == null) {
            s().invoke(i(lc3.x.f317936c));
            return;
        }
        java.lang.String optString = data.optString("appId");
        if (optString == null || optString.length() == 0) {
            s().invoke(i(lc3.x.f317937d));
            return;
        }
        java.lang.String optString2 = data.optString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        fh1.z zVar = (fh1.z) iVar;
        if (u46.l.c(zVar.f262627a.f74803n, optString) && (C0 = zVar.f262627a.C0()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (optString2 == null) {
                optString2 = "";
            }
            C0.g("onMessageFromMagicBrushFrame", jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, optString2).put("biz", zVar.f262628b).toString());
        }
        s().invoke(k());
    }
}
