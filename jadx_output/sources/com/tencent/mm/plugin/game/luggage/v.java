package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI f140031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI luggageGameHalfWebViewUI) {
        super(0);
        this.f140031d = luggageGameHalfWebViewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI luggageGameHalfWebViewUI = this.f140031d;
        if (luggageGameHalfWebViewUI.f139494d.b() instanceof com.tencent.mm.plugin.game.luggage.page.x0) {
            sd.k b17 = luggageGameHalfWebViewUI.f139494d.b();
            kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type com.tencent.mm.plugin.game.luggage.page.GameWebPage");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((com.tencent.mm.plugin.game.luggage.page.x0) b17).f182180p.getWebScrollY() == 0);
            kotlin.jvm.internal.o.d(valueOf);
            r2 = valueOf.booleanValue();
        }
        return java.lang.Boolean.valueOf(r2);
    }
}
