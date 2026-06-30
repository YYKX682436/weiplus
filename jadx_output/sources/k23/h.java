package k23;

/* loaded from: classes12.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f303578d;

    public h(k23.q qVar) {
        this.f303578d = qVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        k23.q qVar = this.f303578d;
        qVar.getVb().b().setAlpha(1.0f);
        android.view.View[] viewArr = {qVar.getVb().a(), qVar.getVb().f(), qVar.getVb().c(), qVar.getVb().e(), qVar.getVb().d()};
        for (int i17 = 0; i17 < 5; i17++) {
            android.view.View view = viewArr[i17];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView$enterValueAnimationV1$2$invoke$lambda$2$$inlined$doOnStart$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView$enterValueAnimationV1$2$invoke$lambda$2$$inlined$doOnStart$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
