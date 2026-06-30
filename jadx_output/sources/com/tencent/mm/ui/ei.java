package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ei implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f208402d;

    public ei(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f208402d = singleChatInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f208402d;
        if (com.tencent.mm.storage.z3.L3(singleChatInfoUI.f197077n)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "[+] onDeleteContact cancle: yuanbao username:%s", singleChatInfoUI.f197077n);
            singleChatInfoUI.W6("yuanbao_chat_delete_cancel", null);
        }
    }
}
