package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.h f150255d;

    public b(com.tencent.mm.plugin.multitalk.ui.h hVar) {
        this.f150255d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.multitalk.ui.a aVar = this.f150255d.f150285w;
        if (aVar != null) {
            com.tencent.mm.plugin.multitalk.model.v0 v0Var = ((com.tencent.mm.plugin.multitalk.model.j1) aVar).f150019a;
            v0Var.X();
            v0Var.C(false);
        }
    }
}
