package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f208219d;

    public w6(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f208219d = mainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.q qVar = this.f208219d.f207380w;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BannerHelper", "destroyBanner");
        qVar.f207989s = true;
        qVar.c();
        qVar.a(qVar.f207977d);
        qVar.a(qVar.f207978e);
        qVar.a(qVar.f207979f);
        qVar.a(qVar.f207980g);
        com.tencent.mm.network.s0 s0Var = qVar.f207982i;
        gm0.j1.i();
        gm0.j1.n().d(s0Var);
        com.tencent.mm.sdk.event.IListener iListener = qVar.f207983m;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.sdk.event.IListener iListener2 = qVar.f207984n;
        if (iListener2 != null) {
            iListener2.dead();
        }
        if (gm0.j1.a()) {
            c01.d9.b().G(qVar);
        }
        qVar.f207985o = null;
        s72.r0 a17 = s72.r0.a();
        synchronized (a17.f404144a) {
            ((java.util.LinkedList) a17.f404144a).remove(qVar);
        }
    }
}
