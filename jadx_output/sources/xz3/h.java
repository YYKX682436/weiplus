package xz3;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f458221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.j f458222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f458223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458224g;

    public h(int i17, xz3.j jVar, int i18, java.lang.String str) {
        this.f458221d = i17;
        this.f458222e = jVar;
        this.f458223f = i18;
        this.f458224g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f458221d;
        xz3.j jVar = this.f458222e;
        long j17 = jVar.f458228e;
        sz3.n request = jVar.f458229f;
        sz3.x0 x0Var = new sz3.x0(i17, j17, request.f413944a, request.f413948e);
        x0Var.f414152f = request.f413945b.f413964f;
        java.util.ArrayList arrayList = jVar.f458233m;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            java.util.ArrayList arrayList2 = x0Var.f414151e;
            sz3.w0 w0Var = new sz3.w0();
            kotlin.jvm.internal.o.g(request, "request");
            w0Var.f414131b = request.f413947d;
            w0Var.f414132c = request.f413946c;
            w0Var.f414133d = request.f413944a;
            w0Var.f414134e = request.f413945b;
            w0Var.f414138i = intValue;
            w0Var.f414137h = 5;
            arrayList2.add(w0Var);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AiScanImageRetrievalTask", "onRetrievalFailed source: %d, requestTrackIdList: %s", java.lang.Integer.valueOf(this.f458221d), kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
        jVar.f458230g.a(x0Var, this.f458221d, jVar.f458228e, this.f458223f, this.f458224g);
    }
}
