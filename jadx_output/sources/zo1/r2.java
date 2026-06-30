package zo1;

/* loaded from: classes5.dex */
public final class r2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474757d;

    public r2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI) {
        this.f474757d = packageManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f474757d.onBackPressed();
        return true;
    }
}
