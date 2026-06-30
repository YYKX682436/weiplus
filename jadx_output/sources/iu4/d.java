package iu4;

/* loaded from: classes9.dex */
public class d implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.e3 f295019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295020e;

    public d(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI, com.tencent.mm.modelbase.e3 e3Var) {
        this.f295020e = gestureGuardLogicUI;
        this.f295019d = e3Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str));
        int i19 = com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.f181308y;
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295020e;
        gestureGuardLogicUI.U6();
        if (i17 == 0 && i18 == 0) {
            hu4.i.j(((r45.on5) oVar.f70711b.f70700a).f382381d);
            com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.T6(gestureGuardLogicUI);
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(1);
        }
        com.tencent.mm.plugin.walletlock.model.n.INSTANCE.i();
        com.tencent.mm.modelbase.e3 e3Var = this.f295019d;
        if (e3Var != null) {
            return e3Var.callback(i17, i18, str, oVar, m1Var);
        }
        return 0;
    }
}
