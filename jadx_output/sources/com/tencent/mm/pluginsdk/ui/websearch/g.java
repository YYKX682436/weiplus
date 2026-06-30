package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl f192060e;

    public g(com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl, int i17) {
        this.f192060e = webSearchVoiceInputLayoutImpl;
        this.f192059d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.g3 g3Var = this.f192060e.f192047s;
        g3Var.getClass();
        g3Var.f190854q = this.f192059d < 28;
        g3Var.invalidateSelf();
    }
}
