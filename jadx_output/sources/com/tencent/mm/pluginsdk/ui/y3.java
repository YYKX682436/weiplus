package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f192099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl f192100e;

    public y3(com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl voiceInputLayoutImpl, boolean z17) {
        this.f192100e = voiceInputLayoutImpl;
        this.f192099d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.g3 g3Var = this.f192100e.f189865s;
        g3Var.getClass();
        if (!this.f192099d) {
            g3Var.f190856s = 3;
        }
        g3Var.f190854q = true;
        g3Var.invalidateSelf();
    }
}
