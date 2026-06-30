package uy3;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.box.BaseBoxDialogView f431938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f431939e;

    public g(com.tencent.mm.plugin.scanner.box.BaseBoxDialogView baseBoxDialogView, int i17) {
        this.f431938d = baseBoxDialogView;
        this.f431939e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uy3.t tVar = this.f431938d.f158687i;
        if (tVar != null) {
            ((uy3.j0) tVar).dismissDialog(this.f431939e);
        }
    }
}
