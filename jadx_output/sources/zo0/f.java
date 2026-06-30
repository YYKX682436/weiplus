package zo0;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.c f474536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo0.g f474537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ip0.a f474538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ep0.h f474539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zo0.c f474540h;

    public f(fp0.c cVar, zo0.g gVar, ip0.a aVar, ep0.h hVar, zo0.c cVar2) {
        this.f474536d = cVar;
        this.f474537e = gVar;
        this.f474538f = aVar;
        this.f474539g = hVar;
        this.f474540h = cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((fp0.o) this.f474536d).d(new zo0.e(this.f474537e, this.f474538f, this.f474539g, this.f474540h));
    }
}
