package z;

/* loaded from: classes14.dex */
public final class s2 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468829a;

    public s2(z.l2 l2Var) {
        this.f468829a = l2Var;
    }

    @Override // n0.a2
    public void dispose() {
        z.l2 l2Var = this.f468829a;
        ((n0.q4) l2Var.f468726f).setValue(Long.MIN_VALUE);
        java.lang.Object d17 = l2Var.d();
        z.e1 e1Var = l2Var.f468721a;
        ((n0.q4) e1Var.f468642a).setValue(d17);
        ((n0.q4) l2Var.f468725e).setValue(0L);
        ((n0.q4) e1Var.f468643b).setValue(java.lang.Boolean.FALSE);
    }
}
