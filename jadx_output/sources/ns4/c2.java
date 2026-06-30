package ns4;

/* loaded from: classes2.dex */
public final class c2 implements com.tencent.mm.pluginsdk.ui.span.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f339481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f339483c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f339485e;

    public c2(int i17, java.lang.String str, android.widget.TextView textView, java.lang.String str2, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f339481a = i17;
        this.f339482b = str;
        this.f339483c = textView;
        this.f339484d = str2;
        this.f339485e = finderJumpInfo;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.w
    public final void a(java.lang.String str) {
        java.lang.String str2 = this.f339482b;
        android.widget.TextView textView = this.f339483c;
        int i17 = this.f339481a;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(textView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (i17 == 1) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = this.f339484d;
            b1Var.f317022f = str2;
            b1Var.f317032k = 1205;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(textView.getContext(), b1Var);
            return;
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeCoinIncomeDetailView", "invalid actionType:" + i17);
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f339485e;
        if (info == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeCoinIncomeDetailView", "invalid jumpInfo is null");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kotlin.jvm.internal.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f453252n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
    }
}
