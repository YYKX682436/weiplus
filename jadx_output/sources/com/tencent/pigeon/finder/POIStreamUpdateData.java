package com.tencent.pigeon.finder;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B9\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/tencent/pigeon/finder/POIStreamUpdateData;", "", "finderObjectPBDataArray", "", "", "nearbyInfoPBData", "containsNearby", "", "isReload", "prefetchCount", "", "(Ljava/util/List;[BZZJ)V", "getContainsNearby", "()Z", "getFinderObjectPBDataArray", "()Ljava/util/List;", "getNearbyInfoPBData", "()[B", "getPrefetchCount", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class POIStreamUpdateData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.finder.POIStreamUpdateData.Companion INSTANCE = new com.tencent.pigeon.finder.POIStreamUpdateData.Companion(null);
    private final boolean containsNearby;
    private final java.util.List<byte[]> finderObjectPBDataArray;
    private final boolean isReload;
    private final byte[] nearbyInfoPBData;
    private final long prefetchCount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/finder/POIStreamUpdateData$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/finder/POIStreamUpdateData;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.finder.POIStreamUpdateData fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.ByteArray?>");
            java.util.List list2 = (java.util.List) obj;
            byte[] bArr = (byte[]) list.get(1);
            java.lang.Object obj2 = list.get(2);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
            java.lang.Object obj3 = list.get(3);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
            java.lang.Object obj4 = list.get(4);
            if (obj4 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj4).longValue();
            }
            return new com.tencent.pigeon.finder.POIStreamUpdateData(list2, bArr, booleanValue, booleanValue2, longValue);
        }
    }

    public POIStreamUpdateData(java.util.List<byte[]> finderObjectPBDataArray, byte[] bArr, boolean z17, boolean z18, long j17) {
        kotlin.jvm.internal.o.g(finderObjectPBDataArray, "finderObjectPBDataArray");
        this.finderObjectPBDataArray = finderObjectPBDataArray;
        this.nearbyInfoPBData = bArr;
        this.containsNearby = z17;
        this.isReload = z18;
        this.prefetchCount = j17;
    }

    public static /* synthetic */ com.tencent.pigeon.finder.POIStreamUpdateData copy$default(com.tencent.pigeon.finder.POIStreamUpdateData pOIStreamUpdateData, java.util.List list, byte[] bArr, boolean z17, boolean z18, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = pOIStreamUpdateData.finderObjectPBDataArray;
        }
        if ((i17 & 2) != 0) {
            bArr = pOIStreamUpdateData.nearbyInfoPBData;
        }
        byte[] bArr2 = bArr;
        if ((i17 & 4) != 0) {
            z17 = pOIStreamUpdateData.containsNearby;
        }
        boolean z19 = z17;
        if ((i17 & 8) != 0) {
            z18 = pOIStreamUpdateData.isReload;
        }
        boolean z27 = z18;
        if ((i17 & 16) != 0) {
            j17 = pOIStreamUpdateData.prefetchCount;
        }
        return pOIStreamUpdateData.copy(list, bArr2, z19, z27, j17);
    }

    public final java.util.List<byte[]> component1() {
        return this.finderObjectPBDataArray;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getNearbyInfoPBData() {
        return this.nearbyInfoPBData;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getContainsNearby() {
        return this.containsNearby;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsReload() {
        return this.isReload;
    }

    /* renamed from: component5, reason: from getter */
    public final long getPrefetchCount() {
        return this.prefetchCount;
    }

    public final com.tencent.pigeon.finder.POIStreamUpdateData copy(java.util.List<byte[]> finderObjectPBDataArray, byte[] nearbyInfoPBData, boolean containsNearby, boolean isReload, long prefetchCount) {
        kotlin.jvm.internal.o.g(finderObjectPBDataArray, "finderObjectPBDataArray");
        return new com.tencent.pigeon.finder.POIStreamUpdateData(finderObjectPBDataArray, nearbyInfoPBData, containsNearby, isReload, prefetchCount);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.finder.POIStreamUpdateData)) {
            return false;
        }
        com.tencent.pigeon.finder.POIStreamUpdateData pOIStreamUpdateData = (com.tencent.pigeon.finder.POIStreamUpdateData) other;
        return kotlin.jvm.internal.o.b(this.finderObjectPBDataArray, pOIStreamUpdateData.finderObjectPBDataArray) && kotlin.jvm.internal.o.b(this.nearbyInfoPBData, pOIStreamUpdateData.nearbyInfoPBData) && this.containsNearby == pOIStreamUpdateData.containsNearby && this.isReload == pOIStreamUpdateData.isReload && this.prefetchCount == pOIStreamUpdateData.prefetchCount;
    }

    public final boolean getContainsNearby() {
        return this.containsNearby;
    }

    public final java.util.List<byte[]> getFinderObjectPBDataArray() {
        return this.finderObjectPBDataArray;
    }

    public final byte[] getNearbyInfoPBData() {
        return this.nearbyInfoPBData;
    }

    public final long getPrefetchCount() {
        return this.prefetchCount;
    }

    public int hashCode() {
        int hashCode = this.finderObjectPBDataArray.hashCode() * 31;
        byte[] bArr = this.nearbyInfoPBData;
        return ((((((hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31) + java.lang.Boolean.hashCode(this.containsNearby)) * 31) + java.lang.Boolean.hashCode(this.isReload)) * 31) + java.lang.Long.hashCode(this.prefetchCount);
    }

    public final boolean isReload() {
        return this.isReload;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.finderObjectPBDataArray, this.nearbyInfoPBData, java.lang.Boolean.valueOf(this.containsNearby), java.lang.Boolean.valueOf(this.isReload), java.lang.Long.valueOf(this.prefetchCount));
    }

    public java.lang.String toString() {
        return "POIStreamUpdateData(finderObjectPBDataArray=" + this.finderObjectPBDataArray + ", nearbyInfoPBData=" + java.util.Arrays.toString(this.nearbyInfoPBData) + ", containsNearby=" + this.containsNearby + ", isReload=" + this.isReload + ", prefetchCount=" + this.prefetchCount + ')';
    }

    public /* synthetic */ POIStreamUpdateData(java.util.List list, byte[] bArr, boolean z17, boolean z18, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this(list, (i17 & 2) != 0 ? null : bArr, z17, z18, j17);
    }
}
