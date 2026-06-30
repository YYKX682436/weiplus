package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f111776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var) {
        super(0);
        this.f111776d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "loadStartupVideo come onFirstFrameRendered.");
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var = this.f111776d;
        q0Var.getClass();
        q0Var.A1(mm2.f.f329018i);
        ig2.r f17 = ig2.m.f291393a.f(q0Var.V0().f309129d.f68549s);
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) q0Var.X0(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
        if (ob0Var != null) {
            ob0Var.w1(f17);
        }
        if (f17 != null) {
            f17.h();
        }
        yz5.a aVar = q0Var.f113944t;
        if (aVar != null) {
            aVar.invoke();
        }
        q0Var.f113944t = null;
        return jz5.f0.f302826a;
    }
}
