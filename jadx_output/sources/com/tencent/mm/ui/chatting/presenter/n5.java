package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o5 f202371d;

    public n5(com.tencent.mm.ui.chatting.presenter.o5 o5Var) {
        this.f202371d = o5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.o5 o5Var = this.f202371d;
        com.tencent.mm.ui.chatting.presenter.b6 b6Var = o5Var.f202411d;
        if (b6Var.f202543f == null || b6Var.f202139s.get()) {
            return;
        }
        o5Var.f202411d.f202543f.A(false, 0);
    }
}
