package fm3;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f264158a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Point f264159b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.Size f264160c;

    public w(android.graphics.drawable.Drawable drawable, android.graphics.Point position, android.util.Size size) {
        kotlin.jvm.internal.o.g(position, "position");
        kotlin.jvm.internal.o.g(size, "size");
        this.f264158a = drawable;
        this.f264159b = position;
        this.f264160c = size;
    }

    public final void a(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.util.Size size = this.f264160c;
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        imageView.setLayoutParams(layoutParams);
        android.graphics.Point point = this.f264159b;
        imageView.setX(point.x);
        imageView.setY(point.y);
        imageView.setImageDrawable(this.f264158a);
    }

    public final android.animation.Animator b(fm3.w to6, android.widget.ImageView animateView, boolean z17) {
        kotlin.jvm.internal.o.g(to6, "to");
        kotlin.jvm.internal.o.g(animateView, "animateView");
        a(animateView);
        android.graphics.Point point = this.f264159b;
        float f17 = point.x;
        android.graphics.Point point2 = to6.f264159b;
        float f18 = point2.x;
        float f19 = point.y;
        float f27 = point2.y;
        android.util.Size size = this.f264160c;
        float width = size.getWidth();
        android.util.Size size2 = to6.f264160c;
        float width2 = size2.getWidth();
        float height = size.getHeight();
        float height2 = size2.getHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new fm3.v(this, f17, f18, f19, f27, width, width2, height, height2, animateView, z17));
        return ofFloat;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.w)) {
            return false;
        }
        fm3.w wVar = (fm3.w) obj;
        return kotlin.jvm.internal.o.b(this.f264158a, wVar.f264158a) && kotlin.jvm.internal.o.b(this.f264159b, wVar.f264159b) && kotlin.jvm.internal.o.b(this.f264160c, wVar.f264160c);
    }

    public int hashCode() {
        android.graphics.drawable.Drawable drawable = this.f264158a;
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f264159b.hashCode()) * 31) + this.f264160c.hashCode();
    }

    public java.lang.String toString() {
        return "MusicMvAnimationInfo(drawable=" + this.f264158a + ", position=" + this.f264159b + ", size=" + this.f264160c + ')';
    }
}
