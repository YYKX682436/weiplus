package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wh f114260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g84 f114261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(com.tencent.mm.plugin.finder.live.plugin.wh whVar, r45.g84 g84Var) {
        super(0);
        this.f114260d = whVar;
        this.f114261e = g84Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.wh whVar = this.f114260d;
        fy2.d dVar = (fy2.d) whVar.P0(fy2.d.class);
        r45.g84 g84Var = this.f114261e;
        if (dVar.P6(g84Var != null ? g84Var.getString(1) : null, 1)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveDecorationPlugin", "");
            com.tencent.mm.plugin.finder.live.plugin.wh.t1(whVar, g84Var);
        }
        return jz5.f0.f302826a;
    }
}
