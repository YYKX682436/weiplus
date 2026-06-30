package iu4;

/* loaded from: classes9.dex */
public class j implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.e3 f295032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295033e;

    public j(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI, com.tencent.mm.modelbase.e3 e3Var) {
        this.f295033e = gestureGuardLogicUI;
        this.f295032d = e3Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("Scene doSwitchOff, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str));
        int i19 = com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.f181308y;
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295033e;
        gestureGuardLogicUI.U6();
        if (i17 == 0 && i18 == 0) {
            hu4.i.j(((r45.gz4) oVar.f70711b.f70700a).f375671d);
            hu4.f.b(false);
            gestureGuardLogicUI.f181317o = false;
            com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.T6(gestureGuardLogicUI);
        }
        com.tencent.mm.modelbase.e3 e3Var = this.f295032d;
        if (e3Var != null) {
            return e3Var.callback(i17, i18, str, oVar, m1Var);
        }
        return 0;
    }
}
