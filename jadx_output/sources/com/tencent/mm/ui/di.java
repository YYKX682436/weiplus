package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class di implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f208342d;

    public di(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f208342d = singleChatInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f208342d;
        if (com.tencent.mm.storage.z3.L3(singleChatInfoUI.f197077n)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "[+] onDeleteContact: yuanbao username:%s, notify to server now.", singleChatInfoUI.f197077n);
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ni(singleChatInfoUI.f197077n);
            singleChatInfoUI.W6("yuanbao_chat_delete_suc", null);
        }
        singleChatInfoUI.setResult(1);
        singleChatInfoUI.finish();
    }
}
