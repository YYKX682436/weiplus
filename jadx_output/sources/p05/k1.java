package p05;

/* loaded from: classes5.dex */
public final class k1 extends com.tencent.mm.sdk.event.n {
    public k1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent event = (com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.t2 t2Var = event.f54055g;
        int i17 = t2Var.f7966a;
        int i18 = t2Var.f7967b;
        if (!p05.p3.f350643e.contains(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        int i19 = event.f54055g.f7968c;
        if (i19 != 2) {
            if (i19 != 0) {
                return false;
            }
            java.util.LinkedHashSet linkedHashSet = p05.p3.f350644f;
            synchronized (linkedHashSet) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i17);
                sb6.append('.');
                sb6.append(i18);
                linkedHashSet.add(sb6.toString());
            }
            return false;
        }
        java.lang.String str = p05.a3.f350443e + '/' + i17 + '.' + i18;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WeVisModelMgr", "operation: delete res " + i17 + '.' + i18);
        com.tencent.mm.vfs.w6.f(str);
        java.util.LinkedList NewConfigList = p05.p3.f350641c.f387993d;
        kotlin.jvm.internal.o.f(NewConfigList, "NewConfigList");
        pm0.v.d0(NewConfigList, new p05.i1(i17, i18));
        pm0.v.d0(p05.p3.f350640b, new p05.j1(i17, i18));
        p05.m4.f350622a.b(2, i17, i18);
        return false;
    }
}
