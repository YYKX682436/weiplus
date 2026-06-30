package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class dh implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ah f198939d;

    public dh(com.tencent.mm.ui.chatting.component.ah ahVar) {
        this.f198939d = ahVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        if (this.f198939d.f198580d == null) {
            return false;
        }
        ((os.a) ((ps.e) i95.n0.c(ps.e.class))).getClass();
        if (!com.tencent.mm.plugin.ai.data.business.tools_mp.a.f74654d.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "now try to activity the tools process");
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        }
        return false;
    }
}
