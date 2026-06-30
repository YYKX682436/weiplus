package zo1;

/* loaded from: classes5.dex */
public final class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f474686e;

    public l4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI, android.content.Intent intent) {
        this.f474685d = selectPackageUI;
        this.f474686e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f474685d.startActivityForResult(this.f474686e, 122);
    }
}
