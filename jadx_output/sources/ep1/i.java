package ep1;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv.y f255632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f255633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f255634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp1.b f255635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ep1.k f255636h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f255637i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255638m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ qn5.a f255639n;

    public i(pv.y yVar, android.graphics.Point point, android.graphics.Point point2, fp1.b bVar, ep1.k kVar, int i17, android.view.View view, qn5.a aVar) {
        this.f255632d = yVar;
        this.f255633e = point;
        this.f255634f = point2;
        this.f255635g = bVar;
        this.f255636h = kVar;
        this.f255637i = i17;
        this.f255638m = view;
        this.f255639n = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pv.y yVar = this.f255632d;
        yVar.f358509f = this.f255633e;
        yVar.f358508e = this.f255634f;
        fp1.b bVar = this.f255635g;
        yVar.f358515l = bVar != null ? bVar.a() : false;
        ep1.k.b(this.f255636h, this.f255637i, this.f255638m, yVar, this.f255639n);
    }
}
