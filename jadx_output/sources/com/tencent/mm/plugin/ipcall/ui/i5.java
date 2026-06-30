package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI f142873d;

    public i5(com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI) {
        this.f142873d = iPCallTalkUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI = this.f142873d;
        iPCallTalkUI.setResult(-1, intent);
        iPCallTalkUI.finish();
    }
}
