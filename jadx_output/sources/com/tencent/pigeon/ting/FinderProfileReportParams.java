package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B!\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u001b\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003HÆ\u0003J%\u0010\t\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/ting/FinderProfileReportParams;", "", "params", "", "", "(Ljava/util/Map;)V", "getParams", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FinderProfileReportParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.FinderProfileReportParams.Companion INSTANCE = new com.tencent.pigeon.ting.FinderProfileReportParams.Companion(null);
    private final java.util.Map<java.lang.String, java.lang.Object> params;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/FinderProfileReportParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/FinderProfileReportParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.FinderProfileReportParams fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.ting.FinderProfileReportParams((java.util.Map) list.get(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinderProfileReportParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.ting.FinderProfileReportParams copy$default(com.tencent.pigeon.ting.FinderProfileReportParams finderProfileReportParams, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            map = finderProfileReportParams.params;
        }
        return finderProfileReportParams.copy(map);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component1() {
        return this.params;
    }

    public final com.tencent.pigeon.ting.FinderProfileReportParams copy(java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
        return new com.tencent.pigeon.ting.FinderProfileReportParams(params);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.ting.FinderProfileReportParams) && kotlin.jvm.internal.o.b(this.params, ((com.tencent.pigeon.ting.FinderProfileReportParams) other).params);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getParams() {
        return this.params;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.params;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(this.params);
    }

    public java.lang.String toString() {
        return "FinderProfileReportParams(params=" + this.params + ')';
    }

    public FinderProfileReportParams(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.params = map;
    }

    public /* synthetic */ FinderProfileReportParams(java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : map);
    }
}
