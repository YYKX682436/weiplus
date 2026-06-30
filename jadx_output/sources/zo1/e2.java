package zo1;

/* loaded from: classes5.dex */
public final class e2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI f474591d;

    public e2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI) {
        this.f474591d = packageDeleteConfirmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f474591d.onBackPressed();
        return true;
    }
}
