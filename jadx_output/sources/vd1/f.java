package vd1;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public km5.d f435571a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.zt5 f435572b = new r45.zt5();

    public final void a(ze.n nVar, yz5.p callback) {
        km5.d e17;
        kotlin.jvm.internal.o.g(callback, "callback");
        synchronized (this) {
            if (this.f435571a == null) {
                if (nVar != null) {
                    lm0.a K1 = nVar.K1(com.tencent.mm.plugin.appbrand.networking.c0.class);
                    kotlin.jvm.internal.o.d(K1);
                    e17 = ((com.tencent.mm.plugin.appbrand.networking.c0) K1).e1("/cgi-bin/mmbiz-bin/wxartrappsvr/route", nVar.f74803n, this.f435572b, r45.au5.class);
                    kotlin.jvm.internal.o.d(e17);
                } else {
                    com.tencent.mm.plugin.appbrand.networking.c0 c0Var = (com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class);
                    e17 = c0Var != null ? c0Var.e1("/cgi-bin/mmbiz-bin/wxartrappsvr/route", null, this.f435572b, r45.au5.class) : null;
                    if (e17 == null) {
                        e17 = ((km5.q) km5.u.d()).q(vd1.c.f435565a);
                        kotlin.jvm.internal.o.f(e17, "$logic(...)");
                    }
                }
                this.f435571a = e17;
                ((km5.q) e17.a(new vd1.d(callback))).s(new vd1.e(callback));
            }
        }
    }
}
