package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m5 f202270d;

    public i5(com.tencent.mm.ui.chatting.presenter.m5 m5Var) {
        this.f202270d = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.m5 m5Var = this.f202270d;
        if (m5Var.f202543f == null || m5Var.f202348s.get()) {
            return;
        }
        m5Var.f202543f.A(false, 0);
    }
}
