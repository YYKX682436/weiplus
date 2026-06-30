package u9;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f425786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u9.s f425787e;

    public q(u9.s sVar, android.view.Surface surface) {
        this.f425787e = sVar;
        this.f425786d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f425787e.f425791b.n(this.f425786d);
    }
}
