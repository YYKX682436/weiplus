package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m0 f163131a = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.m0();

    public final android.animation.ObjectAnimator a(android.view.View view, com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0 n0Var, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createHideAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AnimHelper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHideAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AnimHelper");
            return null;
        }
        if (n0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHideAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AnimHelper");
            return null;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", f17, f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getControlX1", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getControlX1", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getControlY1", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getControlY1", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getControlX2", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getControlX2", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getControlY2", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getControlY2", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(n0Var.f163136a, n0Var.f163137b, n0Var.f163138c, 1.0f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        ofFloat.setDuration(n0Var.f163139d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHideAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AnimHelper");
        return ofFloat;
    }

    public final android.animation.ObjectAnimator b(android.view.View view, com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.n0 n0Var, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createShowAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AnimHelper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createShowAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AnimHelper");
            return null;
        }
        if (n0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createShowAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AnimHelper");
            return null;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", f17, f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getControlX1", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getControlX1", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getControlY1", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getControlY1", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getControlX2", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getControlX2", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getControlY2", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getControlY2", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(n0Var.f163136a, n0Var.f163137b, n0Var.f163138c, 1.0f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.ControlParam");
        ofFloat.setDuration(n0Var.f163139d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createShowAlphaAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AnimHelper");
        return ofFloat;
    }
}
