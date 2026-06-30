package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.j3 f204160f;

    public i3(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.j3 j3Var) {
        this.f204158d = dVar;
        this.f204159e = f9Var;
        this.f204160f = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.viewitems.j3 j3Var = this.f204160f;
        yb5.d dVar = this.f204158d;
        com.tencent.mm.storage.f9 f9Var = this.f204159e;
        com.tencent.mm.ui.chatting.viewitems.s1.b(dVar, f9Var, j3Var.A(dVar, f9Var));
    }
}
