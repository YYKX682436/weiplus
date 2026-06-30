package i95;

/* loaded from: classes12.dex */
public class u extends java.util.concurrent.RecursiveAction {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.v f289852d;

    public u(i95.v vVar, i95.n nVar) {
        this.f289852d = vVar;
    }

    @Override // java.util.concurrent.RecursiveAction
    public void compute() {
        boolean z17;
        boolean z18;
        boolean z19;
        i95.v vVar = this.f289852d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.FeatureService", "[+] feature_service_transit_start: '%s'(%s => %s) of '%s' was invoked on thread: %s(%s)", vVar, vVar.f289857h, vVar.f289858i, vVar.f289862p, java.lang.Thread.currentThread().getName(), java.lang.Integer.valueOf(android.os.Process.myTid()));
            i95.v vVar2 = this.f289852d;
            i95.r rVar = vVar2.f289857h;
            i95.r rVar2 = vVar2.f289858i;
            if (rVar == rVar2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FeatureService", "[+] feature_service_transit_end: '%s'(%s => %s) of '%s' was invoked on thread: %s(%s)", vVar2, rVar, rVar2, vVar2.f289862p, java.lang.Thread.currentThread().getName(), java.lang.Integer.valueOf(android.os.Process.myTid()));
                return;
            }
            i95.r rVar3 = i95.r.INACTIVE;
            i95.r rVar4 = i95.r.ACTIVATED;
            i95.r rVar5 = i95.r.INITIALIZED;
            if (rVar == rVar3) {
                if (rVar2 == rVar4) {
                    i95.w wVar = vVar2.f289862p;
                    i95.w wVar2 = vVar2.f289856g;
                    i95.w.access$800(wVar, wVar2);
                    wVar.setActivateSource(wVar2);
                    i95.w.access$900(wVar, vVar2.f289854e, vVar2.f289855f, vVar2.f289859m);
                    i95.w.access$1000(wVar, vVar2.f289853d);
                } else {
                    if (rVar2 == rVar5) {
                        i95.w wVar3 = vVar2.f289862p;
                        i95.w wVar4 = vVar2.f289856g;
                        i95.w.access$800(wVar3, wVar4);
                        wVar3.setActivateSource(wVar4);
                        i95.w.access$900(wVar3, vVar2.f289854e, vVar2.f289855f, vVar2.f289859m);
                        i95.w.access$1000(wVar3, vVar2.f289853d);
                        if (i95.n0.g()) {
                            boolean[] zArr = i95.n0.f289826j;
                            synchronized (zArr) {
                                z19 = zArr[0];
                            }
                            if (!z19) {
                                i95.w.access$1100(vVar.f289862p, vVar.f289853d);
                            }
                        }
                        vVar.a();
                    }
                    z18 = true;
                }
                z18 = false;
            } else if (rVar == rVar4) {
                if (rVar2 == rVar5) {
                    if (i95.n0.g()) {
                        boolean[] zArr2 = i95.n0.f289826j;
                        synchronized (zArr2) {
                            z17 = zArr2[0];
                        }
                        if (!z17) {
                            i95.w.access$1100(vVar2.f289862p, vVar2.f289853d);
                            z18 = false;
                        }
                    }
                    vVar2.a();
                    z18 = false;
                }
                z18 = true;
            } else {
                if (rVar != rVar5) {
                    throw new java.lang.IllegalStateException("Illegal from-status: " + vVar.f289857h);
                }
                if (rVar2 == rVar4) {
                    if (i95.n0.g()) {
                        i95.w.access$1200(vVar2.f289862p, vVar2.f289853d);
                    } else {
                        vVar2.a();
                    }
                    z18 = false;
                }
                z18 = true;
            }
            if (z18) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Found bad route: %s => %s", vVar.f289857h, vVar.f289858i));
            }
        } finally {
            i95.v vVar3 = this.f289852d;
            com.tencent.mars.xlog.Log.i("MicroMsg.FeatureService", "[+] feature_service_transit_end: '%s'(%s => %s) of '%s' was invoked on thread: %s(%s)", vVar3, vVar3.f289857h, vVar3.f289858i, vVar3.f289862p, java.lang.Thread.currentThread().getName(), java.lang.Integer.valueOf(android.os.Process.myTid()));
        }
    }
}
