package com.tencent.mm.plugin.game.luggage;

@j95.b
/* loaded from: classes.dex */
public class e0 extends i95.w implements s43.k {
    public static void wi(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameService", "clearGameCache key:%s", str);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(str);
        ew4.c.c().d().z0("wx62d9035fd4fd2059", jSONArray);
    }

    public boolean Ai(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wi(str);
            return false;
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.game.luggage.d0.class, null);
        return false;
    }
}
