package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class d1 implements com.tencent.mm.matrix.dice.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog f153038d;

    public d1(com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog threadWatchDog) {
        this.f153038d = threadWatchDog;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public double A4() {
        long Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_diagnostic_pthread_hook_sensitive_rate, 2);
        if (Ni == 0) {
            Ni = -1;
        }
        return 1.0d / Ni;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public void Sg(double d17) {
        this.f153038d.isSensitiveMode = true;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public long V3() {
        return 0L;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public java.lang.String key() {
        return "MicroMsg.ThreadWatchDog-sensitive";
    }
}
