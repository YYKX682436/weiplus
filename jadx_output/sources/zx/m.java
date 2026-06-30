package zx;

/* loaded from: classes14.dex */
public final class m extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout f476957d;

    public m(com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout) {
        this.f476957d = controlledRipplesLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f476957d.f65305q = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f476957d.f65305q = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f476957d.f65305q = true;
    }
}
