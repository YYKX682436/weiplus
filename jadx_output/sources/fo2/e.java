package fo2;

/* loaded from: classes2.dex */
public class e extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f264900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity, java.lang.String finderAuthorUsername) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(finderAuthorUsername, "finderAuthorUsername");
        this.f264900c = finderAuthorUsername;
    }

    public boolean A() {
        return false;
    }

    public void B() {
    }

    public void C() {
    }

    @Override // v92.g
    public void b(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        super.b(bottomSheet);
        bottomSheet.f211872n = new fo2.b(this, bottomSheet);
        bottomSheet.f211881s = new fo2.c(this);
    }

    @Override // v92.g
    public void h() {
        androidx.appcompat.app.AppCompatActivity context = this.f434158a;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String username = this.f264900c;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&user_ID=%s", java.util.Arrays.copyOf(new java.lang.Object[]{87, username}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public boolean o() {
        return kotlin.jvm.internal.o.b(this.f264900c, xy2.c.e(this.f434158a));
    }

    @Override // v92.g
    public void r() {
        ya2.b2 b17 = ya2.h.f460484a.b(this.f264900c);
        if (b17 == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        com.tencent.mm.ui.MMActivity mMActivity = appCompatActivity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) appCompatActivity : null;
        if (mMActivity == null || hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.finder.assist.q6(b17, mMActivity, null), 3, null);
    }

    @Override // v92.g
    public void u() {
        if (this.f434159b == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f434158a, 1, true);
            b(k0Var);
            c(k0Var);
            k0Var.f211854d = new fo2.d(this);
            this.f434159b = k0Var;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f434159b;
        if (k0Var2 != null) {
            k0Var2.v();
        }
    }

    public boolean z() {
        return false;
    }
}
