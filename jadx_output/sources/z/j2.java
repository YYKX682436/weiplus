package z;

/* loaded from: classes14.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(z.l2 l2Var) {
        super(0);
        this.f468708d = l2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        z.l2 l2Var = this.f468708d;
        java.util.ListIterator listIterator = l2Var.f468728h.listIterator();
        long j17 = 0;
        while (true) {
            x0.s0 s0Var = (x0.s0) listIterator;
            if (!s0Var.hasNext()) {
                break;
            }
            j17 = java.lang.Math.max(j17, ((z.f2) s0Var.next()).b().f468577h);
        }
        java.util.ListIterator listIterator2 = l2Var.f468729i.listIterator();
        while (true) {
            x0.s0 s0Var2 = (x0.s0) listIterator2;
            if (!s0Var2.hasNext()) {
                return java.lang.Long.valueOf(j17);
            }
            j17 = java.lang.Math.max(j17, ((java.lang.Number) ((n0.x1) ((z.l2) s0Var2.next()).f468732l).getValue()).longValue());
        }
    }
}
