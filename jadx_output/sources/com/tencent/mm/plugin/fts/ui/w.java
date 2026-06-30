package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddWw f138215d;

    public w(com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw) {
        this.f138215d = fTSAddWw;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw = this.f138215d;
        fTSAddWw.f137907h.getFtsEditText().m();
        fTSAddWw.f137907h.getFtsEditText().t();
    }
}
