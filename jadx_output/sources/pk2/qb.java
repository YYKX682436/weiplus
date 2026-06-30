package pk2;

/* loaded from: classes3.dex */
public final class qb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356203h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356204i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356203h = helper.B;
        this.f356204i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.f8.f355747a.c(6, 2, null);
        boolean b17 = kotlin.jvm.internal.o.b(((mm2.n6) o9Var.c(mm2.n6.class)).f329294g.getValue(), java.lang.Boolean.TRUE);
        ((mm2.n6) o9Var.c(mm2.n6.class)).f329294g.postValue(java.lang.Boolean.valueOf(!b17));
        db5.t7.h(this.f364427a.f356078d, b17 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dah) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dai));
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356204i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        mm2.n6 n6Var = (mm2.n6) o9Var.c(mm2.n6.class);
        return (n6Var.f329293f && n6Var.f329295h) && !zl2.r4.f473950a.X1(((mm2.e1) o9Var.c(mm2.e1.class)).f328989s);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        boolean f86 = ((mm2.c1) o9Var.c(mm2.c1.class)).f8();
        boolean b17 = kotlin.jvm.internal.o.b(((mm2.n6) o9Var.c(mm2.n6.class)).f329294g.getValue(), java.lang.Boolean.TRUE);
        pk2.o9 o9Var2 = this.f364427a;
        int i17 = this.f356203h;
        if (b17) {
            menu.l(i17, o9Var2.f356078d.getResources().getString(com.tencent.mm.R.string.efu), com.tencent.mm.R.raw.finder_subtitle_off, f86);
        } else {
            menu.l(i17, o9Var2.f356078d.getResources().getString(com.tencent.mm.R.string.efv), com.tencent.mm.R.raw.finder_subtitle_on, f86);
        }
        pk2.f8.f355747a.c(6, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f356203h;
    }
}
