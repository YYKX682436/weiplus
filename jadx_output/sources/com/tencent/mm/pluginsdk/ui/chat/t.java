package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes14.dex */
public class t implements wu5.h {
    public t(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AppPanel_preMakeConnection";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.s1.cj().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "preMakeConnection ret:%d", 0);
        com.tencent.mm.pluginsdk.ui.chat.AppPanel.f189926y0 = false;
    }
}
