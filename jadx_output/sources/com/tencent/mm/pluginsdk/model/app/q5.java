package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.s5 f189047d;

    public q5(com.tencent.mm.pluginsdk.model.app.s5 s5Var) {
        this.f189047d = s5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.model.app.s5 s5Var = this.f189047d;
        long j17 = currentTimeMillis - s5Var.f189078p;
        boolean z17 = s5Var.f189076n;
        boolean z18 = s5Var.f189075m;
        boolean z19 = s5Var.f189074i;
        if (z17) {
            if (j17 < 10800000) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneAppMsg", "summerbig ERR: Try Run service runningFlag:" + s5Var.f189076n + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + s5Var.f189075m + " recving:" + s5Var.f189074i);
        }
        s5Var.f189076n = true;
        s5Var.f189075m = false;
        s5Var.f189077o = 4;
        s5Var.f189074i = false;
        s5Var.f189079q.b();
        s5Var.f189080r.c(10L, 10L);
    }

    public java.lang.String toString() {
        return super.toString() + "|run";
    }
}
