package xk3;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f455055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f455055d = bitmap;
        this.f455056e = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f455055d;
        float width = bitmap.getWidth() / bitmap.getHeight();
        android.widget.ImageView imageView = this.f455056e;
        boolean z17 = width > ((float) imageView.getWidth()) / ((float) imageView.getHeight());
        imageView.setScaleType(z17 ? android.widget.ImageView.ScaleType.CENTER_INSIDE : android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setBackground(z17 ? new android.graphics.drawable.ColorDrawable(-16777216) : null);
        return jz5.f0.f302826a;
    }
}
