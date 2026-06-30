package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI f139851d;

    public m0(com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI) {
        this.f139851d = luggageGameWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_scene", 3);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(this.f139851d, intent, null);
    }
}
