package zo1;

/* loaded from: classes5.dex */
public final class w2 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474813a;

    public w2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI) {
        this.f474813a = packageManagerUI;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        if (i17 == 4096) {
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI = this.f474813a;
            packageManagerUI.setResult(4096);
            packageManagerUI.finish();
        }
    }
}
