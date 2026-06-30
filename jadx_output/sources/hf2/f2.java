package hf2;

/* loaded from: classes10.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f281058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f281059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(hf2.l2 l2Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f281058d = l2Var;
        this.f281059e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hf2.l2 l2Var = this.f281058d;
        hf2.b2 h76 = l2Var.f281104a.h7();
        android.graphics.Bitmap bitmap = this.f281059e;
        h76.d("select_maas", bitmap, 1.0f);
        l2Var.f281104a.f7().c("select_maas", bitmap);
        return jz5.f0.f302826a;
    }
}
