package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class j4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f186270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186275i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f186276m;

    public j4(int i17, int i18, nw4.k kVar, int i19, nw4.y2 y2Var, java.lang.String str, boolean z17) {
        this.f186270d = i17;
        this.f186271e = i18;
        this.f186272f = kVar;
        this.f186273g = i19;
        this.f186274h = y2Var;
        this.f186275i = str;
        this.f186276m = z17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.wechat.iam.biz.p1 Di;
        nw4.k kVar = this.f186272f;
        if (i17 != 0) {
            nw4.g gVar = kVar.f340863d;
            nw4.y2 y2Var = this.f186274h;
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail click error", null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteBizArticle confirmed, msgId=");
        int i18 = this.f186270d;
        sb6.append(i18);
        sb6.append(", idx=");
        sb6.append(this.f186271e);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        android.content.Context context = kVar.f340860a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        int intExtra = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).getIntent().getIntExtra("KProfileItemStatus", 0);
        android.content.Context context2 = kVar.f340860a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        int intExtra2 = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).getIntent().getIntExtra("KProfileDetailInfoSize", 0);
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(kVar.f340860a, "", "", true, true, com.tencent.mm.plugin.webview.ui.tools.newjsapi.i4.f186248d);
        if (this.f186273g == 2) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            Di = ((ox.r) d0Var).Di(2);
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            Di = ((ox.r) d0Var2).Di(1);
        }
        int i19 = this.f186271e;
        Di.a(i18, i19, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.h4(Q, this.f186275i, i19, intExtra, intExtra2, this.f186276m, this.f186272f, this.f186274h));
    }
}
