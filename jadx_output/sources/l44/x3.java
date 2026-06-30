package l44;

/* loaded from: classes4.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f316416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f316417e;

    public x3(java.util.ArrayList arrayList, boolean z17) {
        this.f316416d = arrayList;
        this.f316417e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$3");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        java.util.ArrayList arrayList = this.f316416d;
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        } else {
            java.util.Iterator it = arrayList.iterator();
            boolean z17 = false;
            boolean z18 = false;
            while (it.hasNext()) {
                l44.y3 y3Var = (l44.y3) it.next();
                if (!android.text.TextUtils.isEmpty(y3Var.f316425a)) {
                    if (y3Var.f316427c == 2) {
                        z17 = true;
                    } else {
                        z18 = true;
                    }
                }
            }
            boolean z19 = this.f316417e;
            if (z17 || z18) {
                l44.z3.g(arrayList, z19, z17, z18);
            } else {
                com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "doPreloadWeAppEnvForNativeLandingPage, preloadWeAppPkg=" + z19 + ", no weAppUserName");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        com.tencent.mars.xlog.Log.i("AdWeAppPreloader", "---checkPreloadWeAppEnvForNativeLandingPage, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$3");
    }
}
