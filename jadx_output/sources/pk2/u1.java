package pk2;

/* loaded from: classes3.dex */
public final class u1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356277h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356278i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356277h = helper.f356087h0;
        this.f356278i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        mf2.b0 b0Var = (if2.b) o9Var.e(yf2.t1.class);
        if (b0Var == null || !(b0Var instanceof jm2.d)) {
            return;
        }
        yf2.t1 t1Var = (yf2.t1) ((jm2.d) b0Var);
        t1Var.a7(false, t1Var.f461789m);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356278i;
    }

    @Override // qk2.f
    public boolean o() {
        if (((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) this.f364427a.c(mm2.g1.class)).f329068f).getValue()) != null) {
            return !zl2.r4.f473950a.T1(r0);
        }
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f356277h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ozh);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.list_circle_regular, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f356277h;
    }
}
