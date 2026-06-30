package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h20 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t20 f112756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112757e;

    public h20(com.tencent.mm.plugin.finder.live.plugin.t20 t20Var, android.view.View view) {
        this.f112756d = t20Var;
        this.f112757e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.t20.t1(this.f112756d, this.f112757e);
    }
}
