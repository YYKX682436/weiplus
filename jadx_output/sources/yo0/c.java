package yo0;

/* loaded from: classes15.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    public xo0.d f464060c;

    /* renamed from: d, reason: collision with root package name */
    public zo0.g f464061d;

    /* renamed from: f, reason: collision with root package name */
    public zo0.i f464063f;

    /* renamed from: g, reason: collision with root package name */
    public dp0.a f464064g;

    /* renamed from: a, reason: collision with root package name */
    public yo0.i f464058a = yo0.i.f464094o.a();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.loader.cache.memory.e f464059b = new com.tencent.mm.loader.cache.memory.c();

    /* renamed from: e, reason: collision with root package name */
    public ep0.h f464062e = new ap0.a();

    /* renamed from: h, reason: collision with root package name */
    public final zo0.j f464065h = new ap0.i();

    /* renamed from: i, reason: collision with root package name */
    public final ep0.b f464066i = new ap0.d();

    /* renamed from: j, reason: collision with root package name */
    public final ep0.f f464067j = new ap0.k();

    public final yo0.c a(dp0.d transcoder) {
        kotlin.jvm.internal.o.g(transcoder, "transcoder");
        dp0.a aVar = this.f464064g;
        if (aVar == null) {
            this.f464064g = new dp0.a(transcoder);
        } else if (aVar != null) {
            aVar.c(transcoder);
        }
        return this;
    }

    public final yo0.c b(yo0.i options) {
        kotlin.jvm.internal.o.g(options, "options");
        this.f464058a = options;
        return this;
    }
}
