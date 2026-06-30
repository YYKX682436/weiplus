package oy2;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy2.a0 f350007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(oy2.a0 a0Var) {
        super(1);
        this.f350007d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f350007d.f349942g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
