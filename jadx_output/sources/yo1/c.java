package yo1;

/* loaded from: classes4.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI f464112d;

    public c(com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI permissionRegainUI) {
        this.f464112d = permissionRegainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f464112d.finish();
        return true;
    }
}
