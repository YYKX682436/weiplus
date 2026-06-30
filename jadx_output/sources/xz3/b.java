package xz3;

/* loaded from: classes15.dex */
public final class b implements xz3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xz3.f f458209a;

    public b(xz3.f fVar) {
        this.f458209a = fVar;
    }

    @Override // xz3.g
    public void a(sz3.x0 result, int i17, long j17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.e("MicroMsg.AiScanImageGetProductTask", "getProductTask onRetrievalFailed source: " + i17 + ", session: " + j17 + ", errCode: " + i18 + ", errMsg: " + str);
        xz3.f fVar = this.f458209a;
        fVar.f458216e.a(result, i17, j17, i18, str);
        fVar.f458216e.j(fVar);
    }

    @Override // xz3.k
    public void b(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // xz3.k
    public void g(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        xz3.f fVar = this.f458209a;
        fVar.f458216e.g(fVar);
    }

    @Override // xz3.g
    public void h(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductTask", "getProductTask onRetrievalSuccess");
        xz3.f fVar = this.f458209a;
        fVar.f458216e.h(result);
        fVar.f458216e.j(fVar);
    }

    @Override // xz3.g
    public void i(sz3.n request) {
        kotlin.jvm.internal.o.g(request, "request");
        this.f458209a.f458216e.i(request);
    }

    @Override // xz3.k
    public void j(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
    }
}
