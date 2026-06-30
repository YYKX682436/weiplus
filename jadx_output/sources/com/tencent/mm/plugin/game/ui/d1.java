package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f141360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f141361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f141362h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView, java.lang.String str, boolean z17, yz5.a aVar, int i17) {
        super(2);
        this.f141358d = gameDebugView;
        this.f141359e = str;
        this.f141360f = z17;
        this.f141361g = aVar;
        this.f141362h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        this.f141358d.P6(this.f141359e, this.f141360f, this.f141361g, (n0.o) obj, this.f141362h | 1);
        return jz5.f0.f302826a;
    }
}
