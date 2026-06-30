package fp0;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f265253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.d f265254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.u f265255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fp0.o oVar, fp0.d dVar, fp0.u uVar) {
        super(0);
        this.f265253d = oVar;
        this.f265254e = dVar;
        this.f265255f = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fp0.d work;
        java.lang.Object obj;
        fp0.o oVar = this.f265253d;
        java.util.Iterator it = oVar.f265274f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            work = this.f265254e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((fp0.d) ((fp0.q) obj).f265275a).d(), work.d())) {
                break;
            }
        }
        fp0.q qVar = (fp0.q) obj;
        fp0.u status = this.f265255f;
        if (qVar != null) {
            oVar.f265274f.remove(qVar);
            for (fp0.p pVar : qVar.f265276b) {
                if (pVar != null) {
                    kotlin.jvm.internal.o.e(work, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.callPrepareInUI.<no name provided>.onTaskStatusCallback.<no name provided>.invoke$lambda$2$lambda$1");
                    kotlin.jvm.internal.o.d(status);
                    pVar.a(work, status);
                }
            }
        }
        kotlin.jvm.internal.o.f(work, "$work");
        kotlin.jvm.internal.o.f(status, "$status");
        pm0.v.X(new fp0.j(oVar, work, status));
        if (fp0.f.f265252a[status.ordinal()] == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultTaskLoader", oVar.f() + "workStat wait");
        } else {
            oVar.c();
        }
        return jz5.f0.f302826a;
    }
}
