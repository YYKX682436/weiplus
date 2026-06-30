package uv2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f431367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uv2.n f431368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f431369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f431370g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.mb4 mb4Var, uv2.n nVar, java.lang.Object obj, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f431367d = mb4Var;
        this.f431368e = nVar;
        this.f431369f = obj;
        this.f431370g = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.vlog.model.z result = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[processComposition] success:" + result.f175793a + " isCancel:" + result.f175795c);
        uv2.e.f431380e.remove(uv2.e.f431376a.i(this.f431367d));
        uv2.n nVar = this.f431368e;
        nVar.getClass();
        nVar.f431402b = result;
        this.f431368e.f431404d = result.f175793a ? 0 : -1;
        java.lang.Object obj2 = this.f431369f;
        kotlin.jvm.internal.c0 c0Var = this.f431370g;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notifyAll();
        }
        return jz5.f0.f302826a;
    }
}
