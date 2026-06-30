package e0;

/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.s f245659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(e0.s sVar) {
        super(1);
        this.f245659d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object needle) {
        kotlin.jvm.internal.o.g(needle, "needle");
        e0.s sVar = this.f245659d;
        e0.n1 n1Var = new e0.n1(sVar);
        int e17 = ((e0.u) sVar).e();
        int i17 = 0;
        while (true) {
            if (i17 >= e17) {
                i17 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(n1Var.invoke(java.lang.Integer.valueOf(i17)), needle)) {
                break;
            }
            i17++;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
