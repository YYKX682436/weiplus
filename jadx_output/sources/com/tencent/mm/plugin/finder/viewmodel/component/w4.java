package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f136297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.a1 f136298f;

    public w4(in5.s0 s0Var, so2.u1 u1Var, bb2.a1 a1Var) {
        this.f136296d = s0Var;
        this.f136297e = u1Var;
        this.f136298f = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) this.f136296d.p(com.tencent.mm.R.id.e_k)).setBulletLifecycle(!this.f136297e.g2() ? null : this.f136298f.getPlayStatusListener());
    }
}
