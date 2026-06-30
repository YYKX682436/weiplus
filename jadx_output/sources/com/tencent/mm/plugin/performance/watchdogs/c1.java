package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class c1 implements com.tencent.mm.matrix.dice.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog f153035d;

    public c1(com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog threadWatchDog) {
        this.f153035d = threadWatchDog;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public double A4() {
        return 1.0d / ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_diagnostic_pthread_hook_auto_trigger_rate_denominator_v2, 5);
    }

    @Override // com.tencent.mm.matrix.dice.a
    public void Sg(double d17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadWatchDog", "enable trigger pthread hook");
        this.f153035d.enableTriggerPthreadHook = true;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public long V3() {
        return 0L;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public java.lang.String key() {
        return "MicroMsg.ThreadWatchDog";
    }
}
