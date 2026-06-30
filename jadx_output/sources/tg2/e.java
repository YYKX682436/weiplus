package tg2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f419164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f419165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tg2.g f419166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f419167g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.widget.ImageView imageView, android.graphics.PointF pointF, tg2.g gVar, android.graphics.PointF pointF2) {
        super(0);
        this.f419164d = imageView;
        this.f419165e = pointF;
        this.f419166f = gVar;
        this.f419167g = pointF2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.PointF pointF = this.f419165e;
        float f17 = pointF.x;
        android.widget.ImageView imageView = this.f419164d;
        imageView.setX(f17 - (imageView.getWidth() / 2));
        imageView.setY(pointF.y - (imageView.getHeight() / 2));
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(pointF.x - (imageView.getWidth() / 2), pointF.y - (imageView.getHeight() / 2));
        float f18 = pointF.x;
        android.graphics.PointF pointF2 = this.f419167g;
        float f19 = pointF2.x;
        float f27 = 2;
        float abs = ((f18 + f19) * 0.5f) - (java.lang.Math.abs(f18 - f19) / f27);
        float f28 = pointF.y;
        float f29 = pointF2.y;
        path.quadTo(abs, ((f28 + f29) * 0.5f) - (java.lang.Math.abs(f28 - f29) / f27), pointF2.x, pointF2.y);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.X, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.Y, path);
        ofFloat.setInterpolator(tg2.g.f419173b);
        ofFloat.setDuration(1650L);
        tg2.g.a(this.f419166f, imageView, 1650L, ofFloat);
        return jz5.f0.f302826a;
    }
}
