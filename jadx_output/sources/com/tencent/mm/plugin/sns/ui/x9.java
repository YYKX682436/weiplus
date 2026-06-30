package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class x9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.y9 f171499d;

    public x9(com.tencent.mm.plugin.sns.ui.y9 y9Var) {
        this.f171499d = y9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
        com.tencent.mm.plugin.sns.ui.y9 y9Var = this.f171499d;
        if (com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p) == null || com.tencent.mm.plugin.sns.ui.pa.i(y9Var.f171624p) == null || com.tencent.mm.plugin.sns.ui.pa.k(y9Var.f171624p) == null || com.tencent.mm.plugin.sns.ui.pa.k(y9Var.f171624p).alphaAnimBtnInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.pa paVar = y9Var.f171624p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        boolean o17 = paVar.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (!o17) {
            float a17 = ym5.x.a(com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p), 4.0f);
            com.tencent.mm.plugin.sns.ui.pa paVar2 = y9Var.f171624p;
            int color = com.tencent.mm.plugin.sns.ui.pa.d(paVar2).getResources().getColor(com.tencent.mm.R.color.a4n);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            android.graphics.drawable.StateListDrawable n17 = paVar2.n(a17, color);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.tencent.mm.plugin.sns.ui.pa.i(y9Var.f171624p).setBackground(n17);
            com.tencent.mm.plugin.sns.ui.pa.i(y9Var.f171624p).setTextColor(com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p).getResources().getColor(com.tencent.mm.R.color.a4o));
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl", "btn is not enable!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
            return;
        }
        float f17 = 0.0f;
        if (valueAnimator != null) {
            try {
                f17 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", e17.toString());
            }
        }
        int color2 = com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p).getResources().getColor(com.tencent.mm.R.color.f478724ff);
        com.tencent.mm.plugin.sns.ui.pa paVar3 = y9Var.f171624p;
        int f18 = com.tencent.mm.plugin.sns.ui.pa.f(paVar3, color2, com.tencent.mm.plugin.sns.ui.pa.k(paVar3).btnDarkColor, com.tencent.mm.plugin.sns.ui.pa.k(y9Var.f171624p).btnColor);
        com.tencent.mm.plugin.sns.ui.pa paVar4 = y9Var.f171624p;
        com.tencent.mm.plugin.sns.ui.pa.i(y9Var.f171624p).setTextColor(e3.b.c(f18, com.tencent.mm.plugin.sns.ui.pa.f(paVar4, color2, com.tencent.mm.plugin.sns.ui.pa.k(paVar4).alphaAnimBtnInfo.f166015e, com.tencent.mm.plugin.sns.ui.pa.k(y9Var.f171624p).alphaAnimBtnInfo.f166013c), f17));
        int color3 = com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p).getResources().getColor(com.tencent.mm.R.color.f478601c0);
        int color4 = com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p).getResources().getColor(com.tencent.mm.R.color.f478602c1);
        com.tencent.mm.plugin.sns.ui.pa paVar5 = y9Var.f171624p;
        int f19 = com.tencent.mm.plugin.sns.ui.pa.f(paVar5, color3, com.tencent.mm.plugin.sns.ui.pa.k(paVar5).btnBgDarkColor, com.tencent.mm.plugin.sns.ui.pa.k(y9Var.f171624p).btnBgColor);
        com.tencent.mm.plugin.sns.ui.pa paVar6 = y9Var.f171624p;
        int c17 = e3.b.c(f19, com.tencent.mm.plugin.sns.ui.pa.f(paVar6, color3, com.tencent.mm.plugin.sns.ui.pa.k(paVar6).alphaAnimBtnInfo.f166016f, com.tencent.mm.plugin.sns.ui.pa.k(y9Var.f171624p).alphaAnimBtnInfo.f166014d), f17);
        com.tencent.mm.plugin.sns.ui.pa paVar7 = y9Var.f171624p;
        int f27 = com.tencent.mm.plugin.sns.ui.pa.f(paVar7, color4, com.tencent.mm.plugin.sns.ui.pa.k(paVar7).btnBgDarkColor, com.tencent.mm.plugin.sns.ui.pa.k(y9Var.f171624p).btnBgColor);
        com.tencent.mm.plugin.sns.ui.pa paVar8 = y9Var.f171624p;
        int c18 = e3.b.c(e3.b.c(f27, com.tencent.mm.plugin.sns.ui.pa.f(paVar8, color4, com.tencent.mm.plugin.sns.ui.pa.k(paVar8).alphaAnimBtnInfo.f166016f, com.tencent.mm.plugin.sns.ui.pa.k(y9Var.f171624p).alphaAnimBtnInfo.f166014d), f17), -16777216, 0.125f);
        float a18 = ym5.x.a(com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p), 4.0f);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        android.graphics.drawable.ShapeDrawable p17 = com.tencent.mm.plugin.sns.ui.pa.p(com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p), c18, a18);
        android.graphics.drawable.ShapeDrawable p18 = com.tencent.mm.plugin.sns.ui.pa.p(com.tencent.mm.plugin.sns.ui.pa.d(y9Var.f171624p), c17, a18);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, p17);
        stateListDrawable.addState(new int[0], p18);
        com.tencent.mm.plugin.sns.ui.pa.i(y9Var.f171624p).setBackground(stateListDrawable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
    }
}
