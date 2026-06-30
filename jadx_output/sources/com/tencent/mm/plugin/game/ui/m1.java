package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f141468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f141469f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView, yz5.l lVar, int i17) {
        super(2);
        this.f141467d = gameDebugView;
        this.f141468e = lVar;
        this.f141469f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f141469f | 1;
        this.f141467d.R6(this.f141468e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
