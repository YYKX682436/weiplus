package com.tencent.pigeon.data_report;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001b\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007HÆ\u0003JB\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/data_report/ReportPageInfo;", "", "pageId", "", "pageName", "", "pageParams", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V", "getPageId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPageName", "()Ljava/lang/String;", "getPageParams", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)Lcom/tencent/pigeon/data_report/ReportPageInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReportPageInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.data_report.ReportPageInfo.Companion INSTANCE = new com.tencent.pigeon.data_report.ReportPageInfo.Companion(null);
    private final java.lang.Long pageId;
    private final java.lang.String pageName;
    private final java.util.Map<java.lang.String, java.lang.Object> pageParams;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/data_report/ReportPageInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/data_report/ReportPageInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.data_report.ReportPageInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.tencent.pigeon.data_report.ReportPageInfo(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.String) list.get(1), (java.util.Map) list.get(2));
        }
    }

    public ReportPageInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.data_report.ReportPageInfo copy$default(com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo, java.lang.Long l17, java.lang.String str, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = reportPageInfo.pageId;
        }
        if ((i17 & 2) != 0) {
            str = reportPageInfo.pageName;
        }
        if ((i17 & 4) != 0) {
            map = reportPageInfo.pageParams;
        }
        return reportPageInfo.copy(l17, str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getPageId() {
        return this.pageId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPageName() {
        return this.pageName;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return this.pageParams;
    }

    public final com.tencent.pigeon.data_report.ReportPageInfo copy(java.lang.Long pageId, java.lang.String pageName, java.util.Map<java.lang.String, ? extends java.lang.Object> pageParams) {
        return new com.tencent.pigeon.data_report.ReportPageInfo(pageId, pageName, pageParams);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.data_report.ReportPageInfo)) {
            return false;
        }
        com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo = (com.tencent.pigeon.data_report.ReportPageInfo) other;
        return kotlin.jvm.internal.o.b(this.pageId, reportPageInfo.pageId) && kotlin.jvm.internal.o.b(this.pageName, reportPageInfo.pageName) && kotlin.jvm.internal.o.b(this.pageParams, reportPageInfo.pageParams);
    }

    public final java.lang.Long getPageId() {
        return this.pageId;
    }

    public final java.lang.String getPageName() {
        return this.pageName;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getPageParams() {
        return this.pageParams;
    }

    public int hashCode() {
        java.lang.Long l17 = this.pageId;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.pageName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.util.Map<java.lang.String, java.lang.Object> map = this.pageParams;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.pageId, this.pageName, this.pageParams);
    }

    public java.lang.String toString() {
        return "ReportPageInfo(pageId=" + this.pageId + ", pageName=" + this.pageName + ", pageParams=" + this.pageParams + ')';
    }

    public ReportPageInfo(java.lang.Long l17, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.pageId = l17;
        this.pageName = str;
        this.pageParams = map;
    }

    public /* synthetic */ ReportPageInfo(java.lang.Long l17, java.lang.String str, java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : map);
    }
}
