package xk3;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f455060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f455060d = bitmap;
        this.f455061e = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f455060d != null) {
            float width = r0.getWidth() / r0.getHeight();
            android.widget.ImageView imageView = this.f455061e;
            imageView.setScaleType(width > ((float) imageView.getWidth()) / ((float) imageView.getHeight()) ? android.widget.ImageView.ScaleType.CENTER_INSIDE : android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        return jz5.f0.f302826a;
    }
}
