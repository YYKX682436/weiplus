package l42;

/* loaded from: classes15.dex */
public class c {
    public final java.lang.String a(java.util.Map map, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!u46.l.e(str) && !u46.l.e(str2)) {
            java.lang.String str4 = str + "_" + str2;
            if (map != null && map.containsKey(str4)) {
                return (java.lang.String) map.get(str4);
            }
        }
        return str3;
    }

    public s42.b b(java.lang.String str, j62.a aVar) {
        java.lang.String str2;
        int parseInt;
        int parseInt2;
        int parseInt3;
        int parseInt4;
        int parseInt5;
        int parseInt6;
        int parseInt7;
        java.lang.String a17;
        java.lang.String a18;
        if (u46.l.e(str) || aVar == null) {
            return null;
        }
        g42.i.a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseNewScriptExptConfig configID : " + str);
        try {
            parseInt = java.lang.Integer.parseInt(a(aVar.f297890r, "ECDataSourceType", str, "0"));
            parseInt2 = java.lang.Integer.parseInt(a(aVar.f297890r, "ECDataSourceID", str, "0"));
            parseInt3 = java.lang.Integer.parseInt(a(aVar.f297890r, "ECReportID", str, "0"));
            parseInt4 = java.lang.Integer.parseInt(a(aVar.f297890r, "ECIsInstantReport", str, "0"));
            parseInt5 = java.lang.Integer.parseInt(a(aVar.f297890r, "ECIsRepeat", str, "1"));
            parseInt6 = java.lang.Integer.parseInt(a(aVar.f297890r, "ECRunPeriod", str, "0"));
            parseInt7 = java.lang.Integer.parseInt(a(aVar.f297890r, "ECDbExpireTime", str, "0"));
            a17 = a(aVar.f297890r, "ECScriptMD5", str, "");
            a18 = a(aVar.f297890r, "ECScriptUrl", str, "");
            str2 = "EdgeComputingConfigParser";
        } catch (java.lang.Exception e17) {
            e = e17;
            str2 = "EdgeComputingConfigParser";
        }
        try {
            int parseInt8 = java.lang.Integer.parseInt(a(aVar.f297890r, "ECReportMethod", str, "0"));
            org.json.JSONArray jSONArray = new org.json.JSONArray(a(aVar.f297890r, "ECFields", str, ""));
            if (!u46.l.e(a18) && !u46.l.e(a17)) {
                s42.b bVar = new s42.b();
                bVar.f402931a = str;
                bVar.f402932b = parseInt;
                bVar.f402933c = parseInt2;
                bVar.f402934d = parseInt3;
                bVar.f402936f = parseInt4;
                bVar.f402937g = parseInt5;
                bVar.f402938h = parseInt6;
                bVar.f402939i = parseInt7;
                bVar.f402944n = a17;
                bVar.f402942l = a18;
                bVar.f402940j = parseInt8;
                bVar.f402935e = new java.util.ArrayList();
                if (jSONArray.length() > 0) {
                    s42.a aVar2 = new s42.a();
                    aVar2.f402928a = 0;
                    aVar2.f402930c = "report_time_ec";
                    aVar2.f402929b = 2;
                    bVar.f402935e.add(aVar2);
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        s42.a c17 = c(jSONArray.getJSONObject(i17));
                        if (c17 != null) {
                            bVar.f402935e.add(c17);
                        }
                    }
                    java.util.Collections.sort(bVar.f402935e, new l42.a(this));
                }
                t42.a.f(true);
                return bVar;
            }
            return null;
        } catch (java.lang.Exception e18) {
            e = e18;
            t42.a.f(false);
            com.tencent.mars.xlog.Log.e(str2, "[EdgeComputingConfigParser] parseScriptJsonConfig throw Exception : " + e.getMessage());
            return null;
        }
    }

    public final s42.a c(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        g42.i.a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseNewScriptFieldConfig fieldConfigJson : " + jSONObject.toString());
        try {
            int optInt = jSONObject.optInt(dm.i4.COL_ID, 0);
            java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
            java.lang.String optString2 = jSONObject.optString("type", "");
            if (!u46.l.e(optString) && !u46.l.e(optString2) && optInt > 21) {
                s42.a aVar = new s42.a();
                aVar.f402928a = optInt - 21;
                aVar.f402930c = optString == null ? null : optString.toLowerCase();
                if (!u46.l.c("unsigned int", optString2) && !u46.l.c("long long", optString2)) {
                    if (u46.l.c("char[1024]", optString2)) {
                        aVar.f402929b = 0;
                    } else if (u46.l.c("int", optString2)) {
                        aVar.f402929b = 1;
                    }
                    return aVar;
                }
                aVar.f402929b = 2;
                return aVar;
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseNewScriptFieldConfig throw Exception : " + e17.getMessage() + ", fieldConfigJson : " + jSONObject.toString());
            return null;
        }
    }

    public s42.c d(java.lang.String str, j62.a aVar) {
        if (!u46.l.e(str) && aVar != null) {
            g42.i.a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseNewSqlExptConfig configID : " + str);
            try {
                int parseInt = java.lang.Integer.parseInt(a(aVar.f297890r, "ECReportID", str, "0"));
                java.lang.String a17 = a(aVar.f297890r, "ECScriptUrl", str, "");
                java.lang.String a18 = a(aVar.f297890r, "ECDbPath", str, "");
                java.lang.String a19 = a(aVar.f297890r, "ECScriptMD5", str, "");
                int parseInt2 = java.lang.Integer.parseInt(a(aVar.f297890r, "ECReportMethod", str, "0"));
                if (parseInt > 0 && !u46.l.e(a17) && !u46.l.e(a19)) {
                    s42.c cVar = new s42.c();
                    cVar.f402945a = str;
                    cVar.f402949e = a18;
                    cVar.f402948d = a17;
                    cVar.f402952h = a19;
                    cVar.f402946b = parseInt;
                    cVar.f402950f = parseInt2;
                    t42.a.i(true);
                    return cVar;
                }
                return null;
            } catch (java.lang.Exception e17) {
                t42.a.i(false);
                com.tencent.mars.xlog.Log.e("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseSqlJsonConfig throw Exception : " + e17.getMessage());
            }
        }
        return null;
    }

    public final s42.a e(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        g42.i.a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseScriptFieldConfig fieldConfigJson : " + jSONObject.toString());
        try {
            int optInt = jSONObject.optInt(ya.b.INDEX, 0);
            java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
            int optInt2 = jSONObject.optInt("type", 0);
            if (u46.l.e(optString)) {
                return null;
            }
            s42.a aVar = new s42.a();
            aVar.f402928a = optInt;
            aVar.f402930c = optString == null ? null : optString.toLowerCase();
            aVar.f402929b = optInt2;
            return aVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseScriptFieldConfig throw Exception : " + e17.getMessage() + ", fieldConfigJson : " + jSONObject.toString());
            return null;
        }
    }

    public s42.b f(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        org.json.JSONObject jSONObject;
        int optInt;
        int optInt2;
        int optInt3;
        int optInt4;
        int optInt5;
        int optInt6;
        int optInt7;
        int optInt8;
        java.lang.String optString;
        if (u46.l.e(str) || u46.l.e(str2)) {
            return null;
        }
        g42.i.a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseScriptJsonConfig configID : " + str + ", json : " + str2);
        try {
            jSONObject = new org.json.JSONObject(str2);
            optInt = jSONObject.optInt("dataSourceType", 0);
            optInt2 = jSONObject.optInt("dataSourceID", 0);
            optInt3 = jSONObject.optInt("reportID", 0);
            optInt4 = jSONObject.optInt("isInstantReport", 0);
            optInt5 = jSONObject.optInt("isRepeat", 1);
            optInt6 = jSONObject.optInt("runPeriod", 0);
            optInt7 = jSONObject.optInt("dbExpireTime", 0);
            optInt8 = jSONObject.optInt("reportMethod", 0);
            optString = jSONObject.optString("scriptMD5", "");
            str3 = "EdgeComputingConfigParser";
        } catch (java.lang.Exception e17) {
            e = e17;
            str3 = "EdgeComputingConfigParser";
        }
        try {
            java.lang.String optString2 = jSONObject.optString("script", "");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("fields");
            if (!u46.l.e(optString2) && !u46.l.e(optString)) {
                s42.b bVar = new s42.b();
                bVar.f402931a = str;
                bVar.f402932b = optInt;
                bVar.f402933c = optInt2;
                bVar.f402934d = optInt3;
                bVar.f402936f = optInt4;
                bVar.f402937g = optInt5;
                bVar.f402938h = optInt6;
                bVar.f402939i = optInt7;
                bVar.f402940j = optInt8;
                bVar.f402944n = optString;
                bVar.f402941k = new java.lang.String(android.util.Base64.decode(optString2, 0), com.tencent.mapsdk.internal.rv.f51270c);
                bVar.f402943m = str2;
                bVar.f402935e = new java.util.ArrayList();
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    s42.a aVar = new s42.a();
                    aVar.f402928a = 0;
                    aVar.f402930c = "report_time_ec";
                    aVar.f402929b = 2;
                    bVar.f402935e.add(aVar);
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        s42.a e18 = e(optJSONArray.getJSONObject(i17));
                        if (e18 != null) {
                            bVar.f402935e.add(e18);
                        }
                    }
                    java.util.Collections.sort(bVar.f402935e, new l42.b(this));
                }
                t42.a.f(true);
                return bVar;
            }
            return null;
        } catch (java.lang.Exception e19) {
            e = e19;
            t42.a.f(false);
            com.tencent.mars.xlog.Log.e(str3, "[EdgeComputingConfigParser] parseScriptJsonConfig throw Exception : " + e.getMessage() + ", json : " + str2);
            return null;
        }
    }

    public s42.c g(java.lang.String str, java.lang.String str2) {
        if (!u46.l.e(str) && !u46.l.e(str2)) {
            g42.i.a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseSqlJsonConfig configID : " + str + ", json : " + str2);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                int optInt = jSONObject.optInt("reportID", 0);
                java.lang.String optString = jSONObject.optString("sql", "");
                java.lang.String optString2 = jSONObject.optString("dbPath", "");
                java.lang.String optString3 = jSONObject.optString("sqlMD5", "");
                int optInt2 = jSONObject.optInt("reportMethod", 0);
                if (optInt > 0 && !u46.l.e(optString) && !u46.l.e(optString3)) {
                    s42.c cVar = new s42.c();
                    cVar.f402945a = str;
                    cVar.f402949e = optString2;
                    cVar.f402947c = optString;
                    cVar.f402952h = optString3;
                    cVar.f402946b = optInt;
                    cVar.f402950f = optInt2;
                    cVar.f402951g = str2;
                    t42.a.i(true);
                    return cVar;
                }
                return null;
            } catch (java.lang.Exception e17) {
                t42.a.i(false);
                com.tencent.mars.xlog.Log.e("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseSqlJsonConfig throw Exception : " + e17.getMessage() + ", json : " + str2);
            }
        }
        return null;
    }
}
