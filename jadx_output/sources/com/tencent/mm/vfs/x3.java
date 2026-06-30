package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f213238a = {"Download", "attachment", "image", "image2", "record", "video", "voice2"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f213239b = {".planCache", "CheckResUpdate_1", "CronetCache", "configlist", "jscache", "jsengine", "surface", "biztest", "webcompt_debug", "mmslot", "tmpScanLicense", "webservice", "CDNTemp", "test_writable", "xlogtest_writable", ".planCache", ".tmp", "AudioRecord", "CDNTemp", "CheckResUpdate", "CheckResUpdate_1", "ClickFlow", "CronetCache", "Diagnostic", "Download", "FailMsgFileCache", "Game", "Handler", "ProcessDetector", "SQLTrace", "ThumbVideoCache", "WebCanvasPkg", "WebviewCache", "appbrand", "avatar", "browser", "card", "configlist", com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, "diskcache", "download", "egg_spring", "exdevice", "facedir", "fts", "game", "hbstoryvideo", "hilive", "imagecache", "jscache", "jsengine", "surface", "biztest", "webcompt_debug", "last_avatar_dir", "mail", "mapsdk", "mmslot", "music", "recovery", "regioncode", "taxi_icon", "temp_video_cache", "test_writable", "tmpScanLicense", "trace", "video", "vusericon", "wagamefiles", "wallet", "wallet", "wallet_images", "webcompt", "webservice", "webview_tmpl", "wenote", "wepkg", "wvtemp", "wxacache", "wxafiles", "wxanewfiles", "wxauto", "wxvideocache", "wxvideotmp", "xlog", "xlogtest_writable"};

    public static void a() {
        java.lang.String str;
        java.lang.String str2 = "storage_migration_report_last_report";
        long j17 = 0;
        long j18 = com.tencent.mm.sdk.platformtools.o4.L().getLong("storage_migration_report_last_report", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - j18 < 86400000) {
            return;
        }
        com.tencent.mars.xlog.Log.i("VFS.MigrationStatistics", "Report storage migration");
        int i17 = 0;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(com.tencent.mm.sdk.platformtools.o4.L().getString("storage_migration_report_items", "[]"));
            int length = jSONArray.length();
            int i18 = 0;
            while (i18 < length) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i18);
                if (optJSONObject == null) {
                    str = str2;
                } else {
                    java.lang.String optString = optJSONObject.optString("n");
                    long optLong = optJSONObject.optLong("ts", j17);
                    int optInt = optJSONObject.optInt("f", i17);
                    int optInt2 = optJSONObject.optInt("d", i17);
                    str = str2;
                    try {
                        long optLong2 = optJSONObject.optLong("a", -1L);
                        if (!optString.isEmpty()) {
                            com.tencent.mars.xlog.Log.i("VFS.MigrationStatistics", ">> KV: " + optString + ", " + optInt + ", " + optInt2 + ", " + optLong2);
                            jx3.f.INSTANCE.d(21388, optString, 0, 0, "", java.lang.Long.valueOf(optLong), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2), 0, 0, 0, java.lang.Long.valueOf(optLong2), 0, 0, com.tencent.mm.sdk.platformtools.z.f193109e);
                        }
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        com.tencent.mars.xlog.Log.printErrStackTrace("VFS.MigrationStatistics", e, "Cannot read report json", new java.lang.Object[0]);
                        com.tencent.mm.sdk.platformtools.o4.L().B(str, currentTimeMillis);
                    }
                }
                i18++;
                str2 = str;
                i17 = 0;
                j17 = 0;
            }
            str = str2;
        } catch (org.json.JSONException e18) {
            e = e18;
            str = str2;
        }
        com.tencent.mm.sdk.platformtools.o4.L().B(str, currentTimeMillis);
    }
}
