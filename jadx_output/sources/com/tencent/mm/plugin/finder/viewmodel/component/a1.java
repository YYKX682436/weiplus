package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.d1 f133700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.u0 f133701e;

    public a1(com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var, com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var) {
        this.f133700d = d1Var;
        this.f133701e = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f133700d.U6(false, this.f133701e);
    }
}
