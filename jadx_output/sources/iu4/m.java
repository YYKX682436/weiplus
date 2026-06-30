package iu4;

/* loaded from: classes9.dex */
public class m implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.e3 f295036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295037e;

    public m(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI, com.tencent.mm.modelbase.e3 e3Var) {
        this.f295037e = gestureGuardLogicUI;
        this.f295036d = e3Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str));
        int i19 = com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.f181308y;
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295037e;
        gestureGuardLogicUI.U6();
        if (i17 == 0 && i18 == 0) {
            hu4.i.j(((r45.on5) oVar.f70711b.f70700a).f382381d);
            hu4.f.b(false);
            com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.T6(gestureGuardLogicUI);
        }
        com.tencent.mm.plugin.walletlock.model.n.INSTANCE.i();
        com.tencent.mm.modelbase.e3 e3Var = this.f295036d;
        if (e3Var != null) {
            return e3Var.callback(i17, i18, str, oVar, m1Var);
        }
        return 0;
    }
}
