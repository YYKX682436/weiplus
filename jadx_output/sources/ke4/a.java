package ke4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ke4.a f307025a = new ke4.a();

    public final void a(java.lang.String imageId, java.lang.String snsPublishSessionId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoClose", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
        kotlin.jvm.internal.o.g(imageId, "imageId");
        kotlin.jvm.internal.o.g(snsPublishSessionId, "snsPublishSessionId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoReportHelper", "reportLivePhotoClose >> imageId: ".concat(imageId));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("live_photo_close", kz5.c1.k(new jz5.l("image_id", imageId), new jz5.l("sns_publish_sessionid", snsPublishSessionId)), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoClose", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
    }

    public final void b(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, java.lang.String str5, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoExposure", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoReportHelper", "reportLivePhotoExposure >> livePhotoSid=" + str + ", snsObjectType=" + i17 + ", snsFeedId=" + str2 + ", snsPublishSessionId=" + str3 + ", livePhotoExpFrom=" + i18 + ", imageId=" + str4 + ", sessionidSns=" + str5 + ", liveDurationMs=" + i19);
        jz5.l[] lVarArr = new jz5.l[8];
        if (str == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("live_photo_sid", str);
        lVarArr[1] = new jz5.l("sns_objecttype", java.lang.Integer.valueOf(i17));
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[2] = new jz5.l("sns_feed_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[3] = new jz5.l("sns_publish_sessionid", str3);
        lVarArr[4] = new jz5.l("live_photo_exp_from", java.lang.Integer.valueOf(i18));
        if (str4 == null) {
            str4 = "";
        }
        lVarArr[5] = new jz5.l("image_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        lVarArr[6] = new jz5.l("sessionid_sns", str5);
        lVarArr[7] = new jz5.l("live_duration_ms", java.lang.Integer.valueOf(i19));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("live_photo_exp", kz5.c1.k(lVarArr), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoExposure", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
    }

    public final void c(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, java.lang.String str4, java.lang.String str5, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoPlay", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoReportHelper", "reportLivePhotoPlay >> imageId: " + str2 + ", livePlayType: " + i17);
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("live_play_type", java.lang.Integer.valueOf(i17));
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("live_photo_sid", str);
        lVarArr[2] = new jz5.l("live_photo_exp_from", java.lang.Integer.valueOf(i18));
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[3] = new jz5.l("image_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[4] = new jz5.l("sessionid_sns", str3);
        lVarArr[5] = new jz5.l("sns_objecttype", java.lang.Integer.valueOf(i19));
        if (str4 == null) {
            str4 = "";
        }
        lVarArr[6] = new jz5.l("sns_feed_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        lVarArr[7] = new jz5.l("sns_publish_sessionid", str5);
        lVarArr[8] = new jz5.l("live_duration_ms", java.lang.Integer.valueOf(i27));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("live_photo_play", kz5.c1.k(lVarArr), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoPlay", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
    }

    public final void d(int i17, java.lang.String sessionidSns, java.lang.String snsPublishSessionId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoPopupClick", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
        kotlin.jvm.internal.o.g(sessionidSns, "sessionidSns");
        kotlin.jvm.internal.o.g(snsPublishSessionId, "snsPublishSessionId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoReportHelper", "reportLivePhotoPopupClick >> liveFeedback: " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("live_pop_win", "view_clk", kz5.c1.k(new jz5.l("live_feedback", java.lang.Integer.valueOf(i17)), new jz5.l("sessionid_sns", sessionidSns), new jz5.l("sns_publish_sessionid", snsPublishSessionId)), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoPopupClick", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
    }

    public final void e(int i17, java.lang.String sessionidSns, java.lang.String snsPublishSessionId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoPopupExposure", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
        kotlin.jvm.internal.o.g(sessionidSns, "sessionidSns");
        kotlin.jvm.internal.o.g(snsPublishSessionId, "snsPublishSessionId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoReportHelper", "reportLivePhotoPopupExposure >> liveFeedback: " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("live_pop_win", "view_exp", kz5.c1.k(new jz5.l("live_feedback", java.lang.Integer.valueOf(i17)), new jz5.l("sessionid_sns", sessionidSns), new jz5.l("sns_publish_sessionid", snsPublishSessionId)), 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoPopupExposure", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
    }
}
