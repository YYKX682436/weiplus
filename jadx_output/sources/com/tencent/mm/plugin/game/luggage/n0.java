package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f139856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f139857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI f139859g;

    public n0(com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI, android.view.View view, android.view.View view2, java.lang.String str) {
        this.f139859g = luggageGameWebViewUI;
        this.f139856d = view;
        this.f139857e = view2;
        this.f139858f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f139856d;
        android.view.View view = this.f139857e;
        frameLayout.addView(view);
        this.f139859g.f139498h.put(this.f139858f, view);
    }
}
