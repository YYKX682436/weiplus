package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes3.dex */
public class c4 extends android.view.ViewOutlineProvider {
    public c4(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var) {
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$2");
        try {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$2");
    }
}
