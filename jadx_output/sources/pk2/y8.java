package pk2;

/* loaded from: classes3.dex */
public final class y8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(pk2.d9 d9Var) {
        super(1);
        this.f356402d = d9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        pk2.d9 d9Var = this.f356402d;
        java.lang.Integer num = d9Var.f355675r;
        if (num != null && intValue == num.intValue()) {
            d9Var.f355675r = null;
        }
        return jz5.f0.f302826a;
    }
}
