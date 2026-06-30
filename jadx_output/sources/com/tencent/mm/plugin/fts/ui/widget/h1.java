package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl f138276d;

    public h1(com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl) {
        this.f138276d = fTSVoiceInputLayoutImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl.f138222x;
        com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = this.f138276d;
        fTSVoiceInputLayoutImpl.getClass();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.fts.ui.widget.c1(fTSVoiceInputLayoutImpl), 100L);
        com.tencent.mm.plugin.fts.ui.widget.x0 x0Var = fTSVoiceInputLayoutImpl.f138225s;
        x0Var.f138358n = 2;
        x0Var.f138359o = 0;
        x0Var.invalidateSelf();
    }
}
