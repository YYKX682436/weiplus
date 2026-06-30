package k5;

/* loaded from: classes13.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5.m f304160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f304161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a5.o f304162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k5.t f304164h;

    public s(k5.t tVar, l5.m mVar, java.util.UUID uuid, a5.o oVar, android.content.Context context) {
        this.f304164h = tVar;
        this.f304160d = mVar;
        this.f304161e = uuid;
        this.f304162f = oVar;
        this.f304163g = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!(this.f304160d.f316534d instanceof l5.c)) {
                java.lang.String uuid = this.f304161e.toString();
                a5.q0 f17 = ((j5.g0) this.f304164h.f304167c).f(uuid);
                if (f17 == null || f17.h()) {
                    throw new java.lang.IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((b5.e) this.f304164h.f304166b).e(uuid, this.f304162f);
                this.f304163g.startService(i5.d.b(this.f304163g, uuid, this.f304162f));
            }
            this.f304160d.i(null);
        } catch (java.lang.Throwable th6) {
            this.f304160d.j(th6);
        }
    }
}
