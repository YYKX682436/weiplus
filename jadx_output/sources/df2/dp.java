package df2;

/* loaded from: classes15.dex */
public final class dp extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        mm2.e1 e1Var;
        super.onLiveActivate();
        mm2.e1 e1Var2 = (mm2.e1) business(mm2.e1.class);
        long j17 = e1Var2.f328988r.getLong(0);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.i2 i2Var = (ym5.i2) ((jz5.n) ym5.l2.f463425b).getValue();
        long j18 = i2Var.f463382a;
        if (j18 == j17) {
            e1Var = e1Var2;
        } else {
            if (j18 != 0) {
                i2Var.f463382a = 0L;
            }
            i2Var.f463382a = j17;
            e1Var = e1Var2;
            i2Var.f463383b = new ym5.h2(j17, 0, 0, 0.0d, 0.0d, 0, 0, 0.0d, 0.0d, ac1.g.CTRL_INDEX, null);
        }
        ym5.u1.f463547b = new df2.cp(pm0.v.u(j17), e1Var.R6());
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        ym5.h2 h2Var = null;
        ym5.u1.f463547b = null;
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.i2 i2Var = (ym5.i2) ((jz5.n) ym5.l2.f463425b).getValue();
        if (i2Var.f463382a != 0) {
            i2Var.f463382a = 0L;
            h2Var = i2Var.f463383b;
        }
        if (h2Var != null) {
            long j17 = h2Var.f463363a;
            if (j17 != 0) {
                com.tencent.mm.autogen.mmdata.rpt.FinderLivePAGStatisticReportStruct finderLivePAGStatisticReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePAGStatisticReportStruct();
                finderLivePAGStatisticReportStruct.f57260f = finderLivePAGStatisticReportStruct.b("LiveId", pm0.v.u(j17), true);
                int i17 = h2Var.f463368f;
                finderLivePAGStatisticReportStruct.f57258d = i17;
                if (i17 > 0) {
                    finderLivePAGStatisticReportStruct.f57261g = (long) ((h2Var.f463371i * 1000.0d) / h2Var.f463369g);
                    finderLivePAGStatisticReportStruct.f57263i = (long) (h2Var.f463370h * 1000.0d);
                }
                int i18 = h2Var.f463364b;
                finderLivePAGStatisticReportStruct.f57259e = i18;
                if (i18 > 0) {
                    finderLivePAGStatisticReportStruct.f57262h = (long) ((h2Var.f463367e * 1000.0d) / h2Var.f463365c);
                    finderLivePAGStatisticReportStruct.f57264j = (long) (h2Var.f463366d * 1000.0d);
                }
                com.tencent.mars.xlog.Log.i("LivePAGReportController", "report31499 liveId:" + finderLivePAGStatisticReportStruct.f57260f + ", mainGiftPagCnt:" + finderLivePAGStatisticReportStruct.f57258d + ", mainGiftPagAvgFrameTimeF:" + finderLivePAGStatisticReportStruct.f57261g + ", mainGiftPagAvgFrameTimeMaxF:" + finderLivePAGStatisticReportStruct.f57263i + ",mainGiftRfxCnt:" + finderLivePAGStatisticReportStruct.f57259e + ", mainGiftRfxAvgFrameTimeF:" + finderLivePAGStatisticReportStruct.f57262h + ", mainGiftRfxAvgFrameTimeMaxF:" + finderLivePAGStatisticReportStruct.f57264j);
                finderLivePAGStatisticReportStruct.k();
            }
        }
    }
}
