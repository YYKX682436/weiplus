package pa;

/* loaded from: classes13.dex */
public class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.transformation.ExpandableTransformationBehavior f352934d;

    public b(com.google.android.material.transformation.ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f352934d = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f352934d.f44624e = null;
    }
}
