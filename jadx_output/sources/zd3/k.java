package zd3;

/* loaded from: classes7.dex */
public final class k extends zd3.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "registerExternalTexture";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt(dm.i4.COL_ID);
        java.lang.String optString = data.optString("type");
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        rk0.c.c("MB_External_surface", "registerExternalTexture invoke data: " + data, new java.lang.Object[0]);
        boolean b17 = kotlin.jvm.internal.o.b(optString, "finder-live");
        lc3.z zVar = lc3.x.f317937d;
        if (!b17 && !kotlin.jvm.internal.o.b(optString, "video")) {
            java.lang.String str = "type invalid: " + optString + ", id: " + optInt;
            rk0.c.b("MB_External_surface", "registerExternalTexture " + str, new java.lang.Object[0]);
            s().invoke(j(zVar, str));
            return;
        }
        if (optJSONObject == null) {
            w(zVar, "extraData is null, id: " + optInt + ", type: " + optString);
            return;
        }
        kotlin.jvm.internal.o.d(optString);
        if (kotlin.jvm.internal.o.b(optString, "finder-live")) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData(ve3.u.f436106e, optInt, optString, optJSONObject.toString(), null, 16, null), xd3.e.class, new zd3.j(this, optInt, optString, optJSONObject));
        } else {
            if (kotlin.jvm.internal.o.b(optString, "video")) {
                v(optInt, optString, optJSONObject);
                return;
            }
            w(lc3.x.f317936c, "type invalid: " + optString + ", id: " + optInt);
        }
    }

    public final void v(int i17, java.lang.String type, org.json.JSONObject jSONObject) {
        zd3.i iVar = new zd3.i(type, i17, this);
        bf3.p0 p0Var = bf3.p0.f19645a;
        int b17 = a06.d.b(p0Var.a() * jSONObject.optInt("width", 0));
        int b18 = a06.d.b(p0Var.a() * jSONObject.optInt("height", 0));
        if (b17 <= 0 || b18 <= 0) {
            w(lc3.x.f317937d, "Invalid size: w=" + b17 + ", h=" + b18 + ", id=" + i17);
            return;
        }
        jSONObject.put("containerWidth", b17);
        jSONObject.put("containerHeight", b18);
        lc3.h0 h0Var = (lc3.h0) this.f317890a;
        if (h0Var == null) {
            w(lc3.x.f317936c, "context is null, id: " + i17);
            return;
        }
        zd3.g gVar = new zd3.g(this, i17, b17, b18, iVar, jSONObject);
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.magicbrush.MagicBrush magicBrush = ((sc3.k1) h0Var).f406488t;
        kotlin.jvm.internal.o.d(magicBrush);
        com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin mBExternalTexturePlugin = magicBrush.f48582f;
        kotlin.jvm.internal.o.f(mBExternalTexturePlugin, "getExternalTexturePlugin(...)");
        bh.a.a(mBExternalTexturePlugin, type, i17, b17, b18, null, gVar, null, false, 64, null);
    }

    public final void w(lc3.z zVar, java.lang.String str) {
        if (str == null) {
            str = "unknown error";
        }
        rk0.c.b("MB_External_surface", "registerExternalTexture error: ".concat(str), new java.lang.Object[0]);
        s().invoke(j(zVar, str));
    }
}
