package df2;

/* loaded from: classes3.dex */
public final class f1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k1 f230100d;

    public f1(df2.k1 k1Var) {
        this.f230100d = k1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        r45.nw1 liveInfo;
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            int integer = tm1Var.getInteger(0);
            df2.k1 k1Var = this.f230100d;
            if (k1Var.f230539r.contains(java.lang.Integer.valueOf(integer))) {
                com.tencent.mars.xlog.Log.w("FinderCreateLiveGuideController", "observe: has shown this guide, msgType=" + integer);
                return;
            }
            k1Var.f230539r.add(java.lang.Integer.valueOf(integer));
            com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", "showBubble: show msgType=" + tm1Var.getInteger(0) + ", guideTitle=" + tm1Var.getString(3) + ", guideBtnText=" + tm1Var.getString(4));
            com.tencent.mm.ui.MMActivity N6 = k1Var.N6();
            if (N6 != null) {
                yl2.g1 g1Var = new yl2.g1(N6, k1Var.f230537p, 0L, 4, null);
                k1Var.k7(k1Var);
                k1Var.f230541t = tm1Var.getInteger(5);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) k1Var.business(mm2.c1.class)).f328846n;
                k1Var.f230542u = (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) k1Var.business(mm2.c1.class)).f328846n;
                if (finderObject2 == null || (str = finderObject2.getUsername()) == null) {
                    str = "";
                }
                k1Var.f230543v = str;
                k1Var.o7(1);
                k1Var.n7(1, k1Var.f230537p, java.lang.Long.valueOf(g1Var.f463010c));
                k1Var.h7(new df2.g1(k1Var));
                java.lang.String string = tm1Var.getString(3);
                if (string == null || string.length() == 0) {
                    string = k1Var.O6().getResources().getString(com.tencent.mm.R.string.nux);
                }
                java.lang.String str2 = string;
                java.lang.String string2 = tm1Var.getString(4);
                k1Var.l7(new df2.d9(str2, null, string2 == null || string2.length() == 0 ? k1Var.O6().getResources().getString(com.tencent.mm.R.string.nuw) : string2, null, 0, 0, 48, null));
                k1Var.g7(new df2.i1(k1Var, g1Var, tm1Var));
                long integer2 = tm1Var.getInteger(1);
                kotlinx.coroutines.r2 r2Var = k1Var.f230540s;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                if (integer2 > 0) {
                    k1Var.f230540s = com.tencent.mm.plugin.finder.live.util.y.o(k1Var, null, null, new df2.j1(integer2, k1Var, null), 3, null);
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", "observe: post null");
        }
    }
}
