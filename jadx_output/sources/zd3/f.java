package zd3;

/* loaded from: classes7.dex */
public final class f extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "prepareResourceForExternalTexture";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt(dm.i4.COL_ID);
        java.lang.String optString = data.optString("type");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        java.lang.String jSONObject = optJSONObject != null ? optJSONObject.toString() : null;
        rk0.c.c("MB_External_surface", "prepareResourceForExternalTexture invoke data: " + data, new java.lang.Object[0]);
        if (kotlin.jvm.internal.o.b(optString, "video")) {
            kotlin.jvm.internal.o.d(optString);
            java.lang.String u17 = u(optString);
            com.tencent.mm.ipcinvoker.extension.l.a(u17, new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData(ve3.u.f436106e, optInt, optString, jSONObject, null, 16, null), xd3.e.class, new zd3.d(this, u17, optInt, optString, jSONObject));
        } else {
            rk0.c.b("MB_External_surface", "prepareResourceForExternalTexture only support video type, current: " + optString, new java.lang.Object[0]);
            s().invoke(h(6, "only support video type"));
        }
    }
}
