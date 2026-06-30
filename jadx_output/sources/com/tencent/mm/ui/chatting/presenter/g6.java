package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.c6 f202232d;

    public g6(com.tencent.mm.ui.chatting.presenter.c6 c6Var) {
        this.f202232d = c6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.c6 c6Var = this.f202232d;
        if (c6Var.f202543f == null || c6Var.f202152t.get()) {
            return;
        }
        c6Var.f202543f.A(false, 0);
    }
}
