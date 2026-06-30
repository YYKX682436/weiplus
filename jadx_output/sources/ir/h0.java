package ir;

/* loaded from: classes12.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.i0 f293862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ir.i0 i0Var) {
        super(1);
        this.f293862d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        if (v75Var != null) {
            ir.i0 i0Var = this.f293862d;
            r45.v75 v75Var2 = i0Var.f293867c;
            if (kotlin.jvm.internal.o.b(v75Var2 != null ? java.lang.Integer.valueOf(v75Var2.f387964d) : null, java.lang.Integer.valueOf(v75Var.f387964d))) {
                i0Var.f293867c = v75Var;
                i0Var.f293869e = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
