package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.y1 f144756d;

    public b2(com.tencent.mm.plugin.location.ui.impl.y1 y1Var) {
        this.f144756d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "stopLocateRunnable run() called");
        com.tencent.mm.plugin.location.ui.impl.y1 y1Var = this.f144756d;
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "doPause: hasClickTakeCarBtn:%s", java.lang.Boolean.valueOf(y1Var.f144952x0));
        i11.e eVar = y1Var.f144744w;
        if (eVar != null) {
            ((i11.h) eVar).m(y1Var.f144875J);
        }
        za3.i1 i1Var = y1Var.S;
        if (i1Var != null) {
            i1Var.b();
        }
    }
}
