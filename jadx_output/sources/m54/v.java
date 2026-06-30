package m54;

/* loaded from: classes4.dex */
public abstract class v {
    public static final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        try {
            boolean z17 = true;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_landing_page_dynamic_canvas_ui, 1);
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "DynamicCanvasSwitch:: the switch value is " + Ni);
            if (Ni <= 0) {
                z17 = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportVangogh", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            return false;
        }
    }
}
