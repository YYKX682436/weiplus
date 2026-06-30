package jh;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f299711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jh.m f299712e;

    public h(jh.m mVar, android.os.CancellationSignal cancellationSignal) {
        this.f299712e = mVar;
        this.f299711d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.File file = new java.io.File(this.f299712e.f299726b);
        boolean isDirectory = file.isDirectory();
        jh.s sVar = jh.s.DiskUsage;
        if (!isDirectory) {
            this.f299712e.f299729e.a(sVar);
            return;
        }
        long[] jArr = new long[2];
        try {
            jh.a0.e(file, this.f299711d, new jh.g(this, jArr));
            this.f299712e.f299729e.a(sVar);
            jh.a0.f(this.f299712e.f299730f.f299673a);
            oj.j.c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]));
            jh.p pVar = jh.m.f299724h;
            if (pVar != null) {
                ((com.tencent.mm.plugin.performance.diagnostic.c) pVar).a(jh.o.DiskUsage, java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]));
            }
        } catch (android.os.OperationCanceledException | java.util.concurrent.CancellationException unused) {
            this.f299712e.f299729e.a(sVar);
            jh.a0.f(this.f299712e.f299730f.f299673a);
            oj.j.c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]));
        } catch (java.lang.Throwable th6) {
            this.f299712e.f299729e.a(sVar);
            jh.a0.f(this.f299712e.f299730f.f299673a);
            oj.j.c("Matrix.WarmUpDelegate", "Compute disk usage, file count(%s), disk usage(%s)", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]));
            throw th6;
        }
    }
}
