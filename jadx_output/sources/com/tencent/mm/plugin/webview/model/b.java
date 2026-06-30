package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public final class b implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f182774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f182775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f182776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f182777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f182778h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182779i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f182780m;

    public b(kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.f0 f0Var2, int i17, java.lang.String str, android.content.Intent intent, android.content.Context context, kotlin.jvm.internal.d0 d0Var) {
        this.f182774d = f0Var;
        this.f182775e = h0Var;
        this.f182776f = h0Var2;
        this.f182777g = f0Var2;
        this.f182778h = intent;
        this.f182779i = context;
        this.f182780m = d0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.util.Map t17 = kz5.c1.t(((com.tencent.mm.plugin.webview.model.AISummarySearchLogic$ResponseWrapper) obj).f182727d);
        kotlin.jvm.internal.f0 f0Var = this.f182774d;
        boolean a17 = tg0.r2.a(f0Var.f310116d);
        kotlin.jvm.internal.h0 h0Var = this.f182775e;
        if (a17) {
            str = (java.lang.String) h0Var.f310123d;
        } else {
            str = (java.lang.String) h0Var.f310123d;
            try {
                str = fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Throwable unused) {
            }
            if (str == null) {
                str = "";
            }
        }
        t17.put("query", str);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        int i17 = f0Var.f310116d;
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(i17);
        kotlin.jvm.internal.o.d(f17);
        t17.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        boolean a18 = tg0.r2.a(f0Var.f310116d);
        kotlin.jvm.internal.h0 h0Var2 = this.f182776f;
        java.lang.String a19 = a18 ? (java.lang.String) h0Var2.f310123d : fp.s0.a((java.lang.String) h0Var2.f310123d);
        kotlin.jvm.internal.o.d(a19);
        t17.put("thirdExtParam", a19);
        t17.put("isHalfScreen", "1");
        boolean z17 = this.f182777g.f310116d == 0;
        if (!z17) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String valueOf = java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("hideNavBar", bool), new jz5.l("hideSearchBar", bool))));
            if (!tg0.r2.a(f0Var.f310116d)) {
                valueOf = fp.s0.a(valueOf);
            }
            kotlin.jvm.internal.o.d(valueOf);
            t17.put("extParams", valueOf);
        }
        java.lang.String h17 = ((com.tencent.mm.plugin.websearch.a0) ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).Zi()).h(su4.t0.MP, f0Var.f310116d, 0, f17, f17, (java.lang.String) h0Var.f310123d, null, "");
        if (h17 != null) {
            t17.put("pRequestId", h17);
        }
        java.lang.String str2 = (java.lang.String) h0Var.f310123d;
        android.content.Intent intent = this.f182778h;
        intent.putExtra("ftsQuery", str2);
        intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        intent.putExtra("rawUrl", su4.r2.e(t17, 0));
        intent.putExtra("ftsbizscene", f0Var.f310116d);
        intent.putExtra("key_search_icon_and_hint_fix_default", true);
        intent.putExtra("ftsInitToSearch", true);
        boolean z18 = !z17;
        intent.putExtra("hideSearchCancel", z18);
        intent.putExtra("hideSearchInput", z18);
        if (!z17) {
            intent.putExtra("key_back_btn_type", 2);
            intent.putExtra("hideSearchTitle", true);
        }
        ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Ai(new zg0.s3(this.f182779i, intent, false, this.f182780m.f310114d, true, null, null, false, 224, null));
    }
}
