package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f141795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f141796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f141795d = v2Var;
        this.f141796e = v2Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.game.ui.GameDebugView.f140728d;
        com.tencent.mm.plugin.game.model.w.d("GameDebugID.ReddotMockUrl", (java.lang.String) this.f141795d.getValue());
        com.tencent.mm.plugin.game.model.w.d("GameDebugID.ReddotMockContent", (java.lang.String) this.f141796e.getValue());
        return jz5.f0.f302826a;
    }
}
