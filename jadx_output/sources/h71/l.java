package h71;

/* loaded from: classes15.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI f279399d;

    public l(com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f279399d = mySafeDeviceDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI$startLoading$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI = this.f279399d;
        if (mySafeDeviceDetailUI.f73208s) {
            mySafeDeviceDetailUI.Y6(mySafeDeviceDetailUI.f73197e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI$startLoading$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
