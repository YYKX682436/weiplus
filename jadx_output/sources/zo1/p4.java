package zo1;

/* loaded from: classes3.dex */
public final class p4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474737d;

    public p4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        this.f474737d = selectPackageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f474737d.finish();
        return true;
    }
}
