package i06;

/* loaded from: classes16.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k0 f286654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i06.k0 k0Var) {
        super(0);
        this.f286654d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i06.k0 k0Var = this.f286654d;
        f26.o0 returnType = k0Var.l().getReturnType();
        kotlin.jvm.internal.o.d(returnType);
        return new i06.w3(returnType, new i06.g0(k0Var));
    }
}
