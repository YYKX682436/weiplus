package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class es implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f134296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134297f;

    public es(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var) {
        this.f134295d = baseFinderFeed;
        this.f134296e = hsVar;
        this.f134297f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.mm.plugin.finder.viewmodel.component.hs.B.get(java.lang.Long.valueOf(this.f134295d.getItemId())) != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f134296e;
            hsVar.getClass();
            java.lang.System.currentTimeMillis();
            in5.s0 s0Var = this.f134297f;
            hsVar.v7(s0Var, new com.tencent.mm.plugin.finder.viewmodel.component.as(hsVar, s0Var));
        }
    }
}
