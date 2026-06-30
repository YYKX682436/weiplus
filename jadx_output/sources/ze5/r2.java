package ze5;

/* loaded from: classes9.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        super(1);
        this.f472177d = f9Var;
        this.f472178e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        imageView.setVisibility(0);
        com.tencent.mm.storage.f9 f9Var = this.f472177d;
        if (com.tencent.mm.ui.chatting.viewitems.s1.a(f9Var, f9Var.z0())) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var.z0(), i65.a.g(this.f472178e.g()), false);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
