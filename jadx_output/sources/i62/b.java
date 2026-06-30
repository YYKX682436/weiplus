package i62;

/* loaded from: classes13.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f288938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f288939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f288940f;

    public b(android.app.Activity activity, long j17, int i17) {
        this.f288938d = activity;
        this.f288939e = j17;
        this.f288940f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        android.view.View decorView;
        android.app.Activity activity = this.f288938d;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new i62.a(this.f288939e, activity, this.f288940f));
    }
}
