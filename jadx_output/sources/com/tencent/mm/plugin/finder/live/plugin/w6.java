package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class w6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f114876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        super(1);
        this.f114876d = x7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f114876d;
            qo0.c.a(x7Var.f115036p, qo0.b.K3, null, 2, null);
            java.util.Iterator it = x7Var.M.f21807d.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.view.k2) it.next()).f();
            }
            x7Var.f115046z.c();
        }
        return jz5.f0.f302826a;
    }
}
