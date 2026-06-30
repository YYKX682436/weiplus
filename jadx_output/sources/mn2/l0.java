package mn2;

/* loaded from: classes10.dex */
public final class l0 extends xo0.a {
    @Override // xo0.a, xo0.d
    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        return ((mn2.h3) url.f293573a).getPath();
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        java.lang.String a17 = a(url, opts, reaper);
        url.toString();
        com.tencent.mm.vfs.w6.j(a17);
        java.lang.Object obj = url.f293573a;
        mn2.h3 h3Var = (mn2.h3) obj;
        java.util.Objects.toString(h3Var.getMediaType());
        if (com.tencent.mm.vfs.w6.j(a17)) {
            return jp0.f.c(a17, null);
        }
        if (!(h3Var instanceof mn2.n)) {
            obj = null;
        }
        mn2.h3 h3Var2 = (mn2.h3) obj;
        if (h3Var2 != null) {
            mn2.n nVar = (mn2.n) h3Var2;
            if (!android.text.TextUtils.equals(nVar.f330060e, nVar.f330064i)) {
                java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102141j + ((java.lang.String) ((jz5.n) nVar.f330066n).getValue());
                if (com.tencent.mm.vfs.w6.j(str)) {
                    return jp0.f.c(str, null);
                }
            }
        }
        if (h3Var.getMediaType() == com.tencent.mm.plugin.finder.storage.y90.f128356f) {
            if (com.tencent.mm.vfs.w6.j(h3Var.l())) {
                return jp0.f.c(h3Var.l(), null);
            }
        } else if (com.tencent.mm.vfs.w6.j(h3Var.getUrl())) {
            return jp0.f.c(h3Var.getUrl(), null);
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
