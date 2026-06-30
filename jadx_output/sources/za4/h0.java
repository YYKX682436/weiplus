package za4;

/* loaded from: classes4.dex */
public class h0 {
    public java.lang.Object a(ab4.d0 d0Var, java.lang.Class cls) {
        java.util.List a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
        if (d0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
            return null;
        }
        if (cls.isInstance(d0Var)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
            return d0Var;
        }
        try {
            if (za4.z0.s(d0Var.f2827q) && (a17 = d0Var.a()) != null) {
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    java.lang.Object a18 = a((ab4.d0) it.next(), cls);
                    if (a18 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
                        return a18;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageInfoFinder", "findCardInfo, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
        return null;
    }
}
