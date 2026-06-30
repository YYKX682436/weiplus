package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.f0 f190290d;

    public e0(com.tencent.mm.pluginsdk.ui.chat.f0 f0Var) {
        this.f190290d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.f0 f0Var = this.f190290d;
        if (f0Var.f190303d.L0()) {
            return;
        }
        f0Var.f190303d.f190021m.getSizeAnimController().a(true);
    }
}
