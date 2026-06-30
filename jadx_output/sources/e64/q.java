package e64;

/* loaded from: classes.dex */
public abstract class q {
    public static final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportLandingPageWithMagicBrush", "com.tencent.mm.plugin.sns.ad.magicbrush.SnsAdMagicBrushSwitch");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_landing_page_magic_brush, 0);
            com.tencent.mars.xlog.Log.i("SnsAdMagicBrushSwitch", "SnsAdMagicBrushSwitch:: the switch value is " + Ni);
            boolean z17 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportLandingPageWithMagicBrush", "com.tencent.mm.plugin.sns.ad.magicbrush.SnsAdMagicBrushSwitch");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportLandingPageWithMagicBrush", "com.tencent.mm.plugin.sns.ad.magicbrush.SnsAdMagicBrushSwitch");
            return false;
        }
    }
}
