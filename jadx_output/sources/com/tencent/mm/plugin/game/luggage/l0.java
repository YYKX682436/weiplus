package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI f139806e;

    public l0(com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI, java.lang.String str) {
        this.f139806e = luggageGameWebViewUI;
        this.f139805d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI = this.f139806e;
        if (luggageGameWebViewUI.isFinishing() || luggageGameWebViewUI.activityHasDestroyed()) {
            return;
        }
        luggageGameWebViewUI.f139494d.i(this.f139805d, luggageGameWebViewUI.getIntent().getExtras());
    }
}
