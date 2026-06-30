package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xs implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f115127d;

    public xs(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f115127d = etVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f115127d.B1 = false;
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "search panel dismissed");
    }
}
