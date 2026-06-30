package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.q f199344d;

    public k3(com.tencent.mm.ui.chatting.component.h3 h3Var, yb5.q qVar) {
        this.f199344d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        java.util.List<com.tencent.mm.storage.f9> p66 = cj6.p6(java.util.Collections.singletonList("findermessage006"));
        for (com.tencent.mm.storage.f9 f9Var : p66) {
            java.util.Set set = dt1.a.f243124h;
            if (!dt1.a.f243124h.contains(java.lang.Long.valueOf(f9Var.getMsgId()))) {
                f9Var.r1(5);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(p66.size());
        yb5.q qVar = this.f199344d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBypComponent", "sending msg size=%s talker=%s username=%s", valueOf, qVar.f460743b, qVar.f460742a);
    }
}
