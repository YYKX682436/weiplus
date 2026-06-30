package cy4;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f224862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy4.e f224863e;

    public c(cy4.e eVar, android.app.Activity activity) {
        this.f224863e = eVar;
        this.f224862d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f224862d.getWindow().getDecorView();
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-5895));
        this.f224863e.f224876k = true;
    }
}
