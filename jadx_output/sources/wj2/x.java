package wj2;

/* loaded from: classes10.dex */
public final class x implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.y f446734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f446735e;

    public x(wj2.y yVar, boolean z17) {
        this.f446734d = yVar;
        this.f446735e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        wj2.y yVar = this.f446734d;
        yVar.getPkExtraView().setVisibility(8);
        if (this.f446735e) {
            yVar.getFinderLiveMicAnchorAudioLayout().setVisibility(0);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        wj2.y yVar = this.f446734d;
        yVar.getPkExtraView().setVisibility(8);
        if (this.f446735e) {
            yVar.getFinderLiveMicAnchorAudioLayout().setVisibility(0);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
