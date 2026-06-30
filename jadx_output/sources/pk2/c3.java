package pk2;

/* loaded from: classes3.dex */
public final class c3 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355603h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355604i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355603h = helper.f356101o0;
        this.f355604i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.o9 o9Var2 = this.f364427a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) o9Var2.c(mm2.c1.class)).f328917y0;
        if (finderJumpInfo != null) {
            com.tencent.mars.xlog.Log.i(o9Var.f356072a, "AnchorPopularActivityOption onClick");
            if (((zy2.b6) i95.n0.c(zy2.b6.class)) != null) {
                com.tencent.mm.ui.MMActivity context = o9Var2.f356078d;
                kotlin.jvm.internal.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f453343a;
                xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                p0Var.f453252n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355604i;
    }

    @Override // qk2.f
    public boolean o() {
        return ((mm2.c1) this.f364427a.c(mm2.c1.class)).f328917y0 != null;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f355603h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.owu);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.flag_regular, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f355603h;
    }
}
