package h71;

/* loaded from: classes15.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI f279385d;

    public e(com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f279385d = mySafeDeviceDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f279385d.finish();
        return true;
    }
}
