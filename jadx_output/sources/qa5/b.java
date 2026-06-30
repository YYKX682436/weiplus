package qa5;

/* loaded from: classes5.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.content.AnimTextView f361117d;

    public b(com.tencent.mm.ui.anim.content.AnimTextView animTextView) {
        this.f361117d = animTextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f361117d.f197179q = false;
    }
}
