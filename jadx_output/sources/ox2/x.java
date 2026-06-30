package ox2;

/* loaded from: classes3.dex */
public final class x implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349717e;

    public x(android.view.View view, android.view.View view2) {
        this.f349716d = view;
        this.f349717e = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f349716d;
        if (weImageView != null) {
            weImageView.setAlpha(0.0f);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f349717e;
        if (weImageView2 == null) {
            return;
        }
        weImageView2.setAlpha(1.0f);
    }
}
