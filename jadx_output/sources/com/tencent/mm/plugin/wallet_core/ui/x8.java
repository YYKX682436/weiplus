package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f180798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.y8 f180799e;

    public x8(com.tencent.mm.plugin.wallet_core.ui.y8 y8Var, boolean z17) {
        this.f180799e = y8Var;
        this.f180798d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f180798d;
        com.tencent.mm.plugin.wallet_core.ui.y8 y8Var = this.f180799e;
        if (z17) {
            y8Var.f180815a.f180099g.fullScroll(130);
        } else {
            y8Var.f180815a.f180099g.fullScroll(33);
        }
    }
}
