package i5;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f288442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Notification f288443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f288444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.SystemForegroundService f288445g;

    public e(androidx.work.impl.foreground.SystemForegroundService systemForegroundService, int i17, android.app.Notification notification, int i18) {
        this.f288445g = systemForegroundService;
        this.f288442d = i17;
        this.f288443e = notification;
        this.f288444f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.app.Notification notification = this.f288443e;
        int i18 = this.f288442d;
        androidx.work.impl.foreground.SystemForegroundService systemForegroundService = this.f288445g;
        if (i17 >= 29) {
            systemForegroundService.startForeground(i18, notification, this.f288444f);
        } else {
            systemForegroundService.startForeground(i18, notification);
        }
    }
}
