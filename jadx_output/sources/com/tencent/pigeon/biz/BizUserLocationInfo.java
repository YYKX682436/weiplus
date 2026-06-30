package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012¨\u0006%"}, d2 = {"Lcom/tencent/pigeon/biz/BizUserLocationInfo;", "", "longitude", "", "latitude", "adcode", "", "openK1kLocation", "", "openSystemLocation", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getAdcode", "()Ljava/lang/String;", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getOpenK1kLocation", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOpenSystemLocation", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/biz/BizUserLocationInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BizUserLocationInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizUserLocationInfo.Companion INSTANCE = new com.tencent.pigeon.biz.BizUserLocationInfo.Companion(null);
    private final java.lang.String adcode;
    private final java.lang.Double latitude;
    private final java.lang.Double longitude;
    private final java.lang.Long openK1kLocation;
    private final java.lang.Long openSystemLocation;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizUserLocationInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizUserLocationInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizUserLocationInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Double d17 = (java.lang.Double) list.get(0);
            java.lang.Double d18 = (java.lang.Double) list.get(1);
            java.lang.String str = (java.lang.String) list.get(2);
            java.lang.Object obj = list.get(3);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(4);
            return new com.tencent.pigeon.biz.BizUserLocationInfo(d17, d18, str, valueOf, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2);
        }
    }

    public BizUserLocationInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizUserLocationInfo copy$default(com.tencent.pigeon.biz.BizUserLocationInfo bizUserLocationInfo, java.lang.Double d17, java.lang.Double d18, java.lang.String str, java.lang.Long l17, java.lang.Long l18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            d17 = bizUserLocationInfo.longitude;
        }
        if ((i17 & 2) != 0) {
            d18 = bizUserLocationInfo.latitude;
        }
        java.lang.Double d19 = d18;
        if ((i17 & 4) != 0) {
            str = bizUserLocationInfo.adcode;
        }
        java.lang.String str2 = str;
        if ((i17 & 8) != 0) {
            l17 = bizUserLocationInfo.openK1kLocation;
        }
        java.lang.Long l19 = l17;
        if ((i17 & 16) != 0) {
            l18 = bizUserLocationInfo.openSystemLocation;
        }
        return bizUserLocationInfo.copy(d17, d19, str2, l19, l18);
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
    public final java.lang.String getAdcode() {
        return this.adcode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getOpenK1kLocation() {
        return this.openK1kLocation;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Long getOpenSystemLocation() {
        return this.openSystemLocation;
    }

    public final com.tencent.pigeon.biz.BizUserLocationInfo copy(java.lang.Double longitude, java.lang.Double latitude, java.lang.String adcode, java.lang.Long openK1kLocation, java.lang.Long openSystemLocation) {
        return new com.tencent.pigeon.biz.BizUserLocationInfo(longitude, latitude, adcode, openK1kLocation, openSystemLocation);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizUserLocationInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.BizUserLocationInfo bizUserLocationInfo = (com.tencent.pigeon.biz.BizUserLocationInfo) other;
        return kotlin.jvm.internal.o.b(this.longitude, bizUserLocationInfo.longitude) && kotlin.jvm.internal.o.b(this.latitude, bizUserLocationInfo.latitude) && kotlin.jvm.internal.o.b(this.adcode, bizUserLocationInfo.adcode) && kotlin.jvm.internal.o.b(this.openK1kLocation, bizUserLocationInfo.openK1kLocation) && kotlin.jvm.internal.o.b(this.openSystemLocation, bizUserLocationInfo.openSystemLocation);
    }

    public final java.lang.String getAdcode() {
        return this.adcode;
    }

    public final java.lang.Double getLatitude() {
        return this.latitude;
    }

    public final java.lang.Double getLongitude() {
        return this.longitude;
    }

    public final java.lang.Long getOpenK1kLocation() {
        return this.openK1kLocation;
    }

    public final java.lang.Long getOpenSystemLocation() {
        return this.openSystemLocation;
    }

    public int hashCode() {
        java.lang.Double d17 = this.longitude;
        int hashCode = (d17 == null ? 0 : d17.hashCode()) * 31;
        java.lang.Double d18 = this.latitude;
        int hashCode2 = (hashCode + (d18 == null ? 0 : d18.hashCode())) * 31;
        java.lang.String str = this.adcode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l17 = this.openK1kLocation;
        int hashCode4 = (hashCode3 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.openSystemLocation;
        return hashCode4 + (l18 != null ? l18.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.longitude, this.latitude, this.adcode, this.openK1kLocation, this.openSystemLocation);
    }

    public java.lang.String toString() {
        return "BizUserLocationInfo(longitude=" + this.longitude + ", latitude=" + this.latitude + ", adcode=" + this.adcode + ", openK1kLocation=" + this.openK1kLocation + ", openSystemLocation=" + this.openSystemLocation + ')';
    }

    public BizUserLocationInfo(java.lang.Double d17, java.lang.Double d18, java.lang.String str, java.lang.Long l17, java.lang.Long l18) {
        this.longitude = d17;
        this.latitude = d18;
        this.adcode = str;
        this.openK1kLocation = l17;
        this.openSystemLocation = l18;
    }

    public /* synthetic */ BizUserLocationInfo(java.lang.Double d17, java.lang.Double d18, java.lang.String str, java.lang.Long l17, java.lang.Long l18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : d17, (i17 & 2) != 0 ? null : d18, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : l17, (i17 & 16) != 0 ? null : l18);
    }
}
