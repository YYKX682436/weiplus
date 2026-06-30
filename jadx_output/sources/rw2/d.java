package rw2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.j f400591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f400592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rw2.j jVar, java.lang.Object obj) {
        super(1);
        this.f400591d = jVar;
        this.f400592e = obj;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.Surface it = (android.view.Surface) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i(this.f400591d.f400607c, "thumbRenderer setup finished");
        kk4.v vVar = this.f400591d.f400611g;
        if (vVar != null) {
            vVar.J(it, true);
        }
        kk4.v vVar2 = this.f400591d.f400611g;
        if (vVar2 != null) {
            vVar2.O();
        }
        java.lang.Object obj2 = this.f400592e;
        rw2.j jVar = this.f400591d;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(jVar.f400607c, e17, "notify init thumb fetcher error", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
