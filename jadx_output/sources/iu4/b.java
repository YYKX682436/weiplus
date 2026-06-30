package iu4;

/* loaded from: classes9.dex */
public class b implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f295014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295015e;

    public b(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI, java.util.List list) {
        this.f295015e = gestureGuardLogicUI;
        this.f295014d = list;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295015e;
        if (i18 == 0) {
            gestureGuardLogicUI.f181317o = false;
            gestureGuardLogicUI.f181318p = 0;
            hu4.i.g();
            hu4.i.e();
            hu4.i.f();
            gestureGuardLogicUI.f181316n = this.f295014d;
            gestureGuardLogicUI.f181311f = 1;
            gestureGuardLogicUI.Y6();
        } else if (i18 == -3) {
            gestureGuardLogicUI.f181318p++;
            gestureGuardLogicUI.f181311f = 2;
            gestureGuardLogicUI.Y6();
        } else {
            dp.a.makeText(gestureGuardLogicUI, gestureGuardLogicUI.getString(com.tencent.mm.R.string.frc), 0).show();
        }
        return 0;
    }
}
