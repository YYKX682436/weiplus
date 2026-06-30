package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.k2 f149985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.multitalk.model.k2 k2Var) {
        super(1);
        this.f149985d = k2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String wxUserName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        com.tencent.mm.plugin.multitalk.model.k2 k2Var = this.f149985d;
        java.lang.Integer num = (java.lang.Integer) k2Var.f150029b.get(wxUserName);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (num != null) {
            if (num.intValue() == 104) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkScreenCastManager", "state change from stop to default");
            } else {
                com.tencent.mm.plugin.multitalk.model.k2.b(k2Var, wxUserName);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.plugin.multitalk.model.k2.b(k2Var, wxUserName);
        }
        k2Var.f150029b.put(wxUserName, 100);
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150186y1) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().m().l(wxUserName, 0);
        }
        return f0Var2;
    }
}
