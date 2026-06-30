package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x80 f113842d;

    public p80(com.tencent.mm.plugin.finder.live.plugin.x80 x80Var) {
        this.f113842d = x80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = this.f113842d;
        x80Var.F.removeCallbacks(x80Var.G);
        com.tencent.mars.xlog.Log.i("Finder.LiveScreenClearPlugin", "autoClearScreen business(LiveCommonSlice::class.java).screenClear:" + ((mm2.c1) x80Var.P0(mm2.c1.class)).N1);
        if (((mm2.c1) x80Var.P0(mm2.c1.class)).N1) {
            return;
        }
        x80Var.u1(true);
    }
}
