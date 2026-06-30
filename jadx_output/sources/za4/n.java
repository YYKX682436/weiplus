package za4;

/* loaded from: classes4.dex */
public class n {
    public java.lang.Object a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var, java.lang.Class cls) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
        if (a2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
            return null;
        }
        if (cls.isInstance(a2Var)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
            return a2Var;
        }
        try {
            if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) {
                java.util.Iterator it = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) a2Var).O().iterator();
                while (it.hasNext()) {
                    java.lang.Object a17 = a((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next(), cls);
                    if (a17 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
                        return a17;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageCompFinder", "findCardComp, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
        return null;
    }
}
