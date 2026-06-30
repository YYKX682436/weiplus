package ta4;

/* loaded from: classes4.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.d1 f416736a = new ta4.d1();

    public final void a(java.lang.String eventId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPublishGroupCellEvent", "com.tencent.mm.plugin.sns.report.SnsPublishGroupReporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.lang.String l17 = ca4.z0.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPublishGroupReporter", "reportPublishGroupCellEvent sessionId:" + l17 + " eventId:" + eventId + " reportGroupStatus:" + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("50310_visiblelist", eventId, kz5.c1.k(new jz5.l("post_session_id", l17), new jz5.l("sns_post_visible_status", java.lang.Integer.valueOf(i17))), 36244);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPublishGroupCellEvent", "com.tencent.mm.plugin.sns.report.SnsPublishGroupReporter");
    }

    public final void b(java.lang.String eventId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPublishLastGroupViewEvent", "com.tencent.mm.plugin.sns.report.SnsPublishGroupReporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.lang.String l17 = ca4.z0.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPublishGroupReporter", "reportPublishLastGroupViewEvent sessionId:" + l17 + " eventId:" + eventId);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("50310_lastgroup", eventId, kz5.b1.e(new jz5.l("post_session_id", l17)), 36244);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPublishLastGroupViewEvent", "com.tencent.mm.plugin.sns.report.SnsPublishGroupReporter");
    }
}
