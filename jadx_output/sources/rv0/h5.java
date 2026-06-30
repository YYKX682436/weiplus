package rv0;

/* loaded from: classes5.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.k5 f400035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(rv0.k5 k5Var) {
        super(0);
        this.f400035d = k5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rv0.k5 k5Var = this.f400035d;
        return java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) k5Var.f400090i).getValue()).intValue() - (((java.lang.Number) ((jz5.n) k5Var.f400089h).getValue()).intValue() * 2));
    }
}
