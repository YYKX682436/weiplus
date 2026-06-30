package ta4;

/* loaded from: classes4.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.k1 f416795a = new ta4.k1();

    public final java.util.Map a(xc4.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genCommonParams", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        java.util.Map l17 = kz5.c1.l(new jz5.l("sns_scene", 1), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()), new jz5.l("sns_feed_id", ca4.z0.t0(pVar.c1().field_snsId)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genCommonParams", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        return l17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(xc4.p r7, java.util.Map r8) {
        /*
            r6 = this;
            java.lang.String r0 = "putPoiShareParams"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            wa4.b0 r2 = wa4.b0.f444203a
            java.lang.String r7 = r7.W0()
            wa4.f0 r7 = r2.b(r7)
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L2d
            r45.ed4 r4 = r7.a()
            if (r4 == 0) goto L2d
            java.lang.String r4 = r4.f373316i
            if (r4 == 0) goto L2d
            int r4 = r4.length()
            if (r4 <= 0) goto L28
            r4 = r2
            goto L29
        L28:
            r4 = r3
        L29:
            if (r4 != r2) goto L2d
            r4 = r2
            goto L2e
        L2d:
            r4 = r3
        L2e:
            if (r7 == 0) goto L3a
            java.util.List r5 = r7.b()
            if (r5 == 0) goto L3a
            int r3 = r5.size()
        L3a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "has_poi"
            r8.put(r5, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "pic_cnt"
            r8.put(r4, r3)
            java.lang.String r3 = "getFeedMediaType"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            if (r7 == 0) goto L62
            java.lang.String r4 = "getInfoType"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            wa4.d0 r7 = r7.f444225a
            goto L63
        L62:
            r7 = 0
        L63:
            if (r7 != 0) goto L67
            r7 = -1
            goto L6f
        L67:
            int[] r4 = ta4.i1.f416768a
            int r7 = r7.ordinal()
            r7 = r4[r7]
        L6f:
            if (r7 == r2) goto L79
            r4 = 2
            if (r7 == r4) goto L79
            r2 = 3
            if (r7 == r2) goto L78
            goto L79
        L78:
            r2 = r4
        L79:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "sns_feed_media_type"
            r8.put(r2, r7)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta4.k1.b(xc4.p, java.util.Map):void");
    }

    public final void c(java.lang.String eventId, int i17, xc4.p snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportGetPostBizFooterBar", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map a17 = a(snsInfo);
        a17.put("get_lead_result", java.lang.Integer.valueOf(i17));
        if (rVar != null) {
            ((cy1.a) rVar).Ej(eventId, a17, 36244);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetPostBizFooterBar", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
    }

    public final void d(java.lang.String eventId, int i17, xc4.p snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportShareReturn", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map a17 = a(snsInfo);
        a17.put("post_status", java.lang.Integer.valueOf(i17));
        b(snsInfo, a17);
        if (rVar != null) {
            ((cy1.a) rVar).Ej(eventId, a17, 36244);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportShareReturn", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
    }

    public final void e(android.view.View view, java.lang.String viewId, xc4.p snsInfo, java.util.Map customParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareBtnReporter", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(customParams, "customParams");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).pk(view, viewId);
        }
        if (rVar != null) {
            ((cy1.a) rVar).tk(view, snsInfo.W0());
        }
        if (rVar != null) {
            ((cy1.a) rVar).Ai(view, new ta4.j1(snsInfo, customParams));
        }
        ((cy1.a) rVar).kk(view, 40, 36244, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareBtnReporter", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
    }
}
