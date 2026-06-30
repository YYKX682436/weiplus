package qt2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f366626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.widget.ImageView imageView) {
        super(1);
        this.f366626d = imageView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f366626d;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
