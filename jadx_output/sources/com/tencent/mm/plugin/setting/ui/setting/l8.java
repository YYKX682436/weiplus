package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class l8 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.p8 f161286d;

    public l8(com.tencent.mm.plugin.setting.ui.setting.p8 p8Var) {
        this.f161286d = p8Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        e21.f0 f0Var = (e21.f0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeCloseUIC", "opResult: " + f0Var);
        com.tencent.mm.plugin.setting.ui.setting.p8 p8Var = this.f161286d;
        if (p8Var.f161427d != null) {
            xg3.q0 q0Var = f0Var.f246516a;
            if (q0Var != null && q0Var.b() == 23) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.setting.ui.setting.n8(p8Var, f0Var.f246517b));
            }
        }
        return jz5.f0.f302826a;
    }
}
