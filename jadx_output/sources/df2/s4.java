package df2;

/* loaded from: classes3.dex */
public final class s4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.x4 f231289d;

    public s4(df2.x4 x4Var) {
        this.f231289d = x4Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            df2.x4 x4Var = this.f231289d;
            x4Var.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveSwitchStreamGuideController", "showBubble: show msgType=" + tm1Var.getInteger(0) + ", guideTitle=" + tm1Var.getString(3) + ", guideBtnText=" + tm1Var.getString(4));
            if (x4Var.N6() != null) {
                x4Var.k7(x4Var);
                x4Var.h7(new df2.t4(x4Var));
                java.lang.String string = tm1Var.getString(3);
                java.lang.String str = string == null || string.length() == 0 ? "" : string;
                java.lang.String string2 = tm1Var.getString(4);
                x4Var.l7(new df2.d9(str, null, string2 == null || string2.length() == 0 ? "" : string2, null, 0, 0, 48, null));
                kotlinx.coroutines.r2 r2Var = x4Var.f231758r;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                long integer = tm1Var.getInteger(1);
                if (integer > 0) {
                    x4Var.f231758r = com.tencent.mm.plugin.finder.live.util.y.o(x4Var, null, null, new df2.u4(integer, x4Var, null), 3, null);
                }
                x4Var.g7(new df2.w4(x4Var, tm1Var));
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Hk(ml2.u4.f328111e);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveSwitchStreamGuideController", "observe: post null");
        }
    }
}
