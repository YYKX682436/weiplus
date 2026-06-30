package h71;

/* loaded from: classes15.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI f279403d;

    public n(com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI) {
        this.f279403d = mySafeDeviceListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI = this.f279403d;
        java.util.List list = mySafeDeviceListUI.f73212f;
        if (list != null && ((java.util.LinkedList) list).size() > 0) {
            mySafeDeviceListUI.f73211e = ~mySafeDeviceListUI.f73211e;
            for (com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference safeDeviceListPreference : mySafeDeviceListUI.f73212f) {
                safeDeviceListPreference.N = mySafeDeviceListUI.f73211e;
                safeDeviceListPreference.M();
            }
            ((com.tencent.mm.ui.base.preference.h0) mySafeDeviceListUI.f73210d).notifyDataSetChanged();
        }
        int i17 = mySafeDeviceListUI.f73211e;
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = mySafeDeviceListUI.f73220q;
        if (i17 == 1) {
            mySafeDeviceListUI.addTextOptionMenu(0, mySafeDeviceListUI.getString(com.tencent.mm.R.string.f490441v5), onMenuItemClickListener);
        } else {
            mySafeDeviceListUI.addTextOptionMenu(0, mySafeDeviceListUI.getString(com.tencent.mm.R.string.i7q), onMenuItemClickListener);
        }
        return true;
    }
}
