package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseMainUI f138119d;

    public n0(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI) {
        this.f138119d = fTSBaseMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainUI", " finish");
        super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
    }
}
