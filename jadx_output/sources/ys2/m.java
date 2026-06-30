package ys2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f465170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ys2.o f465171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.graphics.Bitmap bitmap, ys2.o oVar) {
        super(0);
        this.f465170d = bitmap;
        this.f465171e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f465170d;
        boolean z17 = bitmap.getWidth() > bitmap.getHeight();
        ys2.o oVar = this.f465171e;
        oVar.d7(z17);
        android.widget.ImageView imageView = oVar.f465175o;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
