package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.x0 f159078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f159079e;

    public v0(com.tencent.mm.plugin.scanner.model.x0 x0Var, long j17) {
        this.f159078d = x0Var;
        this.f159079e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.model.x0 x0Var = this.f159078d;
        if (x0Var.f159098e) {
            x0Var.a(this.f159079e, true);
        }
    }
}
