package t56;

/* loaded from: classes16.dex */
public class i0 extends t56.k0 {

    /* renamed from: e, reason: collision with root package name */
    public final r56.a f415886e;

    /* renamed from: f, reason: collision with root package name */
    public final long f415887f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f415888g;

    public i0(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        this.f415886e = aVar;
        this.f415887f = j17;
        this.f415888g = timeUnit;
    }

    @Override // t56.k0
    public p56.s a(p56.p pVar) {
        return pVar.e(this.f415886e, this.f415887f, this.f415888g);
    }
}
