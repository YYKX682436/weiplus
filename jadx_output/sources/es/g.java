package es;

/* loaded from: classes14.dex */
public abstract class g {
    public static final void a(android.view.View view, long j17, float f17, float f18, es.f fVar) {
        if (view != null) {
            android.animation.Animator animator = (android.animation.Animator) view.getTag(com.tencent.mm.R.id.lcg);
            if (animator != null) {
                animator.cancel();
            }
            kd.c.c("Changelcai", "[animTran] duration:%s x:%s", java.lang.Long.valueOf(j17), java.lang.Float.valueOf(f17));
            view.animate().cancel();
            view.animate().setListener(null);
            android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(view.getContext(), com.tencent.mm.R.anim.f477822cg);
            if (fVar == null) {
                view.animate().setDuration(j17).translationX(f17).translationY(f18).setInterpolator(loadInterpolator);
            } else {
                view.animate().setDuration(j17).translationX(f17).translationY(f18).setInterpolator(loadInterpolator).setListener(new es.e(fVar));
            }
        }
    }

    public static final void b(android.view.View view, float f17, float f18) {
        if (view != null) {
            android.animation.Animator animator = (android.animation.Animator) view.getTag(com.tencent.mm.R.id.lcg);
            if (animator != null) {
                animator.cancel();
            }
            view.animate().cancel();
            view.setTranslationX(f17);
            view.setTranslationY(f18);
        }
    }
}
