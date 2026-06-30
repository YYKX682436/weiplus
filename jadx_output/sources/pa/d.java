package pa;

/* loaded from: classes13.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f352938d;

    public d(com.google.android.material.transformation.FabTransformationBehavior fabTransformationBehavior, android.view.View view) {
        this.f352938d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f352938d.invalidate();
    }
}
