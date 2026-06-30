package h71;

/* loaded from: classes5.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI f279379d;

    public a(com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI bindSafeDeviceUI) {
        this.f279379d = bindSafeDeviceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f279379d.finish();
        return true;
    }
}
