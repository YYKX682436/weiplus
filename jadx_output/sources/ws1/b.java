package ws1;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs1.d f448976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f448977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xs1.e f448978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f448979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xs1.b f448980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f448981i;

    public b(xs1.d dVar, boolean z17, xs1.e eVar, long j17, xs1.b bVar, java.lang.Object obj) {
        this.f448976d = dVar;
        this.f448977e = z17;
        this.f448978f = eVar;
        this.f448979g = j17;
        this.f448980h = bVar;
        this.f448981i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xs1.d dVar = this.f448976d;
        boolean z17 = dVar.f456298c;
        xs1.e eVar = this.f448978f;
        long j17 = this.f448979g;
        if (z17 && !this.f448977e && !eVar.f456301a) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrlInner failed and retry, session: %d, url: %s", java.lang.Long.valueOf(j17), dVar.f456296a);
            ws1.d.b(j17, dVar, this.f448980h, true);
            return;
        }
        java.util.ArrayList<xs1.b> arrayList = (java.util.ArrayList) ws1.d.f448986a.remove(dVar.f456296a);
        if (arrayList != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrl onCompleted session: %s, url: %s, callbackList size: %s", java.lang.Long.valueOf(j17), dVar.f456296a, java.lang.Integer.valueOf(arrayList.size()));
            for (xs1.b bVar : arrayList) {
                kotlin.jvm.internal.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.webprefetcher.downloader.base.WebPrefetcherHttpDownloadListener<T of com.tencent.mm.plugin.brandservice.webprefetcher.downloader.WebPrefetcherHttpDownloadManager.downloadUrlInner.<no name provided>.onCompleted.<no name provided>.run$lambda$1>");
                bVar.b(this.f448981i, eVar);
            }
        }
    }
}
