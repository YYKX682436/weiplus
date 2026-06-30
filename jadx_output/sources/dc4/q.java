package dc4;

/* loaded from: classes4.dex */
public class q implements xd4.e0 {
    public q(dc4.u uVar) {
    }

    @Override // xd4.e0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$1");
        com.tencent.mars.xlog.Log.w("MicroMsg.AdNormalSightDetailItem", "timelineVideoView setUICallback onDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$1");
    }
}
