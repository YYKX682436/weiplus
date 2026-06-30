package zo1;

/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(0);
        this.f474713d = createPackageUI;
        this.f474714e = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474713d;
        android.widget.Button button = createPackageUI.f92822n;
        if (button == null) {
            kotlin.jvm.internal.o.o("createBtn");
            throw null;
        }
        button.setEnabled(true);
        this.f474714e.dismiss();
        android.widget.Toast.makeText(createPackageUI.getContext(), com.tencent.mm.R.string.mxh, 1).show();
        return jz5.f0.f302826a;
    }
}
