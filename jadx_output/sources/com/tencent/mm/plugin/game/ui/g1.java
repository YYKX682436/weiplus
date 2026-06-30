package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.e1 f141393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f141394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f141395g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView, com.tencent.mm.plugin.game.ui.e1 e1Var, yz5.p pVar, int i17) {
        super(2);
        this.f141392d = gameDebugView;
        this.f141393e = e1Var;
        this.f141394f = pVar;
        this.f141395g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f141395g | 1;
        com.tencent.mm.plugin.game.ui.e1 e1Var = this.f141393e;
        yz5.p pVar = this.f141394f;
        this.f141392d.Q6(e1Var, pVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
