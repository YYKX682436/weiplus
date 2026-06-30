package cw1;

/* loaded from: classes12.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f222968d;

    public h6(cw1.l6 l6Var) {
        this.f222968d = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.l6 l6Var = this.f222968d;
        yv1.h1.f(1, l6Var.f223122q);
        if (!cw1.l6.a(l6Var)) {
            return;
        }
        while (true) {
            com.tencent.wcdb.support.CancellationSignal cancellationSignal = l6Var.f223122q;
            kotlin.jvm.internal.o.d(cancellationSignal);
            if (cancellationSignal.isCanceled()) {
                return;
            } else {
                java.lang.Thread.sleep(100L);
            }
        }
    }
}
