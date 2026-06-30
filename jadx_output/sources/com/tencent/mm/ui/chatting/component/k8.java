package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199354e;

    public k8(com.tencent.mm.ui.chatting.component.y8 y8Var, int i17) {
        this.f199353d = y8Var;
        this.f199354e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199353d;
        if (y8Var.C) {
            if (this.f199354e == y8Var.F) {
                y8Var.E = true;
                com.tencent.mm.ui.chatting.component.y8.q0(y8Var, y8Var.H, y8Var.I);
            }
        }
    }
}
