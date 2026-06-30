package df2;

/* loaded from: classes3.dex */
public final class sm implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f231349d;

    public sm(df2.cn cnVar) {
        this.f231349d = cnVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.i62 i62Var = (r45.i62) obj;
        if (i62Var != null) {
            df2.cn cnVar = this.f231349d;
            boolean p76 = cnVar.p7();
            com.tencent.mars.xlog.Log.i(cnVar.f229892p, "receive bubble, hasLiked=" + p76 + ", hasBubbleShowed = " + cnVar.G + ", data=" + pm0.b0.g(i62Var));
            if (cnVar.G || p76) {
                return;
            }
            cnVar.G = true;
            cnVar.k7(cnVar);
            cnVar.s7(1, java.lang.Integer.valueOf(i62Var.getInteger(2)));
            cnVar.t7(120, 1, null);
            java.lang.String string = cnVar.O6().getString(com.tencent.mm.R.string.m8a);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = cnVar.O6().getString(com.tencent.mm.R.string.m8_);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            cnVar.l7(new df2.d9(string, null, string2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_live_heart), 0, 0, 48, null));
            cnVar.h7(new df2.wm(cnVar, i62Var));
            java.lang.Number valueOf = java.lang.Integer.valueOf(i62Var.getInteger(0));
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf == null) {
                valueOf = java.lang.Long.valueOf(cnVar.f229894r);
            }
            cnVar.A = valueOf.longValue();
            cnVar.g7(new df2.xm(cnVar, i62Var));
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i62Var.getInteger(1));
            if (!(valueOf2.intValue() > 0)) {
                valueOf2 = null;
            }
            long intValue = valueOf2 != null ? valueOf2.intValue() : cnVar.f229893q;
            kotlinx.coroutines.r2 r2Var = cnVar.f229900x;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            cnVar.f229900x = com.tencent.mm.plugin.finder.live.util.y.o(cnVar, null, null, new df2.ym(intValue, cnVar, null), 3, null);
        }
    }
}
