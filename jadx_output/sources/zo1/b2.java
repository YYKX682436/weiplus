package zo1;

/* loaded from: classes5.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f474552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(0);
        this.f474551d = createPackageUI;
        this.f474552e = y1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Go to add new device ui.");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474551d;
        ((com.tencent.mm.ui.bd) createPackageUI.startActivityForResult(new android.content.Intent(createPackageUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.device.AddNewDeviceListUI.class))).f197877a = new zo1.a2(createPackageUI, this.f474552e);
        return jz5.f0.f302826a;
    }
}
