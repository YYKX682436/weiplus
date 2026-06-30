package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f141070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f141071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView, yz5.l lVar, int i17) {
        super(2);
        this.f141069d = gameDebugView;
        this.f141070e = lVar;
        this.f141071f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f141071f | 1;
        this.f141069d.O6(this.f141070e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
