package e80;

/* loaded from: classes12.dex */
public final class l implements s70.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r70.g f250031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e80.r f250032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f250033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f250034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f250035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f250036f;

    public l(r70.g gVar, e80.r rVar, long j17, long j18, float f17, float f18) {
        this.f250031a = gVar;
        this.f250032b = rVar;
        this.f250033c = j17;
        this.f250034d = j18;
        this.f250035e = f17;
        this.f250036f = f18;
    }

    public void a(s70.e event) {
        kotlin.jvm.internal.o.g(event, "event");
        r70.c cVar = new r70.c(this.f250031a, r70.d.f393084e);
        cVar.f393076c = this.f250033c;
        cVar.f393077d = this.f250034d;
        float f17 = this.f250036f;
        float f18 = this.f250035e;
        cVar.f393078e = f18 + ((f17 - f18) * event.f403935c);
        this.f250032b.V6(cVar);
    }
}
