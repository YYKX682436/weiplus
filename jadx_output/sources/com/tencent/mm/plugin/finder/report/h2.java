package com.tencent.mm.plugin.finder.report;

/* loaded from: classes5.dex */
public final /* synthetic */ class h2 extends kotlin.jvm.internal.m implements yz5.q {
    public h2(java.lang.Object obj) {
        super(3, obj, com.tencent.mm.plugin.finder.report.p2.class, "getDefaultPostLoadingInfo", "getDefaultPostLoadingInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/FinderPostLoadingInfo;", 0);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String p07 = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        ((com.tencent.mm.plugin.finder.report.p2) this.receiver).getClass();
        r45.xp2 xp2Var = new r45.xp2();
        xp2Var.set(1, p07);
        xp2Var.set(0, (java.lang.String) obj2);
        xp2Var.set(2, (java.lang.String) obj3);
        return xp2Var;
    }
}
