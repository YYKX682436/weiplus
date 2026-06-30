package iu4;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295018d;

    public c(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI) {
        this.f295018d = gestureGuardLogicUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295018d;
        gestureGuardLogicUI.f181313h[gestureGuardLogicUI.f181312g].f295023c.b();
    }
}
