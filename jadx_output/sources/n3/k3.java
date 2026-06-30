package n3;

/* loaded from: classes14.dex */
public class k3 extends n3.l3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowInsetsController f334358a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.s0 f334359b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Window f334360c;

    public k3(android.view.Window window, n3.m3 m3Var, n3.s0 s0Var) {
        this.f334358a = window.getInsetsController();
        this.f334359b = s0Var;
        this.f334360c = window;
    }

    @Override // n3.l3
    public void a(int i17) {
        if ((i17 & 8) != 0) {
            this.f334359b.f334398a.a();
        }
        this.f334358a.hide(i17 & (-9));
    }

    @Override // n3.l3
    public boolean b() {
        return (this.f334358a.getSystemBarsAppearance() & 16) != 0;
    }

    @Override // n3.l3
    public boolean c() {
        return (this.f334358a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // n3.l3
    public void d(boolean z17) {
        android.view.WindowInsetsController windowInsetsController = this.f334358a;
        android.view.Window window = this.f334360c;
        if (z17) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // n3.l3
    public void e(boolean z17) {
        android.view.WindowInsetsController windowInsetsController = this.f334358a;
        android.view.Window window = this.f334360c;
        if (z17) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // n3.l3
    public void f(int i17) {
        this.f334358a.setSystemBarsBehavior(i17);
    }

    @Override // n3.l3
    public void g(int i17) {
        if ((i17 & 8) != 0) {
            this.f334359b.f334398a.b();
        }
        this.f334358a.show(i17 & (-9));
    }
}
