package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.k2 f149992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.plugin.multitalk.model.k2 k2Var) {
        super(1);
        this.f149992d = k2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.multitalk.model.c0 c0Var;
        java.lang.String wxUserName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        com.tencent.mm.plugin.multitalk.model.k2 k2Var = this.f149992d;
        java.lang.Integer num = (java.lang.Integer) k2Var.f150029b.get(wxUserName);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        android.util.ArrayMap arrayMap = k2Var.f150029b;
        boolean z17 = true;
        if (num != null) {
            java.lang.Integer num2 = (java.lang.Integer) arrayMap.get(wxUserName);
            if (num2 != null && num2.intValue() == 104) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkScreenCastManager", "error state change from stop to pause");
                z17 = false;
            } else if (num2 != null && num2.intValue() == 102) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkScreenCastManager", "state change from pause to pause");
            } else {
                com.tencent.mm.plugin.multitalk.model.c0 c0Var2 = k2Var.f150028a;
                if (c0Var2 != null) {
                    ((com.tencent.mm.plugin.multitalk.model.a) c0Var2).a(wxUserName);
                }
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null && (c0Var = k2Var.f150028a) != null) {
            ((com.tencent.mm.plugin.multitalk.model.a) c0Var).a(wxUserName);
        }
        if (z17) {
            arrayMap.put(wxUserName, 102);
        }
        return f0Var2;
    }
}
