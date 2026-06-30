package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class r3 {
    public r3(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findRandomPickCardTitleComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp$Companion");
        if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 u3Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3) a2Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findRandomPickCardTitleComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp$Companion");
            return u3Var;
        }
        if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) {
            java.util.Iterator it = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) a2Var).O().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 a17 = a((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) it.next());
                if (a17 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findRandomPickCardTitleComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp$Companion");
                    return a17;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findRandomPickCardTitleComponent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp$Companion");
        return null;
    }
}
