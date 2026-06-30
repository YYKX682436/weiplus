package l44;

/* loaded from: classes2.dex */
public class z4 implements zy2.t9 {
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFailure", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
        com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", "preloadVideo onFailure, feedId is " + j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFailure", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
    }
}
