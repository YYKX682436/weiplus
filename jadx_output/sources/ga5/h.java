package ga5;

/* loaded from: classes5.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.HashMap a() {
        java.lang.String M;
        org.json.JSONObject jSONObject;
        org.json.JSONArray names;
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRUniversalConfig", "getUniversalConfig");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_96eea621", "UDRConfig");
            if (Ui != null && (M = com.tencent.mm.vfs.w6.M(Ui.getPath())) != null && (names = (jSONObject = new org.json.JSONObject(M)).names()) != null) {
                int length = names.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String optString = names.optString(i17);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray(optString);
                    if (optJSONArray != null) {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        int length2 = optJSONArray.length();
                        for (int i18 = 0; i18 < length2; i18++) {
                            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                            java.lang.String optString2 = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                            java.lang.String optString3 = jSONObject2.optString("value");
                            com.tencent.mars.xlog.Log.i("MicroMsg.UDRUniversalConfig", "universal module %s name:%s,value:%s", optString, optString2, optString3);
                            kotlin.jvm.internal.o.d(optString2);
                            kotlin.jvm.internal.o.d(optString3);
                            hashMap2.put(optString2, optString3);
                        }
                        kotlin.jvm.internal.o.d(optString);
                        hashMap.put(optString, hashMap2);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UDRUniversalConfig", e17, "getUniversalConfig fail", new java.lang.Object[0]);
        }
        return hashMap;
    }
}
