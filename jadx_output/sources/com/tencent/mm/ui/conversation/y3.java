package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b4 f208261d;

    public y3(com.tencent.mm.ui.conversation.b4 b4Var) {
        this.f208261d = b4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean a17 = gm0.j1.a();
        com.tencent.mm.ui.conversation.b4 b4Var = this.f208261d;
        if (!a17) {
            b4Var.C.d();
            com.tencent.mars.xlog.Log.e("MicroMsg.EnterpriseConversationAdapter", "dkpno handleDataChange acc has not ready");
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        b4Var.f();
        long currentTimeMillis2 = (java.lang.System.currentTimeMillis() - currentTimeMillis) * 3;
        int i17 = com.tencent.mm.ui.conversation.b4.E;
        boolean z18 = b4Var.B;
        long j17 = (currentTimeMillis2 + com.tencent.mm.ui.conversation.b4.D) / 2;
        com.tencent.mm.ui.conversation.b4.D = j17;
        b4Var.B = false;
        b4Var.C.c(j17, j17);
    }
}
