package zo1;

/* loaded from: classes5.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f474753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474756g;

    public r1(yz5.a aVar, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f474753d = aVar;
        this.f474754e = createPackageUI;
        this.f474755f = h0Var;
        this.f474756g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f474753d.invoke();
        po1.d dVar = (po1.d) this.f474755f.f310123d;
        com.tencent.mm.ui.widget.dialog.u3 waitDialog = this.f474756g;
        kotlin.jvm.internal.o.f(waitDialog, "$waitDialog");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.U6(this.f474754e, dVar, waitDialog);
    }
}
