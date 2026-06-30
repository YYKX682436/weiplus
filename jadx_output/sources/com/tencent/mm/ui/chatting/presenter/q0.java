package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.z0 f202427e;

    public q0(com.tencent.mm.ui.chatting.presenter.z0 z0Var, int i17) {
        this.f202427e = z0Var;
        this.f202426d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.z0 z0Var = this.f202427e;
        if (z0Var.f202543f == null || z0Var.f202572s.get()) {
            return;
        }
        z0Var.f202543f.A(false, this.f202426d);
    }
}
