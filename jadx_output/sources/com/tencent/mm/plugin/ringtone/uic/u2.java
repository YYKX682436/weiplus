package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes5.dex */
public final class u2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158497d;

    public u2(com.tencent.mm.plugin.ringtone.uic.b3 b3Var) {
        this.f158497d = b3Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        e21.f0 f0Var = (e21.f0) obj;
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "opResult: " + f0Var);
        if (f0Var.f246517b == 0) {
            xg3.q0 q0Var = f0Var.f246516a;
            if (q0Var != null && q0Var.b() == 23) {
                com.tencent.mm.plugin.ringtone.uic.b3 b3Var = this.f158497d;
                if (b3Var.f158367w) {
                    b3Var.O6(true, true);
                    b3Var.f158367w = false;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
