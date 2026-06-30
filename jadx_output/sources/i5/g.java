package i5;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f288449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.SystemForegroundService f288450e;

    public g(androidx.work.impl.foreground.SystemForegroundService systemForegroundService, int i17) {
        this.f288450e = systemForegroundService;
        this.f288449d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f288450e.f12495h.cancel(this.f288449d);
    }
}
