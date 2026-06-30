package hd5;

/* loaded from: classes9.dex */
public final class g implements hd5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ he5.t f280602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd5.q f280603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hd5.j f280604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd5.n f280605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hd5.o f280606e;

    public g(he5.t tVar, hd5.q qVar, hd5.j jVar, hd5.n nVar, hd5.o oVar) {
        this.f280602a = tVar;
        this.f280603b = qVar;
        this.f280604c = jVar;
        this.f280605d = nVar;
        this.f280606e = oVar;
    }

    @Override // hd5.o
    public final void next() {
        he5.t tVar = this.f280602a;
        hd5.q qVar = this.f280603b;
        tVar.b(qVar.f280631c, new hd5.f(tVar, this.f280604c, this.f280605d, qVar, this.f280606e));
    }
}
