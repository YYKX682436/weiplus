package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl f192054d;

    public c(com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl) {
        this.f192054d = webSearchVoiceInputLayoutImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.g3 g3Var = this.f192054d.f192047s;
        g3Var.f190856s = 5;
        g3Var.f190857t.cancel();
        g3Var.invalidateSelf();
    }
}
