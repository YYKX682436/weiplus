package zq;

/* loaded from: classes10.dex */
public final class c extends xo0.a {

    /* renamed from: b, reason: collision with root package name */
    public static final zq.b f474969b = new zq.b(null);

    @Override // xo0.a, xo0.d
    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        zq.b bVar = f474969b;
        java.lang.String str = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().w() + "emoji/";
        java.lang.String str2 = ((zq.a) url.f293573a).f474968d.field_productID;
        kotlin.jvm.internal.o.f(str2, "getProductID(...)");
        sb6.append(bVar.a(str, str2, ""));
        sb6.append("_panel_enable");
        return sb6.toString();
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        zq.b bVar = f474969b;
        java.lang.String str = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().w() + "emoji/";
        java.lang.String str2 = ((zq.a) url.f293573a).f474968d.field_productID;
        kotlin.jvm.internal.o.f(str2, "getProductID(...)");
        sb6.append(bVar.a(str, str2, ""));
        sb6.append("_panel_enable");
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.vfs.w6.j(sb7)) {
            return jp0.f.c(sb7, null);
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
