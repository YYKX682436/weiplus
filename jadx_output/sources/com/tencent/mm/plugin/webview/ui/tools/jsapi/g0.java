package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class g0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185117e;

    public g0(nw4.k kVar, nw4.y2 y2Var) {
        this.f185116d = kVar;
        this.f185117e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("ret", "fail");
        nw4.k kVar = this.f185116d;
        nw4.g gVar = kVar.f340863d;
        nw4.y2 y2Var = this.f185117e;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ':' + string, null);
        if (bundle.getInt("closeWindow", 0) == 1) {
            android.content.Context context = kVar.f340860a;
            if (context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).finish();
            }
        }
    }
}
