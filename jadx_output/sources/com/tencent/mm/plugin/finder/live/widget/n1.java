package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.t1 f119146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.finder.live.widget.t1 t1Var, boolean z17) {
        super(0);
        this.f119146d = t1Var;
        this.f119147e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.t1 t1Var = this.f119146d;
        t1Var.getClass();
        t1Var.L = null;
        com.tencent.mars.xlog.Log.i(t1Var.i0(), "get cache cacheInvalid");
        kotlinx.coroutines.y0 y0Var = t1Var.f119858J;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.widget.m1(this.f119147e, t1Var, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
