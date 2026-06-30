package ht2;

/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f284925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f284926e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable) {
        super(2);
        this.f284925d = imageView;
        this.f284926e = drawable;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g((java.lang.String) obj, "<anonymous parameter 0>");
        android.widget.ImageView imageView = this.f284925d;
        if (bitmap != null) {
            imageView.setAlpha(0.8f);
            imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(imageView.getResources(), bitmap));
        } else {
            imageView.setAlpha(1.0f);
            imageView.setImageDrawable(this.f284926e);
        }
        return jz5.f0.f302826a;
    }
}
