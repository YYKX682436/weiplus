package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class y9 extends qz5.l implements yz5.p {
    public y9(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.y9(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.y9 y9Var = new com.tencent.mm.plugin.finder.viewmodel.component.y9((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        ph.c c17 = tVar.c();
        com.tencent.mm.plugin.finder.viewmodel.component.aa.f133757e = c17.b();
        com.tencent.mm.plugin.finder.viewmodel.component.aa.f133758f = c17.c();
        c17.f();
        com.tencent.mm.plugin.finder.viewmodel.component.aa.f133759g = false;
        com.tencent.mars.xlog.Log.i("Finder.DeviceBatteryInfoUIC", "batteryPercentage=" + com.tencent.mm.plugin.finder.viewmodel.component.aa.f133757e + " isPowerSaveMode=" + com.tencent.mm.plugin.finder.viewmodel.component.aa.f133758f + " isLowBattery=" + com.tencent.mm.plugin.finder.viewmodel.component.aa.f133759g);
        return jz5.f0.f302826a;
    }
}
