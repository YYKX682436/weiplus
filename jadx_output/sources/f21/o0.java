package f21;

/* loaded from: classes8.dex */
public class o0 extends com.tencent.mm.sdk.event.n {
    public o0() {
        super(0);
    }

    public static boolean b() {
        return com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().l(81938, null))).longValue()) * 1000 > 86400000;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        b();
        if (!b()) {
            return false;
        }
        if (f21.c.f258844f == null) {
            f21.c.f258844f = new f21.c();
        }
        f21.c.f258844f.a();
        return false;
    }
}
