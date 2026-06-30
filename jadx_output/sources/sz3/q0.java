package sz3;

/* loaded from: classes15.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f414102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.ScanProductInfo f414104f;

    public q0(sz3.v0 v0Var, sz3.c1 c1Var, com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo) {
        this.f414102d = v0Var;
        this.f414103e = c1Var;
        this.f414104f = scanProductInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.c1 c1Var = this.f414103e;
        sz3.x0 x0Var = new sz3.x0(c1Var.f413974a, c1Var.f413975b, 1, c1Var.f413976c);
        java.util.ArrayList arrayList = x0Var.f414151e;
        sz3.w0 w0Var = new sz3.w0();
        w0Var.f414138i = this.f414104f.getId();
        arrayList.add(w0Var);
        this.f414102d.m(x0Var, 1001, "convert yuv to jpg failed");
    }
}
