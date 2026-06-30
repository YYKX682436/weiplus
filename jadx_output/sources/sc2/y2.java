package sc2;

/* loaded from: classes2.dex */
public final class y2 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b3 f406380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f406381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406383g;

    public y2(sc2.b3 b3Var, float f17, android.view.View view, android.view.View view2) {
        this.f406380d = b3Var;
        this.f406381e = f17;
        this.f406382f = view;
        this.f406383g = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        sc2.b3 b3Var = this.f406380d;
        android.view.View view = b3Var.f405777x;
        if (view != null) {
            view.post(new sc2.x2(b3Var, this.f406381e, this.f406382f, this.f406383g));
        }
    }
}
