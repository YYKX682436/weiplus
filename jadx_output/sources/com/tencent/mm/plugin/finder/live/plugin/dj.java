package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class dj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fj f112295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.sy2 f112296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(com.tencent.mm.plugin.finder.live.plugin.fj fjVar, r45.sy2 sy2Var) {
        super(0);
        this.f112295d = fjVar;
        this.f112296e = sy2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list = this.f112296e.getList(0);
        r45.p73 p73Var = list != null ? (r45.p73) kz5.n0.Z(list) : null;
        com.tencent.mm.plugin.finder.live.plugin.fj fjVar = this.f112295d;
        fjVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskBubblePlugin", "#updateGiftInfo");
        te2.n3 n3Var = fjVar.f112561p;
        if (n3Var != null) {
            ((te2.r3) n3Var).g(p73Var, false);
        }
        return jz5.f0.f302826a;
    }
}
