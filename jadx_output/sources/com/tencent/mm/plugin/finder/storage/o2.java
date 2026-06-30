package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.o2 f127281d = new com.tencent.mm.plugin.finder.storage.o2();

    public o2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        c66.q qVar = c66.q.f39493a;
        synchronized (qVar) {
            try {
                ((com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39505m).getValue()).deleteObjects();
                qVar.c().clear();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "resetFinderAccountUpdateHistoryRecord fail");
            }
        }
        return jz5.f0.f302826a;
    }
}
