package cy1;

/* loaded from: classes11.dex */
public final /* synthetic */ class a$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy1.a f224702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iy1.a f224703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f224704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gy1.d f224705g;

    public /* synthetic */ a$$b(cy1.a aVar, iy1.a aVar2, int i17, gy1.d dVar) {
        this.f224702d = aVar;
        this.f224703e = aVar2;
        this.f224704f = i17;
        this.f224705g = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cy1.a aVar = this.f224702d;
        aVar.getClass();
        java.lang.String b17 = aVar.f224690m.b(this.f224703e.f295747d, this.f224704f);
        if (u46.l.e(b17)) {
            return;
        }
        this.f224705g.a(b17);
    }
}
