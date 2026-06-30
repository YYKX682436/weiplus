package pk2;

/* loaded from: classes3.dex */
public final class fa extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355748h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355749i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355748h = helper.f356103p0;
        this.f355749i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.ui.MMActivity mMActivity = this.f364427a.f356078d;
        if (mMActivity.isFinishing() || mMActivity.isDestroyed()) {
            com.tencent.mars.xlog.Log.e(o9Var.f356072a, "onItemClicked: activity is finishing or destroyed");
            return;
        }
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var == null || (g8Var = d9Var.f355658a) == null) {
            return;
        }
        pk2.g8.a(g8Var, null, null, new pk2.ea(mMActivity, o9Var, null), 3, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355749i;
    }

    @Override // qk2.f
    public boolean o() {
        return hc2.o0.a(((mm2.c1) this.f364427a.c(mm2.c1.class)).f328846n);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f355748h;
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        java.lang.String string = mMActivity.getResources().getString(com.tencent.mm.R.string.owj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.icons_outlined_link, mMActivity.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f355748h;
    }
}
