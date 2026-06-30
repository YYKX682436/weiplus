package iu4;

/* loaded from: classes9.dex */
public class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI f295034d;

    public k(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI) {
        this.f295034d = gestureGuardLogicUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.f181308y;
        com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI = this.f295034d;
        if (gestureGuardLogicUI.V6()) {
            return true;
        }
        gestureGuardLogicUI.a7(0, 4, "user cancel when setting gesture");
        return true;
    }
}
