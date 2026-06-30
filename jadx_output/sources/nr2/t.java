package nr2;

/* loaded from: classes2.dex */
public final class t extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final int f339304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f339305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(nr2.j0 j0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f339305d = j0Var;
        this.f339304c = 1;
    }

    @Override // v92.g
    public void b(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        bottomSheet.f211872n = new nr2.r(this);
        bottomSheet.f211881s = new nr2.s(this);
    }

    @Override // v92.g
    public void c(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
    }

    @Override // v92.g
    public void h() {
        nr2.j0 j0Var = this.f339305d;
        nr2.m mVar = j0Var.f339220d;
        long l17 = mVar != null ? mVar.l() : 0L;
        android.app.Activity context = j0Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{85, pm0.v.u(l17)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public int j() {
        return this.f339304c;
    }
}
