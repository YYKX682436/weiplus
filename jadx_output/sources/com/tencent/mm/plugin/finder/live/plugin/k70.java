package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k70 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f113201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        super(0);
        this.f113201d = v70Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f113201d;
        com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var = v70Var.f114683q;
        com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var2 = com.tencent.mm.plugin.finder.live.plugin.gp0.f112724d;
        if (gp0Var == gp0Var2) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "hideStatePanel: curState is Hide");
        } else {
            v70Var.t1();
            v70Var.f114683q = gp0Var2;
            v70Var.f114684r.h(true, new com.tencent.mm.plugin.finder.live.plugin.j70(v70Var));
        }
        return jz5.f0.f302826a;
    }
}
