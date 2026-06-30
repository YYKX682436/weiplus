package pk2;

/* loaded from: classes3.dex */
public final class x9 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356376h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356377i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356376h = helper.f356094l;
        this.f356377i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        ((mm2.c1) o9Var.c(mm2.c1.class)).N1 = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) o9Var.c(mm2.c1.class)).N1);
        o9Var.j(qo0.b.Z2, bundle);
        if (o9Var.f356076c == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).zj(((mm2.c1) o9Var.c(mm2.c1.class)).N1 ? ml2.o1.f327769g : ml2.o1.f327768f);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356377i;
    }

    @Override // qk2.f
    public boolean o() {
        return !((mm2.c1) this.f364427a.c(mm2.c1.class)).N1;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491700dy5);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        menu.g(this.f356376h, string, com.tencent.mm.R.raw.finder_icons_screen_clear);
    }

    @Override // qk2.h
    public int y() {
        return this.f356376h;
    }
}
