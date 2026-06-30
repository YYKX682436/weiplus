package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl f192092d;

    public x3(com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl voiceInputLayoutImpl) {
        this.f192092d = voiceInputLayoutImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.g3 g3Var = this.f192092d.f189865s;
        g3Var.f190856s = 5;
        g3Var.f190857t.cancel();
        g3Var.invalidateSelf();
    }
}
