package u4;

/* loaded from: classes13.dex */
public class b2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.r1 f424446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f424447e;

    public b2(androidx.transition.Visibility visibility, u4.r1 r1Var, android.view.View view) {
        this.f424446d = r1Var;
        this.f424447e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f424446d.a(this.f424447e);
    }
}
