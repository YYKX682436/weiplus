package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.multitask.h f120862d;

    public f(com.tencent.mm.plugin.finder.megavideo.multitask.h hVar) {
        this.f120862d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = this.f120862d;
        jk3.f fVar = hVar.f300125r;
        if (fVar != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new pk3.j((pk3.l) fVar, true, java.lang.Boolean.valueOf(hVar.f300121n).booleanValue(), null));
        }
    }
}
