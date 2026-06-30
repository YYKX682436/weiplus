package ec3;

/* loaded from: classes.dex */
public final class o1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f251071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f251072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f251073f;

    public o1(kotlin.jvm.internal.c0 c0Var, android.widget.RelativeLayout relativeLayout, yz5.a aVar) {
        this.f251071d = c0Var;
        this.f251072e = relativeLayout;
        this.f251073f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        if (!this.f251071d.f310112d) {
            this.f251072e.setVisibility(8);
        }
        yz5.a aVar = this.f251073f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
