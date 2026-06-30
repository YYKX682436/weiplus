package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class mf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f199505d;

    public mf(com.tencent.mm.ui.chatting.component.pe peVar) {
        this.f199505d = peVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int c17 = c01.h2.c(1);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.lf(this, c17));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.HeaderComponent", "updateTitleUnread  last time %d, unread %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(c17));
    }
}
