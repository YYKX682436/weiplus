package com.tencent.mm.xwebutil;

/* loaded from: classes11.dex */
public class w0 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f214892b;

    public w0(int i17) {
        this.f214892b = i17;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "onEnterBackground, try force kill child process in " + this.f214892b + "ms");
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.xwebutil.v0 v0Var = new com.tencent.mm.xwebutil.v0(this);
        long j17 = (long) this.f214892b;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(v0Var, j17, null);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "onExitBackground");
    }
}
