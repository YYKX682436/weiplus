package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class q0 implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.p0 f140619d;

    public q0(com.tencent.mm.plugin.game.p0 p0Var) {
        this.f140619d = p0Var;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f470458d) {
            return;
        }
        if (l0Var != null) {
            java.lang.String str = l0Var.f454410a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && java.util.Objects.equals(l0Var.f454411b, "insert")) {
                if (!str.equals("gh_25d9ac85a4bc")) {
                    int c17 = c01.h2.c(1);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("totalUnreadCount", c17);
                    } catch (org.json.JSONException unused) {
                    }
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    com.tencent.mm.plugin.lite.w.k("wxalite7f2b757eb3c356d7b3d4291ded2f7743", "game.gamePluginDataChange", jSONObject);
                    return;
                }
                java.util.Iterator it = l0Var.f454412c.iterator();
                while (it.hasNext()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(this.f140619d.ij((com.tencent.mm.storage.f9) it.next()));
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("newMessage", jSONObject2);
                    } catch (org.json.JSONException unused2) {
                    }
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    com.tencent.mm.plugin.lite.w.k("wxalite7f2b757eb3c356d7b3d4291ded2f7743", "game.gamePluginDataChange", jSONObject3);
                }
                return;
            }
        }
        if (l0Var != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameExternalService", "onNotifyChange talker:%s func:%s", l0Var.f454410a, l0Var.f454411b);
        }
    }
}
