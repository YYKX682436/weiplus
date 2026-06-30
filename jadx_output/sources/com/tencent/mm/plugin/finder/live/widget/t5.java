package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f119867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        super(1);
        this.f119867d = d6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f119867d;
            d6Var.f118061c.K0(8);
            com.tencent.mm.plugin.finder.live.plugin.l lVar = d6Var.f118061c;
            com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = lVar instanceof com.tencent.mm.plugin.finder.live.plugin.c6 ? (com.tencent.mm.plugin.finder.live.plugin.c6) lVar : null;
            if (c6Var != null) {
                com.tencent.mars.xlog.Log.i(c6Var.f112117q, "releaseDynamicCardEnv");
                hq0.e0 e0Var = c6Var.f112119s;
                if (e0Var != null && (str = e0Var.f282984e) != null) {
                    ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Bi(str);
                }
                c6Var.f112119s = null;
                ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Di(null);
                ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
                xg4.m.f454446a.a(2000L);
            }
        }
        return jz5.f0.f302826a;
    }
}
