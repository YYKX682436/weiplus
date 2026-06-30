package m54;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.f0 f324266a = new m54.f0();

    public final com.tencent.mm.ui.tools.f5 a(android.app.Activity activity) {
        com.tencent.mm.ui.tools.f5 f5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newKeyboardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghKeyboardHeightHelper");
        kotlin.jvm.internal.o.g(activity, "activity");
        m54.h0 h0Var = new m54.h0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newKeyboardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghKeyboardHeightHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportVangoghKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportVangoghKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        } else {
            int Ni = ((h62.d) e0Var).Ni(e42.c0.clicfg_sns_ad_vangogh_page_support_keyboard_height_provider, 1);
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "Vangogh page keyboard height provider: the switch value is " + Ni);
            r6 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportVangoghKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        }
        if (r6) {
            android.view.Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(48);
            }
            f5Var = new com.tencent.mm.ui.tools.f5(activity);
            f5Var.f210400e = h0Var;
        } else {
            f5Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newKeyboardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghKeyboardHeightHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newKeyboardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghKeyboardHeightHelper");
        return f5Var;
    }
}
