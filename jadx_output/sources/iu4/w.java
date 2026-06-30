package iu4;

/* loaded from: classes9.dex */
public class w implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295046d;

    public w(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI) {
        this.f295046d = gestureGuardLogicUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295046d;
        gestureGuardLogicUI.f181319q = null;
        gestureGuardLogicUI.f181315m = null;
        if (i18 == 0) {
            dp.a.makeText(gestureGuardLogicUI, gestureGuardLogicUI.getString(com.tencent.mm.R.string.frt), 0).show();
            gestureGuardLogicUI.a7(-1, 0, "open gesture ok");
        } else {
            dp.a.makeText(gestureGuardLogicUI, gestureGuardLogicUI.getString(com.tencent.mm.R.string.frb), 0).show();
            gestureGuardLogicUI.a7(-1, -1, "open gesture failed");
        }
        return 0;
    }
}
