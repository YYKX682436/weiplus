package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.JumpRemind$2 f213903d;

    public h0(com.tencent.mm.wallet_core.model.JumpRemind$2 jumpRemind$2) {
        this.f213903d = jumpRemind$2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.model.p0 p0Var = this.f213903d.f213845d;
        if (p0Var.f213970i) {
            return;
        }
        p0Var.f213970i = true;
        p0Var.f213969h.onUrlCancel();
    }
}
