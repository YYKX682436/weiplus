package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes.dex */
class q implements com.tencent.mm.ipcinvoker.j {
    private q() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("appId");
        java.lang.String string2 = bundle.getString("keys");
        if (bundle.getBoolean("clearAllData")) {
            ew4.c.c().d().y0(string);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            try {
                ew4.c.c().d().z0(string, new org.json.JSONArray(string2));
            } catch (org.json.JSONException unused) {
            }
        }
        rVar.a(null);
    }
}
