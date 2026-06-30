package pk2;

/* loaded from: classes3.dex */
public final class p2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356139h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356140i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356139h = helper.f356105q0;
        this.f356140i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        sf2.x xVar = (sf2.x) this.f364427a.e(sf2.x.class);
        if (xVar != null) {
            xVar.r7();
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356140i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        if (zl2.r4.F1(o9Var.f356074b)) {
            return false;
        }
        return !((mm2.e1) o9Var.f356074b.a(mm2.e1.class)).b7() && zl2.r4.f473950a.M();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.String string = o9Var.f356078d.getString(com.tencent.mm.R.string.e8j);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        s(menu, this.f356139h, string, com.tencent.mm.R.raw.icon_agenda_regular);
    }

    @Override // qk2.h
    public int y() {
        return this.f356139h;
    }
}
