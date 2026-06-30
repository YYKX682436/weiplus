package dl4;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f235430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f235431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f235430d = bitmap;
        this.f235431e = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = this.f235430d;
        if (bitmap != null && !bitmap.isRecycled() && (imageView = this.f235431e) != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
