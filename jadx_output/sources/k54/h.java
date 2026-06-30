package k54;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f304426a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f304427b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f304428c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f304429d;

    /* renamed from: e, reason: collision with root package name */
    public final fe0.z3 f304430e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f304431f;

    public h(int i17, java.lang.String url, java.lang.String canvasKey, java.lang.String compId, fe0.z3 z3Var, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(canvasKey, "canvasKey");
        kotlin.jvm.internal.o.g(compId, "compId");
        this.f304426a = i17;
        this.f304427b = url;
        this.f304428c = canvasKey;
        this.f304429d = compId;
        this.f304430e = z3Var;
        this.f304431f = z17;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return this.f304428c;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCompId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCompId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return this.f304429d;
    }

    public final int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return this.f304426a;
    }

    public final java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return this.f304427b;
    }

    public final void e(java.util.Map params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        kotlin.jvm.internal.o.g(params, "params");
        params.put("componentId", this.f304429d);
        fe0.z3 z3Var = this.f304430e;
        if (z3Var != null) {
            z3Var.a(params);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return true;
        }
        if (!(obj instanceof k54.h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        k54.h hVar = (k54.h) obj;
        if (this.f304426a != hVar.f304426a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f304427b, hVar.f304427b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f304428c, hVar.f304428c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f304429d, hVar.f304429d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f304430e, hVar.f304430e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
            return false;
        }
        boolean z17 = this.f304431f;
        boolean z18 = hVar.f304431f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return z17 == z18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        int hashCode = ((((((java.lang.Integer.hashCode(this.f304426a) * 31) + this.f304427b.hashCode()) * 31) + this.f304428c.hashCode()) * 31) + this.f304429d.hashCode()) * 31;
        fe0.z3 z3Var = this.f304430e;
        int hashCode2 = ((hashCode + (z3Var == null ? 0 : z3Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f304431f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        java.lang.String str = "WebViewData(id=" + this.f304426a + ", url=" + this.f304427b + ", canvasKey=" + this.f304428c + ", compId=" + this.f304429d + ", onEvent=" + this.f304430e + ", isBackgroundTransparent=" + this.f304431f + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewData");
        return str;
    }
}
