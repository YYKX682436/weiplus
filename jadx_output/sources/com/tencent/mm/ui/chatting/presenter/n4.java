package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.p4 f202370d;

    public n4(com.tencent.mm.ui.chatting.presenter.p4 p4Var) {
        this.f202370d = p4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.p4 p4Var = this.f202370d;
        com.tencent.mm.ui.chatting.presenter.y4 y4Var = p4Var.f202421d;
        if (y4Var.f202543f == null || y4Var.f202565s.get()) {
            return;
        }
        p4Var.f202421d.f202543f.A(false, 0);
    }
}
