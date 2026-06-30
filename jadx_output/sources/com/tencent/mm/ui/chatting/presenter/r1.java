package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f202438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.p1 f202439e;

    public r1(com.tencent.mm.ui.chatting.presenter.p1 p1Var, boolean z17) {
        this.f202439e = p1Var;
        this.f202438d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.p1 p1Var = this.f202439e;
        zb5.i iVar = p1Var.f202543f;
        if (iVar != null) {
            iVar.A(this.f202438d, p1Var.f202546i.size());
        }
    }
}
