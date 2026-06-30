package fp0;

/* loaded from: classes10.dex */
public final class s implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fp0.t f265280a;

    public s(fp0.t tVar) {
        this.f265280a = tVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        fp0.r task = (fp0.r) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLoaderFin] name=");
        fp0.t tVar = this.f265280a;
        sb6.append(tVar.f265281a);
        sb6.append(" status=");
        sb6.append(status);
        com.tencent.mars.xlog.Log.i("Loader.SingleTaskExecutor", sb6.toString());
        tVar.f265284d = false;
        tVar.c();
    }
}
