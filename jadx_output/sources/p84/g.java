package p84;

/* loaded from: classes4.dex */
public final class g extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView f352793e;

    public g(com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView animLabelView) {
        this.f352793e = animLabelView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentAppearAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView.f163508r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView animLabelView = this.f352793e;
        java.lang.String str5 = animLabelView.f163509d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        if (this.f39706d) {
            str = "onAnimationEnd";
            str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentAppearAnim$1$1";
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startArrowAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startArrowAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            if (animLabelView.f163516n == null) {
                android.widget.ImageView imageView = animLabelView.f163514i;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("mArrowIcon");
                    throw null;
                }
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, 0.0f);
                ofFloat.setDuration(500L);
                p84.a aVar = p84.e.f352778n;
                ofFloat.setInterpolator(aVar.a());
                android.widget.ImageView imageView2 = animLabelView.f163514i;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("mArrowIcon");
                    throw null;
                }
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView2, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(500L);
                ofFloat2.setInterpolator(aVar.a());
                float b17 = i65.a.b(animLabelView.getContext(), 4);
                android.widget.ImageView imageView3 = animLabelView.f163514i;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("mArrowIcon");
                    throw null;
                }
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView3, "translationX", 0.0f, b17);
                str4 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentAppearAnim$1$1";
                ofFloat3.setDuration(500L);
                ofFloat3.setInterpolator(aVar.a());
                android.widget.ImageView imageView4 = animLabelView.f163514i;
                if (imageView4 == null) {
                    kotlin.jvm.internal.o.o("mArrowIcon");
                    throw null;
                }
                str3 = "onAnimationEnd";
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView4, "translationX", b17, b17);
                ofFloat4.setDuration(500L);
                ofFloat4.setInterpolator(aVar.a());
                android.widget.ImageView imageView5 = animLabelView.f163514i;
                if (imageView5 == null) {
                    kotlin.jvm.internal.o.o("mArrowIcon");
                    throw null;
                }
                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView5, "alpha", 1.0f, 0.0f);
                ofFloat5.setDuration(500L);
                ofFloat5.setInterpolator(aVar.a());
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2);
                animatorSet.play(ofFloat3).after(ofFloat);
                animatorSet.play(ofFloat4).with(ofFloat5).after(ofFloat3);
                animatorSet.addListener(new p84.f(animLabelView));
                animLabelView.f163516n = animatorSet;
            } else {
                str3 = "onAnimationEnd";
                str4 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentAppearAnim$1$1";
            }
            android.animation.AnimatorSet animatorSet2 = animLabelView.f163516n;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startArrowAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startArrowAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            str = str3;
            str2 = str4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
