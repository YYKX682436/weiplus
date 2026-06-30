package com.tencent.pigeon.finder;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/finder/POIUserLocationInfo;", "", "longitude", "", "latitude", "horizontalAccuracy", "verticalAccuracy", "(DDDD)V", "getHorizontalAccuracy", "()D", "getLatitude", "getLongitude", "getVerticalAccuracy", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class POIUserLocationInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.finder.POIUserLocationInfo.Companion INSTANCE = new com.tencent.pigeon.finder.POIUserLocationInfo.Companion(null);
    private final double horizontalAccuracy;
    private final double latitude;
    private final double longitude;
    private final double verticalAccuracy;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/finder/POIUserLocationInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/finder/POIUserLocationInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.finder.POIUserLocationInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue = ((java.lang.Double) obj).doubleValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue2 = ((java.lang.Double) obj2).doubleValue();
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue3 = ((java.lang.Double) obj3).doubleValue();
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Double");
            return new com.tencent.pigeon.finder.POIUserLocationInfo(doubleValue, doubleValue2, doubleValue3, ((java.lang.Double) obj4).doubleValue());
        }
    }

    public POIUserLocationInfo(double d17, double d18, double d19, double d27) {
        this.longitude = d17;
        this.latitude = d18;
        this.horizontalAccuracy = d19;
        this.verticalAccuracy = d27;
    }

    /* renamed from: component1, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component3, reason: from getter */
    public final double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    /* renamed from: component4, reason: from getter */
    public final double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public final com.tencent.pigeon.finder.POIUserLocationInfo copy(double longitude, double latitude, double horizontalAccuracy, double verticalAccuracy) {
        return new com.tencent.pigeon.finder.POIUserLocationInfo(longitude, latitude, horizontalAccuracy, verticalAccuracy);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.finder.POIUserLocationInfo)) {
            return false;
        }
        com.tencent.pigeon.finder.POIUserLocationInfo pOIUserLocationInfo = (com.tencent.pigeon.finder.POIUserLocationInfo) other;
        return java.lang.Double.compare(this.longitude, pOIUserLocationInfo.longitude) == 0 && java.lang.Double.compare(this.latitude, pOIUserLocationInfo.latitude) == 0 && java.lang.Double.compare(this.horizontalAccuracy, pOIUserLocationInfo.horizontalAccuracy) == 0 && java.lang.Double.compare(this.verticalAccuracy, pOIUserLocationInfo.verticalAccuracy) == 0;
    }

    public final double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return (((((java.lang.Double.hashCode(this.longitude) * 31) + java.lang.Double.hashCode(this.latitude)) * 31) + java.lang.Double.hashCode(this.horizontalAccuracy)) * 31) + java.lang.Double.hashCode(this.verticalAccuracy);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Double.valueOf(this.longitude), java.lang.Double.valueOf(this.latitude), java.lang.Double.valueOf(this.horizontalAccuracy), java.lang.Double.valueOf(this.verticalAccuracy));
    }

    public java.lang.String toString() {
        return "POIUserLocationInfo(longitude=" + this.longitude + ", latitude=" + this.latitude + ", horizontalAccuracy=" + this.horizontalAccuracy + ", verticalAccuracy=" + this.verticalAccuracy + ')';
    }
}
