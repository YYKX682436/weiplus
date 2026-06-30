package xo0;

/* loaded from: classes10.dex */
public abstract class a extends xo0.d {
    @Override // xo0.d
    public abstract java.lang.String a(ip0.a aVar, yo0.i iVar, vo0.h hVar);

    @Override // xo0.d
    public boolean b(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        return com.tencent.mm.vfs.w6.h(a(url, opts, reaper));
    }

    @Override // xo0.d
    public boolean f(ip0.a url, hp0.i httpResponse, hp0.g source, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        android.graphics.Bitmap bitmap;
        boolean z17;
        hp0.g gVar2 = gVar;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(httpResponse, "httpResponse");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        if (e(url, httpResponse, gVar, opts, reaper)) {
            java.lang.String a17 = a(url, opts, reaper);
            com.tencent.mars.xlog.Log.i("MicroMsg.Loader.IDiskCache", "save " + url + " filePath " + a17);
            xo0.c cVar = xo0.c.f455743a;
            java.io.OutputStream b17 = cVar.b(a17);
            if (b17 != null) {
                if (gVar2 != null) {
                    try {
                        bitmap = (android.graphics.Bitmap) gVar2.f282913a;
                    } finally {
                    }
                } else {
                    bitmap = null;
                }
                if (gVar2 == null || bitmap == null) {
                    z17 = false;
                    gVar2 = source;
                } else {
                    xo0.c.a(cVar, bitmap, null, 0, b17, 6, null);
                    z17 = true;
                }
                if (!z17) {
                    httpResponse.b(b17);
                    z17 = true;
                }
                if (z17) {
                    d(url, gVar2, opts, reaper);
                }
                vz5.b.a(b17, null);
            }
        }
        return true;
    }
}
