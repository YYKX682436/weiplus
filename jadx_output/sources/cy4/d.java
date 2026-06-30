package cy4;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f224864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy4.e f224865e;

    public d(cy4.e eVar, android.app.Activity activity) {
        this.f224865e = eVar;
        this.f224864d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f224865e.f224876k = false;
        ((android.view.ViewGroup) this.f224864d.getWindow().getDecorView()).setSystemUiVisibility(5894);
    }
}
