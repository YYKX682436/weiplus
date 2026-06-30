package n74;

/* loaded from: classes.dex */
public final class w implements q80.f0 {
    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpLiteAppHelper$jumpLiteApp$1$1");
        com.tencent.mars.xlog.Log.i("AdJumpLiteAppHelper", "OpenLiteApp fail");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, ib1.t.CTRL_INDEX);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpLiteAppHelper$jumpLiteApp$1$1");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpLiteAppHelper$jumpLiteApp$1$1");
        com.tencent.mars.xlog.Log.i("AdJumpLiteAppHelper", "OpenLiteApp success");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SUCCESS, "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpLiteAppHelper$jumpLiteApp$1$1");
    }
}
