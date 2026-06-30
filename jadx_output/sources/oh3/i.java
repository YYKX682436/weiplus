package oh3;

@j95.b
/* loaded from: classes8.dex */
public final class i extends i95.w implements p90.k {
    public void Ai(int i17, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo, r45.f03 showInfo) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        com.tencent.mm.autogen.mmdata.rpt.MMEcRedDotReportStruct mMEcRedDotReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MMEcRedDotReportStruct();
        mMEcRedDotReportStruct.f58807d = mMEcRedDotReportStruct.b("RedDotTipsUuid", ctrlInfo.field_tips_uuid, true);
        mMEcRedDotReportStruct.f58808e = ctrlInfo.getType();
        mMEcRedDotReportStruct.f58809f = mMEcRedDotReportStruct.b("RedDotShowInfoPath", showInfo.f373892i, true);
        mMEcRedDotReportStruct.f58810g = mMEcRedDotReportStruct.b("RedDotShowInfoParentPath", showInfo.f373893m, true);
        mMEcRedDotReportStruct.f58811h = showInfo.f373887d;
        mMEcRedDotReportStruct.f58812i = showInfo.f373888e;
        mMEcRedDotReportStruct.f58813j = mMEcRedDotReportStruct.b("RedDotShowInfoTitle", showInfo.f373889f, true);
        mMEcRedDotReportStruct.f58814k = i17;
        mMEcRedDotReportStruct.f58815l = java.lang.System.currentTimeMillis();
        mMEcRedDotReportStruct.f58816m = ctrlInfo.field_time;
        mMEcRedDotReportStruct.f58817n = mMEcRedDotReportStruct.b("RedDotShowInfoIconUrl", showInfo.f373890g, true);
        mMEcRedDotReportStruct.f58818o = 0L;
        mMEcRedDotReportStruct.f58819p = mMEcRedDotReportStruct.b("ReportExtInfo", ctrlInfo.field_ctrInfo.f388499t, true);
        mMEcRedDotReportStruct.o();
        mMEcRedDotReportStruct.k();
    }

    public void wi(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MMEcRedDotReportService", "[exposeMyTab] action=" + i17 + " hasRedDot=" + z17);
        if (z17) {
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("MyTab");
            r45.f03 I0 = nk6.I0("MyTab");
            if (L0 == null || I0 == null) {
                return;
            }
            ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).Ai(i17, L0, I0);
        }
    }
}
