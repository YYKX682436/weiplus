package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public class ia implements java.lang.Runnable {
    public ia(com.tencent.mm.ui.conversation.pa paVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.tencent.mm.sdk.platformtools.x2.f193073c) {
            com.tencent.mm.sdk.platformtools.x2.f193073c = true;
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.conversation.ha(this), 100L);
        }
        com.tencent.mm.plugin.report.service.f0.b(8);
    }
}
