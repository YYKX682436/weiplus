package d85;

/* loaded from: classes10.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d85.k0 f227244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(d85.k0 k0Var) {
        super(1);
        this.f227244d = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        d85.k0 k0Var = this.f227244d;
        if (k0Var != null) {
            k0Var.onOp(java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f302826a;
    }
}
