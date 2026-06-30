package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o5 f207869d;

    public m5(com.tencent.mm.ui.conversation.o5 o5Var) {
        this.f207869d = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207869d;
        yf5.n m17 = o5Var.m("message_fold");
        if (m17 != null) {
            if (m17.f461930q.getTop() > o5Var.f207936s || m17.f461930q.getTop() <= o5Var.f207935r) {
                o5Var.w(false);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            o5Var.w(true);
        }
    }
}
