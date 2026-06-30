package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes13.dex */
public class u1 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144066a;

    public u1(com.tencent.mm.plugin.lite.logic.g1 g1Var) {
        this.f144066a = g1Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f144066a;
            synchronized (g1Var.f143960n) {
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) g1Var.f143959m).keySet().iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.sdk.platformtools.b4) ((java.util.concurrent.ConcurrentHashMap) g1Var.f143959m).get((java.lang.String) it.next())).d();
                }
                ((java.util.concurrent.ConcurrentHashMap) g1Var.f143959m).clear();
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.lite.logic.v1 v1Var = new com.tencent.mm.plugin.lite.logic.v1(g1Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(v1Var, 30000L, false);
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
