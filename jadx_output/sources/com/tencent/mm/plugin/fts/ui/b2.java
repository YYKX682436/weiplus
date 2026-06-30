package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSChattingConvUI f138022d;

    public b2(com.tencent.mm.plugin.fts.ui.FTSChattingConvUI fTSChattingConvUI) {
        this.f138022d = fTSChattingConvUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSChattingConvUI fTSChattingConvUI = this.f138022d;
        fTSChattingConvUI.f137907h.getFtsEditText().m();
        fTSChattingConvUI.f137907h.getFtsEditText().t();
    }
}
