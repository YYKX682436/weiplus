package h71;

/* loaded from: classes14.dex */
public class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI f279407d;

    public q(com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI) {
        this.f279407d = mySafeDeviceListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f279407d.finish();
        return true;
    }
}
