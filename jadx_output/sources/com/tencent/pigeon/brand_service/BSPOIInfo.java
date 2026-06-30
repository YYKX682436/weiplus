package com.tencent.pigeon.brand_service;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/tencent/pigeon/brand_service/BSPOIInfo;", "", "latitude", "", "longitude", "lastCacheTimestamp", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getLastCacheTimestamp", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLatitude", "getLongitude", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/tencent/pigeon/brand_service/BSPOIInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BSPOIInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.brand_service.BSPOIInfo.Companion INSTANCE = new com.tencent.pigeon.brand_service.BSPOIInfo.Companion(null);
    private final java.lang.Double lastCacheTimestamp;
    private final java.lang.Double latitude;
    private final java.lang.Double longitude;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/brand_service/BSPOIInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/brand_service/BSPOIInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.brand_service.BSPOIInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.brand_service.BSPOIInfo((java.lang.Double) list.get(0), (java.lang.Double) list.get(1), (java.lang.Double) list.get(2));
        }
    }

    public BSPOIInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.brand_service.BSPOIInfo copy$default(com.tencent.pigeon.brand_service.BSPOIInfo bSPOIInfo, java.lang.Double d17, java.lang.Double d18, java.lang.Double d19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            d17 = bSPOIInfo.latitude;
        }
        if ((i17 & 2) != 0) {
            d18 = bSPOIInfo.longitude;
        }
        if ((i17 & 4) != 0) {
            d19 = bSPOIInfo.lastCacheTimestamp;
        }
        return bSPOIInfo.copy(d17, d18, d19);
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
    public final java.lang.Double getLastCacheTimestamp() {
        return this.lastCacheTimestamp;
    }

    public final com.tencent.pigeon.brand_service.BSPOIInfo copy(java.lang.Double latitude, java.lang.Double longitude, java.lang.Double lastCacheTimestamp) {
        return new com.tencent.pigeon.brand_service.BSPOIInfo(latitude, longitude, lastCacheTimestamp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.brand_service.BSPOIInfo)) {
            return false;
        }
        com.tencent.pigeon.brand_service.BSPOIInfo bSPOIInfo = (com.tencent.pigeon.brand_service.BSPOIInfo) other;
        return kotlin.jvm.internal.o.b(this.latitude, bSPOIInfo.latitude) && kotlin.jvm.internal.o.b(this.longitude, bSPOIInfo.longitude) && kotlin.jvm.internal.o.b(this.lastCacheTimestamp, bSPOIInfo.lastCacheTimestamp);
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
        java.lang.Double d19 = this.lastCacheTimestamp;
        return hashCode2 + (d19 != null ? d19.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.latitude, this.longitude, this.lastCacheTimestamp);
    }

    public java.lang.String toString() {
        return "BSPOIInfo(latitude=" + this.latitude + ", longitude=" + this.longitude + ", lastCacheTimestamp=" + this.lastCacheTimestamp + ')';
    }

    public BSPOIInfo(java.lang.Double d17, java.lang.Double d18, java.lang.Double d19) {
        this.latitude = d17;
        this.longitude = d18;
        this.lastCacheTimestamp = d19;
    }

    public /* synthetic */ BSPOIInfo(java.lang.Double d17, java.lang.Double d18, java.lang.Double d19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : d17, (i17 & 2) != 0 ? null : d18, (i17 & 4) != 0 ? null : d19);
    }
}
