package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class uq extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wq f119987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f119989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(com.tencent.mm.plugin.finder.live.widget.wq wqVar, int i17, r45.h32 h32Var) {
        super(1);
        this.f119987d = wqVar;
        this.f119988e = i17;
        this.f119989f = h32Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h32 it = (r45.h32) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.widget.wq wqVar = this.f119987d;
        java.lang.String str = wqVar.U;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("originSendType:");
        int i17 = this.f119988e;
        sb6.append(i17);
        sb6.append(" change send Type to: ");
        sb6.append(it.getInteger(18));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.f(k0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.widget.tq(i17, this.f119989f, wqVar, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
