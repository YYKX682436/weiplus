package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x6 f128289d = new com.tencent.mm.plugin.finder.storage.x6();

    public x6() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) ((cq.k) c17).f221226g.f242287d).getValue();
        if (o4Var != null) {
            o4Var.W("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN");
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "clearOpenFinderEntranceDialogRecord");
        long j17 = c01.z1.j() | 34359738368L;
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("FINDER_CLEAR_OPEN_ENTRANCE_GUIDE_DIALOG_RECORD", "closeFinderEntrance extstatus:" + j17);
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 57;
        p53Var.f382762e = 2;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        return jz5.f0.f302826a;
    }
}
