package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f138281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl f138282e;

    public i1(com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl, int i17) {
        this.f138282e = fTSVoiceInputLayoutImpl;
        this.f138281d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.widget.x0 x0Var = this.f138282e.f138225s;
        int i17 = x0Var.f138359o;
        int i18 = this.f138281d;
        x0Var.f138356l = i18 < 10;
        x0Var.invalidateSelf();
        x0Var.f138359o = i18;
    }
}
