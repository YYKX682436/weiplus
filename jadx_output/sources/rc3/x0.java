package rc3;

/* loaded from: classes7.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f394108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(rc3.f1 f1Var, int i17) {
        super(1);
        this.f394108d = f1Var;
        this.f394109e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lc3.a0 result = (lc3.a0) obj;
        kotlin.jvm.internal.o.g(result, "result");
        sc3.q1 q1Var = this.f394108d.f393990h;
        if (q1Var == null) {
            kotlin.jvm.internal.o.o("server");
            throw null;
        }
        q1Var.J5(this.f394109e, result.a());
        return jz5.f0.f302826a;
    }
}
