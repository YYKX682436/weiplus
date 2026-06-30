package zd3;

/* loaded from: classes7.dex */
public final class o extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "unRegisterExternalTexture";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt(dm.i4.COL_ID);
        java.lang.String optString = data.optString("type");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        java.lang.String jSONObject = optJSONObject != null ? optJSONObject.toString() : null;
        rk0.c.c("MB_External_surface", "unRegisterExternalTexture invoke data: " + data, new java.lang.Object[0]);
        if (kotlin.jvm.internal.o.b(optString, "finder-live") || kotlin.jvm.internal.o.b(optString, "video")) {
            lc3.h0 h0Var = (lc3.h0) this.f317890a;
            if (h0Var != null) {
                kotlin.jvm.internal.o.d(optString);
                com.tencent.magicbrush.MagicBrush magicBrush = ((sc3.k1) h0Var).f406488t;
                kotlin.jvm.internal.o.d(magicBrush);
                magicBrush.f48582f.b(optString, optInt);
            }
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData(ve3.u.f436108g, optInt, optString, jSONObject, null, 16, null), xd3.e.class, new zd3.n(this));
            return;
        }
        java.lang.String str = "type invalid: " + optString + ", id: " + optInt;
        rk0.c.b("MB_External_surface", "unRegisterExternalTexture " + str, new java.lang.Object[0]);
        s().invoke(j(lc3.x.f317937d, str));
    }
}
