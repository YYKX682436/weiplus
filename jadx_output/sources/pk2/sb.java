package pk2;

/* loaded from: classes3.dex */
public final class sb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356250h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356251i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356250h = helper.A;
        this.f356251i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var == null || (g8Var = d9Var.f355658a) == null) {
            return;
        }
        pk2.g8.a(g8Var, null, null, new pk2.rb(o9Var, this, null), 3, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356251i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        if (((mm2.d1) o9Var.c(mm2.d1.class)).O6()) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (!r4Var.w1() && !r4Var.X1(((mm2.e1) o9Var.c(mm2.e1.class)).f328989s)) {
                return true;
            }
        }
        return false;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        menu.b(this.f356250h, com.tencent.mm.R.string.egf, com.tencent.mm.R.raw.finder_live_ticket_icon_in_live);
        r45.b84 b84Var = (r45.b84) ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getCustom(47);
        if (b84Var == null || (str = b84Var.getString(1)) == null) {
            str = "";
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).jk(3, str);
    }

    @Override // qk2.h
    public int y() {
        return this.f356250h;
    }
}
