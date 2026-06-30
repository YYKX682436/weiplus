package xk3;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f455058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f455057d = imageView;
        this.f455058e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f455058e;
        float width = bitmap.getWidth() / bitmap.getHeight();
        android.widget.ImageView imageView = this.f455057d;
        imageView.setScaleType(width > ((float) imageView.getWidth()) / ((float) imageView.getHeight()) ? android.widget.ImageView.ScaleType.CENTER_INSIDE : android.widget.ImageView.ScaleType.CENTER_CROP);
        return jz5.f0.f302826a;
    }
}
