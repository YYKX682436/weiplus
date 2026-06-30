package s4;

/* loaded from: classes7.dex */
public class a extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public android.view.animation.Animation.AnimationListener f402846d;

    public a(android.content.Context context, int i17) {
        super(context);
        float f17 = getContext().getResources().getDisplayMetrics().density;
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.s(this, f17 * 4.0f);
        shapeDrawable.getPaint().setColor(i17);
        n3.u0.q(this, shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        android.view.animation.Animation.AnimationListener animationListener = this.f402846d;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        android.view.animation.Animation.AnimationListener animationListener = this.f402846d;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        if (getBackground() instanceof android.graphics.drawable.ShapeDrawable) {
            ((android.graphics.drawable.ShapeDrawable) getBackground()).getPaint().setColor(i17);
        }
    }
}
