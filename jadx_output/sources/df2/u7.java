package df2;

/* loaded from: classes3.dex */
public final class u7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f231503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f231504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f231503d = imageView;
        this.f231504e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f231503d;
        imageView.setColorFilter((android.graphics.ColorFilter) null);
        imageView.setImageDrawable(null);
        imageView.setImageBitmap(this.f231504e);
        return jz5.f0.f302826a;
    }
}
