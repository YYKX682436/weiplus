package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class p0 implements vz.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI f139864a;

    public p0(com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI) {
        this.f139864a = luggageGameWebViewUI;
    }

    @Override // vz.w1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGameWebViewUI", str);
        int i17 = com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI.f139493i;
        this.f139864a.U6();
    }

    @Override // vz.w1
    public void onDismiss() {
        int i17 = com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI.f139493i;
        this.f139864a.U6();
    }
}
