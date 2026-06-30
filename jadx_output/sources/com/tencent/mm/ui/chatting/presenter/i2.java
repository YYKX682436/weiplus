package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.l2 f202259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f202260e;

    public i2(com.tencent.mm.ui.chatting.presenter.l2 l2Var, boolean z17) {
        this.f202259d = l2Var;
        this.f202260e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.l2 l2Var = this.f202259d;
        zb5.i iVar = l2Var.f202543f;
        if (iVar != null) {
            iVar.A(this.f202260e, l2Var.f202546i.size());
        }
    }
}
