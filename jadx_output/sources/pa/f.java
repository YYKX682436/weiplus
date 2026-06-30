package pa;

/* loaded from: classes13.dex */
public class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca.j f352941d;

    public f(com.google.android.material.transformation.FabTransformationBehavior fabTransformationBehavior, ca.j jVar) {
        this.f352941d = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ca.j jVar = this.f352941d;
        ca.i revealInfo = jVar.getRevealInfo();
        revealInfo.f39764c = Float.MAX_VALUE;
        jVar.setRevealInfo(revealInfo);
    }
}
