package com.tencent.pigeon.fav_list;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eJ\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006!"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavCapacityInfo;", "", "usedCapacity", "", "totalCapacity", "usedCapacityStr", "", "totalCapacityStr", "capacityEntryEnabled", "", "(JJLjava/lang/String;Ljava/lang/String;Z)V", "getCapacityEntryEnabled", "()Z", "getTotalCapacity", "()J", "getTotalCapacityStr", "()Ljava/lang/String;", "getUsedCapacity", "getUsedCapacityStr", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FavCapacityInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.fav_list.FavCapacityInfo.Companion INSTANCE = new com.tencent.pigeon.fav_list.FavCapacityInfo.Companion(null);
    private final boolean capacityEntryEnabled;
    private final long totalCapacity;
    private final java.lang.String totalCapacityStr;
    private final long usedCapacity;
    private final java.lang.String usedCapacityStr;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavCapacityInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/fav_list/FavCapacityInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.fav_list.FavCapacityInfo fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            long j18 = longValue2;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj3;
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj5 = list.get(4);
            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.fav_list.FavCapacityInfo(j17, j18, str, (java.lang.String) obj4, ((java.lang.Boolean) obj5).booleanValue());
        }
    }

    public FavCapacityInfo(long j17, long j18, java.lang.String usedCapacityStr, java.lang.String totalCapacityStr, boolean z17) {
        kotlin.jvm.internal.o.g(usedCapacityStr, "usedCapacityStr");
        kotlin.jvm.internal.o.g(totalCapacityStr, "totalCapacityStr");
        this.usedCapacity = j17;
        this.totalCapacity = j18;
        this.usedCapacityStr = usedCapacityStr;
        this.totalCapacityStr = totalCapacityStr;
        this.capacityEntryEnabled = z17;
    }

    /* renamed from: component1, reason: from getter */
    public final long getUsedCapacity() {
        return this.usedCapacity;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalCapacity() {
        return this.totalCapacity;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUsedCapacityStr() {
        return this.usedCapacityStr;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTotalCapacityStr() {
        return this.totalCapacityStr;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCapacityEntryEnabled() {
        return this.capacityEntryEnabled;
    }

    public final com.tencent.pigeon.fav_list.FavCapacityInfo copy(long usedCapacity, long totalCapacity, java.lang.String usedCapacityStr, java.lang.String totalCapacityStr, boolean capacityEntryEnabled) {
        kotlin.jvm.internal.o.g(usedCapacityStr, "usedCapacityStr");
        kotlin.jvm.internal.o.g(totalCapacityStr, "totalCapacityStr");
        return new com.tencent.pigeon.fav_list.FavCapacityInfo(usedCapacity, totalCapacity, usedCapacityStr, totalCapacityStr, capacityEntryEnabled);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.fav_list.FavCapacityInfo)) {
            return false;
        }
        com.tencent.pigeon.fav_list.FavCapacityInfo favCapacityInfo = (com.tencent.pigeon.fav_list.FavCapacityInfo) other;
        return this.usedCapacity == favCapacityInfo.usedCapacity && this.totalCapacity == favCapacityInfo.totalCapacity && kotlin.jvm.internal.o.b(this.usedCapacityStr, favCapacityInfo.usedCapacityStr) && kotlin.jvm.internal.o.b(this.totalCapacityStr, favCapacityInfo.totalCapacityStr) && this.capacityEntryEnabled == favCapacityInfo.capacityEntryEnabled;
    }

    public final boolean getCapacityEntryEnabled() {
        return this.capacityEntryEnabled;
    }

    public final long getTotalCapacity() {
        return this.totalCapacity;
    }

    public final java.lang.String getTotalCapacityStr() {
        return this.totalCapacityStr;
    }

    public final long getUsedCapacity() {
        return this.usedCapacity;
    }

    public final java.lang.String getUsedCapacityStr() {
        return this.usedCapacityStr;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.usedCapacity) * 31) + java.lang.Long.hashCode(this.totalCapacity)) * 31) + this.usedCapacityStr.hashCode()) * 31) + this.totalCapacityStr.hashCode()) * 31) + java.lang.Boolean.hashCode(this.capacityEntryEnabled);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.usedCapacity), java.lang.Long.valueOf(this.totalCapacity), this.usedCapacityStr, this.totalCapacityStr, java.lang.Boolean.valueOf(this.capacityEntryEnabled));
    }

    public java.lang.String toString() {
        return "FavCapacityInfo(usedCapacity=" + this.usedCapacity + ", totalCapacity=" + this.totalCapacity + ", usedCapacityStr=" + this.usedCapacityStr + ", totalCapacityStr=" + this.totalCapacityStr + ", capacityEntryEnabled=" + this.capacityEntryEnabled + ')';
    }
}
