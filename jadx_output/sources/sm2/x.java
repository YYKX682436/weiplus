package sm2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(sm2.o4 o4Var) {
        super(1);
        this.f409777d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        sm2.o4 o4Var = this.f409777d;
        dk2.xf g17 = o4Var.g();
        if (g17 != null) {
            ((dk2.r4) g17).v(new sm2.w(o4Var));
        }
        return jz5.f0.f302826a;
    }
}
