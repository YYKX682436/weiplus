package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f178992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.f1 f178993e;

    public e1(com.tencent.mm.plugin.wallet.pwd.ui.f1 f1Var, boolean z17) {
        this.f178993e = f1Var;
        this.f178992d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f178992d;
        com.tencent.mm.plugin.wallet.pwd.ui.f1 f1Var = this.f178993e;
        if (z17) {
            f1Var.f178998a.f178905d.fullScroll(130);
        } else {
            f1Var.f178998a.f178905d.fullScroll(33);
        }
    }
}
