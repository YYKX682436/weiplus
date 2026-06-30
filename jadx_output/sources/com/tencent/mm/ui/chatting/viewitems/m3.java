package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.n3 f204552f;

    public m3(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.n3 n3Var) {
        this.f204550d = dVar;
        this.f204551e = f9Var;
        this.f204552f = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.viewitems.n3 n3Var = this.f204552f;
        yb5.d dVar = this.f204550d;
        com.tencent.mm.storage.f9 f9Var = this.f204551e;
        com.tencent.mm.ui.chatting.viewitems.s1.b(dVar, f9Var, n3Var.A(dVar, f9Var));
    }
}
