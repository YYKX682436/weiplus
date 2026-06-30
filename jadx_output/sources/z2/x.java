package z2;

/* loaded from: classes13.dex */
public final class x implements z2.w {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.job.JobWorkItem f469532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2.y f469533b;

    public x(z2.y yVar, android.app.job.JobWorkItem jobWorkItem) {
        this.f469533b = yVar;
        this.f469532a = jobWorkItem;
    }

    @Override // z2.w
    public void complete() {
        synchronized (this.f469533b.f469535b) {
            android.app.job.JobParameters jobParameters = this.f469533b.f469536c;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f469532a);
            }
        }
    }

    @Override // z2.w
    public android.content.Intent getIntent() {
        return this.f469532a.getIntent();
    }
}
