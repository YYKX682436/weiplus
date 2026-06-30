package l44;

/* loaded from: classes4.dex */
public class y4 implements d44.b {
    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$6");
        com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "doCacheFinderLivingRoom, snsId=" + str + ", errCode=" + i18 + ", actionType=" + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$6");
    }
}
