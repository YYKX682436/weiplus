package sc2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vt0 f406346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406348g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(in5.s0 s0Var, r45.vt0 vt0Var, android.view.View view, sc2.h1 h1Var) {
        super(0);
        this.f406345d = s0Var;
        this.f406346e = vt0Var;
        this.f406347f = view;
        this.f406348g = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f406345d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.vt0 vt0Var = this.f406346e;
        java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/promotion/res/htmledition/mobile/html/feedback.html?aid=%s&source=1022", java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(vt0Var != null ? vt0Var.getLong(0) : 0L)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.finder.report.d2.k(com.tencent.mm.plugin.finder.report.d2.f124994a, this.f406347f, "ad_complaint", "view_clk", false, sc2.h1.H(this.f406348g, s0Var), null, 40, null);
        return jz5.f0.f302826a;
    }
}
