package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o2 f207737d;

    public i2(com.tencent.mm.ui.conversation.o2 o2Var) {
        this.f207737d = o2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean a17 = gm0.j1.a();
        com.tencent.mm.ui.conversation.o2 o2Var = this.f207737d;
        if (!a17) {
            o2Var.G.d();
            com.tencent.mars.xlog.Log.e("MicroMsg.ConversationAdapter", "dkpno handleDataChange acc has not ready");
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        o2Var.f();
        long currentTimeMillis2 = (java.lang.System.currentTimeMillis() - currentTimeMillis) * 3;
        int i17 = com.tencent.mm.ui.conversation.o2.I;
        boolean z18 = o2Var.F;
        long j17 = (currentTimeMillis2 + com.tencent.mm.ui.conversation.o2.H) / 2;
        com.tencent.mm.ui.conversation.o2.H = j17;
        o2Var.F = false;
        o2Var.G.c(j17, j17);
    }
}
