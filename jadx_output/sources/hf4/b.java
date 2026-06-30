package hf4;

/* loaded from: classes4.dex */
public final class b extends xo0.a {
    @Override // xo0.a, xo0.d
    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        java.lang.String e17;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        ef4.c0 c0Var = ef4.c0.f252438a;
        java.lang.Object obj = url.f293573a;
        java.lang.String str = ((hf4.e) obj).f281224d.f390021d;
        java.lang.String str2 = ((hf4.e) obj).f281225e;
        if (str == null) {
            e17 = "";
        } else {
            java.lang.String concat = c0Var.a(str2).concat("pic/");
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            e17 = c0Var.e(concat, kk.k.g(bytes));
        }
        c0Var.b(e17, true);
        return e17;
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        java.lang.String concat;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        java.lang.String a17 = a(url, opts, reaper);
        boolean j17 = com.tencent.mm.vfs.w6.j(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryLoader", "url " + url + " and path " + a17 + " ret " + j17);
        if (j17) {
            return jp0.f.c(a17, null);
        }
        java.lang.String str = ((hf4.e) url.f293573a).f281224d.f390021d;
        if (str == null) {
            concat = "";
        } else {
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(ef4.w.f252468t.b() + str + ".p", true);
            kotlin.jvm.internal.o.d(i17);
            concat = i17.concat(".u");
        }
        boolean j18 = com.tencent.mm.vfs.w6.j(concat);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryLoader", "thumb url " + url + " and path " + a17 + " ret " + j18);
        if (j18) {
            return jp0.f.c(concat, null);
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
