package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class u extends com.tencent.mm.plugin.sns.ui.improve.component.j {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f169000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        f169000d = O6(activity);
    }

    public final boolean O6(android.app.Activity activity) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        if (com.tencent.mm.ui.bk.v0()) {
            z17 = fp.h.c(30) && com.tencent.mm.ui.ee.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (activity != null) {
                z17 = ((!com.tencent.mm.ui.bk.N(activity.getTaskId()) && (!com.tencent.mm.ui.bk.O(activity.getContentResolver()) || activity.isInMultiWindowMode())) || com.tencent.mm.ui.ee.b(activity.getTaskId())) ? z17 : true;
            }
        } else {
            z17 = false;
        }
        tc4.n1 n1Var = tc4.x1.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRightPanel_Max_Ava_Width", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateRightPanelMaxAvaWidth", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        int a17 = n1Var.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatar_Margin_Left", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAvatar_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.g gVar = tc4.x1.T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAvatar_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatar_Margin_Left", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        int f17 = i17 - (((a17 + intValue) + n1Var.f()) + (n1Var.c() * 2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateRightPanelMaxAvaWidth", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRightPanel_Max_Ava_Width", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        boolean z18 = (!z17 || f17 > n1Var.d()) ? z17 : false;
        f169000d = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ConfigUIC", "enableLargeUI: " + z18 + ", firstCheck=" + z17 + ", RightPanelMaxAvaWidth=" + f17 + ", LargeRightPanelLayoutWidth=" + n1Var.d());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        return z18;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ConfigUIC", "onConfigurationChanged:");
        f169000d = O6(getActivity());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        ka4.n nVar = ka4.n.f306147a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTPPlayerConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        if (nVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "updateTPPlayerConfig");
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_switch_video_config, "", true);
            kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.TPConfig", "updateTPConfig serverConfig:".concat(Zi));
            if (!android.text.TextUtils.isEmpty(Zi)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                    ck4.a.f42527a = jSONObject.optInt("local_buffer_kb", ck4.a.f42527a);
                    ck4.a.f42528b = jSONObject.optInt("local_send_socket_kb", ck4.a.f42528b);
                    ck4.a.f42529c = jSONObject.optBoolean("switch_strategy_enable", ck4.a.f42529c);
                    ck4.a.f42530d = jSONObject.optLong("buffer_packet_ms", ck4.a.f42530d);
                    ck4.a.f42531e = jSONObject.optLong("left_packet_queue_ms", ck4.a.f42531e);
                    ck4.a.f42532f = jSONObject.optInt("tcp_recv_buffer_kb", ck4.a.f42532f);
                    ck4.a.f42533g = jSONObject.optInt("switch_video_limit_ms", ck4.a.f42533g);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TPConfig", "updateTPConfig TP_LOCAL_BUFFER_KB:" + ck4.a.f42527a + " TP_LOCAL_SEND_SOCKET_KB:" + ck4.a.f42528b + " TP_SWITCH_STRATEGY_ENABLE:" + ck4.a.f42529c + " TP_BUFFER_PACKET_MS:" + ck4.a.f42530d + " TP_LEFT_PACKET_QUEUE_MS:" + ck4.a.f42531e + " TP_TCP_RECV_BUFFER_KB:" + ck4.a.f42532f);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TPConfig", e17, "updateTPConfig parse json error!", new java.lang.Object[0]);
                }
            }
            com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig tPProxyServiceConfig = new com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig();
            tPProxyServiceConfig.serviceType = 100;
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            tPProxyServiceConfig.dataDir = com.tencent.mm.plugin.finder.assist.e9.f102136e;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            int i17 = ck4.a.f42527a * 1024;
            if (i17 > 0) {
                jSONObject2.put("key_localserver_buffer_size", i17);
            }
            int i18 = ck4.a.f42528b * 1024;
            if (i18 > 0) {
                jSONObject2.put("key_localserver_send_socket_buffer_size", i18);
            }
            tPProxyServiceConfig.initConfig = jSONObject2.toString();
            com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setProxyConfig(tPProxyServiceConfig);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTPPlayerConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSwitch", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        ma4.a.f325220d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_timeline_preload_switch, true);
        ma4.a.f325221e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_timeline_preload_time, "20:00-23:59", true);
        ma4.a.f325222f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_preload_nettype, 1);
        ma4.a.f325217a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_preload_in_queue, 6);
        ma4.a.f325218b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_parallel_in_queue, 3);
        ma4.a.f325219c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_max_preload, 1000);
        ma4.a.f325223g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_preload_percent, 60);
        ma4.a.f325225i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_timeline_preload_time_min, 4.0f);
        ma4.a.f325226j = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_timeline_preload_time_max, 8.0f);
        ma4.a.f325227k = ma4.a.c();
        ma4.a.f325228l = ma4.a.b();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsPreloadSwitch", "TIMELINE_MAIN_SWITCH:%b\nTIMELINE_DAY_UNABLE_PRELOAD_TIME_INTERVAL:%s\nTIMELINE_PRELOAD_NET_TYPE:%d\nTIMELINE_MAX_PRELOAD_IN_QUEUE:%d\nTIMELINE_MAX_PARALLEL_IN_QUEUE:%d\n TIMELINE_MAX_PRELOAD_COUNT:%d\nTIMELINE_PRELOAD_PERCENT:%d\nTIMELINE_OUT_PRELOAD_INTERVAL:%d\nSNS_RED_DOT_PRELOAD:%d\n SNS_PRELOAD_VIDEO_EXPIRED_TIME:%d\nSNS_RED_DOT_PRELOAD_BUSY_TIME:%s", java.lang.Boolean.valueOf(ma4.a.f325220d), ma4.a.f325221e, java.lang.Integer.valueOf(ma4.a.f325222f), java.lang.Integer.valueOf(ma4.a.f325217a), java.lang.Integer.valueOf(ma4.a.f325218b), java.lang.Integer.valueOf(ma4.a.f325219c), java.lang.Integer.valueOf(ma4.a.f325223g), java.lang.Integer.valueOf(ma4.a.f325224h), java.lang.Integer.valueOf(ma4.a.f325227k), java.lang.Integer.valueOf(ma4.a.f325228l), "20:00-23:59");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSwitch", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
    }
}
