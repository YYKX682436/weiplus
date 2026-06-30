package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fd0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f112541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f112542e;

    public fd0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, boolean z17) {
        this.f112541d = nd0Var;
        this.f112542e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] call true");
        com.tencent.mm.plugin.finder.live.plugin.nd0.H1(this.f112541d, this.f112542e, true);
    }
}
