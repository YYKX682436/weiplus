package com.tencent.pigeon.data_report;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/data_report/ReportRouteRule;", "", "routeType", "", "routeRule", "isBatchReport", "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRouteRule", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRouteType", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/tencent/pigeon/data_report/ReportRouteRule;", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReportRouteRule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.data_report.ReportRouteRule.Companion INSTANCE = new com.tencent.pigeon.data_report.ReportRouteRule.Companion(null);
    private final java.lang.Boolean isBatchReport;
    private final java.lang.Long routeRule;
    private final java.lang.Long routeType;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/data_report/ReportRouteRule$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/data_report/ReportRouteRule;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.data_report.ReportRouteRule fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(1);
            return new com.tencent.pigeon.data_report.ReportRouteRule(valueOf, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2, (java.lang.Boolean) list.get(2));
        }
    }

    public ReportRouteRule() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.data_report.ReportRouteRule copy$default(com.tencent.pigeon.data_report.ReportRouteRule reportRouteRule, java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = reportRouteRule.routeType;
        }
        if ((i17 & 2) != 0) {
            l18 = reportRouteRule.routeRule;
        }
        if ((i17 & 4) != 0) {
            bool = reportRouteRule.isBatchReport;
        }
        return reportRouteRule.copy(l17, l18, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getRouteType() {
        return this.routeType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getRouteRule() {
        return this.routeRule;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getIsBatchReport() {
        return this.isBatchReport;
    }

    public final com.tencent.pigeon.data_report.ReportRouteRule copy(java.lang.Long routeType, java.lang.Long routeRule, java.lang.Boolean isBatchReport) {
        return new com.tencent.pigeon.data_report.ReportRouteRule(routeType, routeRule, isBatchReport);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.data_report.ReportRouteRule)) {
            return false;
        }
        com.tencent.pigeon.data_report.ReportRouteRule reportRouteRule = (com.tencent.pigeon.data_report.ReportRouteRule) other;
        return kotlin.jvm.internal.o.b(this.routeType, reportRouteRule.routeType) && kotlin.jvm.internal.o.b(this.routeRule, reportRouteRule.routeRule) && kotlin.jvm.internal.o.b(this.isBatchReport, reportRouteRule.isBatchReport);
    }

    public final java.lang.Long getRouteRule() {
        return this.routeRule;
    }

    public final java.lang.Long getRouteType() {
        return this.routeType;
    }

    public int hashCode() {
        java.lang.Long l17 = this.routeType;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Long l18 = this.routeRule;
        int hashCode2 = (hashCode + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Boolean bool = this.isBatchReport;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.Boolean isBatchReport() {
        return this.isBatchReport;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.routeType, this.routeRule, this.isBatchReport);
    }

    public java.lang.String toString() {
        return "ReportRouteRule(routeType=" + this.routeType + ", routeRule=" + this.routeRule + ", isBatchReport=" + this.isBatchReport + ')';
    }

    public ReportRouteRule(java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool) {
        this.routeType = l17;
        this.routeRule = l18;
        this.isBatchReport = bool;
    }

    public /* synthetic */ ReportRouteRule(java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : l18, (i17 & 4) != 0 ? null : bool);
    }
}
