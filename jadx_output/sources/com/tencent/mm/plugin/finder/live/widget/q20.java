package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f119463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var) {
        super(0);
        this.f119463d = e30Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f119463d;
        e30Var.w1(false);
        com.tencent.mars.xlog.Log.i(e30Var.f118213r, "[ken_stopPostLike]");
        com.tencent.mm.plugin.finder.live.util.y.m(e30Var, null, kotlinx.coroutines.a1.UNDISPATCHED, new com.tencent.mm.plugin.finder.live.widget.a30(e30Var, null), 1, null);
        return jz5.f0.f302826a;
    }
}
