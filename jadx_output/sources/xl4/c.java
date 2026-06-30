package xl4;

/* loaded from: classes11.dex */
public final class c extends jm4.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xl4.e f455126d;

    public c(xl4.e eVar) {
        this.f455126d = eVar;
    }

    @Override // jm4.o3, jm4.n3
    public void Mc(jm4.k3 k3Var) {
    }

    @Override // b66.r
    public void fd(bw5.kq0 kq0Var, bw5.pq0 state, bw5.lq0 event, bw5.mq0 mq0Var) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(event, "event");
        pm0.v.X(new xl4.b(state, this.f455126d));
    }
}
