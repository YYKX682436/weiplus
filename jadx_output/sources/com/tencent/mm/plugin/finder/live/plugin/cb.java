package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gb f112131d;

    public cb(com.tencent.mm.plugin.finder.live.plugin.gb gbVar) {
        this.f112131d = gbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.gb gbVar = this.f112131d;
        gbVar.f365323d.animate().setListener(new com.tencent.mm.plugin.finder.live.plugin.bb(gbVar)).alpha(0.0f).start();
    }
}
