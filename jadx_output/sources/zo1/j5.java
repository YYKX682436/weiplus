package zo1;

/* loaded from: classes5.dex */
public final class j5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI f474660d;

    public j5(com.tencent.mm.plugin.backup.roambackup.ui.pkg.StartBackupIngUI startBackupIngUI) {
        this.f474660d = startBackupIngUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f474660d.finish();
        return true;
    }
}
