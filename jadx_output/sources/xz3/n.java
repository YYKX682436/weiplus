package xz3;

/* loaded from: classes15.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f458234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.p f458235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f458236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f458237g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f458238h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458239i;

    public n(int i17, xz3.p pVar, java.util.List list, int i18, int i19, java.lang.String str) {
        this.f458234d = i17;
        this.f458235e = pVar;
        this.f458236f = list;
        this.f458237g = i18;
        this.f458238h = i19;
        this.f458239i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f458234d;
        xz3.p pVar = this.f458235e;
        long j17 = pVar.f458245e;
        sz3.p pVar2 = pVar.f458246f;
        sz3.x0 x0Var = new sz3.x0(i17, j17, pVar2.f413944a, pVar2.f413948e);
        x0Var.f414152f = pVar.f458246f.f413945b.f413964f;
        java.util.Iterator it = this.f458236f.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            java.util.ArrayList arrayList = x0Var.f414151e;
            sz3.w0 w0Var = new sz3.w0();
            pVar.a(pVar.f458246f, w0Var);
            w0Var.f414138i = intValue;
            w0Var.f414137h = 3;
            arrayList.add(w0Var);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AiScanImageUploadTask", "onUploadFailed source: %d, scanImageType: %s, requestTrackIdList: %s", java.lang.Integer.valueOf(this.f458234d), java.lang.Integer.valueOf(pVar.f458246f.f413944a), kz5.n0.g0(this.f458236f, ",", null, null, 0, null, null, 62, null));
        pVar.f458247g.d(x0Var, this.f458234d, pVar.f458245e, this.f458237g, this.f458238h, this.f458239i);
    }
}
