package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.b6 f202501e;

    public u5(com.tencent.mm.ui.chatting.presenter.b6 b6Var, int i17) {
        this.f202501e = b6Var;
        this.f202500d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.b6 b6Var = this.f202501e;
        if (b6Var.f202543f == null || b6Var.f202139s.get()) {
            return;
        }
        b6Var.f202543f.A(false, this.f202500d);
    }
}
