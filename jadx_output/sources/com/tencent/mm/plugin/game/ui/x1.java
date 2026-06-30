package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f141843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(n0.v2 v2Var) {
        super(1);
        this.f141843d = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.game.ui.GameDebugView.f140728d;
        this.f141843d.setValue(it);
        return jz5.f0.f302826a;
    }
}
