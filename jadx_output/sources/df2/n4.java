package df2;

/* loaded from: classes3.dex */
public final class n4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.r4 f230832d;

    public n4(df2.r4 r4Var) {
        this.f230832d = r4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            df2.r4 r4Var = this.f230832d;
            r4Var.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveSubscribeNextLiveGuideController", "showBubble: show msgType=" + tm1Var.getInteger(0) + ", guideTitle=" + tm1Var.getString(3) + ", guideBtnText=" + tm1Var.getString(4));
            java.lang.String string = tm1Var.getString(4);
            java.lang.String string2 = (string == null || string.length() == 0) != false ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nkj) : tm1Var.getString(4);
            if (r4Var.N6() != null) {
                r4Var.k7(r4Var);
                r4Var.o7(1);
                r4Var.h7(new df2.o4(r4Var));
                r4Var.l7(new df2.d9(tm1Var.getString(3), null, string2, null, 0, 0, 48, null));
                kotlinx.coroutines.r2 r2Var = r4Var.f231221q;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(tm1Var.getInteger(1));
                java.lang.Long l17 = valueOf.longValue() > 0 ? valueOf : null;
                if (l17 != null) {
                    r4Var.n7(l17.longValue(), "init default");
                }
                r4Var.g7(new df2.q4(r4Var, new kotlin.jvm.internal.c0(), tm1Var, string2));
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveSubscribeNextLiveGuideController", "observe: post null");
        }
    }
}
