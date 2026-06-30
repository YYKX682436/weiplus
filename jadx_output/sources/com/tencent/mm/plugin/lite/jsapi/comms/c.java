package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final dn.o f143517d;

    public c(dn.o oVar) {
        this.f143517d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dn.o oVar = this.f143517d;
        if (oVar != null) {
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().e(oVar, false);
        }
    }
}
