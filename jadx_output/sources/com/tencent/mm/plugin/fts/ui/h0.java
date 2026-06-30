package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseMainUI f138066d;

    public h0(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI) {
        this.f138066d = fTSBaseMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI = this.f138066d;
        android.app.Dialog dialog = fTSBaseMainUI.S1;
        if (dialog != null) {
            dialog.dismiss();
            fTSBaseMainUI.S1 = null;
        }
    }
}
