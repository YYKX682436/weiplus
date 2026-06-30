package iu4;

/* loaded from: classes9.dex */
public class x implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295047d;

    public x(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI) {
        this.f295047d = gestureGuardLogicUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295047d;
        if (i18 == 0) {
            hu4.i.f285230a = android.os.SystemClock.elapsedRealtime();
            dp.a.makeText(gestureGuardLogicUI, gestureGuardLogicUI.getString(com.tencent.mm.R.string.fru), 0).show();
            int i19 = com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.f181308y;
            gestureGuardLogicUI.X6();
        } else {
            dp.a.makeText(gestureGuardLogicUI, gestureGuardLogicUI.getString(com.tencent.mm.R.string.frb), 0).show();
        }
        gestureGuardLogicUI.f181319q = null;
        gestureGuardLogicUI.f181315m = null;
        return 0;
    }
}
