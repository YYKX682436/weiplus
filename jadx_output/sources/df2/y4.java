package df2;

/* loaded from: classes3.dex */
public final class y4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d5 f231847d;

    public y4(df2.d5 d5Var) {
        this.f231847d = d5Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            df2.d5 d5Var = this.f231847d;
            d5Var.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveSwitchTestLiveGuideController", "showBubble: show msgType=" + tm1Var.getInteger(0) + ", guideTitle=" + tm1Var.getString(3) + ", guideBtnText=" + tm1Var.getString(4));
            if (d5Var.N6() != null) {
                d5Var.k7(d5Var);
                d5Var.h7(new df2.z4(d5Var));
                java.lang.String string = tm1Var.getString(3);
                java.lang.String str = string == null || string.length() == 0 ? "" : string;
                java.lang.String string2 = tm1Var.getString(4);
                d5Var.l7(new df2.d9(str, null, string2 == null || string2.length() == 0 ? "" : string2, null, 0, 0, 48, null));
                kotlinx.coroutines.r2 r2Var = d5Var.f229943q;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                long integer = tm1Var.getInteger(1);
                if (integer > 0) {
                    d5Var.f229943q = com.tencent.mm.plugin.finder.live.util.y.o(d5Var, null, null, new df2.a5(integer, d5Var, null), 3, null);
                }
                d5Var.g7(new df2.c5(d5Var, tm1Var));
                ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f327337e);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveSwitchTestLiveGuideController", "observe: post null");
        }
    }
}
