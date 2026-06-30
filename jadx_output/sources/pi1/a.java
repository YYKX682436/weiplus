package pi1;

/* loaded from: classes7.dex */
public class a extends pi1.b {

    /* renamed from: c, reason: collision with root package name */
    public int f354755c;

    public a(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        super(v5Var);
        this.f354755c = 0;
    }

    @Override // pi1.e
    public void a() {
        android.view.Window window;
        this.f354757b.set(pi1.d.HIDDEN);
        android.app.Activity a17 = q75.a.a(this.f354756a.getF147807d());
        if (a17 == null || a17.isFinishing() || a17.isDestroyed() || (window = a17.getWindow()) == null) {
            return;
        }
        window.addFlags(1024);
        android.view.View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4 | 256);
    }

    @Override // pi1.e
    public void b() {
    }

    @Override // pi1.b, pi1.e
    public void c() {
        super.c();
        int ordinal = ((pi1.d) this.f354757b.get()).ordinal();
        if (ordinal == 0) {
            f(true);
        } else {
            if (ordinal != 1) {
                return;
            }
            a();
        }
    }

    @Override // pi1.e
    public void d() {
        f(false);
    }

    public void e(boolean z17, int i17) {
        boolean z18 = i17 != this.f354755c;
        this.f354755c = i17;
        if (2 != i17) {
            if ((z18 || this.f354757b.get() == pi1.d.SHOWN) && !z17) {
                f(false);
                return;
            }
            return;
        }
        android.app.Activity v17 = this.f354756a.v1();
        if ((v17 != null && v17.isInMultiWindowMode() && v17.getRequestedOrientation() == 1) || z17) {
            return;
        }
        a();
    }

    public final void f(boolean z17) {
        android.view.Window window;
        this.f354757b.set(pi1.d.SHOWN);
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f354756a;
        if (!(v5Var.getF147807d() instanceof android.app.Activity) || (window = ((android.app.Activity) v5Var.getF147807d()).getWindow()) == null) {
            return;
        }
        android.view.View decorView = window.getDecorView();
        window.clearFlags(1024);
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-5));
    }
}
