package l31;

/* loaded from: classes9.dex */
public final class i extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final k31.a f315360e;

    /* renamed from: f, reason: collision with root package name */
    public final l31.f f315361f;

    /* renamed from: g, reason: collision with root package name */
    public f31.f f315362g;

    public i(k31.a aVar, l31.f fVar) {
        super("");
        this.f315360e = aVar;
        this.f315361f = fVar;
    }

    @Override // l31.b
    public void a() {
        this.f315316d = true;
        f31.f fVar = this.f315362g;
        if (fVar != null) {
            f31.b.f259269a.b(fVar);
        }
    }

    @Override // l31.u
    public void run() {
        l31.h hVar = new l31.h(this);
        f31.f fVar = new f31.f("", 7);
        fVar.f259277f = hVar;
        this.f315362g = fVar;
        c(fVar);
    }
}
