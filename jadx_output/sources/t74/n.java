package t74;

/* loaded from: classes4.dex */
public final class n extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f416199g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416200h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f416201i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416202m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416203n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f416204o;

    public n(t74.w1 w1Var, android.view.View view, android.view.View view2, int i17, android.view.View view3, float f17, android.view.View view4, android.view.View view5, float f18) {
        this.f416196d = w1Var;
        this.f416197e = view;
        this.f416198f = view2;
        this.f416199g = i17;
        this.f416200h = view3;
        this.f416201i = f17;
        this.f416202m = view4;
        this.f416203n = view5;
        this.f416204o = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        t74.w1 w1Var = this.f416196d;
        if (t74.w1.l0(w1Var)) {
            com.tencent.mars.xlog.Log.i(w1Var.j(), "doFlipCardAnim onAnimationEnd, shouldInterceptAction");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1");
            return;
        }
        t74.i2 R = t74.w1.R(w1Var);
        if (R != null) {
            R.d();
        }
        android.view.View view = this.f416197e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$doFlipCardAnim$o1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$doFlipCardAnim$o1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f416198f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$doFlipCardAnim$o1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$doFlipCardAnim$o1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = this.f416199g;
        t74.w1.i0(w1Var, i17);
        com.tencent.mm.ui.base.MMDotView O = t74.w1.O(w1Var);
        if (O != null) {
            O.setSelectedDot(t74.w1.N(w1Var));
        }
        if (i17 == 0) {
            w1Var.L0();
            t74.i2 R2 = t74.w1.R(w1Var);
            if (R2 != null) {
                R2.c(0);
            }
            if (t74.w1.Y(w1Var)) {
                t74.i2 R3 = t74.w1.R(w1Var);
                if (R3 != null) {
                    R3.e(1);
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H = t74.w1.H(w1Var);
                if (H != null) {
                    H.M(0, false);
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H2 = t74.w1.H(w1Var);
                if (H2 != null) {
                    H2.setTag(com.tencent.mm.R.id.f486984n33, 1);
                }
            }
        } else {
            t74.i2 R4 = t74.w1.R(w1Var);
            if (R4 != null) {
                R4.c(1);
            }
            if (t74.w1.Z(w1Var)) {
                t74.i2 R5 = t74.w1.R(w1Var);
                if (R5 != null) {
                    R5.e(0);
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W = t74.w1.W(w1Var);
                if (W != null) {
                    W.M(0, false);
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W2 = t74.w1.W(w1Var);
                if (W2 != null) {
                    W2.setTag(com.tencent.mm.R.id.f486984n33, 1);
                }
            }
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(150L);
        float f17 = this.f416201i;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f416200h, "rotationY", -f17, 0.0f);
        android.view.View view3 = this.f416202m;
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view3, "rotationY", -f17, 0.0f);
        float f18 = this.f416204o;
        ofFloat2.addUpdateListener(new t74.l(view3, f18, w1Var));
        float[] fArr = {-f17, 0.0f};
        android.view.View view4 = this.f416203n;
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view4, "rotationY", fArr);
        ofFloat3.addUpdateListener(new t74.m(view4, f18, w1Var));
        animatorSet.addListener(new t74.k(w1Var, i17));
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1");
    }
}
