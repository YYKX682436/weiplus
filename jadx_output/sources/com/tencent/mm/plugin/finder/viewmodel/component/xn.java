package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xn implements com.tencent.mm.pluginsdk.ui.span.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f136480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f136482e;

    public xn(int i17, java.lang.String str, android.widget.TextView textView, java.lang.String str2, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f136478a = i17;
        this.f136479b = str;
        this.f136480c = textView;
        this.f136481d = str2;
        this.f136482e = finderJumpInfo;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.w
    public final void a(java.lang.String str) {
        java.lang.String str2 = this.f136479b;
        android.widget.TextView textView = this.f136480c;
        int i17 = this.f136478a;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(textView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (i17 == 1) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = this.f136481d;
            b1Var.f317022f = str2;
            b1Var.f317032k = 1205;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(textView.getContext(), b1Var);
            return;
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveIncomeListUIC", "invalid actionType:" + i17);
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f136482e;
        if (finderJumpInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveIncomeListUIC", "invalid jumpInfo is null");
            return;
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xc2.y2.i(y2Var, context, new xc2.p0(finderJumpInfo), 0, null, 8, null);
    }
}
