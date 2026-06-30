package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.c6 f202254e;

    public h6(com.tencent.mm.ui.chatting.presenter.c6 c6Var, int i17) {
        this.f202254e = c6Var;
        this.f202253d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.c6 c6Var = this.f202254e;
        if (c6Var.f202543f == null || c6Var.f202152t.get()) {
            return;
        }
        c6Var.f202543f.A(false, this.f202253d);
    }
}
