package com.tencent.mm.plugin.game.luggage.jsevent;

/* loaded from: classes.dex */
public class k implements vz.k1 {
    @Override // vz.k1
    public void Z(int i17, long j17) {
        com.tencent.mm.plugin.game.luggage.jsevent.n nVar = com.tencent.mm.plugin.game.luggage.jsevent.o.f139798a;
        try {
            switch (i17) {
                case 1:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                    if (c17 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("appid", c17.field_appId);
                    jSONObject.put("download_id", c17.field_downloadId);
                    jSONObject.put("state", "download_start");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxdownload:state_change");
                    bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
                    ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                    com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, tw4.a.class, null);
                    nVar.a(bundle);
                    return;
                case 2:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c18 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                    if (c18 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("appid", c18.field_appId);
                    jSONObject2.put("download_id", c18.field_downloadId);
                    if (c18.field_fromDownloadApp && c18.field_downloadInWifi && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                        jSONObject2.put("state", "download_wait_for_wifi");
                    } else {
                        jSONObject2.put("state", "download_pause");
                    }
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxdownload:state_change");
                    bundle2.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2.toString());
                    ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                    com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle2, tw4.a.class, null);
                    nVar.a(bundle2);
                    return;
                case 3:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c19 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                    if (c19 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("appid", c19.field_appId);
                    jSONObject3.put("download_id", c19.field_downloadId);
                    jSONObject3.put("state", "download_succ");
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxdownload:state_change");
                    bundle3.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject3.toString());
                    ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                    com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle3, tw4.a.class, null);
                    nVar.a(bundle3);
                    return;
                case 4:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c27 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                    if (c27 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put("appid", c27.field_appId);
                    jSONObject4.put("download_id", c27.field_downloadId);
                    jSONObject4.put("state", "download_removed");
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxdownload:state_change");
                    bundle4.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject4.toString());
                    ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                    com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle4, tw4.a.class, null);
                    nVar.a(bundle4);
                    return;
                case 5:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c28 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                    if (c28 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("appid", c28.field_appId);
                    jSONObject5.put("download_id", c28.field_downloadId);
                    jSONObject5.put("state", "download_fail");
                    android.os.Bundle bundle5 = new android.os.Bundle();
                    bundle5.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxdownload:state_change");
                    bundle5.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject5.toString());
                    ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                    com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle5, tw4.a.class, null);
                    nVar.a(bundle5);
                    return;
                case 6:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c29 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                    if (c29 != null) {
                        long j18 = c29.field_totalSize;
                        if (j18 != 0) {
                            long j19 = c29.field_downloadedSize;
                            int i18 = (int) ((j19 / j18) * 100.0d);
                            float f17 = (((float) j19) / ((float) j18)) * 100.0f;
                            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                            jSONObject6.put("appid", c29.field_appId);
                            jSONObject6.put("download_id", c29.field_downloadId);
                            jSONObject6.put("progress", i18);
                            jSONObject6.put("progress_float", f17);
                            android.os.Bundle bundle6 = new android.os.Bundle();
                            bundle6.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxdownload:progress_change");
                            bundle6.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject6.toString());
                            ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                            com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle6, tw4.a.class, null);
                            nVar.a(bundle6);
                            return;
                        }
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsDownloadEventDispatch", "loadDownloadProgress failed");
                    return;
                case 7:
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    h02.a c37 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                    if (c37 == null) {
                        return;
                    }
                    org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                    jSONObject7.put("appid", c37.field_appId);
                    jSONObject7.put("download_id", c37.field_downloadId);
                    jSONObject7.put("state", "download_resumed");
                    android.os.Bundle bundle7 = new android.os.Bundle();
                    bundle7.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxdownload:state_change");
                    bundle7.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject7.toString());
                    ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                    com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle7, tw4.a.class, null);
                    nVar.a(bundle7);
                    return;
                default:
                    return;
            }
        } catch (org.json.JSONException unused) {
        }
    }
}
