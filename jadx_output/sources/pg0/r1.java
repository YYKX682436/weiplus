package pg0;

/* loaded from: classes8.dex */
public final class r1 extends com.tencent.mm.sdk.event.n {
    public r1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.UpdatePackageEvent event = (com.tencent.mm.autogen.events.UpdatePackageEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.b00 b00Var = event.f54922g;
        if (b00Var.f6202a == 11) {
            java.util.List list = b00Var.f6203b;
            if (list != null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) list;
                if (linkedList.size() > 0) {
                    byte[] d17 = x51.j1.d(((r45.n35) linkedList.get(0)).f381058h);
                    if (d17 != null && d17.length != 0) {
                        java.lang.String str = new java.lang.String(d17, r26.c.f368865a);
                        pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
                        if (kotlin.jvm.internal.o.b(str, a3Var.f353967u)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.UpdateMassSendPlaceTopListener", "the same result : %s".concat(str));
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.UpdateMassSendPlaceTopListener", "UpdatePackageEvent: %s", str);
                            dt4.b.e(str);
                            a3Var.f353967u = str;
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.UpdateMassSendPlaceTopListener", "empty UpdatePackageEvent");
        }
        return false;
    }
}
