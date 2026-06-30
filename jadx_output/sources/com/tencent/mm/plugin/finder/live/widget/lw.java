package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f118979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f118981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nw f118982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(az2.f fVar, int i17, java.util.List list, com.tencent.mm.plugin.finder.live.widget.nw nwVar) {
        super(0);
        this.f118979d = fVar;
        this.f118980e = i17;
        this.f118981f = list;
        this.f118982g = nwVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ch0 ch0Var;
        dk2.xf k17;
        this.f118979d.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switch role succeeded. role type ");
        int i17 = this.f118980e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("FinderLiveSwitchRoleDialog", sb6.toString());
        zl2.r4.f473950a.W2(new java.util.LinkedList(this.f118981f), i17, g92.b.f269769e.k2().getLong(5));
        gk2.e eVar = gk2.e.f272471n;
        if (eVar != null && (k17 = dk2.ef.f233372a.k(eVar)) != null) {
            ((dk2.r4) k17).q(null);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (ch0Var = (com.tencent.mm.plugin.finder.live.plugin.ch0) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ch0.class)) != null) {
            ch0Var.K0(8);
        }
        com.tencent.mm.plugin.finder.live.widget.nw nwVar = this.f118982g;
        nwVar.f119211i.invoke(java.lang.Integer.valueOf(i17));
        nwVar.a();
        return jz5.f0.f302826a;
    }
}
