package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f115246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f115247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f115246d = q0Var;
        this.f115247e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "loadStartupVideo come error.");
        r45.ce2 ce2Var = (r45.ce2) this.f115247e.f310123d;
        if (ce2Var == null || (str = ce2Var.getString(0)) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var = this.f115246d;
        q0Var.x1(str, true);
        com.tencent.mm.plugin.finder.live.plugin.vw vwVar = (com.tencent.mm.plugin.finder.live.plugin.vw) q0Var.X0(com.tencent.mm.plugin.finder.live.plugin.vw.class);
        if (vwVar != null) {
            vwVar.t1();
        }
        return jz5.f0.f302826a;
    }
}
