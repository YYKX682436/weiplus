package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l2 f126086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f126087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f126088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f126089g;

    public j2(com.tencent.mm.plugin.finder.service.l2 l2Var, int i17, int i18, int i19) {
        this.f126086d = l2Var;
        this.f126087e = i17;
        this.f126088f = i18;
        this.f126089g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.service.l2 l2Var = this.f126086d;
        java.util.Iterator it = l2Var.f126120n.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.service.x1 x1Var = (com.tencent.mm.plugin.finder.service.x1) it.next();
            r45.rv0 rv0Var = new r45.rv0();
            rv0Var.set(1, x1Var.f126252a);
            rv0Var.set(2, x1Var.f126253b);
            linkedList.add(rv0Var);
        }
        l2Var.f126119m = null;
        l2Var.f126120n.clear();
        this.f126086d.Di(this.f126087e, this.f126088f, linkedList, this.f126089g, true);
    }
}
