package tg2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f419168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f419169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f419170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tg2.g f419171g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f419172h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.widget.ImageView imageView, android.graphics.PointF pointF, android.graphics.PointF pointF2, tg2.g gVar, long j17) {
        super(0);
        this.f419168d = imageView;
        this.f419169e = pointF;
        this.f419170f = pointF2;
        this.f419171g = gVar;
        this.f419172h = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.PointF pointF = this.f419169e;
        float f17 = pointF.x;
        android.widget.ImageView imageView = this.f419168d;
        imageView.setX(f17 - (imageView.getWidth() / 2));
        imageView.setY(pointF.y - (imageView.getHeight() / 2));
        android.util.Property property = android.view.View.X;
        android.graphics.PointF pointF2 = this.f419170f;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) property, pointF.x - (imageView.getWidth() / 2), pointF2.x);
        long j17 = this.f419172h;
        ofFloat.setDuration(j17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.Y, pointF.y - (imageView.getHeight() / 2), pointF2.y);
        ofFloat2.setDuration(j17);
        tg2.g.a(this.f419171g, imageView, j17, ofFloat, ofFloat2);
        return jz5.f0.f302826a;
    }
}
