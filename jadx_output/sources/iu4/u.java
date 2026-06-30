package iu4;

/* loaded from: classes9.dex */
public class u implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295044d;

    public u(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI) {
        this.f295044d = gestureGuardLogicUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295044d;
        if (i18 == 0) {
            dp.a.makeText(gestureGuardLogicUI, gestureGuardLogicUI.getString(com.tencent.mm.R.string.fru), 0).show();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11474, new java.lang.Object[0]);
        } else {
            dp.a.makeText(gestureGuardLogicUI, gestureGuardLogicUI.getString(com.tencent.mm.R.string.frb), 0).show();
        }
        gestureGuardLogicUI.f181319q = null;
        gestureGuardLogicUI.f181315m = null;
        gestureGuardLogicUI.finish();
        return 0;
    }
}
