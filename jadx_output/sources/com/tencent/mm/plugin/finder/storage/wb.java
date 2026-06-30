package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class wb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wb f128242d = new com.tencent.mm.plugin.finder.storage.wb();

    public wb() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Number) obj).intValue() == 1) {
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            r45.tt2 tt2Var = new r45.tt2();
            java.util.LinkedList list = tt2Var.getList(0);
            r45.ut2 ut2Var = new r45.ut2();
            ut2Var.set(0, "FinderEntrance");
            ut2Var.set(1, 0);
            list.add(ut2Var);
            zy2.ia.P0(nk6, "FINDER_ENTRANCE_REFUSE_REDDOT", tt2Var, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
