package xa4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xa4.b f452821a = new xa4.b();

    public final void a(boolean z17, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsPostBottomSheetClk", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        java.lang.String l17 = ca4.z0.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsPostBottomSheetClk >> " + z17 + " action: " + i17 + " sessionId: " + l17 + " scene: " + i18);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_post_actionsheet", "view_clk", kz5.c1.k(new jz5.l("is_red_dot", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("actionsheet_opt", java.lang.Integer.valueOf(i17 == nc4.d.f336123e.h() ? 0 : i17 == nc4.d.f336125g.h() ? 1 : i17 == nc4.d.f336124f.h() ? 2 : i17 == nc4.d.f336128m.h() ? 6 : -1)), new jz5.l("post_session_id", l17), new jz5.l("sns_scene", java.lang.Integer.valueOf(i18))), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsPostBottomSheetClk", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void b(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsPostBottomSheetExp", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "isShowRedDot >> " + z17 + " scene: " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_post_actionsheet", "view_exp", kz5.c1.k(new jz5.l("is_red_dot", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("sns_scene", java.lang.Integer.valueOf(i17))), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsPostBottomSheetExp", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void c(boolean z17, java.lang.String eventId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsTimelineCameraEntrance", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsTimelineCameraEntrance >> isShowRedDot: " + z17 + " eventId: " + eventId + " scene: " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_camera", eventId, kz5.c1.k(new jz5.l("is_red_dot", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("sns_scene", java.lang.Integer.valueOf(i17))), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsTimelineCameraEntrance", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void d(java.lang.String eventId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsUploadBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.lang.String l17 = ca4.z0.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsUploadBtn >> " + eventId + " postSessionId: " + l17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_post_btn", eventId, kz5.b1.e(new jz5.l("post_session_id", l17)), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsUploadBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void e(java.lang.String eventId, java.lang.String feedId, com.tencent.mm.plugin.sns.storage.v1 comment, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsYearCallBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(comment, "comment");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsYearCallBtn >> feedId: " + feedId + " eventId: " + eventId + " isWished: " + z17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("pay_new_year_call", eventId, kz5.c1.k(new jz5.l("sns_feed_id", feedId), new jz5.l("sns_notice_usr", comment.field_talker), new jz5.l("sns_notice_cid", java.lang.String.valueOf(comment.S)), new jz5.l("return_state", java.lang.Integer.valueOf(z17 ? 1 : 0))), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsYearCallBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void f(java.lang.String eventId, java.lang.String feedId, com.tencent.mm.plugin.sns.storage.v1 comment, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsYearCallMsg", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(comment, "comment");
        if (comment.field_type == 22) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsYearCallMsg >> feedId: " + feedId + " eventId: " + eventId);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("pay_new_year_call_msg", eventId, kz5.c1.k(new jz5.l("sns_feed_id", feedId), new jz5.l("sns_notice_usr", comment.field_talker), new jz5.l("sns_notice_cid", java.lang.String.valueOf(comment.S)), new jz5.l("is_tag_expired", java.lang.Integer.valueOf(z17 ? 1 : 0))), 33050);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsYearCallMsg", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void g(java.lang.String eventId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWsFoldSettingActionSheet", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportWsFoldSettingActionSheet >> " + eventId + ", fold_btn_type >> " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_fold_sheet_btn", eventId, kz5.b1.e(new jz5.l("fold_btn_type", java.lang.Integer.valueOf(i17))), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWsFoldSettingActionSheet", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }
}
