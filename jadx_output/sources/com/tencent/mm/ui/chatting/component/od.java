package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class od implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.le f199639d;

    public od(com.tencent.mm.ui.chatting.component.le leVar) {
        this.f199639d = leVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.ui.chatting.component.le leVar = this.f199639d;
        java.lang.Thread thread = leVar.f199429x;
        objArr[0] = thread != null ? java.lang.Boolean.valueOf(thread.isAlive()) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "getRecentToolsThread interrupt() %s", objArr);
        java.lang.Thread thread2 = leVar.f199429x;
        if (thread2 == null || !thread2.isAlive()) {
            return;
        }
        leVar.f199429x.interrupt();
    }
}
