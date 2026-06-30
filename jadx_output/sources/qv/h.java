package qv;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f366860a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f366861b;

    /* renamed from: c, reason: collision with root package name */
    public static final i35.e f366862c;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f366861b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ModNewContactEvent>(a0Var) { // from class: com.tencent.mm.feature.biz.BizContactObserver$followBizListener$1
            {
                this.__eventId = 1301753576;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ModNewContactEvent modNewContactEvent) {
                com.tencent.mm.autogen.events.ModNewContactEvent event = modNewContactEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Set set = qv.h.f366860a;
                am.uj ujVar = event.f54497g;
                java.lang.String str = ujVar.f8102a;
                boolean z17 = true;
                if (str == null ? false : ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).k2()) {
                    java.util.Set set2 = qv.h.f366860a;
                    if (set2 != null) {
                        java.lang.String username = ujVar.f8102a;
                        kotlin.jvm.internal.o.f(username, "username");
                        ((java.util.HashSet) set2).add(username);
                    }
                    rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
                    java.lang.String str2 = ujVar.f8102a;
                    ((vw.m2) k3Var).getClass();
                    yw.h1 h1Var = yw.h1.f466332a;
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        if (g95.e.f269801a.c(str2) > 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed create time has been fetched");
                        } else {
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(str2);
                            h1Var.e(linkedList);
                        }
                    }
                }
                return false;
            }
        };
        f366862c = qv.g.f366859d;
    }
}
