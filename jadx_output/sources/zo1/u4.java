package zo1;

/* loaded from: classes5.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f474785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f474786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(long j17, androidx.recyclerview.widget.k3 k3Var, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        super(0);
        this.f474785d = j17;
        this.f474786e = k3Var;
        this.f474787f = selectPackageUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("On animation end, do real delete for pkgId=");
        long j17 = this.f474785d;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", sb6.toString());
        this.f474786e.setIsRecyclable(false);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474787f;
        selectPackageUI.f92869h.z(j17);
        if (selectPackageUI.f92869h.getItemCount() == 0) {
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.Z6(selectPackageUI, true);
        }
        return jz5.f0.f302826a;
    }
}
