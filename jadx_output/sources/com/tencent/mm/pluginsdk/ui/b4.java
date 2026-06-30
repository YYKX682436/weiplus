package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f189906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl f189907e;

    public b4(com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl voiceInputLayoutImpl, int i17) {
        this.f189907e = voiceInputLayoutImpl;
        this.f189906d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.g3 g3Var = this.f189907e.f189865s;
        g3Var.getClass();
        g3Var.f190854q = this.f189906d < 28;
        g3Var.invalidateSelf();
    }
}
