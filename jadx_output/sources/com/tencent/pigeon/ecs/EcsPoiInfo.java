package com.tencent.pigeon.ecs;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsPoiInfo;", "", "longitude", "", "latitude", "timeStamp", "", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)Lcom/tencent/pigeon/ecs/EcsPoiInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EcsPoiInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ecs.EcsPoiInfo.Companion INSTANCE = new com.tencent.pigeon.ecs.EcsPoiInfo.Companion(null);
    private final java.lang.Double latitude;
    private final java.lang.Double longitude;
    private final java.lang.Long timeStamp;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsPoiInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ecs/EcsPoiInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ecs.EcsPoiInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Double d17 = (java.lang.Double) list.get(0);
            java.lang.Double d18 = (java.lang.Double) list.get(1);
            java.lang.Object obj = list.get(2);
            return new com.tencent.pigeon.ecs.EcsPoiInfo(d17, d18, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    public EcsPoiInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ecs.EcsPoiInfo copy$default(com.tencent.pigeon.ecs.EcsPoiInfo ecsPoiInfo, java.lang.Double d17, java.lang.Double d18, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            d17 = ecsPoiInfo.longitude;
        }
        if ((i17 & 2) != 0) {
            d18 = ecsPoiInfo.latitude;
        }
        if ((i17 & 4) != 0) {
            l17 = ecsPoiInfo.timeStamp;
        }
        return ecsPoiInfo.copy(d17, d18, l17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getTimeStamp() {
        return this.timeStamp;
    }

    public final com.tencent.pigeon.ecs.EcsPoiInfo copy(java.lang.Double longitude, java.lang.Double latitude, java.lang.Long timeStamp) {
        return new com.tencent.pigeon.ecs.EcsPoiInfo(longitude, latitude, timeStamp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ecs.EcsPoiInfo)) {
            return false;
        }
        com.tencent.pigeon.ecs.EcsPoiInfo ecsPoiInfo = (com.tencent.pigeon.ecs.EcsPoiInfo) other;
        return kotlin.jvm.internal.o.b(this.longitude, ecsPoiInfo.longitude) && kotlin.jvm.internal.o.b(this.latitude, ecsPoiInfo.latitude) && kotlin.jvm.internal.o.b(this.timeStamp, ecsPoiInfo.timeStamp);
    }

    public final java.lang.Double getLatitude() {
        return this.latitude;
    }

    public final java.lang.Double getLongitude() {
        return this.longitude;
    }

    public final java.lang.Long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        java.lang.Double d17 = this.longitude;
        int hashCode = (d17 == null ? 0 : d17.hashCode()) * 31;
        java.lang.Double d18 = this.latitude;
        int hashCode2 = (hashCode + (d18 == null ? 0 : d18.hashCode())) * 31;
        java.lang.Long l17 = this.timeStamp;
        return hashCode2 + (l17 != null ? l17.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.longitude, this.latitude, this.timeStamp);
    }

    public java.lang.String toString() {
        return "EcsPoiInfo(longitude=" + this.longitude + ", latitude=" + this.latitude + ", timeStamp=" + this.timeStamp + ')';
    }

    public EcsPoiInfo(java.lang.Double d17, java.lang.Double d18, java.lang.Long l17) {
        this.longitude = d17;
        this.latitude = d18;
        this.timeStamp = l17;
    }

    public /* synthetic */ EcsPoiInfo(java.lang.Double d17, java.lang.Double d18, java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : d17, (i17 & 2) != 0 ? null : d18, (i17 & 4) != 0 ? null : l17);
    }
}
