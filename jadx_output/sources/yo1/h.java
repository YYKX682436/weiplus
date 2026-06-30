package yo1;

/* loaded from: classes5.dex */
public final class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI f464122d;

    public h(com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI permissionRequestUI) {
        this.f464122d = permissionRequestUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f464122d.finish();
        return true;
    }
}
