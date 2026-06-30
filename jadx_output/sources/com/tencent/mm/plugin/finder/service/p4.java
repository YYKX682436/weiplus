package com.tencent.mm.plugin.finder.service;

/* loaded from: classes5.dex */
public final class p4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.service.p4 f126175d = new com.tencent.mm.plugin.finder.service.p4();

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f126176e;

    /* renamed from: f, reason: collision with root package name */
    public static zy2.za f126177f;

    static {
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f126176e = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Gf).getValue()).r()).booleanValue();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.d().q(6218, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = f126176e;
        sb6.append(z17);
        sb6.append(" errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.FinderSessionStatusUpdater", sb6.toString());
        if (z17) {
            return;
        }
        if (i17 == 0 && i18 == 0 && (m1Var instanceof db2.z5)) {
            zy2.za zaVar = f126177f;
            if (zaVar != null) {
                com.tencent.mm.protobuf.f fVar = ((db2.z5) m1Var).f228263g.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMsgSessionResponse");
                java.util.LinkedList list = ((r45.t81) fVar).getList(1);
                kotlin.jvm.internal.o.f(list, "getSessionProfileList(...)");
                ((com.tencent.mm.ui.ti) zaVar).a(list);
            }
            com.tencent.mm.protobuf.f fVar2 = ((db2.z5) m1Var).f228263g.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMsgSessionResponse");
            java.util.LinkedList<r45.vi2> list2 = ((r45.t81) fVar2).getList(1);
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
        }
        f126177f = null;
    }
}
