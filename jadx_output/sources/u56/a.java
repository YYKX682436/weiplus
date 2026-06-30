package u56;

/* loaded from: classes16.dex */
public final class a extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public final r56.b f424815h;

    /* renamed from: i, reason: collision with root package name */
    public final r56.b f424816i;

    /* renamed from: m, reason: collision with root package name */
    public final r56.a f424817m;

    public a(r56.b bVar, r56.b bVar2, r56.a aVar) {
        this.f424815h = bVar;
        this.f424816i = bVar2;
        this.f424817m = aVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        this.f424815h.call(obj);
    }

    @Override // p56.m
    public void onCompleted() {
        this.f424817m.call();
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        this.f424816i.call(th6);
    }
}
