package j84;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j84.g0 g0Var) {
        super(2);
        this.f298236d = g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.w0 w0Var;
        android.widget.FrameLayout y17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$4");
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$4");
        j84.g0 g0Var = this.f298236d;
        g0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showClickPag", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        android.content.Context context = g0Var.f298200t;
        if (context != null) {
            android.widget.FrameLayout y18 = g0Var.y();
            if ((y18 != null ? y18.getChildCount() : Integer.MAX_VALUE) >= 5) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showClickPag", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            } else {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = g0Var.f298199s;
                if (snsInfo != null && (adXml = snsInfo.getAdXml()) != null && (w0Var = adXml.adScratchCardInfo) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScratchBeginPagInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScratchBeginPagInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                    s34.r1 r1Var = w0Var.f402813j;
                    if (r1Var != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeight", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
                        int i17 = r1Var.f325406e;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeight", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
                        int b17 = i65.a.b(context, i17);
                        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
                        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(b17, b17));
                        float f17 = g0Var.K + floatValue;
                        float f18 = b17 / 2;
                        frameLayout.setX(f17 - f18);
                        frameLayout.setY((g0Var.L + floatValue2) - f18);
                        if (com.tencent.mm.plugin.sns.ad.widget.adpag.c0.b(com.tencent.mm.plugin.sns.ad.widget.adpag.c0.f163333a, context, frameLayout, r1Var.c(), r1Var.a(), new j84.y(frameLayout), 0, 0, 96, null) != null && (y17 = g0Var.y()) != null) {
                            y17.addView(frameLayout);
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showClickPag", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$4");
            jz5.f0 f0Var = jz5.f0.f302826a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$4");
            return f0Var;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showClickPag", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$4");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$4");
        return f0Var2;
    }
}
