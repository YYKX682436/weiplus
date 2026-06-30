package km5;

/* loaded from: classes16.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm5.a f309329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f309330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f309331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km5.q f309332g;

    public l(km5.q qVar, gm5.a aVar, java.lang.Object obj, boolean z17) {
        this.f309332g = qVar;
        this.f309329d = aVar;
        this.f309330e = obj;
        this.f309331f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f309332g.f309358t.a(this.f309329d, this.f309330e, this.f309331f);
    }
}
