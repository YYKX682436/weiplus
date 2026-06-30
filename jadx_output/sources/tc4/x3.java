package tc4;

/* loaded from: classes4.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f417531a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f417532b;

    public x3(java.lang.String url, java.lang.String uniqueKey, int i17, kotlin.jvm.internal.i iVar) {
        url = (i17 & 1) != 0 ? "" : url;
        uniqueKey = (i17 & 2) != 0 ? "" : uniqueKey;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(uniqueKey, "uniqueKey");
        this.f417531a = url;
        this.f417532b = uniqueKey;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        java.lang.String str = this.f417532b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        java.lang.String str = this.f417531a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }

    public final void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f417532b = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
    }

    public final void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f417531a = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return true;
        }
        if (!(obj instanceof tc4.x3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return false;
        }
        tc4.x3 x3Var = (tc4.x3) obj;
        if (!kotlin.jvm.internal.o.b(this.f417531a, x3Var.f417531a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f417532b, x3Var.f417532b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        int hashCode = (this.f417531a.hashCode() * 31) + this.f417532b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        java.lang.String str = "UrlAndToken(url=" + this.f417531a + ", uniqueKey=" + this.f417532b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.item.UrlAndToken");
        return str;
    }
}
