package zk4;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk4.j f473533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.pq0 f473534e;

    public h(zk4.j jVar, bw5.pq0 pq0Var) {
        this.f473533d = jVar;
        this.f473534e = pq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zk4.j jVar = this.f473533d;
        int i17 = jVar.f473537d.f364175d;
        int i18 = this.f473534e.f31808d;
        if (i17 == i18) {
            return;
        }
        qk.ia a17 = qk.ia.f364169e.a(i18);
        zk4.l lVar = zk4.l.f473538a;
        qk.ia oldState = jVar.f473537d;
        kotlin.jvm.internal.o.g(oldState, "oldState");
        java.util.Iterator it = ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).f252242f.iterator();
        while (it.hasNext()) {
            ((ip1.k) ((rk4.c9) it.next())).getClass();
            a17.toString();
            oldState.toString();
            pm0.v.X(new ip1.j(a17));
        }
        jVar.f473537d = a17;
    }
}
