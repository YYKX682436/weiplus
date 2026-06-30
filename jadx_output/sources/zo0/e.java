package zo0;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo0.g f474532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ip0.a f474533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ep0.h f474534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zo0.c f474535g;

    public e(zo0.g gVar, ip0.a aVar, ep0.h hVar, zo0.c cVar) {
        this.f474532d = gVar;
        this.f474533e = aVar;
        this.f474534f = hVar;
        this.f474535g = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f474532d.b(this.f474533e, this.f474534f, new zo0.d(this.f474535g));
    }
}
