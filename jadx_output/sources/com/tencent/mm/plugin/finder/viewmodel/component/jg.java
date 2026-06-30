package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.jg f134865d = new com.tencent.mm.plugin.finder.viewmodel.component.jg();

    public jg() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.bh bhVar = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, 0);
        kotlinx.coroutines.flow.h3 h3Var = (kotlinx.coroutines.flow.h3) com.tencent.mm.plugin.finder.viewmodel.component.bh.f133878b;
        if (((java.lang.Number) h3Var.getValue()).intValue() != r17) {
            com.tencent.mars.xlog.Log.i("Finder.FollowAggregationRepo", "followCount: " + ((java.lang.Number) h3Var.getValue()).intValue() + " -> " + r17);
            h3Var.k(java.lang.Integer.valueOf(r17));
        }
        return jz5.f0.f302826a;
    }
}
