package zo1;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        super(0);
        this.f474602d = checkPackageContentUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474602d;
        java.lang.String string = checkPackageContentUI.getString(com.tencent.mm.R.string.f492876n03);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI.a7(checkPackageContentUI, string, null, checkPackageContentUI.getString(com.tencent.mm.R.string.aby), new zo1.e0(checkPackageContentUI));
        com.tencent.mm.ui.widget.dialog.u3 u3Var = checkPackageContentUI.f92810s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        checkPackageContentUI.f92810s = null;
        return jz5.f0.f302826a;
    }
}
