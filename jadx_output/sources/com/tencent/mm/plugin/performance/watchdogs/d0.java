package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class d0 implements com.tencent.mm.matrix.dice.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.b0 f153037d;

    public d0(com.tencent.mm.plugin.performance.watchdogs.b0 b0Var) {
        this.f153037d = b0Var;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public double A4() {
        return 1.0d / ih.a.d(e42.d0.clicfg_diagnostic_memory_hook_auto_trigger_rate_denominator, -1L);
    }

    @Override // com.tencent.mm.matrix.dice.a
    public void Sg(double d17) {
        this.f153037d.f153026u = true;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public long V3() {
        return 0L;
    }

    @Override // com.tencent.mm.matrix.dice.a
    public java.lang.String key() {
        return "MicroMsg.MemoryWatchDog";
    }
}
