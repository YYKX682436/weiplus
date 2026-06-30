package ee;

/* loaded from: classes7.dex */
public final class a implements pi1.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f251405a;

    /* renamed from: b, reason: collision with root package name */
    public pi1.d f251406b = null;

    public a(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f251405a = v5Var;
    }

    @Override // pi1.e
    public void a() {
        this.f251406b = pi1.d.HIDDEN;
        e(true);
    }

    @Override // pi1.e
    public void b() {
    }

    @Override // pi1.e
    public void c() {
        if (this.f251406b == null) {
            this.f251406b = this.f251405a.t3().m0().f305748r.f305551b ? pi1.d.SHOWN : pi1.d.HIDDEN;
        }
        int ordinal = this.f251406b.ordinal();
        if (ordinal == 0) {
            d();
        } else {
            if (ordinal != 1) {
                return;
            }
            a();
        }
    }

    @Override // pi1.e
    public void d() {
        android.view.Window window;
        this.f251406b = pi1.d.SHOWN;
        e(false);
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f251405a;
        if (!(v5Var.getContext() instanceof android.app.Activity) || (window = ((android.app.Activity) v5Var.getContext()).getWindow()) == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public final void e(boolean z17) {
        android.app.Activity a17 = q75.a.a(this.f251405a.getContext());
        if (a17 == null) {
            return;
        }
        android.view.Window window = a17.getWindow();
        if (z17) {
            com.tencent.mm.plugin.appbrand.ui.na.h(window, true, true);
        } else {
            com.tencent.mm.plugin.appbrand.ui.na.h(window, false, false);
        }
    }

    @Override // pi1.e
    public pi1.d getCurrentState() {
        return this.f251406b;
    }
}
