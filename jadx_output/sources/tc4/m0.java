package tc4;

/* loaded from: classes4.dex */
public final class m0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f417406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f417407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc4.p f417408c;

    public m0(tc4.n0 n0Var, r45.kv2 kv2Var, xc4.p pVar) {
        this.f417406a = n0Var;
        this.f417407b = kv2Var;
        this.f417408c = pVar;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        kotlin.jvm.internal.o.g(view, "view");
        long hashCode = java.lang.Long.hashCode(this.f417408c.y0()) + view.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        return hashCode;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        xc4.p n17;
        xc4.p n18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        kotlin.jvm.internal.o.g(view, "view");
        str = "";
        xc4.p pVar = this.f417408c;
        r45.kv2 kv2Var = this.f417407b;
        tc4.n0 n0Var = this.f417406a;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isVideoPlayStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            boolean z18 = n0Var.G1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isVideoPlayStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            if (!z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var.K1 = 0L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                tc4.n0.Z(n0Var, 0L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var.I1 = 0L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                long c17 = c01.id.c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var.H1 = c17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.F1 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            ((vr2.f) ((zy2.eb) i95.n0.c(zy2.eb.class))).Bi(pm0.v.Z(kv2Var.getString(0)), kv2Var.getString(8), 37, null, n0Var.getContext(), false, null);
            java.lang.String userName = pVar.getUserName();
            zc4.b data = n0Var.getData();
            com.tencent.mm.protocal.protobuf.TimeLineObject h17 = (data == null || (n18 = data.n()) == null) ? null : n18.h1();
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.tencent.mm.plugin.finder.report.m0 m0Var = com.tencent.mm.plugin.finder.report.m0.f125120d;
            kotlin.jvm.internal.o.d(userName);
            java.lang.String string = kv2Var.getString(0);
            java.lang.String str2 = string == null ? "" : string;
            int integer = kv2Var.getInteger(29);
            long j19 = h17 != null ? h17.CreateTime : 0L;
            fe0.o4 o4Var = (fe0.o4) i95.n0.c(fe0.o4.class);
            zc4.b data2 = n0Var.getData();
            if (data2 != null && (n17 = data2.n()) != null) {
                str = n17.W0();
            }
            java.lang.String Di = ((ee0.v4) o4Var).Di(str);
            kotlin.jvm.internal.o.f(Di, "getSnsPublishId(...)");
            m0Var.c(3, 1, userName, null, str2, integer, userName, null, j19, Di);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("expose end ");
            zy2.g5 V = tc4.n0.V(n0Var);
            sb6.append(V != null ? java.lang.Boolean.valueOf(V.isPlaying()) : null);
            n0Var.x("MicroMsg.Improve.FinderMediaTimelineItem", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.F1 = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            if (tc4.n0.V(n0Var) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                long j27 = n0Var.K1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                if (j27 != 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    long j28 = n0Var.J1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    long c18 = c01.id.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    long j29 = n0Var.K1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    tc4.n0.Z(n0Var, j28 + (c18 - j29));
                }
            }
            long c19 = c01.id.c();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[11];
            lVarArr[0] = new jz5.l("view_id", "sns_finder_feed_card");
            lVarArr[1] = new jz5.l("enter_publishid", tc4.n0.W(n0Var));
            java.lang.String string2 = kv2Var.getString(0);
            lVarArr[2] = new jz5.l("feed_id", string2 != null ? string2 : "");
            lVarArr[3] = new jz5.l("source_username", pVar.getUserName());
            lVarArr[4] = new jz5.l("source_commentscene", java.lang.Integer.valueOf(kv2Var.getInteger(29)));
            lVarArr[5] = new jz5.l("share_username", pVar.getUserName());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long j37 = n0Var.J1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            lVarArr[6] = new jz5.l("play_time", java.lang.Long.valueOf(j37));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long j38 = n0Var.H1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            lVarArr[7] = new jz5.l("expose_time_ms", java.lang.Long.valueOf(c19 - j38));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long j39 = n0Var.I1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            lVarArr[8] = new jz5.l("click_timestamp", java.lang.Long.valueOf(j39));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long j47 = n0Var.H1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            lVarArr[9] = new jz5.l("begin_timestamp", java.lang.Long.valueOf(j47));
            lVarArr[10] = new jz5.l("end_timestamp", java.lang.Long.valueOf(c19));
            ((cy1.a) rVar).Cj("view_unexp", view, kz5.c1.k(lVarArr), 25496);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
    }
}
