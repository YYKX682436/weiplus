package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1.k f141873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f141874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(c1.k kVar, n0.v2 v2Var) {
        super(1);
        this.f141873d = kVar;
        this.f141874e = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j0.h2 $receiver = (j0.h2) obj;
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        int i17 = com.tencent.mm.plugin.game.ui.GameDebugView.f140728d;
        com.tencent.mm.plugin.game.model.w.d("GameDebugID.ReddotMockContent", (java.lang.String) this.f141874e.getValue());
        c1.j.a(this.f141873d, false, 1, null);
        return jz5.f0.f302826a;
    }
}
