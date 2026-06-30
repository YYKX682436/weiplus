package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181977e;

    public t(int i17, com.tencent.mm.plugin.webview.core.r0 r0Var) {
        this.f181976d = i17;
        this.f181977e = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181977e;
        java.lang.String T = r0Var.T();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkStatus:");
        int i17 = this.f181976d;
        sb6.append(i17);
        sb6.append(" to [");
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = r0Var.C0;
        sb6.append(kz5.n0.g0(concurrentSkipListSet, ",", null, null, 0, null, null, 62, null));
        sb6.append("] [");
        sb6.append(kz5.n0.g0(r0Var.B0, ",", null, null, 0, null, null, 62, null));
        sb6.append("] [");
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet2 = r0Var.D0;
        sb6.append(kz5.n0.g0(concurrentSkipListSet2, ",", null, null, 0, null, null, 62, null));
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(T, sb6.toString());
        concurrentSkipListSet.add(java.lang.Integer.valueOf(i17));
        r0Var.a1(r0Var.f181967z0, r0Var.E0, null);
        java.lang.String str = r0Var.D;
        if (!(str == null || r26.n0.N(str))) {
            r0Var.a1(r0Var.A0, concurrentSkipListSet2, r0Var.D);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = r0Var.f181917a0;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedDeque == null) {
            concurrentLinkedDeque = new java.util.concurrent.ConcurrentLinkedDeque();
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), concurrentLinkedDeque);
        }
        kz5.h0.A(concurrentLinkedDeque, com.tencent.mm.plugin.webview.core.s.f181971d);
    }
}
