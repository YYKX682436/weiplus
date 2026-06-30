package o54;

/* loaded from: classes4.dex */
public class l implements java.lang.Runnable {
    public l(o54.m mVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader$1$1");
        o54.k.a();
        java.lang.String name = com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo.class.getName();
        t54.d dVar = t54.d.f415846a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProcessPreload", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        yz5.l lVar = t54.d.f415848c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProcessPreload", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        o54.k.b(name, lVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader$1$1");
    }
}
