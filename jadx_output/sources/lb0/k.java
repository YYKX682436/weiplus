package lb0;

/* loaded from: classes4.dex */
public final class k extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f317678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f317680f;

    public k(kotlin.jvm.internal.h0 h0Var, android.content.Context context, int i17) {
        this.f317678d = h0Var;
        this.f317679e = context;
        this.f317680f = i17;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openway/util/ShareTipsUtil$checkShareTips$1$cs$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", (java.lang.String) this.f317678d.f310123d);
        j45.l.j(this.f317679e, "webview", ".ui.tools.WebViewUI", intent, null);
        if (this.f317680f == 9) {
            lb0.q qVar = lb0.q.f317688a;
            ct.k3 k3Var = (ct.k3) ((jz5.n) lb0.q.f317695h).getValue();
            kotlin.jvm.internal.o.f(k3Var, "access$getYuanBaoReportService(...)");
            ((qg5.e3) k3Var).tj(5, null);
        }
        yj0.a.h(this, "com/tencent/mm/feature/openway/util/ShareTipsUtil$checkShareTips$1$cs$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(this.f317679e.getColor(com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
    }
}
