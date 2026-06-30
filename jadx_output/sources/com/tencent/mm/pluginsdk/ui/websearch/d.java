package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f192055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl f192056e;

    public d(com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl, boolean z17) {
        this.f192056e = webSearchVoiceInputLayoutImpl;
        this.f192055d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.g3 g3Var = this.f192056e.f192047s;
        g3Var.getClass();
        if (!this.f192055d) {
            g3Var.f190856s = 3;
        }
        g3Var.f190854q = true;
        g3Var.invalidateSelf();
    }
}
