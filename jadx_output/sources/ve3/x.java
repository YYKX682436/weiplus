package ve3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve3/x;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/magicbrush/texture/IPCExternalTextureEventData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class x implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData data = (com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        fq0.i iVar = (fq0.i) ((jz5.n) ((fq0.n) ((gq0.q) i95.n0.c(gq0.q.class))).f265457e).getValue();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.COL_ID, data.f148156d);
        jSONObject.put("eventType", data.f148157e);
        java.lang.String str = data.f148158f;
        if (str != null) {
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, new org.json.JSONObject(str));
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        fq0.c0 c0Var = (fq0.c0) iVar;
        c0Var.getClass();
        jc3.b0 b0Var = c0Var.f265445e;
        if (b0Var != null) {
            sc3.q1 q1Var = ((rc3.f1) b0Var).f393990h;
            if (q1Var == null) {
                kotlin.jvm.internal.o.o("server");
                throw null;
            }
            q1Var.s2("onExternalTexture", jSONObject2);
        }
        callback.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
    }
}
