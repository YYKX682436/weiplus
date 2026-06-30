package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class h5 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI f142853a;

    public h5(com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI) {
        this.f142853a = iPCallTalkUI;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI = this.f142853a;
        if (!booleanValue) {
            iPCallTalkUI.finish();
        } else {
            int i17 = com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.f142711p;
            iPCallTalkUI.T6();
        }
    }
}
