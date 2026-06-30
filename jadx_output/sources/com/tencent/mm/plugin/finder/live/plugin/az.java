package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class az implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f111946d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f111947e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f111948f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f111949g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f111950h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f111951i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f111952m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f111953n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f111954o;

    public az(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f111946d = context;
        this.f111947e = buContext;
        this.f111948f = statusMonitor;
        this.f111949g = lVar;
        this.f111950h = tVar;
        this.f111951i = "FinderLiveMpArticleBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.ans, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f111952m = (android.view.ViewGroup) inflate;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.plugin.az azVar, java.lang.String str) {
        azVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
        kotlin.jvm.internal.o.f(buildUpon, "buildUpon(...)");
        buildUpon.appendQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "221");
        java.lang.String uri = buildUpon.build().toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        boolean E = zl2.q4.f473933a.E();
        android.content.Context context = azVar.f111946d;
        if (E) {
            db5.t7.makeText(context, "url: ".concat(uri), 0).show();
        }
        intent.putExtra("rawUrl", uri);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f111950h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void b(cm2.x xVar) {
        android.view.ViewGroup viewGroup = this.f111952m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.fbl);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f484778fi1);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f484777fi0);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.eqy);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(xVar.f43407v.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128355e);
        kotlin.jvm.internal.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329972z));
        textView.setText(xVar.f43407v.getString(0));
        textView2.setText(xVar.f43407v.getString(4));
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.yy(this, xVar));
        if (zl2.r4.f473950a.y1(this.f111947e)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveMpArticleItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.zy(this, xVar));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.x) {
            b((cm2.x) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f111952m;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.x) {
            cm2.x xVar = (cm2.x) data;
            b(xVar);
            bf2.c cVar = bf2.c.f19598a;
            gk2.e eVar = this.f111947e;
            java.lang.String string = xVar.f43407v.getString(3);
            if (string == null) {
                string = "";
            }
            bf2.c.c(cVar, eVar, 1, 2, string, 0, null, 0, 0, null, 0, 1008, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
