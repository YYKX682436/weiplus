package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f138269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl f138270e;

    public f1(com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl, boolean z17) {
        this.f138270e = fTSVoiceInputLayoutImpl;
        this.f138269d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.widget.x0 x0Var = this.f138270e.f138225s;
        if (!this.f138269d) {
            x0Var.f138358n = 3;
        }
        int i17 = x0Var.f138359o;
        x0Var.f138356l = true;
        x0Var.invalidateSelf();
        x0Var.f138359o = 0;
    }
}
