package vv4;

/* loaded from: classes12.dex */
public final class d1 implements ry3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI f440457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440458b;

    public d1(com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI, java.lang.String str) {
        this.f440457a = webSearchSnsImageLoadingUI;
        this.f440458b = str;
    }

    @Override // ry3.r
    public final void a(long j17, ry3.q result) {
        int i17;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i(this.f440457a.f181667d, "uploadImageForSearch callback %s filePath:%s isSuccess:%b, session: %s, mBackPressCancel: %s, mScene: %s, useCdnOpt: %s.", result.f401549g, result.f401548f, java.lang.Boolean.valueOf(result.f401544b), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(this.f440457a.f181677q), java.lang.Integer.valueOf(this.f440457a.f181671h), java.lang.Boolean.valueOf(this.f440457a.f181673m));
        com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI = this.f440457a;
        if (webSearchSnsImageLoadingUI.f181677q) {
            return;
        }
        webSearchSnsImageLoadingUI.f181679s = 0L;
        if (result.f401544b) {
            su4.j2 j2Var = new su4.j2();
            com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI2 = this.f440457a;
            j2Var.f412938a = webSearchSnsImageLoadingUI2;
            j2Var.f412942e = webSearchSnsImageLoadingUI2.f181670g;
            int i18 = webSearchSnsImageLoadingUI2.f181671h;
            j2Var.f412957t = !(i18 == 83 && i18 == 100) && ((i17 = webSearchSnsImageLoadingUI2.f181672i) == 15 || i17 == 16);
            int i19 = webSearchSnsImageLoadingUI2.f181672i;
            if (i19 == 17) {
                j2Var.f412957t = true;
            }
            if (i19 == 12 || i19 == 11 || i19 == 13 || i19 == 14) {
                j2Var.f412939b = 83;
            } else if (i19 == 18 || i19 == 19 || i19 == 20 || i19 == 21) {
                j2Var.f412939b = 100;
            } else if (i19 == 15 || i19 == 16) {
                j2Var.f412939b = i18;
            } else if (i19 == 17) {
                j2Var.f412939b = i18;
            } else {
                j2Var.f412939b = 81;
            }
            j2Var.f412943f = true;
            if (result.f401550h == 3) {
                j2Var.f412941d = result.f401551i;
                ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            } else {
                java.util.Map extParams = j2Var.f412944g;
                kotlin.jvm.internal.o.f(extParams, "extParams");
                ((java.util.HashMap) extParams).put("chatSearch", "2");
                try {
                    java.util.Map extParams2 = j2Var.f412944g;
                    kotlin.jvm.internal.o.f(extParams2, "extParams");
                    ((java.util.HashMap) extParams2).put("reqKey", fp.s0.b(result.f401549g, "utf8"));
                } catch (java.lang.Exception unused) {
                }
                java.lang.String str = "weixin://fts/image?path=" + com.tencent.mm.vfs.w6.i(result.f401548f, false);
                try {
                    java.util.Map extParams3 = j2Var.f412944g;
                    kotlin.jvm.internal.o.f(extParams3, "extParams");
                    ((java.util.HashMap) extParams3).put("cacheImageSrc", fp.s0.b(str, "utf8"));
                } catch (java.lang.Exception unused2) {
                }
                j2Var.f412945h = true;
                j2Var.f412946i = false;
                j2Var.f412958u = true;
                j2Var.f412952o = i65.a.d(this.f440457a, com.tencent.mm.R.color.aaw);
                j2Var.f412953p = true;
                ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
                com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI3 = this.f440457a;
                java.lang.String imagePath = result.f401548f;
                kotlin.jvm.internal.o.f(imagePath, "imagePath");
                webSearchSnsImageLoadingUI3.T6(8, imagePath, this.f440457a.f181670g, 0, java.lang.System.currentTimeMillis());
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            vv4.b1 b1Var = new vv4.b1(this.f440457a);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b1Var, 500L, false);
        } else {
            pm0.v.X(new vv4.c1(webSearchSnsImageLoadingUI));
        }
        com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI webSearchSnsImageLoadingUI4 = this.f440457a;
        webSearchSnsImageLoadingUI4.T6(5, this.f440458b, webSearchSnsImageLoadingUI4.f181670g, result.f401546d, java.lang.System.currentTimeMillis());
    }
}
