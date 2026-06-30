package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f161058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f161059e;

    public g0(com.tencent.mm.plugin.setting.ui.setting.i0 i0Var, boolean z17) {
        this.f161058d = i0Var;
        this.f161059e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = this.f161058d;
        i0Var.f161136v++;
        i0Var.O6(this.f161059e);
    }
}
