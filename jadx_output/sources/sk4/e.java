package sk4;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk4.p f408972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408973e;

    public e(sk4.p pVar, yz5.l lVar) {
        this.f408972d = pVar;
        this.f408973e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jm4.q4.a(jm4.r4.f300421a, "RecordStart", false, 0L, null, 14, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, ");
        sk4.p pVar = this.f408972d;
        sb6.append(pVar.f408994i);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRecorderImpl", sb6.toString());
        tl.w wVar = new tl.w(pVar.f408989d, pVar.f408990e, pVar.f408991f);
        wVar.f420172y = pVar.f408998p;
        pVar.f408999q = wVar;
        if (pVar.f409000r == 0) {
            tl.w wVar2 = pVar.f408999q;
            kotlin.jvm.internal.o.d(wVar2);
            pVar.f409000r = (((wVar2.f420154g * wVar2.f420155h) * wVar2.f420153f) / 1000) * 2;
        }
        boolean z17 = pVar.f408994i;
        yz5.l lVar = this.f408973e;
        if (!z17) {
            tl.w wVar3 = pVar.f408999q;
            if (!((wVar3 == null || wVar3.k()) ? false : true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AudioRecorderImpl", "started");
                java.util.Iterator it = pVar.f408996n.iterator();
                while (it.hasNext()) {
                    jm4.y0 y0Var = (jm4.y0) ((com.tencent.unit_rc.WeakPtr) it.next()).lock();
                    if (y0Var != null) {
                        y0Var.n1();
                    }
                }
                pVar.f408993h = false;
                pVar.f408994i = true;
                pVar.f408995m = 0L;
                pVar.f408992g = false;
                if (lVar != null) {
                    lVar.invoke("");
                    return;
                }
                return;
            }
        }
        if (lVar != null) {
            lVar.invoke("isRunning or MMPcmRecorder start error");
        }
    }
}
