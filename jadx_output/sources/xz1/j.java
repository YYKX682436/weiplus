package xz1;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz1.k f458186d;

    public j(xz1.k kVar) {
        this.f458186d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DevTools.DevToolsService", "start");
        while (true) {
            xz1.k kVar = this.f458186d;
            if (!kVar.f458191e) {
                kVar.release();
                com.tencent.mars.xlog.Log.i("MicroMsg.DevTools.DevToolsService", "end");
                return;
            }
            try {
                android.net.LocalSocket accept = ((android.net.LocalServerSocket) ((jz5.n) kVar.f458190d).getValue()).accept();
                yz1.c cVar = new yz1.c(new java.io.BufferedInputStream(accept.getInputStream(), 1024));
                xz1.k kVar2 = this.f458186d;
                yz1.d dVar = new yz1.d(new java.io.BufferedOutputStream(accept.getOutputStream()));
                java.io.OutputStream outputStream = accept.getOutputStream();
                kotlin.jvm.internal.o.f(outputStream, "getOutputStream(...)");
                xz1.d dVar2 = xz1.k.f458187i;
                yz1.h hVar = new yz1.h();
                xz1.d.b(dVar2, hVar, cVar);
                xz1.k.wi(kVar2, accept, dVar, outputStream, hVar, new yz1.i());
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DevTools.DevToolsService", "Could not start server");
                kVar.f458191e = false;
            }
        }
    }
}
