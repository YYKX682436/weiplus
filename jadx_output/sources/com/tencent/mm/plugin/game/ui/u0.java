package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f141779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f141781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f141782h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView, android.content.Context context, java.lang.String str, yz5.a aVar, int i17) {
        super(2);
        this.f141778d = gameDebugView;
        this.f141779e = context;
        this.f141780f = str;
        this.f141781g = aVar;
        this.f141782h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        this.f141778d.N6(this.f141779e, this.f141780f, this.f141781g, (n0.o) obj, this.f141782h | 1);
        return jz5.f0.f302826a;
    }
}
