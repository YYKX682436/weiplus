package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public interface oo0 {
    static /* synthetic */ kotlinx.coroutines.f1 L(com.tencent.mm.plugin.finder.live.plugin.oo0 oo0Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchAsync");
        }
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return oo0Var.H(lVar, a1Var, pVar);
    }

    static /* synthetic */ kotlinx.coroutines.r2 Z(com.tencent.mm.plugin.finder.live.plugin.oo0 oo0Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scopeLaunch");
        }
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return oo0Var.d0(lVar, a1Var, pVar);
    }

    kotlinx.coroutines.f1 H(oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar);

    so2.v2 Y();

    kotlinx.coroutines.r2 d0(oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar);
}
