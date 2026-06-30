package zo1;

/* loaded from: classes5.dex */
public final class b1 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474550a;

    public b1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        this.f474550a = createPackageUI;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra;
        po1.d e17;
        if (i17 != -1 || intent == null || (stringExtra = intent.getStringExtra("deviceId")) == null || (e17 = ro1.v.f398014a.e(stringExtra)) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
        this.f474550a.Y6(e17);
    }
}
