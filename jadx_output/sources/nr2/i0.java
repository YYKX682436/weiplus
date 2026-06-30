package nr2;

/* loaded from: classes2.dex */
public final class i0 extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f339209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(nr2.j0 j0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f339209c = j0Var;
    }

    @Override // v92.g
    public void e(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.tencent.mm.pluginsdk.forward.m mVar = new com.tencent.mm.pluginsdk.forward.m();
        boolean z17 = !(this instanceof nr2.t);
        nr2.j0 j0Var = this.f339209c;
        if (z17) {
            bottomSheet.f211876p = new nr2.d0(mVar, j0Var, bottomSheet);
        }
        r45.ev2 P6 = nr2.j0.P6(j0Var);
        if (P6 != null) {
            bottomSheet.f211885w = new nr2.g0(mVar, j0Var, P6);
        }
        bottomSheet.f211886x = new nr2.h0(mVar, bottomSheet);
    }

    @Override // v92.g
    public void h() {
        nr2.j0 j0Var = this.f339209c;
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
        return 0;
    }

    @Override // v92.g
    public void r() {
        nr2.j0 j0Var = this.f339209c;
        r45.ev2 P6 = nr2.j0.P6(j0Var);
        if (P6 != null) {
            com.tencent.mm.plugin.finder.assist.n7.f102406a.q(j0Var.getContext(), P6, (r16 & 4) != 0 ? false : true, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        }
    }

    @Override // v92.g
    public void t() {
        nr2.j0 j0Var = this.f339209c;
        r45.ev2 P6 = nr2.j0.P6(j0Var);
        if (P6 != null) {
            com.tencent.mm.plugin.finder.assist.n7.f102406a.s(j0Var.getContext(), P6, true);
        }
    }
}
