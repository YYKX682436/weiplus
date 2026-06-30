package n5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.workers.ConstraintTrackingWorker f335092d;

    public a(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker) {
        this.f335092d = constraintTrackingWorker;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker = this.f335092d;
        java.lang.String c17 = constraintTrackingWorker.f12459e.f12466b.c("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (android.text.TextUtils.isEmpty(c17)) {
            a5.a0.c().b(androidx.work.impl.workers.ConstraintTrackingWorker.f12496q, "No worker to delegate to.", new java.lang.Throwable[0]);
            constraintTrackingWorker.f12500o.i(new a5.v());
            return;
        }
        androidx.work.ListenableWorker a17 = constraintTrackingWorker.f12459e.f12470f.a(constraintTrackingWorker.f12458d, c17, constraintTrackingWorker.f12497i);
        constraintTrackingWorker.f12501p = a17;
        if (a17 == null) {
            a5.a0.c().a(androidx.work.impl.workers.ConstraintTrackingWorker.f12496q, "No worker to delegate to.", new java.lang.Throwable[0]);
            constraintTrackingWorker.f12500o.i(new a5.v());
            return;
        }
        j5.w i17 = ((j5.g0) b5.w.c(constraintTrackingWorker.f12458d).f17897c.n()).i(constraintTrackingWorker.f12459e.f12465a.toString());
        if (i17 == null) {
            constraintTrackingWorker.f12500o.i(new a5.v());
            return;
        }
        android.content.Context context = constraintTrackingWorker.f12458d;
        f5.d dVar = new f5.d(context, b5.w.c(context).f17898d, constraintTrackingWorker);
        dVar.b(java.util.Collections.singletonList(i17));
        if (!dVar.a(constraintTrackingWorker.f12459e.f12465a.toString())) {
            a5.a0.c().a(androidx.work.impl.workers.ConstraintTrackingWorker.f12496q, java.lang.String.format("Constraints not met for delegate %s. Requesting retry.", c17), new java.lang.Throwable[0]);
            constraintTrackingWorker.f12500o.i(new a5.w());
            return;
        }
        a5.a0.c().a(androidx.work.impl.workers.ConstraintTrackingWorker.f12496q, java.lang.String.format("Constraints met for delegate %s", c17), new java.lang.Throwable[0]);
        try {
            wa.a e17 = constraintTrackingWorker.f12501p.e();
            e17.addListener(new n5.b(constraintTrackingWorker, e17), constraintTrackingWorker.f12459e.f12468d);
        } catch (java.lang.Throwable th6) {
            a5.a0 c18 = a5.a0.c();
            java.lang.String str = androidx.work.impl.workers.ConstraintTrackingWorker.f12496q;
            c18.a(str, java.lang.String.format("Delegated worker %s threw exception in startWork.", c17), th6);
            synchronized (constraintTrackingWorker.f12498m) {
                if (constraintTrackingWorker.f12499n) {
                    a5.a0.c().a(str, "Constraints were unmet, Retrying.", new java.lang.Throwable[0]);
                    constraintTrackingWorker.f12500o.i(new a5.w());
                } else {
                    constraintTrackingWorker.f12500o.i(new a5.v());
                }
            }
        }
    }
}
