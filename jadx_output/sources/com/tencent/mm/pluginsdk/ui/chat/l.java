package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes14.dex */
public class l extends wu5.b {
    public l(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "initAppGrid";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppPanel", "initAppGrid ANR!");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(999L, 2L, 1L);
    }
}
