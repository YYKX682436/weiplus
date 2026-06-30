package sz3;

/* loaded from: classes15.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.w f414124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.ScanProductInfo f414126f;

    public v(sz3.w wVar, sz3.c1 c1Var, com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo) {
        this.f414124d = wVar;
        this.f414125e = c1Var;
        this.f414126f = scanProductInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.c1 c1Var = this.f414125e;
        sz3.x0 x0Var = new sz3.x0(c1Var.f413974a, c1Var.f413975b, 1, c1Var.f413976c);
        java.util.ArrayList arrayList = x0Var.f414151e;
        sz3.w0 w0Var = new sz3.w0();
        w0Var.f414138i = this.f414126f.getId();
        arrayList.add(w0Var);
        this.f414124d.m(x0Var, 1001, "convert yuv to jpg failed");
    }
}
