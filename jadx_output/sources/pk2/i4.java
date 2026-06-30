package pk2;

/* loaded from: classes3.dex */
public final class i4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355836h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355837i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355836h = helper.f356075b0;
        this.f355837i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) this.f364427a.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
        if (r5Var != null) {
            ll2.e.b(ll2.e.f319133a, "startlive.bottom.shopping", false, false, 6, null);
            qo0.b bVar = qo0.b.f365349f2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
            r5Var.X6(bVar, bundle);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355837i;
    }

    @Override // qk2.f
    public boolean o() {
        r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) this.f364427a.c(mm2.g1.class)).f329068f).getValue();
        if (q12Var == null) {
            return false;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        return (r4Var.p2(q12Var) || r4Var.X1(q12Var)) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f355836h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dug);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.shopping_bag_regular, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f355836h;
    }
}
