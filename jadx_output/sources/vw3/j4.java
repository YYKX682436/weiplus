package vw3;

/* loaded from: classes.dex */
public final class j4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI f441002d;

    public j4(com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI repairerResDownloadUI) {
        this.f441002d = repairerResDownloadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441002d.finish();
        return false;
    }
}
