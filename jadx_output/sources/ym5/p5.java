package ym5;

/* loaded from: classes10.dex */
public final class p5 implements dn5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f463467a;

    public p5(ym5.y5 y5Var) {
        this.f463467a = y5Var;
    }

    @Override // dn5.f
    public final void a(int i17) {
        ym5.y5 y5Var = this.f463467a;
        java.lang.String str = y5Var.f463581x;
        y5Var.f463358u.getCurMode();
        if (y5Var.f463358u.getCurMode() != 3) {
            y5Var.f463357t.setTextColor(i17);
        } else {
            y5Var.f463358u.setTag(java.lang.Integer.valueOf(i17));
            y5Var.f463357t.setTextBackground(i17);
        }
    }
}
