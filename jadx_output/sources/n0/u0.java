package n0;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.i3[] f333712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.f f333713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(n0.i3[] i3VarArr, p0.f fVar) {
        super(2);
        this.f333712d = i3VarArr;
        this.f333713e = fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        ((java.lang.Number) obj2).intValue();
        n0.y0 y0Var = (n0.y0) ((n0.o) obj);
        y0Var.U(935231726);
        java.lang.Object obj3 = n0.e1.f333492a;
        y0Var.U(721128344);
        r0.d dVar = r0.d.f367962f;
        dVar.getClass();
        r0.f fVar = new r0.f(dVar);
        for (n0.i3 i3Var : this.f333712d) {
            boolean z17 = i3Var.f333542c;
            n0.l1 key = i3Var.f333540a;
            if (!z17) {
                p0.f fVar2 = this.f333713e;
                kotlin.jvm.internal.o.g(fVar2, "<this>");
                kotlin.jvm.internal.o.g(key, "key");
                i17 = fVar2.containsKey(key) ? i17 + 1 : 0;
            }
            fVar.put(key, key.a(i3Var.f333541b, y0Var, 72));
        }
        r0.d b17 = fVar.b();
        y0Var.o(false);
        y0Var.o(false);
        return b17;
    }
}
