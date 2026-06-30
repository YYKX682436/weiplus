package k23;

/* loaded from: classes12.dex */
public final class q1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f303664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f303665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f303666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f303667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f303668h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303669i;

    public q1(android.view.ViewGroup viewGroup, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, android.widget.ImageView imageView4, k23.j2 j2Var) {
        this.f303664d = viewGroup;
        this.f303665e = imageView;
        this.f303666f = imageView2;
        this.f303667g = imageView3;
        this.f303668h = imageView4;
        this.f303669i = j2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.ui.widget.imageview.WeImageView mikeIcon;
        android.view.ViewGroup viewGroup = this.f303664d;
        viewGroup.getOverlay().remove(this.f303665e);
        viewGroup.getOverlay().remove(this.f303666f);
        viewGroup.getOverlay().remove(this.f303667g);
        viewGroup.getOverlay().remove(this.f303668h);
        k23.j2 j2Var = this.f303669i;
        mikeIcon = j2Var.getMikeIcon();
        mikeIcon.setAlpha(1.0f);
        j2Var.getStartBtnTv().setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
