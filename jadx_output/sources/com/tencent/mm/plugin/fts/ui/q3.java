package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes10.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI f138163d;

    public q3(com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI fTSWXPayNotifyUI) {
        this.f138163d = fTSWXPayNotifyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI fTSWXPayNotifyUI = this.f138163d;
        if (fTSWXPayNotifyUI.isFinishing() || fTSWXPayNotifyUI.isDestroyed()) {
            return;
        }
        fTSWXPayNotifyUI.f137907h.getFtsEditText().m();
        fTSWXPayNotifyUI.f137907h.getFtsEditText().t();
    }
}
