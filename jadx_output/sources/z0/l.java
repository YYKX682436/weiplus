package z0;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.o f468913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n0.o oVar) {
        super(2);
        this.f468913d = oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        z0.t acc = (z0.t) obj;
        z0.t element = (z0.s) obj2;
        kotlin.jvm.internal.o.g(acc, "acc");
        kotlin.jvm.internal.o.g(element, "element");
        if (element instanceof z0.j) {
            yz5.q qVar = ((z0.j) element).f468911d;
            kotlin.jvm.internal.m0.e(qVar, 3);
            int i17 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            n0.o oVar = this.f468913d;
            element = z0.m.c(oVar, (z0.t) qVar.invoke(pVar, oVar, 0));
        }
        return acc.k(element);
    }
}
