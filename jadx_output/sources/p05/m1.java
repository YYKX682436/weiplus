package p05;

/* loaded from: classes5.dex */
public final class m1 extends com.tencent.mm.sdk.event.n {
    public m1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.r2 r2Var = event.f54053g;
        int i17 = r2Var.f7759a;
        boolean z17 = r2Var.f7763e;
        p05.p3 p3Var = p05.p3.f350639a;
        if (!p05.p3.f350643e.contains(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        am.r2 r2Var2 = event.f54053g;
        int i18 = r2Var2.f7760b;
        java.lang.String str = r2Var2.f7761c;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisModelMgr", "getRes: " + i17 + ", " + i18 + ", " + str + ", " + z17);
        if (!z17 || str == null) {
            return false;
        }
        p3Var.a(i17, i18, str);
        p3Var.f();
        java.util.LinkedHashSet linkedHashSet = p05.p3.f350644f;
        synchronized (linkedHashSet) {
            if (!linkedHashSet.isEmpty()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i17);
                sb6.append('.');
                sb6.append(i18);
                linkedHashSet.remove(sb6.toString());
                if (linkedHashSet.isEmpty()) {
                    p05.m4.f350622a.c();
                }
            }
        }
        return false;
    }
}
