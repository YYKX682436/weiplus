package fk4;

/* loaded from: classes10.dex */
public final class m extends xo0.a {
    @Override // xo0.a, xo0.d
    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        return ((fk4.n) url.f293573a).f263644e;
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        java.lang.String a17 = a(url, opts, reaper);
        c06.e eVar = fk4.d.f263597a;
        url.toString();
        com.tencent.mm.vfs.w6.j(a17);
        if (com.tencent.mm.vfs.w6.j(a17)) {
            return jp0.f.c(a17, null);
        }
        return null;
    }

    @Override // xo0.d
    public boolean d(ip0.a url, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        return true;
    }

    @Override // xo0.d
    public boolean e(ip0.a url, hp0.i httpResponse, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(httpResponse, "httpResponse");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        return true;
    }

    @Override // xo0.a, xo0.d
    public boolean f(ip0.a url, hp0.i httpResponse, hp0.g source, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(httpResponse, "httpResponse");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        java.lang.String a17 = a(url, opts, reaper);
        c06.e eVar = fk4.d.f263597a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save ");
        sb6.append(url);
        sb6.append(" filePath ");
        sb6.append(a17);
        sb6.append(' ');
        sb6.append(source);
        sb6.append(", ");
        java.lang.Object obj = source.f282913a;
        sb6.append(obj);
        boolean z17 = false;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CdnImageLoader", sb6.toString(), new java.lang.Object[0]);
        xo0.c cVar = xo0.c.f455743a;
        java.io.OutputStream b17 = cVar.b(a17);
        if (b17 != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageLoader", "open stream save " + url);
                if (obj != null) {
                    xo0.c.a(cVar, (android.graphics.Bitmap) obj, null, 0, b17, 6, null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageLoader", "finished compress to local file: " + url);
                    z17 = true;
                }
                if (!z17) {
                    httpResponse.b(b17);
                    z17 = true;
                }
                if (z17) {
                    d(url, source, opts, reaper);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageLoader", "call onCompleted finished: " + url);
                vz5.b.a(b17, null);
            } finally {
            }
        }
        return true;
    }
}
