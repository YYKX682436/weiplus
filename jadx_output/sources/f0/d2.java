package f0;

/* loaded from: classes5.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.q f258045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(f0.q qVar) {
        super(1);
        this.f258045d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object needle) {
        kotlin.jvm.internal.o.g(needle, "needle");
        f0.q qVar = this.f258045d;
        f0.c2 c2Var = new f0.c2(qVar);
        int e17 = ((f0.s) qVar).e();
        int i17 = 0;
        while (true) {
            if (i17 >= e17) {
                i17 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(c2Var.invoke(java.lang.Integer.valueOf(i17)), needle)) {
                break;
            }
            i17++;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
