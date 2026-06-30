package com.tencent.pigeon.brand_service;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\tR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0007\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/brand_service/BrandServiceContactInfo;", "", "userName", "", "nickName", "isContact", "", "isPlaceTop", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickName", "()Ljava/lang/String;", "getUserName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tencent/pigeon/brand_service/BrandServiceContactInfo;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BrandServiceContactInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.brand_service.BrandServiceContactInfo.Companion INSTANCE = new com.tencent.pigeon.brand_service.BrandServiceContactInfo.Companion(null);
    private final java.lang.Boolean isContact;
    private final java.lang.Boolean isPlaceTop;
    private final java.lang.String nickName;
    private final java.lang.String userName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/brand_service/BrandServiceContactInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/brand_service/BrandServiceContactInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.brand_service.BrandServiceContactInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.brand_service.BrandServiceContactInfo((java.lang.String) list.get(0), (java.lang.String) list.get(1), (java.lang.Boolean) list.get(2), (java.lang.Boolean) list.get(3));
        }
    }

    public BrandServiceContactInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.brand_service.BrandServiceContactInfo copy$default(com.tencent.pigeon.brand_service.BrandServiceContactInfo brandServiceContactInfo, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = brandServiceContactInfo.userName;
        }
        if ((i17 & 2) != 0) {
            str2 = brandServiceContactInfo.nickName;
        }
        if ((i17 & 4) != 0) {
            bool = brandServiceContactInfo.isContact;
        }
        if ((i17 & 8) != 0) {
            bool2 = brandServiceContactInfo.isPlaceTop;
        }
        return brandServiceContactInfo.copy(str, str2, bool, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserName() {
        return this.userName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNickName() {
        return this.nickName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getIsContact() {
        return this.isContact;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Boolean getIsPlaceTop() {
        return this.isPlaceTop;
    }

    public final com.tencent.pigeon.brand_service.BrandServiceContactInfo copy(java.lang.String userName, java.lang.String nickName, java.lang.Boolean isContact, java.lang.Boolean isPlaceTop) {
        return new com.tencent.pigeon.brand_service.BrandServiceContactInfo(userName, nickName, isContact, isPlaceTop);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.brand_service.BrandServiceContactInfo)) {
            return false;
        }
        com.tencent.pigeon.brand_service.BrandServiceContactInfo brandServiceContactInfo = (com.tencent.pigeon.brand_service.BrandServiceContactInfo) other;
        return kotlin.jvm.internal.o.b(this.userName, brandServiceContactInfo.userName) && kotlin.jvm.internal.o.b(this.nickName, brandServiceContactInfo.nickName) && kotlin.jvm.internal.o.b(this.isContact, brandServiceContactInfo.isContact) && kotlin.jvm.internal.o.b(this.isPlaceTop, brandServiceContactInfo.isPlaceTop);
    }

    public final java.lang.String getNickName() {
        return this.nickName;
    }

    public final java.lang.String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        java.lang.String str = this.userName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.nickName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Boolean bool = this.isContact;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.isPlaceTop;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final java.lang.Boolean isContact() {
        return this.isContact;
    }

    public final java.lang.Boolean isPlaceTop() {
        return this.isPlaceTop;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.userName, this.nickName, this.isContact, this.isPlaceTop);
    }

    public java.lang.String toString() {
        return "BrandServiceContactInfo(userName=" + this.userName + ", nickName=" + this.nickName + ", isContact=" + this.isContact + ", isPlaceTop=" + this.isPlaceTop + ')';
    }

    public BrandServiceContactInfo(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.userName = str;
        this.nickName = str2;
        this.isContact = bool;
        this.isPlaceTop = bool2;
    }

    public /* synthetic */ BrandServiceContactInfo(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : bool, (i17 & 8) != 0 ? null : bool2);
    }
}
