package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI f139969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI luggageGameHalfWebViewUI) {
        super(0);
        this.f139969d = luggageGameHalfWebViewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI luggageGameHalfWebViewUI = this.f139969d;
        luggageGameHalfWebViewUI.finish();
        luggageGameHalfWebViewUI.overridePendingTransition(com.tencent.mm.R.anim.f477783bc, com.tencent.mm.R.anim.f477831cp);
        return jz5.f0.f302826a;
    }
}
