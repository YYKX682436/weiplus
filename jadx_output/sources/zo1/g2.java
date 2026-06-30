package zo1;

/* loaded from: classes5.dex */
public final class g2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI f474620d;

    public g2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI) {
        this.f474620d = packageDeleteConfirmUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.x(0, com.tencent.mm.R.string.mvr, this.f474620d.getColor(com.tencent.mm.R.color.Red_100));
    }
}
