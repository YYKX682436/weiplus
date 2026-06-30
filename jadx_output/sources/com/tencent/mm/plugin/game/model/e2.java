package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class e2 implements com.tencent.wechat.aff.game.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f140302a = "GameSyncManagerImpl";

    public final org.json.JSONObject a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        boolean has = jSONObject.has("message_control");
        java.lang.String str = this.f140302a;
        if (has && (jSONObject3 = jSONObject.getJSONObject("message_control")) != null && jSONObject3.has("pull_cooldown_interval")) {
            long optLong = jSONObject3.optLong("pull_cooldown_interval", 0L);
            if (optLong > 0) {
                long currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) + optLong;
                com.tencent.mm.sdk.platformtools.o4.M("game_redot").putLong("next_pulldown_time", currentTimeMillis);
                com.tencent.mars.xlog.Log.i(str, "preprocessGameJson pull_cooldown_interval: %d seconds, nextPulldownTime: %d", java.lang.Long.valueOf(optLong), java.lang.Long.valueOf(currentTimeMillis));
            }
        }
        if (jSONObject.has("msg_bubble_info")) {
            org.json.JSONObject jSONObject4 = jSONObject.getJSONObject("msg_bubble_info");
            if (jSONObject4.has("jump_id")) {
                java.lang.String string = jSONObject4.getString("jump_id");
                jSONObject4.remove("jump_id");
                wq5.n.a(jSONObject4, "jump_id", string);
            }
        }
        if (jSONObject.has("exposure_strategy") && (jSONObject2 = jSONObject.getJSONObject("exposure_strategy")) != null && jSONObject2.has("ignore_exceed_exposure")) {
            java.lang.Object obj = jSONObject2.get("ignore_exceed_exposure");
            if (obj instanceof java.lang.Boolean) {
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                jSONObject2.put("ignore_exceed_exposure", booleanValue ? 1 : 0);
                com.tencent.mars.xlog.Log.i(str, "preprocessGameJson convert ignore_exceed_exposure from boolean to int: %b -> %d", obj, java.lang.Integer.valueOf(booleanValue ? 1 : 0));
            }
        }
        if (jSONObject.has("jump_info")) {
            org.json.JSONObject jSONObject5 = jSONObject.getJSONObject("jump_info");
            if (jSONObject5.has("jump")) {
                java.lang.Object obj2 = jSONObject5.get("jump");
                if (obj2 instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        org.json.JSONObject jSONObject6 = jSONArray.getJSONObject(i17);
                        if (jSONObject6.has("jump_id")) {
                            java.lang.String string2 = jSONObject6.getString("jump_id");
                            jSONObject6.remove("jump_id");
                            wq5.n.a(jSONObject6, dm.i4.COL_ID, string2);
                        }
                    }
                } else if (obj2 instanceof org.json.JSONObject) {
                    org.json.JSONObject jSONObject7 = (org.json.JSONObject) obj2;
                    if (jSONObject7.has("jump_id")) {
                        java.lang.String string3 = jSONObject7.getString("jump_id");
                        jSONObject7.remove("jump_id");
                        wq5.n.a(jSONObject7, dm.i4.COL_ID, string3);
                    }
                }
            }
        }
        org.json.JSONObject jSONObject8 = new org.json.JSONObject();
        wq5.n.a(jSONObject8, "newmsgtype", "100");
        org.json.JSONArray names = jSONObject.names();
        if (names != null) {
            for (int i18 = 0; i18 < names.length(); i18++) {
                java.lang.String string4 = names.getString(i18);
                jSONObject8.put(string4, jSONObject.get(string4));
            }
        }
        org.json.JSONObject jSONObject9 = new org.json.JSONObject();
        wq5.n.a(jSONObject9, "type", "gamecenter");
        jSONObject9.put("gamecenter", jSONObject8);
        org.json.JSONObject jSONObject10 = new org.json.JSONObject();
        jSONObject10.put("sysmsg", jSONObject9);
        return jSONObject10;
    }

    public final void b(java.lang.String str) {
        java.lang.String str2 = this.f140302a;
        if (str == null || str.isEmpty()) {
            com.tencent.mars.xlog.Log.w(str2, "processGameData gameDataJson is empty");
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i(str2, "processGameData gameDataJson length:%d", java.lang.Integer.valueOf(str.length()));
            java.lang.String str3 = null;
            try {
                wq5.e eVar = new wq5.e(new wq5.h(new java.io.StringReader(a(new org.json.JSONObject(str)).toString())));
                java.lang.Character ch6 = wq5.i.f448711a;
                str3 = wq5.i.e(eVar, null, wq5.j.f448720e);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Json.XmlToJsonUtil", e17, "toXml", new java.lang.Object[0]);
            }
            if (str3 != null && !str3.isEmpty()) {
                com.tencent.mars.xlog.Log.i(str2, "processGameData xmlContent length:%d", java.lang.Integer.valueOf(str3.length()));
                com.tencent.mm.plugin.game.model.e1 a17 = com.tencent.mm.plugin.game.model.h1.a(str3);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.w(str2, "processGameData parse message failed");
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i(str2, "processGameData parse success, msgId:%s gameMsgId:%s", java.lang.Long.valueOf(a17.field_msgId), a17.field_gameMsgId);
                    ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().s(a17);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.w(str2, "processGameData toXml failed");
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str2, e18, "processGameData failed", new java.lang.Object[0]);
        }
    }
}
