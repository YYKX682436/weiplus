package ws1;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f448986a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final xs1.a f448987b = ws1.f.f448995a;

    public static final void a(xs1.d downloadRequest, xs1.b downloadListener) {
        kotlin.jvm.internal.o.g(downloadRequest, "downloadRequest");
        kotlin.jvm.internal.o.g(downloadListener, "downloadListener");
        ((ku5.t0) ku5.t0.f312615d).h(new ws1.a(downloadRequest, downloadListener, java.lang.System.currentTimeMillis()), "MicroMsg.WebPrefetcherHttpDownloadManager");
    }

    public static final void b(long j17, xs1.d dVar, xs1.b bVar, boolean z17) {
        ws1.c cVar = new ws1.c(bVar, dVar, z17, j17);
        java.lang.String str = dVar.f456296a;
        kotlin.jvm.internal.o.e(f448987b, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.webprefetcher.downloader.base.IWebPrefetcherHttpDownloader<T of com.tencent.mm.plugin.brandservice.webprefetcher.downloader.WebPrefetcherHttpDownloadManager.downloadUrlInner>");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = dVar.f456296a;
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(dVar.f456297b.u(), true);
        java.lang.String str3 = i17 + ".fd";
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl session: %s, url: %s, savedPath: %s, downloadRequest: %s", java.lang.Long.valueOf(currentTimeMillis), dVar.f456296a, i17, dVar);
        hw4.d.a(str2, str3, new ws1.e(dVar, cVar, str3, currentTimeMillis, i17, str2));
    }
}
