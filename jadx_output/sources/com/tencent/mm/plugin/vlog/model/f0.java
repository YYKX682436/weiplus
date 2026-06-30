package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public interface f0 {
    static float a(com.tencent.mm.plugin.vlog.model.f0 f0Var, r45.h70 compositionInfo, boolean z17, yz5.l callback, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: export");
        }
        com.tencent.mm.plugin.vlog.model.n nVar = (com.tencent.mm.plugin.vlog.model.n) f0Var;
        nVar.getClass();
        kotlin.jvm.internal.o.g(compositionInfo, "compositionInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        nVar.f175687f.f320201b = nVar.c(false);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.vlog.model.j jVar = new com.tencent.mm.plugin.vlog.model.j(callback, nVar, compositionInfo, h0Var);
        h0Var.f310123d = jVar;
        return nVar.d(compositionInfo, jVar);
    }

    static void b(com.tencent.mm.plugin.vlog.model.f0 f0Var, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        com.tencent.mm.plugin.vlog.model.n nVar = (com.tencent.mm.plugin.vlog.model.n) f0Var;
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CompositionExporter", "cancel: ");
        nVar.f175696o = true;
        rm5.v vVar = nVar.f175695n;
        if (vVar != null) {
            vVar.f397593u = new com.tencent.mm.plugin.vlog.model.g(nVar, aVar);
        }
        if (vVar != null) {
            vVar.d();
        }
    }
}
