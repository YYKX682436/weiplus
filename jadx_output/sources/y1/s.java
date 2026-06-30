package y1;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f458789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f458790e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, yz5.l lVar) {
        super(3);
        this.f458789d = z17;
        this.f458790e = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-140499264);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        if (y17 == n0.n.f333620a) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = y1.q.f458785f;
            y17 = java.lang.Integer.valueOf(y1.q.f458785f.addAndGet(1));
            y0Var.g0(y17);
        }
        y0Var.o(false);
        y1.q qVar = new y1.q(((java.lang.Number) y17).intValue(), this.f458789d, false, this.f458790e);
        y0Var.o(false);
        return qVar;
    }
}
