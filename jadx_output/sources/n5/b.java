package n5;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa.a f335093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.workers.ConstraintTrackingWorker f335094e;

    public b(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker, wa.a aVar) {
        this.f335094e = constraintTrackingWorker;
        this.f335093d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f335094e.f12498m) {
            if (this.f335094e.f12499n) {
                androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker = this.f335094e;
                constraintTrackingWorker.f12500o.i(new a5.w());
            } else {
                this.f335094e.f12500o.k(this.f335093d);
            }
        }
    }
}
