package zo1;

/* loaded from: classes5.dex */
public final class a2 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f474546b;

    public a2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f474545a = createPackageUI;
        this.f474546b = y1Var;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra;
        po1.d e17;
        if (i17 != -1 || intent == null || (stringExtra = intent.getStringExtra("deviceId")) == null || (e17 = ro1.v.f398014a.e(stringExtra)) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
        this.f474545a.Y6(e17);
        this.f474546b.q();
    }
}
