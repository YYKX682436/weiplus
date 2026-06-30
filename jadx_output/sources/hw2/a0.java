package hw2;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.b0 f285501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hw2.b0 b0Var) {
        super(0);
        this.f285501d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hw2.b0 b0Var = this.f285501d;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(b0Var.f285505f);
        i0Var.d(com.tencent.mm.R.string.csy);
        i0Var.f(com.tencent.mm.R.string.f490608zu);
        i0Var.e(com.tencent.mm.R.string.f490503wx);
        hw2.x xVar = new hw2.x(b0Var);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.F = xVar;
        aVar.E = new hw2.y(b0Var);
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        a17.setOnDismissListener(new hw2.z(b0Var));
        return a17;
    }
}
