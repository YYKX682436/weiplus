package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes10.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI f138065d;

    public g3(com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI fTSServiceNotifyUI) {
        this.f138065d = fTSServiceNotifyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI fTSServiceNotifyUI = this.f138065d;
        if (fTSServiceNotifyUI.isFinishing() || fTSServiceNotifyUI.isDestroyed()) {
            return;
        }
        fTSServiceNotifyUI.f137907h.getFtsEditText().m();
        fTSServiceNotifyUI.f137907h.getFtsEditText().t();
    }
}
