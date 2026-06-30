package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ib extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f123794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        super(1);
        this.f123793d = obVar;
        this.f123794e = b2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123793d;
        java.lang.String username = obVar.getUsername();
        int e17 = c01.id.e();
        boolean f17 = hc2.s.f(this.f123794e);
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = obVar.Z1;
        o3Var.wk(username, 2, e17, f17 ? 1 : 0, (l2Var == null || !l2Var.f123934w) ? 0 : 1);
        r45.qt2 contextObj = obVar.getContextObj();
        java.lang.String username2 = obVar.getUsername();
        int i17 = db2.m0.f228066v;
        com.tencent.mm.plugin.finder.profile.uic.ob.S6(obVar, contextObj, username2, 3, 0L, null, false, null, null, 224, null);
        obVar.v7();
        obVar.p7("setWaiting");
        return jz5.f0.f302826a;
    }
}
