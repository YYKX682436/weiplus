package ym5;

/* loaded from: classes3.dex */
public class g0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.ExpandTextView f463338d;

    public g0(com.tencent.mm.view.ExpandTextView expandTextView) {
        this.f463338d = expandTextView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.view.ExpandTextView expandTextView = this.f463338d;
        expandTextView.f213302d.setAlpha(1.0f);
        expandTextView.f213302d.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
