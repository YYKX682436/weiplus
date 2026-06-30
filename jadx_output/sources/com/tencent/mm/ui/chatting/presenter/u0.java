package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te5.i f202491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.v0 f202492e;

    public u0(com.tencent.mm.ui.chatting.presenter.v0 v0Var, te5.i iVar) {
        this.f202492e = v0Var;
        this.f202491d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.v0 v0Var = this.f202492e;
        com.tencent.mm.ui.chatting.presenter.x0 x0Var = v0Var.f202504f;
        if (x0Var.f202533q == v0Var.f202502d) {
            com.tencent.mm.ui.chatting.presenter.z0 z0Var = v0Var.f202506h;
            com.tencent.mm.ui.chatting.presenter.w0 w0Var = v0Var.f202505g;
            te5.i iVar = com.tencent.mm.ui.chatting.presenter.z0.f202569v;
            z0Var.q(x0Var, this.f202491d, w0Var);
        }
    }
}
