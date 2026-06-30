package ut2;

/* loaded from: classes3.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f431004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f431005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(android.graphics.Bitmap bitmap, ut2.j5 j5Var) {
        super(0);
        this.f431004d = bitmap;
        this.f431005e = j5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        ut2.j5 j5Var = this.f431005e;
        android.graphics.Bitmap bitmap = this.f431004d;
        if (bitmap != null) {
            j5Var.q().setImageBitmap(bitmap);
            d92.f.f227470a.k(j5Var.q(), (bitmap.getWidth() * 16.0f) / bitmap.getHeight(), 16.0f);
            j5Var.q().setVisibility(0);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            j5Var.q().setVisibility(8);
        }
        return f0Var2;
    }
}
