package com.tencent.pigeon.brand_service;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/brand_service/BrandServiceAccountInfo;", "", "contactInfo", "Lcom/tencent/pigeon/brand_service/BrandServiceContactInfo;", "hasUnreadDot", "", "lastMsgTime", "", "(Lcom/tencent/pigeon/brand_service/BrandServiceContactInfo;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getContactInfo", "()Lcom/tencent/pigeon/brand_service/BrandServiceContactInfo;", "getHasUnreadDot", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastMsgTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Lcom/tencent/pigeon/brand_service/BrandServiceContactInfo;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/tencent/pigeon/brand_service/BrandServiceAccountInfo;", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BrandServiceAccountInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.brand_service.BrandServiceAccountInfo.Companion INSTANCE = new com.tencent.pigeon.brand_service.BrandServiceAccountInfo.Companion(null);
    private final com.tencent.pigeon.brand_service.BrandServiceContactInfo contactInfo;
    private final java.lang.Boolean hasUnreadDot;
    private final java.lang.Long lastMsgTime;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/brand_service/BrandServiceAccountInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/brand_service/BrandServiceAccountInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.brand_service.BrandServiceAccountInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(0);
            com.tencent.pigeon.brand_service.BrandServiceContactInfo fromList = list2 != null ? com.tencent.pigeon.brand_service.BrandServiceContactInfo.INSTANCE.fromList(list2) : null;
            java.lang.Boolean bool = (java.lang.Boolean) list.get(1);
            java.lang.Object obj = list.get(2);
            return new com.tencent.pigeon.brand_service.BrandServiceAccountInfo(fromList, bool, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    public BrandServiceAccountInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.brand_service.BrandServiceAccountInfo copy$default(com.tencent.pigeon.brand_service.BrandServiceAccountInfo brandServiceAccountInfo, com.tencent.pigeon.brand_service.BrandServiceContactInfo brandServiceContactInfo, java.lang.Boolean bool, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            brandServiceContactInfo = brandServiceAccountInfo.contactInfo;
        }
        if ((i17 & 2) != 0) {
            bool = brandServiceAccountInfo.hasUnreadDot;
        }
        if ((i17 & 4) != 0) {
            l17 = brandServiceAccountInfo.lastMsgTime;
        }
        return brandServiceAccountInfo.copy(brandServiceContactInfo, bool, l17);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.brand_service.BrandServiceContactInfo getContactInfo() {
        return this.contactInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getHasUnreadDot() {
        return this.hasUnreadDot;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getLastMsgTime() {
        return this.lastMsgTime;
    }

    public final com.tencent.pigeon.brand_service.BrandServiceAccountInfo copy(com.tencent.pigeon.brand_service.BrandServiceContactInfo contactInfo, java.lang.Boolean hasUnreadDot, java.lang.Long lastMsgTime) {
        return new com.tencent.pigeon.brand_service.BrandServiceAccountInfo(contactInfo, hasUnreadDot, lastMsgTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.brand_service.BrandServiceAccountInfo)) {
            return false;
        }
        com.tencent.pigeon.brand_service.BrandServiceAccountInfo brandServiceAccountInfo = (com.tencent.pigeon.brand_service.BrandServiceAccountInfo) other;
        return kotlin.jvm.internal.o.b(this.contactInfo, brandServiceAccountInfo.contactInfo) && kotlin.jvm.internal.o.b(this.hasUnreadDot, brandServiceAccountInfo.hasUnreadDot) && kotlin.jvm.internal.o.b(this.lastMsgTime, brandServiceAccountInfo.lastMsgTime);
    }

    public final com.tencent.pigeon.brand_service.BrandServiceContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public final java.lang.Boolean getHasUnreadDot() {
        return this.hasUnreadDot;
    }

    public final java.lang.Long getLastMsgTime() {
        return this.lastMsgTime;
    }

    public int hashCode() {
        com.tencent.pigeon.brand_service.BrandServiceContactInfo brandServiceContactInfo = this.contactInfo;
        int hashCode = (brandServiceContactInfo == null ? 0 : brandServiceContactInfo.hashCode()) * 31;
        java.lang.Boolean bool = this.hasUnreadDot;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Long l17 = this.lastMsgTime;
        return hashCode2 + (l17 != null ? l17.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.pigeon.brand_service.BrandServiceContactInfo brandServiceContactInfo = this.contactInfo;
        objArr[0] = brandServiceContactInfo != null ? brandServiceContactInfo.toList() : null;
        objArr[1] = this.hasUnreadDot;
        objArr[2] = this.lastMsgTime;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "BrandServiceAccountInfo(contactInfo=" + this.contactInfo + ", hasUnreadDot=" + this.hasUnreadDot + ", lastMsgTime=" + this.lastMsgTime + ')';
    }

    public BrandServiceAccountInfo(com.tencent.pigeon.brand_service.BrandServiceContactInfo brandServiceContactInfo, java.lang.Boolean bool, java.lang.Long l17) {
        this.contactInfo = brandServiceContactInfo;
        this.hasUnreadDot = bool;
        this.lastMsgTime = l17;
    }

    public /* synthetic */ BrandServiceAccountInfo(com.tencent.pigeon.brand_service.BrandServiceContactInfo brandServiceContactInfo, java.lang.Boolean bool, java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : brandServiceContactInfo, (i17 & 2) != 0 ? null : bool, (i17 & 4) != 0 ? null : l17);
    }
}
