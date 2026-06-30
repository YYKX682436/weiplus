package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI f139549d;

    public e1(com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI mMLuggageGameWebViewUI) {
        this.f139549d = mMLuggageGameWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_scene", 3);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(this.f139549d, intent, null);
    }
}
