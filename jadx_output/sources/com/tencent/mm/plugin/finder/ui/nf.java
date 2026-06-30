package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class nf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.pf f129551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f129552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f129553f;

    public nf(com.tencent.mm.plugin.finder.ui.pf pfVar, long j17, r45.mb4 mb4Var) {
        this.f129551d = pfVar;
        this.f129552e = j17;
        this.f129553f = mb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f129551d.a(this.f129552e, this.f129553f);
    }
}
