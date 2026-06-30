package f92;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f92.t f260261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m92.b f260262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m92.j f260263f;

    public n(f92.t tVar, m92.b bVar, m92.j jVar) {
        this.f260261d = tVar;
        this.f260262e = bVar;
        this.f260263f = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (l92.b bVar : this.f260261d.h6().f324984g) {
            ((f92.i) bVar).c(this.f260262e, this.f260263f.name());
        }
    }
}
