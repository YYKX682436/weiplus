package df2;

/* loaded from: classes3.dex */
public final class wm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f231700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.i62 f231701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(df2.cn cnVar, r45.i62 i62Var) {
        super(0);
        this.f231700d = cnVar;
        this.f231701e = i62Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f231701e.getInteger(2));
        df2.cn cnVar = this.f231700d;
        cnVar.s7(6, valueOf);
        cnVar.n7("clickClose", false);
        cnVar.t7(121, 20, null);
        return jz5.f0.f302826a;
    }
}
