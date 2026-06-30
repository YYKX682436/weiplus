package mg2;

/* loaded from: classes10.dex */
public final class a extends lg2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // lg2.a
    public void k() {
        android.view.ViewGroup viewGroup = this.f318566q;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = this.f318566q;
        android.view.ViewParent parent = viewGroup2 != null ? viewGroup2.getParent() : null;
        android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup3 != null) {
            viewGroup3.addView(this.f318563n, new android.widget.FrameLayout.LayoutParams((int) (x() * s().width()), (int) (x() * s().height())));
        }
    }

    @Override // lg2.a
    public android.graphics.Rect m() {
        return new android.graphics.Rect(0, 0, (int) (x() * s().width()), (int) (x() * s().height()));
    }

    @Override // lg2.a
    public android.graphics.Rect n() {
        ig2.n nVar = this.f318565p;
        kotlin.jvm.internal.o.d(nVar);
        return nVar.f291410i;
    }

    @Override // lg2.a
    public android.view.View o() {
        android.content.Context context = this.f318556d;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = new com.tencent.mm.ui.widget.RoundedCornerFrameLayout(context);
        roundedCornerFrameLayout.setRadius(context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        ig2.n nVar = this.f318565p;
        ig2.g gVar = nVar instanceof ig2.g ? (ig2.g) nVar : null;
        if (gVar != null) {
            android.view.View view = gVar.f291375j;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
            imageView.setImageDrawable(((android.widget.ImageView) view).getDrawable());
        }
        roundedCornerFrameLayout.addView(imageView, layoutParams);
        return roundedCornerFrameLayout;
    }

    @Override // lg2.b, lg2.a, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        super.onAnimationEnd(p07);
        ig2.m.f291393a.d();
    }

    @Override // lg2.a
    public void p() {
        android.view.ViewGroup viewGroup = this.f318566q;
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f318563n);
        }
    }

    @Override // lg2.a
    public java.lang.String r() {
        return "SwitchInImageDirector";
    }

    public final float x() {
        android.view.ViewGroup viewGroup = this.f318566q;
        if (viewGroup == null) {
            return 1.0f;
        }
        kotlin.jvm.internal.o.d(viewGroup);
        float height = viewGroup.getHeight() / s().height();
        kotlin.jvm.internal.o.d(this.f318566q);
        float width = r1.getWidth() / s().width();
        return width < height ? height : width;
    }
}
