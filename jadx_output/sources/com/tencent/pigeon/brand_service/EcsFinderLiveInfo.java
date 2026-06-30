package com.tencent.pigeon.brand_service;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/brand_service/EcsFinderLiveInfo;", "", "finderExportId", "", "liveStatus", "", "liveDesc", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getFinderExportId", "()Ljava/lang/String;", "getLiveDesc", "getLiveStatus", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/tencent/pigeon/brand_service/EcsFinderLiveInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EcsFinderLiveInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.brand_service.EcsFinderLiveInfo.Companion INSTANCE = new com.tencent.pigeon.brand_service.EcsFinderLiveInfo.Companion(null);
    private final java.lang.String finderExportId;
    private final java.lang.String liveDesc;
    private final java.lang.Long liveStatus;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/brand_service/EcsFinderLiveInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/brand_service/EcsFinderLiveInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.brand_service.EcsFinderLiveInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.Object obj = list.get(1);
            return new com.tencent.pigeon.brand_service.EcsFinderLiveInfo(str, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.String) list.get(2));
        }
    }

    public EcsFinderLiveInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.brand_service.EcsFinderLiveInfo copy$default(com.tencent.pigeon.brand_service.EcsFinderLiveInfo ecsFinderLiveInfo, java.lang.String str, java.lang.Long l17, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = ecsFinderLiveInfo.finderExportId;
        }
        if ((i17 & 2) != 0) {
            l17 = ecsFinderLiveInfo.liveStatus;
        }
        if ((i17 & 4) != 0) {
            str2 = ecsFinderLiveInfo.liveDesc;
        }
        return ecsFinderLiveInfo.copy(str, l17, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFinderExportId() {
        return this.finderExportId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getLiveStatus() {
        return this.liveStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLiveDesc() {
        return this.liveDesc;
    }

    public final com.tencent.pigeon.brand_service.EcsFinderLiveInfo copy(java.lang.String finderExportId, java.lang.Long liveStatus, java.lang.String liveDesc) {
        return new com.tencent.pigeon.brand_service.EcsFinderLiveInfo(finderExportId, liveStatus, liveDesc);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.brand_service.EcsFinderLiveInfo)) {
            return false;
        }
        com.tencent.pigeon.brand_service.EcsFinderLiveInfo ecsFinderLiveInfo = (com.tencent.pigeon.brand_service.EcsFinderLiveInfo) other;
        return kotlin.jvm.internal.o.b(this.finderExportId, ecsFinderLiveInfo.finderExportId) && kotlin.jvm.internal.o.b(this.liveStatus, ecsFinderLiveInfo.liveStatus) && kotlin.jvm.internal.o.b(this.liveDesc, ecsFinderLiveInfo.liveDesc);
    }

    public final java.lang.String getFinderExportId() {
        return this.finderExportId;
    }

    public final java.lang.String getLiveDesc() {
        return this.liveDesc;
    }

    public final java.lang.Long getLiveStatus() {
        return this.liveStatus;
    }

    public int hashCode() {
        java.lang.String str = this.finderExportId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long l17 = this.liveStatus;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str2 = this.liveDesc;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.finderExportId, this.liveStatus, this.liveDesc);
    }

    public java.lang.String toString() {
        return "EcsFinderLiveInfo(finderExportId=" + this.finderExportId + ", liveStatus=" + this.liveStatus + ", liveDesc=" + this.liveDesc + ')';
    }

    public EcsFinderLiveInfo(java.lang.String str, java.lang.Long l17, java.lang.String str2) {
        this.finderExportId = str;
        this.liveStatus = l17;
        this.liveDesc = str2;
    }

    public /* synthetic */ EcsFinderLiveInfo(java.lang.String str, java.lang.Long l17, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : l17, (i17 & 4) != 0 ? null : str2);
    }
}
