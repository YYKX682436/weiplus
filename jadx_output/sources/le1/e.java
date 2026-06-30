package le1;

/* loaded from: classes7.dex */
public class e implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f318129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318130b;

    public e(le1.f fVar, android.view.Window window, int i17) {
        this.f318129a = window;
        this.f318130b = i17;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            this.f318129a.getDecorView().setSystemUiVisibility(this.f318130b);
        }
    }
}
