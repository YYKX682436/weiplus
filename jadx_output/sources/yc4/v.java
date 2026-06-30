package yc4;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f460874a;

    /* renamed from: b, reason: collision with root package name */
    public final long f460875b;

    /* renamed from: c, reason: collision with root package name */
    public int f460876c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f460877d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f460878e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f460879f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f460880g;

    public v(java.lang.String sessionId, long j17, int i17, java.util.HashMap feedLikeMap, java.util.HashMap feedCommentMap, java.util.HashMap feedClickList, java.util.HashMap feedBrowseTimeMsMap, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 4) != 0 ? 0 : i17;
        feedLikeMap = (i18 & 8) != 0 ? new java.util.HashMap() : feedLikeMap;
        feedCommentMap = (i18 & 16) != 0 ? new java.util.HashMap() : feedCommentMap;
        feedClickList = (i18 & 32) != 0 ? new java.util.HashMap() : feedClickList;
        feedBrowseTimeMsMap = (i18 & 64) != 0 ? new java.util.HashMap() : feedBrowseTimeMsMap;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(feedLikeMap, "feedLikeMap");
        kotlin.jvm.internal.o.g(feedCommentMap, "feedCommentMap");
        kotlin.jvm.internal.o.g(feedClickList, "feedClickList");
        kotlin.jvm.internal.o.g(feedBrowseTimeMsMap, "feedBrowseTimeMsMap");
        this.f460874a = sessionId;
        this.f460875b = j17;
        this.f460876c = i17;
        this.f460877d = feedLikeMap;
        this.f460878e = feedCommentMap;
        this.f460879f = feedClickList;
        this.f460880g = feedBrowseTimeMsMap;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        return this.f460874a;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return true;
        }
        if (!(obj instanceof yc4.v)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        yc4.v vVar = (yc4.v) obj;
        if (!kotlin.jvm.internal.o.b(this.f460874a, vVar.f460874a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (this.f460875b != vVar.f460875b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (this.f460876c != vVar.f460876c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f460877d, vVar.f460877d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f460878e, vVar.f460878e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f460879f, vVar.f460879f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f460880g, vVar.f460880g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        int hashCode = (((((((((((this.f460874a.hashCode() * 31) + java.lang.Long.hashCode(this.f460875b)) * 31) + java.lang.Integer.hashCode(this.f460876c)) * 31) + this.f460877d.hashCode()) * 31) + this.f460878e.hashCode()) * 31) + this.f460879f.hashCode()) * 31) + this.f460880g.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        java.lang.String str = "Report16242Data(sessionId=" + this.f460874a + ", localNewestFeedId=" + this.f460875b + ", newFeedCount=" + this.f460876c + ", feedLikeMap=" + this.f460877d + ", feedCommentMap=" + this.f460878e + ", feedClickList=" + this.f460879f + ", feedBrowseTimeMsMap=" + this.f460880g + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        return str;
    }
}
