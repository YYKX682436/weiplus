package sz3;

/* loaded from: classes15.dex */
public final class r implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.w f414106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f414107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f414108g;

    public r(sz3.c1 c1Var, sz3.w wVar, sz3.x0 x0Var, yz5.l lVar) {
        this.f414105d = c1Var;
        this.f414106e = wVar;
        this.f414107f = x0Var;
        this.f414108g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.c1 c1Var = this.f414105d;
        sz3.a1 a17 = c1Var != null ? c1Var.a() : null;
        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = a17 != null ? a17.f413959a : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAddScanProductResultForFullImage source: ");
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.f413974a) : null);
        sb6.append(", session: ");
        sb6.append(c1Var != null ? java.lang.Long.valueOf(c1Var.f413975b) : null);
        sb6.append(", trackId: ");
        sb6.append(scanProductInfo != null ? java.lang.Integer.valueOf(scanProductInfo.getId()) : null);
        sb6.append(", scanProductInfo: %s");
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = scanProductInfo != null ? java.lang.Integer.valueOf(scanProductInfo.hashCode()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewAiImageHandler", sb7, objArr);
        yz5.l lVar = this.f414108g;
        if (scanProductInfo == null) {
            vz3.t.f441710a.j();
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        vz3.t.f441710a.m();
        int id6 = scanProductInfo.getId();
        sz3.w wVar = this.f414106e;
        if (wVar.e(id6)) {
            lVar.invoke(java.lang.Boolean.FALSE);
        } else if (wVar.j(c1Var, this.f414107f)) {
            wVar.d(scanProductInfo.getId());
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewAiImageHandler", "onAddScanProductResultForFullImage addScanProduct failed");
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}
