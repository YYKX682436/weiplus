package fm3;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String folder) {
        kotlin.jvm.internal.o.g(folder, "folder");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(com.tencent.mm.vfs.w6.M(new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(folder)), "config.conf").o()));
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString(dm.i4.COL_ID);
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String str = folder + '/' + optString + ".pag";
                    if (!com.tencent.mm.vfs.w6.j(str)) {
                        str = null;
                    }
                    java.lang.String str2 = "";
                    java.lang.String str3 = str == null ? "" : str;
                    java.lang.String str4 = folder + '/' + optString + ".wxam";
                    java.lang.String str5 = com.tencent.mm.vfs.w6.j(str4) ? str4 : null;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    boolean z17 = optJSONObject.optInt("is_show_in_panel", 0) == 1;
                    if (optString != null && optJSONObject2 != null) {
                        fm3.b.f264026e.getClass();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mv.DefaultPagInfo", e17, "fillPagInfoList", new java.lang.Object[0]);
        }
    }
}
