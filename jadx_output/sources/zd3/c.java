package zd3;

/* loaded from: classes7.dex */
public final class c extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "operateExternalTexture";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt(dm.i4.COL_ID);
        java.lang.String optString = data.optString("type");
        java.lang.String optString2 = data.optString("action");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        java.lang.String jSONObject = optJSONObject != null ? optJSONObject.toString() : null;
        rk0.c.c("MB_External_surface", "operateExternalTexture invoke data: " + data, new java.lang.Object[0]);
        if (kotlin.jvm.internal.o.b(optString, "finder-live") || kotlin.jvm.internal.o.b(optString, "video")) {
            kotlin.jvm.internal.o.d(optString);
            com.tencent.mm.ipcinvoker.extension.l.a(u(optString), new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData(ve3.u.f436109h, optInt, optString, jSONObject, new com.tencent.mm.ipcinvoker.type.IPCString(optString2)), xd3.e.class, new zd3.b(this));
            return;
        }
        java.lang.String str = "type invalid: " + optString + ", id: " + optInt;
        rk0.c.b("MB_External_surface", "operateExternalTexture " + str, new java.lang.Object[0]);
        s().invoke(j(lc3.x.f317937d, str));
    }
}
