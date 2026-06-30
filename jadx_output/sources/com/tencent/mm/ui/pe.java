package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class pe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f209504d;

    public pe(com.tencent.mm.ui.he heVar) {
        this.f209504d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int q17;
        if (gm0.j1.a()) {
            q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(143618, null));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.UnreadCountHelper", "getAddrTabUnreadCount, but mmcore not ready");
            q17 = 0;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.oe(this, q17));
    }
}
