package i5;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f288446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Notification f288447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.SystemForegroundService f288448f;

    public f(androidx.work.impl.foreground.SystemForegroundService systemForegroundService, int i17, android.app.Notification notification) {
        this.f288448f = systemForegroundService;
        this.f288446d = i17;
        this.f288447e = notification;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f288448f.f12495h.notify(this.f288446d, this.f288447e);
    }
}
