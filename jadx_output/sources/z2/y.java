package z2;

/* loaded from: classes13.dex */
public final class y extends android.app.job.JobServiceEngine implements z2.t {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.core.app.JobIntentService f469534a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f469535b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.job.JobParameters f469536c;

    public y(androidx.core.app.JobIntentService jobIntentService) {
        super(jobIntentService);
        this.f469535b = new java.lang.Object();
        this.f469534a = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        this.f469536c = jobParameters;
        this.f469534a.a(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        z2.s sVar = this.f469534a.f11026f;
        if (sVar != null) {
            sVar.cancel(false);
        }
        synchronized (this.f469535b) {
            this.f469536c = null;
        }
        return true;
    }
}
