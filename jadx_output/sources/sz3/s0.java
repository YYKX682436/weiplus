package sz3;

/* loaded from: classes15.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f414116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.ScanProductInfo f414118f;

    public s0(sz3.v0 v0Var, sz3.c1 c1Var, com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo) {
        this.f414116d = v0Var;
        this.f414117e = c1Var;
        this.f414118f = scanProductInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.c1 c1Var = this.f414117e;
        sz3.x0 x0Var = new sz3.x0(c1Var.f413974a, c1Var.f413975b, 1, c1Var.f413976c);
        java.util.ArrayList arrayList = x0Var.f414151e;
        sz3.w0 w0Var = new sz3.w0();
        w0Var.f414138i = this.f414118f.getId();
        arrayList.add(w0Var);
        this.f414116d.m(x0Var, 1001, "convert image failed");
    }
}
