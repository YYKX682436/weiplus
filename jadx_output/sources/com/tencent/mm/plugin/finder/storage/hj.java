package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class hj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hj f126899d = new com.tencent.mm.plugin.finder.storage.hj();

    public hj() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).bj(Ui, 0L, 0);
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).bj(Ui, 0L, 1);
        g92.b bVar = g92.b.f269769e;
        java.util.LinkedList list = bVar.k2().d().getList(28);
        if (list != null) {
            list.clear();
        }
        java.util.LinkedList list2 = bVar.k2().d().getList(28);
        if (list2 != null) {
            r45.ct4 ct4Var = new r45.ct4();
            ct4Var.set(0, Ui);
            ct4Var.set(1, "文本文本文本文本文本文本文本文本文本文");
            ct4Var.set(2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            m92.b j37 = g92.a.j3(bVar, Ui, false, 2, null);
            if (j37 == null || (str = j37.u0().getString(7)) == null) {
                str = "";
            }
            ct4Var.set(4, str);
            list2.add(ct4Var);
        }
        return jz5.f0.f302826a;
    }
}
