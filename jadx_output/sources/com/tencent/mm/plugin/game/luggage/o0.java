package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f139861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI f139863f;

    public o0(com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI, android.view.View view, java.lang.String str) {
        this.f139863f = luggageGameWebViewUI;
        this.f139861d = view;
        this.f139862e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f139861d;
        com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI = this.f139863f;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = luggageGameWebViewUI.f139498h;
        java.lang.String str = this.f139862e;
        frameLayout.removeView((android.view.View) concurrentHashMap.get(str));
        luggageGameWebViewUI.f139498h.remove(str);
    }
}
