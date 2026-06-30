package vv4;

/* loaded from: classes12.dex */
public final class s0 implements ry3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440498b;

    public s0(com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI, java.lang.String str) {
        this.f440497a = webSearchImageLoadingUI;
        this.f440498b = str;
    }

    @Override // ry3.r
    public final void a(long j17, ry3.q result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i(this.f440497a.f181654d, "uploadImageForSearch callback %s filePath:%s isSucess:%b, session: %s, %s, mBackPressCancel: %s.", result.f401549g, result.f401548f, java.lang.Boolean.valueOf(result.f401544b), java.lang.Long.valueOf(j17), o13.p.c(j17), java.lang.Boolean.valueOf(this.f440497a.f181662o));
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440497a;
        if (webSearchImageLoadingUI.f181662o) {
            return;
        }
        webSearchImageLoadingUI.f181665r = 0L;
        if (result.f401544b) {
            if (result.f401550h == 3) {
                su4.j2 j2Var = new su4.j2();
                com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI2 = this.f440497a;
                j2Var.f412938a = webSearchImageLoadingUI2;
                j2Var.f412939b = 67;
                j2Var.f412941d = result.f401551i;
                j2Var.f412942e = webSearchImageLoadingUI2.f181658h;
                j2Var.f412946i = false;
                j2Var.f412943f = true;
                ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            } else {
                su4.j2 j2Var2 = new su4.j2();
                com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI3 = this.f440497a;
                j2Var2.f412938a = webSearchImageLoadingUI3;
                j2Var2.f412939b = 67;
                j2Var2.f412941d = "";
                j2Var2.f412942e = webSearchImageLoadingUI3.f181658h;
                j2Var2.f412943f = true;
                j2Var2.f412945h = true;
                j2Var2.f412946i = false;
                j2Var2.f412958u = true;
                j2Var2.f412952o = i65.a.d(webSearchImageLoadingUI3, com.tencent.mm.R.color.aaw);
                j2Var2.f412953p = true;
                java.util.Map extParams = j2Var2.f412944g;
                kotlin.jvm.internal.o.f(extParams, "extParams");
                ((java.util.HashMap) extParams).put("chatSearch", "2");
                try {
                    java.util.Map extParams2 = j2Var2.f412944g;
                    kotlin.jvm.internal.o.f(extParams2, "extParams");
                    ((java.util.HashMap) extParams2).put("reqKey", fp.s0.b(result.f401549g, "utf8"));
                } catch (java.lang.Exception unused) {
                }
                java.lang.String str = "weixin://fts/image?path=" + com.tencent.mm.vfs.w6.i(result.f401548f, false);
                try {
                    java.util.Map extParams3 = j2Var2.f412944g;
                    kotlin.jvm.internal.o.f(extParams3, "extParams");
                    ((java.util.HashMap) extParams3).put("cacheImageSrc", fp.s0.b(str, "utf8"));
                } catch (java.lang.Exception unused2) {
                }
                ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var2);
                com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI4 = this.f440497a;
                java.lang.String imagePath = result.f401548f;
                kotlin.jvm.internal.o.f(imagePath, "imagePath");
                webSearchImageLoadingUI4.U6(8, imagePath, this.f440497a.f181658h, 0, java.lang.System.currentTimeMillis());
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            vv4.q0 q0Var = new vv4.q0(this.f440497a);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(q0Var, 500L, false);
        } else {
            pm0.v.X(new vv4.r0(webSearchImageLoadingUI));
        }
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI5 = this.f440497a;
        webSearchImageLoadingUI5.U6(5, this.f440498b, webSearchImageLoadingUI5.f181658h, result.f401546d, java.lang.System.currentTimeMillis());
    }
}
