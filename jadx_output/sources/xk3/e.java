package xk3;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f455021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f455022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xk3.i f455023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.widget.ImageView imageView, android.graphics.Matrix matrix, android.graphics.Bitmap bitmap, xk3.i iVar) {
        super(0);
        this.f455020d = imageView;
        this.f455021e = matrix;
        this.f455022f = bitmap;
        this.f455023g = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f455020d;
        imageView.setImageMatrix(this.f455021e);
        android.graphics.Bitmap bitmap = this.f455022f;
        imageView.setImageBitmap(bitmap);
        this.f455023g.q(bitmap, imageView);
        return jz5.f0.f302826a;
    }
}
