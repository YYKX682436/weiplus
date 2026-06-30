package h54;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f279071a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f279072b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f279073c;

    /* renamed from: d, reason: collision with root package name */
    public final int f279074d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f279075e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f279076f;

    /* renamed from: g, reason: collision with root package name */
    public final fe0.z3 f279077g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f279078h;

    public a(int i17, java.lang.String url, java.lang.String compId, int i18, java.lang.String str, java.lang.String str2, fe0.z3 z3Var, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(compId, "compId");
        this.f279071a = i17;
        this.f279072b = url;
        this.f279073c = compId;
        this.f279074d = i18;
        this.f279075e = str;
        this.f279076f = str2;
        this.f279077g = z3Var;
        this.f279078h = z17;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCompId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCompId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return this.f279073c;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return this.f279072b;
    }

    public final void c(java.util.Map params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        kotlin.jvm.internal.o.g(params, "params");
        fe0.z3 z3Var = this.f279077g;
        if (z3Var != null) {
            z3Var.a(params);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return true;
        }
        if (!(obj instanceof h54.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        h54.a aVar = (h54.a) obj;
        if (this.f279071a != aVar.f279071a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279072b, aVar.f279072b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279073c, aVar.f279073c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (this.f279074d != aVar.f279074d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279075e, aVar.f279075e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279076f, aVar.f279076f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279077g, aVar.f279077g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        boolean z17 = this.f279078h;
        boolean z18 = aVar.f279078h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return z17 == z18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        int hashCode = ((((((java.lang.Integer.hashCode(this.f279071a) * 31) + this.f279072b.hashCode()) * 31) + this.f279073c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f279074d)) * 31;
        java.lang.String str = this.f279075e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f279076f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        fe0.z3 z3Var = this.f279077g;
        int hashCode4 = ((hashCode3 + (z3Var != null ? z3Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f279078h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return hashCode4;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        java.lang.String str = "FormData(id=" + this.f279071a + ", url=" + this.f279072b + ", compId=" + this.f279073c + ", subType=" + this.f279074d + ", qrExtInfo=" + this.f279075e + ", canvasKey=" + this.f279076f + ", onEvent=" + this.f279077g + ", isBackgroundTransparent=" + this.f279078h + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return str;
    }

    public /* synthetic */ a(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, fe0.z3 z3Var, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, str, str2, i18, str3, str4, z3Var, (i19 & 128) != 0 ? false : z17);
    }
}
