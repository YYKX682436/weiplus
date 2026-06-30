package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class zi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f212636d;

    public zi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f212636d = singleChatInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f212636d;
        g0Var.d(14553, 6, 4, singleChatInfoUI.f197077n);
        com.tencent.mm.ui.SingleChatInfoUI.f197069x = true;
        if (singleChatInfoUI.f197081r) {
            singleChatInfoUI.finish();
            return;
        }
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI != null) {
            launcherUI.startChatting(singleChatInfoUI.f197071e.d1(), null, true);
        }
    }
}
