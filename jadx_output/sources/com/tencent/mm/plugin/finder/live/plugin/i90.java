package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.j90 f112950d;

    public i90(com.tencent.mm.plugin.finder.live.plugin.j90 j90Var) {
        this.f112950d = j90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.j90 j90Var = this.f112950d;
        j90Var.f113073r.animate().alpha(1.0f).setDuration(500L).start();
        j90Var.f113074s.animate().alpha(1.0f).setDuration(500L).start();
    }
}
