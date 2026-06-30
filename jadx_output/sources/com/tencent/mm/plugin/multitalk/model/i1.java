package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class i1 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.v0 f150000d;

    public i1(com.tencent.mm.plugin.multitalk.model.v0 v0Var) {
        this.f150000d = v0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f150000d;
        v0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - v0Var.f150180w;
        sj3.e4 e4Var = sj3.e4.Talking;
        if (currentTimeMillis >= 45000 && this.f150000d.f150176s != e4Var) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.model.g1(this));
        }
        com.tencent.mm.plugin.multitalk.model.v0 v0Var2 = this.f150000d;
        if (v0Var2.f150176s == e4Var) {
            v0Var2.f150181x++;
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.multitalk.model.h1(this));
        }
    }
}
