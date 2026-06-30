package yo1;

/* loaded from: classes.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionDeniedUI f464110d;

    public a(com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionDeniedUI permissionDeniedUI) {
        this.f464110d = permissionDeniedUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f464110d.finish();
        return true;
    }
}
