package ws1;

/* loaded from: classes7.dex */
public final class c implements xs1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xs1.b f448982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xs1.d f448983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f448984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f448985d;

    public c(xs1.b bVar, xs1.d dVar, boolean z17, long j17) {
        this.f448982a = bVar;
        this.f448983b = dVar;
        this.f448984c = z17;
        this.f448985d = j17;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        kotlin.jvm.internal.o.g(headers, "headers");
        return this.f448982a.a(obj, i17, headers);
    }

    @Override // xs1.b
    public void b(java.lang.Object obj, xs1.e downloadResult) {
        kotlin.jvm.internal.o.g(downloadResult, "downloadResult");
        ((ku5.t0) ku5.t0.f312615d).h(new ws1.b(this.f448983b, this.f448984c, downloadResult, this.f448985d, this.f448982a, obj), "MicroMsg.WebPrefetcherHttpDownloadManager");
    }

    @Override // xs1.b
    public void c(java.lang.Object obj) {
        this.f448982a.c(obj);
    }
}
