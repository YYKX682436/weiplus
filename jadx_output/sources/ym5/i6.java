package ym5;

/* loaded from: classes10.dex */
public final class i6 implements dn5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f463389a;

    public i6(ym5.n6 n6Var) {
        this.f463389a = n6Var;
    }

    @Override // dn5.f
    public final void a(int i17) {
        ym5.n6 n6Var = this.f463389a;
        if (n6Var.f463358u.getCurMode() != 3) {
            n6Var.f463357t.setTextColor(i17);
        } else {
            n6Var.f463358u.setTag(java.lang.Integer.valueOf(i17));
            n6Var.f463357t.setTextBackground(i17);
        }
    }
}
