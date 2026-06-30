package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class o3 implements java.lang.Runnable {
    public o3(com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener notifyGameWebviewOperationListener) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval:%sms, allow enter url:%s", 1000, com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.f140182h);
        com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.f140182h = "";
    }
}
