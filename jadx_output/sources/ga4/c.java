package ga4;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f269906a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f269907b;

    public c(java.lang.String content, java.util.ArrayList contentMatchList) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(contentMatchList, "contentMatchList");
        this.f269906a = content;
        this.f269907b = contentMatchList;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            return true;
        }
        if (!(obj instanceof ga4.c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            return false;
        }
        ga4.c cVar = (ga4.c) obj;
        if (!kotlin.jvm.internal.o.b(this.f269906a, cVar.f269906a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f269907b, cVar.f269907b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
        int hashCode = (this.f269906a.hashCode() * 31) + this.f269907b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
        java.lang.String str = "SnsInfoMatchResult(content=" + this.f269906a + ", contentMatchList=" + this.f269907b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
        return str;
    }
}
