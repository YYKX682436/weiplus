package com.tencent.mm.plugin.finder.service;

/* loaded from: classes5.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.p4 f126159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.tencent.mm.plugin.finder.service.p4 p4Var) {
        super(1);
        this.f126159d = p4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.t81 resp = (r45.t81) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f126159d.getClass();
        zy2.za zaVar = com.tencent.mm.plugin.finder.service.p4.f126177f;
        if (zaVar != null) {
            java.util.LinkedList list = resp.getList(1);
            kotlin.jvm.internal.o.f(list, "getSessionProfileList(...)");
            ((com.tencent.mm.ui.ti) zaVar).a(list);
        }
        java.util.LinkedList<r45.vi2> list2 = resp.getList(1);
        kotlin.jvm.internal.o.f(list2, "getSessionProfileList(...)");
        for (r45.vi2 vi2Var : list2) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSessionStatusUpdater", "sessionId:" + vi2Var.getString(1) + " , reject:" + vi2Var.getInteger(2) + ", enableAction:" + vi2Var.getInteger(3) + ", followFlag:" + vi2Var.getInteger(5) + "  disable_sendmsg_need_follow:" + vi2Var.getBoolean(6));
            com.tencent.mm.plugin.finder.storage.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
            java.lang.String string = vi2Var.getString(1);
            if (string == null) {
                string = "";
            }
            pk6.W0(string, vi2Var.getInteger(2), vi2Var.getInteger(3), vi2Var.getInteger(5), vi2Var.getBoolean(6));
        }
        com.tencent.mm.plugin.finder.service.p4.f126177f = null;
        return jz5.f0.f302826a;
    }
}
