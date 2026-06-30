package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class dm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC f134150e;

    public dm(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        this.f134149d = s0Var;
        this.f134150e = finderHorizontalVideoDrawerUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.P6(this.f134150e, this.f134149d);
    }
}
