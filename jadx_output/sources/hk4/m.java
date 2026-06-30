package hk4;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.n f281955d;

    public m(hk4.n nVar) {
        this.f281955d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        hk4.n nVar = this.f281955d;
        long j18 = nVar.f281967v;
        if (this.f281955d.F > 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j17 = android.os.SystemClock.elapsedRealtime() - this.f281955d.F;
        } else {
            j17 = 33;
        }
        nVar.f281967v = j18 + j17;
        hk4.n nVar2 = this.f281955d;
        yz5.p pVar = nVar2.f281928g;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(nVar2.f281967v), this.f281955d);
        }
        long j19 = this.f281955d.f281967v;
        hk4.n nVar3 = this.f281955d;
        if (j19 >= nVar3.f281957l) {
            if (!nVar3.f281968w || !nVar3.f281969x) {
                com.tencent.mars.xlog.Log.i(this.f281955d.f281956k, "updateProgressTask play to end");
                hk4.n nVar4 = this.f281955d;
                com.tencent.mm.sdk.platformtools.n3 n3Var = nVar4.f281965t;
                if (n3Var != null) {
                    n3Var.removeCallbacksAndMessages(null);
                }
                android.os.HandlerThread handlerThread = nVar4.f281966u;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                nVar4.f281966u = null;
                nVar4.f281965t = null;
                synchronized (nVar4) {
                    if (!nVar4.A) {
                        com.tencent.mars.xlog.Log.i(nVar4.f281956k, "invokeOnPlayFinished");
                        pm0.v.X(new hk4.e(nVar4));
                        nVar4.A = true;
                    }
                }
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f281955d.f281956k, "updateProgressTask loop to first");
            this.f281955d.f281967v = 0L;
        }
        if (this.f281955d.f281969x) {
            hk4.n nVar5 = this.f281955d;
            nVar5.getClass();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            nVar5.F = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = nVar5.f281965t;
            java.lang.Runnable runnable = nVar5.E;
            if (n3Var2 != null) {
                n3Var2.removeCallbacks(runnable);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var3 = nVar5.f281965t;
            if (n3Var3 != null) {
                n3Var3.postDelayed(runnable, 33L);
            }
        }
    }
}
