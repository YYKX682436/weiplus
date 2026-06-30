package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f141761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView, int i17) {
        super(2);
        this.f141760d = gameDebugView;
        this.f141761e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f141761e | 1;
        this.f141760d.S6((n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
