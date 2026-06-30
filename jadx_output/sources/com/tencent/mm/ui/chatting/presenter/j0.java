package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.k0 f202278d;

    public j0(com.tencent.mm.ui.chatting.presenter.k0 k0Var) {
        this.f202278d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.k0 k0Var = this.f202278d;
        com.tencent.mm.ui.chatting.presenter.z0 z0Var = k0Var.f202296d;
        if (z0Var.f202543f == null || z0Var.f202572s.get()) {
            return;
        }
        k0Var.f202296d.f202543f.A(false, 0);
    }
}
