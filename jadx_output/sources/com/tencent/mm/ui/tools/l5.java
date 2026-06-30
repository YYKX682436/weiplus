package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public abstract class l5 {
    public static final void a(android.view.View view, long j17, float f17, float f18, com.tencent.mm.ui.tools.k5 k5Var) {
        if (view == null || fp.h.a(14)) {
            return;
        }
        android.animation.Animator animator = (android.animation.Animator) view.getTag(com.tencent.mm.R.id.lcg);
        if (animator != null) {
            animator.cancel();
        }
        com.tencent.mars.xlog.Log.i("Changelcai", "[animTran] target %s, duration:%s x:%s", view, java.lang.Long.valueOf(j17), java.lang.Float.valueOf(f17));
        view.animate().cancel();
        view.animate().setListener(null);
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(view.getContext(), com.tencent.mm.R.anim.f477822cg);
        if (k5Var == null) {
            view.animate().setDuration(j17).translationX(f17).translationY(f18).setInterpolator(loadInterpolator);
        } else {
            view.animate().setDuration(j17).translationX(f17).translationY(f18).setInterpolator(loadInterpolator).setListener(new com.tencent.mm.ui.tools.j5(k5Var));
        }
    }

    public static void b(android.view.View view, android.animation.Animator.AnimatorListener animatorListener) {
        if (view == null || fp.h.a(11)) {
            return;
        }
        android.animation.Animator animator = (android.animation.Animator) view.getTag(com.tencent.mm.R.id.lcg);
        if (animator != null) {
            animator.cancel();
        }
        android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(view.getContext(), com.tencent.mm.R.animator.f477960e);
        loadAnimator.setTarget(view);
        if (animatorListener != null) {
            loadAnimator.addListener(animatorListener);
        }
        loadAnimator.start();
        view.setTag(com.tencent.mm.R.id.lcg, loadAnimator);
    }

    public static final void c(android.view.View view, float f17, float f18) {
        if (view == null || fp.h.a(14)) {
            return;
        }
        android.animation.Animator animator = (android.animation.Animator) view.getTag(com.tencent.mm.R.id.lcg);
        if (animator != null) {
            animator.cancel();
        }
        view.animate().cancel();
        view.setTranslationX(f17);
        view.setTranslationY(f18);
    }
}
