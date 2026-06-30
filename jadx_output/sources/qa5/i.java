package qa5;

/* loaded from: classes5.dex */
public final class i extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f361121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa5.l f361122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f361123f;

    public i(qa5.l lVar, yz5.a aVar) {
        this.f361122e = lVar;
        this.f361123f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f361121d = true;
        super.onAnimationCancel(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        qa5.l lVar = this.f361122e;
        qa5.f fVar = lVar.f361135k;
        if (fVar != null) {
            ((com.tencent.mm.ui.chatting.adapter.k) fVar).U0(lVar.hashCode(), false, this.f361121d);
        }
        yz5.a aVar = this.f361123f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        qa5.l lVar = this.f361122e;
        qa5.f fVar = lVar.f361135k;
        if (fVar != null) {
            ((com.tencent.mm.ui.chatting.adapter.k) fVar).U0(lVar.hashCode(), true, this.f361121d);
        }
    }
}
