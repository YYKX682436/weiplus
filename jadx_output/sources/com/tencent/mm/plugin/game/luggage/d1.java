package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI f139548e;

    public d1(com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI mMLuggageGameWebViewUI, java.lang.String str) {
        this.f139548e = mMLuggageGameWebViewUI;
        this.f139547d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI mMLuggageGameWebViewUI = this.f139548e;
        if (mMLuggageGameWebViewUI.isFinishing() || mMLuggageGameWebViewUI.activityHasDestroyed()) {
            return;
        }
        mMLuggageGameWebViewUI.f139504d.i(this.f139547d, mMLuggageGameWebViewUI.getIntent().getExtras());
    }
}
