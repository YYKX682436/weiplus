package zo1;

/* loaded from: classes5.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474697f;

    public n1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f474695d = createPackageUI;
        this.f474696e = h0Var;
        this.f474697f = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        po1.d dVar = (po1.d) this.f474696e.f310123d;
        com.tencent.mm.ui.widget.dialog.u3 waitDialog = this.f474697f;
        kotlin.jvm.internal.o.f(waitDialog, "$waitDialog");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.U6(this.f474695d, dVar, waitDialog);
    }
}
