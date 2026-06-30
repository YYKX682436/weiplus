package df2;

/* loaded from: classes3.dex */
public final class xd implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.yd f231772a;

    public xd(df2.yd ydVar) {
        this.f231772a = ydVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.y23 y23Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (y23Var = (r45.y23) ((r45.bv1) fVar.f70618d).getCustom(3)) != null) {
            df2.yd ydVar = this.f231772a;
            ydVar.getClass();
            cm2.m0 m0Var = new cm2.m0(y23Var);
            dk2.xf P6 = ydVar.P6();
            if (P6 != null) {
                ((dk2.r4) P6).l0((com.tencent.mm.ui.MMActivity) ydVar.O6(), m0Var, new df2.wd(ydVar, y23Var));
            }
            l81.b1 c17 = st2.c2.f412249a.c(y23Var, 1177, null, "", null, true);
            android.content.Context O6 = ydVar.O6();
            com.tencent.mm.ui.MMActivity mMActivity = O6 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) O6 : null;
            if (mMActivity != null) {
                dk2.q4 q4Var = dk2.q4.f233938a;
                gk2.e liveRoomData = ydVar.getStore().getLiveRoomData();
                com.tencent.mm.plugin.finder.live.view.ub ubVar = ydVar.f291099e;
                q4Var.n(mMActivity, liveRoomData, c17, ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null);
            }
        }
        return jz5.f0.f302826a;
    }
}
