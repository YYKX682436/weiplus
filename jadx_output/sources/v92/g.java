package v92;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f434158a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f434159b;

    public g(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f434158a = activity;
    }

    public boolean a() {
        return !(this instanceof nr2.t);
    }

    public void b(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        bottomSheet.f211872n = new v92.a(this);
        bottomSheet.f211881s = new v92.b(this);
        bottomSheet.f211892z = new v92.c(this);
    }

    public void c(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        bottomSheet.f211874o = new v92.d(this);
        bottomSheet.f211884v = new v92.e(this);
    }

    public android.view.View d() {
        return null;
    }

    public void e(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h() {
    }

    public void i() {
    }

    public int j() {
        return 0;
    }

    public void k(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
    }

    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
    }

    public void m(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
    }

    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public void q() {
        com.tencent.mars.xlog.Log.i("FinderShareHandler", "onCreate: " + this);
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
        if (this.f434159b == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f434158a, j(), true);
            if (w()) {
                k0Var.s(d(), true);
            }
            e(k0Var);
            b(k0Var);
            c(k0Var);
            k0Var.f211854d = new v92.f(this);
            this.f434159b = k0Var;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f434159b;
        if (k0Var2 != null) {
            k0Var2.v();
        }
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return this instanceof ib2.u;
    }

    public boolean y() {
        return false;
    }
}
