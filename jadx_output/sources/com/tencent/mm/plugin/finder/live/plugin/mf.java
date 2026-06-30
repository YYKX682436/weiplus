package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113491d;

    public mf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f113491d = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f113491d;
        if (mgVar.C1().getAlpha() > 0.0f) {
            mgVar.C1().setAlpha(1.0f);
        }
    }
}
