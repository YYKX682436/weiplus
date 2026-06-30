package i06;

/* loaded from: classes15.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f286698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(i06.f1 f1Var) {
        super(0);
        this.f286698d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i06.f1 f1Var = this.f286698d;
        f1Var.getClass();
        f06.v[] vVarArr = i06.f1.f286632o;
        f06.v vVar = vVarArr[10];
        java.lang.Object invoke = f1Var.f286638h.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        f06.v vVar2 = vVarArr[12];
        java.lang.Object invoke2 = f1Var.f286640j.invoke();
        kotlin.jvm.internal.o.f(invoke2, "getValue(...)");
        return kz5.n0.t0((java.util.Collection) invoke, (java.util.Collection) invoke2);
    }
}
