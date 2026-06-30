package pk2;

/* loaded from: classes3.dex */
public final class bb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355589h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355590i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355589h = helper.H;
        this.f355590i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.f8.f355747a.c(3, 2, null);
        if (!o9Var.h()) {
            r45.j52 j52Var = ((mm2.c1) o9Var.c(mm2.c1.class)).X;
            if (j52Var != null) {
                zl2.r4.f473950a.q2(j52Var, "clickVisitorPromotionMiniApp", o9Var.f356078d);
                return;
            }
            return;
        }
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var == null || (g8Var = d9Var.f355658a) == null) {
            return;
        }
        ((pk2.k9) g8Var).b(new pk2.ab(o9Var));
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355590i;
    }

    @Override // qk2.f
    public boolean o() {
        return zl2.r4.f473950a.m2(((mm2.c1) this.f364427a.c(mm2.c1.class)).X);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        menu.k(this.f355589h, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ei8), com.tencent.mm.R.raw.icons_outlined_promotion_mini_app, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0), zl2.r4.f473950a.q(o9Var.f356074b), ((mm2.c1) o9Var.c(mm2.c1.class)).W);
        ((mm2.c1) o9Var.c(mm2.c1.class)).W = false;
        pk2.f8.f355747a.c(3, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f355589h;
    }
}
