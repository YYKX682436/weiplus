package f92;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f92.t f260268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f260269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m92.b f260270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m92.j f260271g;

    public q(f92.t tVar, kotlin.jvm.internal.g0 g0Var, m92.b bVar, m92.j jVar) {
        this.f260268d = tVar;
        this.f260269e = g0Var;
        this.f260270f = bVar;
        this.f260271g = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (l92.b bVar : this.f260268d.h6().f324984g) {
            long j17 = this.f260269e.f310121d;
            m92.b account = this.f260270f;
            m92.j jVar = this.f260271g;
            if (j17 < 0) {
                java.lang.String source = jVar.name();
                bVar.getClass();
                kotlin.jvm.internal.o.g(account, "account");
                kotlin.jvm.internal.o.g(source, "source");
            } else {
                java.lang.String source2 = jVar.name();
                bVar.getClass();
                kotlin.jvm.internal.o.g(account, "account");
                kotlin.jvm.internal.o.g(source2, "source");
            }
        }
    }
}
