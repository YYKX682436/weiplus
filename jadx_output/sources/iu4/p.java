package iu4;

/* loaded from: classes9.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295041d;

    public p(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI) {
        this.f295041d = gestureGuardLogicUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.f181308y;
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295041d;
        gestureGuardLogicUI.W6();
        gestureGuardLogicUI.a7(0, 4, "user cancel when setting gesture");
    }
}
