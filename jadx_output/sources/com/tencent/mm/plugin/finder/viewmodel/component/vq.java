package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f136263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f136265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var, r45.zk2 zk2Var) {
        super(0);
        this.f136263d = hsVar;
        this.f136264e = s0Var;
        this.f136265f = zk2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f136263d;
        hsVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popupSurveyLayout questionStyle=");
        r45.zk2 zk2Var = this.f136265f;
        sb6.append(zk2Var.getInteger(3));
        sb6.append(" questionType=");
        sb6.append(zk2Var.getInteger(4));
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        int integer = zk2Var.getInteger(4);
        in5.s0 s0Var = this.f136264e;
        if (integer == 2) {
            hsVar.m7(s0Var, zk2Var, null);
        } else if (zk2Var.getInteger(4) == 1 && zk2Var.getInteger(3) == 2) {
            hsVar.n7(s0Var, zk2Var, null);
        } else if (zk2Var.getInteger(4) == 1 && zk2Var.getInteger(3) == 1) {
            hsVar.l7(s0Var, zk2Var, null);
        }
        return jz5.f0.f302826a;
    }
}
