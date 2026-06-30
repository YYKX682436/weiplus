package mt1;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f331244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ArrayBlockingQueue f331245e;

    public o(l75.k0 k0Var, java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue) {
        this.f331244d = k0Var;
        this.f331245e = arrayBlockingQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashSet hashSet;
        long j17;
        mt1.b0 b0Var = mt1.b0.f331191a;
        l75.k0 k0Var = this.f331244d;
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = this.f331245e;
        ((com.tencent.mm.feature.performance.p4) mt1.b0.c(b0Var)).b(15);
        int myTid = android.os.Process.myTid();
        mt1.b0.b(b0Var).add(java.lang.Integer.valueOf(myTid));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.util.HashSet hashSet2 = mt1.b0.f331196f;
            synchronized (hashSet2) {
                hashSet = new java.util.HashSet(hashSet2);
            }
            try {
                try {
                    try {
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CalcWxNewService", e17, "Cannot refresh invalid files.", new java.lang.Object[0]);
                        if (k0Var.G()) {
                            j17 = 0L;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                if (k0Var.G()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CalcWxNewService", "inTransaction, skip");
                    if (k0Var.G()) {
                        j17 = 0L;
                        k0Var.w(j17);
                    }
                }
                long b17 = k0Var.b();
                while (true) {
                    jz5.l lVar = (jz5.l) arrayBlockingQueue.take();
                    java.lang.String str = (java.lang.String) lVar.f302833d;
                    long longValue = ((java.lang.Number) lVar.f302834e).longValue();
                    if (str == null) {
                        break;
                    }
                    mt1.b0 b0Var2 = mt1.b0.f331191a;
                    java.lang.String h27 = b0Var2.n().h2(longValue);
                    if (h27 == null) {
                        h27 = "talker-ignore";
                    }
                    java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue2 = arrayBlockingQueue;
                    if (!hashSet.contains(new jz5.l(h27, java.lang.Long.valueOf(longValue))) && !com.tencent.mm.vfs.w6.j(str)) {
                        b0Var2.n().O2(h27, longValue, true, null);
                    }
                    arrayBlockingQueue = arrayBlockingQueue2;
                }
                if (k0Var.G()) {
                    j17 = java.lang.Long.valueOf(b17);
                    k0Var.w(j17);
                }
            } catch (java.lang.Throwable th6) {
                try {
                    if (k0Var.G()) {
                        k0Var.w(0L);
                    }
                } catch (java.lang.Exception unused2) {
                }
                throw th6;
            }
        } finally {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.CalcWxNewService", "runTaskWithLeakInspect taskId=15, cost=" + currentTimeMillis2 + "ms|" + java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis2) + "min");
            mt1.b0.b(b0Var).remove(java.lang.Integer.valueOf(myTid));
            ((com.tencent.mm.feature.performance.p4) mt1.b0.c(b0Var)).a(15);
        }
    }
}
