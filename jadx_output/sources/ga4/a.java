package ga4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f269901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f269902b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f269903c;

    public a(int i17, int i18, java.lang.String keyword) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        this.f269901a = i17;
        this.f269902b = i18;
        this.f269903c = keyword;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return true;
        }
        if (!(obj instanceof ga4.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return false;
        }
        ga4.a aVar = (ga4.a) obj;
        if (this.f269901a != aVar.f269901a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return false;
        }
        if (this.f269902b != aVar.f269902b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f269903c, aVar.f269903c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        int hashCode = (((java.lang.Integer.hashCode(this.f269901a) * 31) + java.lang.Integer.hashCode(this.f269902b)) * 31) + this.f269903c.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        java.lang.String str = "ContentMatchResult(startPos=" + this.f269901a + ", endPos=" + this.f269902b + ", keyword=" + this.f269903c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
        return str;
    }
}
