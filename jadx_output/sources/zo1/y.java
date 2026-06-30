package zo1;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f474825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI, po1.d dVar) {
        super(0);
        this.f474824d = checkPackageContentUI;
        this.f474825e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474824d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = checkPackageContentUI.f92810s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        checkPackageContentUI.f92810s = null;
        fo1.p.f264890a.b(checkPackageContentUI, this.f474825e, new zo1.x(checkPackageContentUI));
        return jz5.f0.f302826a;
    }
}
