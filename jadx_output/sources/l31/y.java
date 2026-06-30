package l31;

/* loaded from: classes9.dex */
public final class y extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final k31.a f315402e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f315403f;

    /* renamed from: g, reason: collision with root package name */
    public final l31.v f315404g;

    /* renamed from: h, reason: collision with root package name */
    public f31.f f315405h;

    public y(k31.a aVar, boolean z17, l31.v vVar) {
        super("");
        this.f315402e = aVar;
        this.f315403f = z17;
        this.f315404g = vVar;
    }

    @Override // l31.b
    public void a() {
        this.f315316d = true;
        f31.f fVar = this.f315405h;
        if (fVar != null) {
            f31.b.f259269a.b(fVar);
        }
    }

    @Override // l31.u
    public void run() {
        l31.x xVar = new l31.x(this);
        f31.f fVar = new f31.f("", 8, this.f315403f);
        fVar.f259277f = xVar;
        this.f315405h = fVar;
        c(fVar);
    }
}
