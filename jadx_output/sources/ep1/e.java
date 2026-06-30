package ep1;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep1.k f255612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pv.y f255615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qn5.a f255616h;

    public e(ep1.k kVar, int i17, android.view.View view, pv.y yVar, qn5.a aVar) {
        this.f255612d = kVar;
        this.f255613e = i17;
        this.f255614f = view;
        this.f255615g = yVar;
        this.f255616h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ep1.k.b(this.f255612d, this.f255613e, this.f255614f, this.f255615g, this.f255616h);
    }
}
