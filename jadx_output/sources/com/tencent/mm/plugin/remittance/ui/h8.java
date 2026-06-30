package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI f157754d;

    public h8(com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI remittanceResultOldUI) {
        this.f157754d = remittanceResultOldUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI remittanceResultOldUI = this.f157754d;
        int i17 = remittanceResultOldUI.f157591f;
        if (i17 == 33 || i17 == 32) {
            remittanceResultOldUI.finish();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceResultOldUI.f157592g) || remittanceResultOldUI.f157593h) {
            remittanceResultOldUI.finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", remittanceResultOldUI.f157592g);
        intent.putExtra("finish_direct", false);
        j45.l.u(remittanceResultOldUI, ".ui.chatting.ChattingUI", intent, null);
    }
}
