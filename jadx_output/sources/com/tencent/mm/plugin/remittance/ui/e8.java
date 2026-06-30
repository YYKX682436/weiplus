package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI f157693d;

    public e8(com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI remittanceResultNewUI) {
        this.f157693d = remittanceResultNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI remittanceResultNewUI = this.f157693d;
        int i17 = remittanceResultNewUI.f157570f;
        if (i17 == 33 || i17 == 32 || i17 == 48) {
            remittanceResultNewUI.finish();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceResultNewUI.f157571g) || remittanceResultNewUI.f157572h) {
            remittanceResultNewUI.finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", remittanceResultNewUI.f157571g);
        intent.putExtra("finish_direct", false);
        j45.l.u(remittanceResultNewUI, ".ui.chatting.ChattingUI", intent, null);
    }
}
