package cr1;

/* loaded from: classes10.dex */
public final class b extends xo0.a {
    @Override // xo0.a, xo0.d
    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        return ((cr1.a) url.f293573a).getPath();
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        java.lang.String path = ((cr1.a) url.f293573a).getPath();
        if (com.tencent.mm.vfs.w6.j(path)) {
            return jp0.f.c(path, null);
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
}
