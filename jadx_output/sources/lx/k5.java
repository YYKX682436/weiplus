package lx;

/* loaded from: classes4.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f321838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(kotlin.jvm.internal.c0 c0Var, yz5.l lVar) {
        super(1);
        this.f321838d = c0Var;
        this.f321839e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        kotlin.jvm.internal.c0 c0Var = this.f321838d;
        if (!c0Var.f310112d) {
            c0Var.f310112d = true;
            this.f321839e.invoke(kotlin.Result.m520boximpl(value));
        }
        return jz5.f0.f302826a;
    }
}
