package zo1;

/* loaded from: classes5.dex */
public final class w1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po1.d f474812b;

    public w1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, po1.d dVar) {
        this.f474811a = createPackageUI;
        this.f474812b = dVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "[onVolumeMounted] user click is " + z17);
        if (z17) {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
            this.f474811a.Y6(this.f474812b);
        }
    }
}
