package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.q0 f135642d = new com.tencent.mm.plugin.finder.viewmodel.component.q0();

    public q0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.CopyOnWriteArrayList c17;
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c66.q qVar = c66.q.f39493a;
        synchronized (qVar) {
            if (!qVar.c().isEmpty()) {
                c17 = qVar.c();
            } else {
                try {
                    java.util.Collection allObjects = ((com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39505m).getValue()).getAllObjects();
                    kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
                    java.util.Iterator it = allObjects.iterator();
                    while (it.hasNext()) {
                        android.support.v4.media.f.a(it.next());
                        c66.q.f39493a.c().add(null);
                    }
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "getFinderAccountUpdateHistoryRecordList fail");
                }
                c17 = qVar.c();
            }
        }
        return c17;
    }
}
