package em5;

/* loaded from: classes9.dex */
public abstract class f implements im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final im5.c f255217d = new im5.c();

    /* renamed from: e, reason: collision with root package name */
    public final im5.c f255218e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f255219f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f255220g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.vending.base.a f255221h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f255222i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f255223m;

    /* renamed from: n, reason: collision with root package name */
    public hm5.a f255224n;

    public f() {
        im5.c cVar = new im5.c();
        this.f255218e = cVar;
        this.f255219f = new java.util.concurrent.ConcurrentHashMap();
        this.f255220g = new byte[0];
        em5.a aVar = new em5.a(this);
        this.f255221h = aVar;
        this.f255222i = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f255223m = new java.util.HashMap();
        cVar.keep(aVar);
        aVar.addVendingDataResolvedCallback(new em5.b(this));
    }

    public final void a() {
        if (android.os.Looper.myLooper() != this.f255221h.getLooper() || this.f255222i.get()) {
            return;
        }
        jm5.b.a("Vending.Interactor", "This interactor has not call onCreate() yet! Interactor : %s", this);
    }

    public void b() {
        this.f255222i.set(true);
    }

    public void c() {
        this.f255217d.dead();
        this.f255218e.dead();
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f255217d.keep(aVar);
    }
}
