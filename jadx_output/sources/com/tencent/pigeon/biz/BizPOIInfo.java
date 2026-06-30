package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/biz/BizPOIInfo;", "", "latitude", "", "longitude", "cityCode", "", "lastCacheTimestamp", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V", "getCityCode", "()Ljava/lang/String;", "getLastCacheTimestamp", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLatitude", "getLongitude", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)Lcom/tencent/pigeon/biz/BizPOIInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BizPOIInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizPOIInfo.Companion INSTANCE = new com.tencent.pigeon.biz.BizPOIInfo.Companion(null);
    private final java.lang.String cityCode;
    private final java.lang.Double lastCacheTimestamp;
    private final java.lang.Double latitude;
    private final java.lang.Double longitude;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizPOIInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizPOIInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizPOIInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.biz.BizPOIInfo((java.lang.Double) list.get(0), (java.lang.Double) list.get(1), (java.lang.String) list.get(2), (java.lang.Double) list.get(3));
        }
    }

    public BizPOIInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizPOIInfo copy$default(com.tencent.pigeon.biz.BizPOIInfo bizPOIInfo, java.lang.Double d17, java.lang.Double d18, java.lang.String str, java.lang.Double d19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            d17 = bizPOIInfo.latitude;
        }
        if ((i17 & 2) != 0) {
            d18 = bizPOIInfo.longitude;
        }
        if ((i17 & 4) != 0) {
            str = bizPOIInfo.cityCode;
        }
        if ((i17 & 8) != 0) {
            d19 = bizPOIInfo.lastCacheTimestamp;
        }
        return bizPOIInfo.copy(d17, d18, str, d19);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCityCode() {
        return this.cityCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Double getLastCacheTimestamp() {
        return this.lastCacheTimestamp;
    }

    public final com.tencent.pigeon.biz.BizPOIInfo copy(java.lang.Double latitude, java.lang.Double longitude, java.lang.String cityCode, java.lang.Double lastCacheTimestamp) {
        return new com.tencent.pigeon.biz.BizPOIInfo(latitude, longitude, cityCode, lastCacheTimestamp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizPOIInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.BizPOIInfo bizPOIInfo = (com.tencent.pigeon.biz.BizPOIInfo) other;
        return kotlin.jvm.internal.o.b(this.latitude, bizPOIInfo.latitude) && kotlin.jvm.internal.o.b(this.longitude, bizPOIInfo.longitude) && kotlin.jvm.internal.o.b(this.cityCode, bizPOIInfo.cityCode) && kotlin.jvm.internal.o.b(this.lastCacheTimestamp, bizPOIInfo.lastCacheTimestamp);
    }

    public final java.lang.String getCityCode() {
        return this.cityCode;
    }

    public final java.lang.Double getLastCacheTimestamp() {
        return this.lastCacheTimestamp;
    }

    public final java.lang.Double getLatitude() {
        return this.latitude;
    }

    public final java.lang.Double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        java.lang.Double d17 = this.latitude;
        int hashCode = (d17 == null ? 0 : d17.hashCode()) * 31;
        java.lang.Double d18 = this.longitude;
        int hashCode2 = (hashCode + (d18 == null ? 0 : d18.hashCode())) * 31;
        java.lang.String str = this.cityCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Double d19 = this.lastCacheTimestamp;
        return hashCode3 + (d19 != null ? d19.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.latitude, this.longitude, this.cityCode, this.lastCacheTimestamp);
    }

    public java.lang.String toString() {
        return "BizPOIInfo(latitude=" + this.latitude + ", longitude=" + this.longitude + ", cityCode=" + this.cityCode + ", lastCacheTimestamp=" + this.lastCacheTimestamp + ')';
    }

    public BizPOIInfo(java.lang.Double d17, java.lang.Double d18, java.lang.String str, java.lang.Double d19) {
        this.latitude = d17;
        this.longitude = d18;
        this.cityCode = str;
        this.lastCacheTimestamp = d19;
    }

    public /* synthetic */ BizPOIInfo(java.lang.Double d17, java.lang.Double d18, java.lang.String str, java.lang.Double d19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : d17, (i17 & 2) != 0 ? null : d18, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : d19);
    }
}
