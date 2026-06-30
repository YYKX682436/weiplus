package je3;

@j95.b
/* loaded from: classes15.dex */
public final class m extends i95.w implements je3.i {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f299301d = jz5.h.b(je3.l.f299300d);

    @Override // je3.i
    public boolean Ii(float f17) {
        return ((f17 > 1.0f ? 1 : (f17 == 1.0f ? 0 : -1)) == 0) || f17 > ((c06.e) ((jz5.n) this.f299301d).getValue()).b();
    }

    @Override // je3.i
    public boolean Nb() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mb_performance_report_use_scl_base_biz, false);
    }

    @Override // je3.i
    public void Rg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene scene, int i18, int i19) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.autogen.mmdata.rpt.MagicBootsPkgRecordStruct magicBootsPkgRecordStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicBootsPkgRecordStruct();
        magicBootsPkgRecordStruct.f59022d = magicBootsPkgRecordStruct.b("PkgId", str, true);
        magicBootsPkgRecordStruct.f59023e = magicBootsPkgRecordStruct.b("BaseId", str2, true);
        magicBootsPkgRecordStruct.f59024f = magicBootsPkgRecordStruct.b("Version", str3, true);
        magicBootsPkgRecordStruct.f59025g = magicBootsPkgRecordStruct.b("Md5", str4, true);
        magicBootsPkgRecordStruct.f59026h = i17;
        magicBootsPkgRecordStruct.f59027i = scene.getValue();
        magicBootsPkgRecordStruct.f59028j = i18;
        magicBootsPkgRecordStruct.f59029k = i19;
        magicBootsPkgRecordStruct.k();
    }

    @Override // je3.i
    public void Sc(java.lang.String key, int i17, java.lang.String str, float f17) {
        kotlin.jvm.internal.o.g(key, "key");
        if (Ii(f17)) {
            long a17 = c01.id.a();
            if (a17 <= 0) {
                a17 = java.lang.System.currentTimeMillis();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushMonitor", "MagicBrushMonitor kvReport key[" + key + "] value[" + i17 + "] extra[" + str + "] time[" + a17 + ']');
            com.tencent.mm.autogen.mmdata.rpt.MagicBrushMonitorStruct magicBrushMonitorStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicBrushMonitorStruct();
            magicBrushMonitorStruct.f59054d = magicBrushMonitorStruct.b("key", key, true);
            magicBrushMonitorStruct.f59055e = i17;
            magicBrushMonitorStruct.f59056f = magicBrushMonitorStruct.b("extra", str != null ? r26.i0.u(str, ',', ';', false, 4, null) : null, true);
            magicBrushMonitorStruct.f59057g = a17;
            magicBrushMonitorStruct.k();
        }
    }

    @Override // je3.i
    public void T5(java.lang.String bizName, java.lang.String type, java.lang.String content, java.lang.String extras, float f17) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(extras, "extras");
        if (Ii(f17)) {
            com.tencent.mm.autogen.mmdata.rpt.MagicBrushReportRuntimeStruct magicBrushReportRuntimeStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicBrushReportRuntimeStruct();
            magicBrushReportRuntimeStruct.f59058d = magicBrushReportRuntimeStruct.b("BizName", bizName, true);
            magicBrushReportRuntimeStruct.f59059e = magicBrushReportRuntimeStruct.b("Type", type, true);
            magicBrushReportRuntimeStruct.f59060f = magicBrushReportRuntimeStruct.b("Content", r26.i0.t(content, ",", " ", false), false);
            magicBrushReportRuntimeStruct.f59061g = magicBrushReportRuntimeStruct.b("Extras", r26.i0.t(extras, ",", " ", false), false);
            magicBrushReportRuntimeStruct.k();
        }
    }

    @Override // je3.i
    public boolean W7() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mb_scl_click_report_android, false);
    }

    @Override // je3.i
    public void qa(java.lang.String sessionId, java.lang.String bizName, java.lang.String cardName, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene scene, long j17, java.util.List list, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(cardName, "cardName");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.autogen.mmdata.rpt.MagicBrushCardPerformanceReportStruct magicBrushCardPerformanceReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicBrushCardPerformanceReportStruct();
        magicBrushCardPerformanceReportStruct.f59030d = magicBrushCardPerformanceReportStruct.b("SessionID", sessionId, true);
        magicBrushCardPerformanceReportStruct.f59031e = magicBrushCardPerformanceReportStruct.b("CardName", cardName, true);
        magicBrushCardPerformanceReportStruct.f59032f = scene.getValue();
        magicBrushCardPerformanceReportStruct.f59033g = j17;
        magicBrushCardPerformanceReportStruct.f59041o = magicBrushCardPerformanceReportStruct.b("BizName", r26.n0.s0(bizName, "-", bizName), true);
        if (list != null) {
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (i17 == 0) {
                    magicBrushCardPerformanceReportStruct.f59034h = magicBrushCardPerformanceReportStruct.b("Extra0", (java.lang.String) list.get(i17), true);
                } else if (i17 == 1) {
                    magicBrushCardPerformanceReportStruct.f59035i = magicBrushCardPerformanceReportStruct.b("Extra1", (java.lang.String) list.get(i17), true);
                } else if (i17 == 2) {
                    magicBrushCardPerformanceReportStruct.f59036j = magicBrushCardPerformanceReportStruct.b("Extra2", (java.lang.String) list.get(i17), true);
                } else if (i17 == 3) {
                    magicBrushCardPerformanceReportStruct.f59037k = magicBrushCardPerformanceReportStruct.b("Extra3", (java.lang.String) list.get(i17), true);
                } else if (i17 == 4) {
                    magicBrushCardPerformanceReportStruct.f59038l = magicBrushCardPerformanceReportStruct.b("Extra4", (java.lang.String) list.get(i17), true);
                }
            }
        }
        if (jSONObject != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            magicBrushCardPerformanceReportStruct.f59039m = magicBrushCardPerformanceReportStruct.b("Extra5", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        }
        magicBrushCardPerformanceReportStruct.k();
    }

    @Override // je3.i
    public void t6(java.lang.String sessionId, java.lang.String bizName, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene scene, long j17, java.lang.String extras, float f17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(extras, "extras");
        if (Ii(f17)) {
            long j18 = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground() ? 1L : 2L;
            com.tencent.mm.autogen.mmdata.rpt.MagicBrushReportTimeCostStruct magicBrushReportTimeCostStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicBrushReportTimeCostStruct();
            magicBrushReportTimeCostStruct.f59062d = magicBrushReportTimeCostStruct.b("SessionID", sessionId, true);
            magicBrushReportTimeCostStruct.f59063e = magicBrushReportTimeCostStruct.b("BizName", bizName, true);
            magicBrushReportTimeCostStruct.f59064f = scene.getValue();
            magicBrushReportTimeCostStruct.f59065g = j17;
            magicBrushReportTimeCostStruct.f59066h = magicBrushReportTimeCostStruct.b("Extras", extras, false);
            magicBrushReportTimeCostStruct.f59067i = j18;
            magicBrushReportTimeCostStruct.k();
        }
    }

    @Override // je3.i
    public void vb(java.lang.String bizName, int i17, long j17, java.lang.String clickId, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType role, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType eventType, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType action, int i18, int i19, java.lang.String extraInfo, java.lang.String cardName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(clickId, "clickId");
        kotlin.jvm.internal.o.g(role, "role");
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        kotlin.jvm.internal.o.g(cardName, "cardName");
        com.tencent.mm.autogen.mmdata.rpt.MagicBrushClickFunnelReportStruct magicBrushClickFunnelReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicBrushClickFunnelReportStruct();
        magicBrushClickFunnelReportStruct.f59042d = magicBrushClickFunnelReportStruct.b("BizName", bizName, true);
        magicBrushClickFunnelReportStruct.f59043e = i17;
        magicBrushClickFunnelReportStruct.f59044f = 0L;
        magicBrushClickFunnelReportStruct.f59045g = magicBrushClickFunnelReportStruct.b("ClickId", clickId, true);
        magicBrushClickFunnelReportStruct.f59046h = role.getValue();
        magicBrushClickFunnelReportStruct.f59047i = eventType.getValue();
        magicBrushClickFunnelReportStruct.f59048j = action.getValue();
        magicBrushClickFunnelReportStruct.f59049k = i18;
        magicBrushClickFunnelReportStruct.f59050l = i19;
        magicBrushClickFunnelReportStruct.f59051m = magicBrushClickFunnelReportStruct.b("ExtraInfo", extraInfo, true);
        magicBrushClickFunnelReportStruct.f59052n = j17;
        magicBrushClickFunnelReportStruct.f59053o = magicBrushClickFunnelReportStruct.b("CardName", cardName, true);
        magicBrushClickFunnelReportStruct.k();
    }
}
