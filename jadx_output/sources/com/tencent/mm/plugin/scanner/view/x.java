package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class x implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f160006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f160007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t f160008g;

    public x(android.widget.TextView textView, com.tencent.mm.plugin.scanner.view.t0 t0Var, com.tencent.mm.plugin.scanner.view.t tVar) {
        this.f160006e = textView;
        this.f160007f = t0Var;
        this.f160008g = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.widget.TextView textView = this.f160006e;
        if (textView != null) {
            textView.setText(this.f160005d);
        }
        java.lang.String str = this.f160005d;
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f160007f;
        java.util.Map map = t0Var.f159988r;
        java.lang.String str2 = map != null ? (java.lang.String) map.get("personal_passport") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = t0Var.getContext().getString(com.tencent.mm.R.string.n3a);
        }
        java.util.Map map2 = t0Var.f159988r;
        java.lang.String str3 = map2 != null ? (java.lang.String) map2.get("center_of_screen") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = t0Var.getContext().getString(com.tencent.mm.R.string.f493658n36);
        }
        java.util.Map map3 = t0Var.f159988r;
        java.lang.String str4 = map3 != null ? (java.lang.String) map3.get("stay_stable") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            str4 = t0Var.getContext().getString(com.tencent.mm.R.string.n3b);
        }
        java.util.Map map4 = t0Var.f159988r;
        java.lang.String str5 = map4 != null ? (java.lang.String) map4.get("finger_occluded") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            str5 = t0Var.getContext().getString(com.tencent.mm.R.string.f493656n34);
        }
        java.util.Map map5 = t0Var.f159988r;
        java.lang.String str6 = map5 != null ? (java.lang.String) map5.get("get_closer") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            str6 = t0Var.getContext().getString(com.tencent.mm.R.string.f493657n35);
        }
        java.util.Map map6 = t0Var.f159988r;
        java.lang.String str7 = map6 != null ? (java.lang.String) map6.get("smooth_display") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            str7 = t0Var.getContext().getString(com.tencent.mm.R.string.n3_);
        }
        java.util.Map map7 = t0Var.f159988r;
        java.lang.String str8 = map7 != null ? (java.lang.String) map7.get("exist_reflection") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
            str8 = t0Var.getContext().getString(com.tencent.mm.R.string.n39);
        }
        java.util.Map map8 = t0Var.f159988r;
        java.lang.String str9 = map8 != null ? (java.lang.String) map8.get("blurry_photo") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
            str9 = t0Var.getContext().getString(com.tencent.mm.R.string.f493654n32);
        }
        if (!kotlin.jvm.internal.o.b(str, str2)) {
            if (kotlin.jvm.internal.o.b(str, str3)) {
                t0Var.x(2);
            } else if (kotlin.jvm.internal.o.b(str, str4)) {
                t0Var.x(12);
            } else if (kotlin.jvm.internal.o.b(str, str5)) {
                t0Var.x(3);
            } else if (kotlin.jvm.internal.o.b(str, str6)) {
                t0Var.x(4);
            } else if (kotlin.jvm.internal.o.b(str, str7)) {
                t0Var.x(5);
            } else if (kotlin.jvm.internal.o.b(str, str8)) {
                t0Var.x(17);
            } else if (kotlin.jvm.internal.o.b(str, str9)) {
                t0Var.x(18);
            }
        }
        if (textView != null) {
            textView.announceForAccessibility(this.f160005d);
        }
        float[] fArr = new float[2];
        fArr[0] = textView != null ? textView.getAlpha() : 0.0f;
        fArr[1] = 1.0f;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, "alpha", fArr);
        ofFloat.setDuration(500L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new com.tencent.mm.plugin.scanner.view.w(this.f160008g, textView, t0Var));
        animatorSet.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
