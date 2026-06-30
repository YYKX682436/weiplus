package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ob0 f113607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var) {
        super(0);
        this.f113607d = ob0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = this.f113607d;
        boolean z17 = ((mm2.f) ((mm2.w) ob0Var.P0(mm2.w.class)).f329503o.getValue()) == mm2.f.f329014e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInLiveRoom: isDetachInvokeFun:");
        boolean z18 = !z17;
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i(ob0Var.f113733q, sb6.toString());
        return java.lang.Boolean.valueOf(z18);
    }
}
