package z2;

/* loaded from: classes13.dex */
public final class v implements z2.w {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f469524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f469525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.core.app.JobIntentService f469526c;

    public v(androidx.core.app.JobIntentService jobIntentService, android.content.Intent intent, int i17) {
        this.f469526c = jobIntentService;
        this.f469524a = intent;
        this.f469525b = i17;
    }

    @Override // z2.w
    public void complete() {
        this.f469526c.stopSelf(this.f469525b);
    }

    @Override // z2.w
    public android.content.Intent getIntent() {
        return this.f469524a;
    }
}
