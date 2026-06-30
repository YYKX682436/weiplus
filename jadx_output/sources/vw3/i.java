package vw3;

/* loaded from: classes.dex */
public final class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.CDNDebugIPConfigUI f440983d;

    public i(com.tencent.mm.plugin.repairer.ui.CDNDebugIPConfigUI cDNDebugIPConfigUI) {
        this.f440983d = cDNDebugIPConfigUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f440983d.finish();
        return false;
    }
}
