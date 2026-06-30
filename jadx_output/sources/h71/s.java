package h71;

/* loaded from: classes15.dex */
public class s implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI f279408d;

    public s(com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI) {
        this.f279408d = mySafeDeviceListUI;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI.f73209u;
        com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI = this.f279408d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = mySafeDeviceListUI.f73222s;
        java.lang.Runnable runnable = mySafeDeviceListUI.f73223t;
        n3Var.removeCallbacks(runnable);
        n3Var.post(runnable);
    }
}
