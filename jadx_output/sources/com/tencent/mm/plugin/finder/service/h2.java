package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l2 f126065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f126066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f126067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f126068g;

    public h2(com.tencent.mm.plugin.finder.service.l2 l2Var, int i17, int i18, int i19) {
        this.f126065d = l2Var;
        this.f126066e = i17;
        this.f126067f = i18;
        this.f126068g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.service.l2 l2Var = this.f126065d;
        java.util.Iterator it = l2Var.f126118i.iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it.next();
            r45.rv0 rv0Var = new r45.rv0();
            kotlin.jvm.internal.o.d(l17);
            rv0Var.set(0, java.lang.Long.valueOf(l17.longValue()));
            linkedList.add(rv0Var);
        }
        l2Var.f126117h = null;
        l2Var.f126118i.clear();
        this.f126065d.Di(this.f126066e, this.f126067f, linkedList, this.f126068g, true);
    }
}
