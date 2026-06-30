package ta4;

/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.e1 f416740a = new ta4.e1();

    public final java.lang.String a(int i17, boolean z17) {
        java.lang.String Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionId", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        if (i17 == 3) {
            Ni = z17 ? ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni() : ca4.z0.f40071d;
            kotlin.jvm.internal.o.d(Ni);
        } else {
            Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            kotlin.jvm.internal.o.d(Ni);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        return Ni;
    }

    public final void b(java.lang.String sessionId, int i17, java.lang.String failReason, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, ta4.k type) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(failReason, "failReason");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report$default", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        c(sessionId, i17, failReason, snsInfo, z17, type, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report$default", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
    }

    public final void c(java.lang.String sessionId, int i17, java.lang.String failReason, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, ta4.k type, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(failReason, "failReason");
        kotlin.jvm.internal.o.g(type, "type");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsSaveImageVideoReporter", "Fail to get sns info, skip reporting.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
            return;
        }
        java.lang.String r17 = c01.z1.r();
        if (z18) {
            i17 = d(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.report.MaterialType");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.report.MaterialType");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_picvideo_save", kz5.c1.k(new jz5.l("sessionid_sns", sessionId), new jz5.l("sns_scene", java.lang.Integer.valueOf(i17)), new jz5.l("failed_reason", failReason), new jz5.l("sns_feed_id", ca4.z0.t0(snsInfo.field_snsId)), new jz5.l("is_success", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("isfeedpublisher", java.lang.Integer.valueOf(r17.equals(snsInfo.getUserName()) ? 1 : 0)), new jz5.l("materialtype", java.lang.Integer.valueOf(type.f416793d))), 36244);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
    }

    public final int d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiFromSceneToSnsScene", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        if (i17 == 2) {
            i17 = 3;
        } else if (i17 == 3) {
            i17 = 5;
        } else if (i17 == 4 || i17 == 5) {
            i17 = 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiFromSceneToSnsScene", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        return i17;
    }
}
