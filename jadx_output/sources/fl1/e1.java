package fl1;

/* loaded from: classes4.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView f263754d;

    public e1(com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView appBrandGameEvaluateOptionView) {
        this.f263754d = appBrandGameEvaluateOptionView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView appBrandGameEvaluateOptionView = this.f263754d;
        fl1.d1 d1Var = appBrandGameEvaluateOptionView.f91129e;
        if (d1Var == null) {
            kotlin.jvm.internal.o.o("optionChooseCallback");
            throw null;
        }
        r45.l25 l25Var = appBrandGameEvaluateOptionView.f91128d;
        if (l25Var == null) {
            kotlin.jvm.internal.o.o("optionConfig");
            throw null;
        }
        fl1.b1 b1Var = (fl1.b1) d1Var;
        b1Var.f263701a.setVisibility(4);
        b1Var.f263702b.setVisibility(8);
        b1Var.f263703c.setVisibility(4);
        android.widget.LinearLayout linearLayout = b1Var.f263704d;
        android.view.View findViewById = linearLayout.findViewById(com.tencent.mm.R.id.kkb);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$9", "onOptionChoose", "(Lcom/tencent/mm/protocal/protobuf/OptionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$9", "onOptionChoose", "(Lcom/tencent/mm/protocal/protobuf/OptionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fl1.c1 c1Var = b1Var.f263708h;
        if (c1Var.f263744p) {
            return;
        }
        android.view.View findViewById2 = linearLayout.findViewById(com.tencent.mm.R.id.ned);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper", "animateShowThanksViewAndSubmit", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;Landroid/widget/LinearLayout;Lcom/tencent/mm/protocal/protobuf/OptionItem;Ljava/lang/Runnable;Lcom/tencent/mm/protocal/protobuf/WxagGameOriginalReviewConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper", "animateShowThanksViewAndSubmit", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;Landroid/widget/LinearLayout;Lcom/tencent/mm/protocal/protobuf/OptionItem;Ljava/lang/Runnable;Lcom/tencent/mm/protocal/protobuf/WxagGameOriginalReviewConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.o68);
        imageView.setAlpha(0.0f);
        imageView.setScaleX(0.48076922f);
        imageView.setScaleY(0.48076922f);
        imageView.setRotation(24.0f);
        imageView.setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.o69);
        r45.bg7 bg7Var = b1Var.f263707g;
        textView.setText(bg7Var.f370753g);
        textView.setAlpha(0.0f);
        textView.setVisibility(0);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new fl1.q0(c1Var, imageView, textView));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.48076922f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new fl1.r0(c1Var, imageView));
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, "rotation", 24.0f, 0.0f);
        ofFloat3.setDuration(1300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.addListener(new fl1.s0(c1Var, b1Var.f263706f));
        animatorSet.start();
        c1Var.i(b1Var.f263705e, false, l25Var, bg7Var);
    }
}
