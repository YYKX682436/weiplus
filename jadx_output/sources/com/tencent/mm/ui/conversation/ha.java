package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public class ha implements java.lang.Runnable {
    public ha(com.tencent.mm.ui.conversation.ia iaVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RefreshHelper", "APPHasInitEvent begin");
        new com.tencent.mm.autogen.events.APPHasInitEvent().e();
    }
}
