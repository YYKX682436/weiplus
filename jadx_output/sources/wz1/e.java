package wz1;

/* loaded from: classes4.dex */
public final class e implements s85.b {

    /* renamed from: d, reason: collision with root package name */
    public static final wz1.e f450701d = new wz1.e();

    @Override // s85.b
    public void a(s85.c cVar, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (gm0.j1.a()) {
            wz1.b bVar = wz1.b.f450694d;
            kotlin.jvm.internal.o.d(bool);
            boolean booleanValue = bool.booleanValue();
            synchronized (bVar) {
                if (booleanValue) {
                    try {
                        if (wz1.b.f450696f == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Enqueue DB leaf backup.");
                            wz1.b.f450695e = new com.tencent.wcdb.support.CancellationSignal();
                            ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                            t0Var.getClass();
                            wz1.b.f450696f = t0Var.w(bVar, 300000L, null);
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                if (!booleanValue && wz1.b.f450696f != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Cancel DB leaf backup.");
                    com.tencent.wcdb.support.CancellationSignal cancellationSignal = wz1.b.f450695e;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                    if (wz1.b.f450697g) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Test cancel, cancellation delayed.");
                    } else {
                        java.util.concurrent.Future future = wz1.b.f450696f;
                        if (future != null) {
                            future.cancel(false);
                        }
                        wz1.b.f450695e = null;
                        wz1.b.f450696f = null;
                    }
                }
            }
        }
    }
}
