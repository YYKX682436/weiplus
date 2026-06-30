package com.tencent.pigeon.brand_service;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJJ\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0005\u0010\nR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\b\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/brand_service/BSContactInfo;", "", "userName", "", "nickName", "isContact", "", "isPlaceTop", "isMute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickName", "()Ljava/lang/String;", "getUserName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tencent/pigeon/brand_service/BSContactInfo;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BSContactInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.brand_service.BSContactInfo.Companion INSTANCE = new com.tencent.pigeon.brand_service.BSContactInfo.Companion(null);
    private final java.lang.Boolean isContact;
    private final java.lang.Boolean isMute;
    private final java.lang.Boolean isPlaceTop;
    private final java.lang.String nickName;
    private final java.lang.String userName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/brand_service/BSContactInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/brand_service/BSContactInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.brand_service.BSContactInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.brand_service.BSContactInfo((java.lang.String) list.get(0), (java.lang.String) list.get(1), (java.lang.Boolean) list.get(2), (java.lang.Boolean) list.get(3), (java.lang.Boolean) list.get(4));
        }
    }

    public BSContactInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.tencent.pigeon.brand_service.BSContactInfo copy$default(com.tencent.pigeon.brand_service.BSContactInfo bSContactInfo, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = bSContactInfo.userName;
        }
        if ((i17 & 2) != 0) {
            str2 = bSContactInfo.nickName;
        }
        java.lang.String str3 = str2;
        if ((i17 & 4) != 0) {
            bool = bSContactInfo.isContact;
        }
        java.lang.Boolean bool4 = bool;
        if ((i17 & 8) != 0) {
            bool2 = bSContactInfo.isPlaceTop;
        }
        java.lang.Boolean bool5 = bool2;
        if ((i17 & 16) != 0) {
            bool3 = bSContactInfo.isMute;
        }
        return bSContactInfo.copy(str, str3, bool4, bool5, bool3);
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

    /* renamed from: component5, reason: from getter */
    public final java.lang.Boolean getIsMute() {
        return this.isMute;
    }

    public final com.tencent.pigeon.brand_service.BSContactInfo copy(java.lang.String userName, java.lang.String nickName, java.lang.Boolean isContact, java.lang.Boolean isPlaceTop, java.lang.Boolean isMute) {
        return new com.tencent.pigeon.brand_service.BSContactInfo(userName, nickName, isContact, isPlaceTop, isMute);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.brand_service.BSContactInfo)) {
            return false;
        }
        com.tencent.pigeon.brand_service.BSContactInfo bSContactInfo = (com.tencent.pigeon.brand_service.BSContactInfo) other;
        return kotlin.jvm.internal.o.b(this.userName, bSContactInfo.userName) && kotlin.jvm.internal.o.b(this.nickName, bSContactInfo.nickName) && kotlin.jvm.internal.o.b(this.isContact, bSContactInfo.isContact) && kotlin.jvm.internal.o.b(this.isPlaceTop, bSContactInfo.isPlaceTop) && kotlin.jvm.internal.o.b(this.isMute, bSContactInfo.isMute);
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
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Boolean bool3 = this.isMute;
        return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final java.lang.Boolean isContact() {
        return this.isContact;
    }

    public final java.lang.Boolean isMute() {
        return this.isMute;
    }

    public final java.lang.Boolean isPlaceTop() {
        return this.isPlaceTop;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.userName, this.nickName, this.isContact, this.isPlaceTop, this.isMute);
    }

    public java.lang.String toString() {
        return "BSContactInfo(userName=" + this.userName + ", nickName=" + this.nickName + ", isContact=" + this.isContact + ", isPlaceTop=" + this.isPlaceTop + ", isMute=" + this.isMute + ')';
    }

    public BSContactInfo(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
        this.userName = str;
        this.nickName = str2;
        this.isContact = bool;
        this.isPlaceTop = bool2;
        this.isMute = bool3;
    }

    public /* synthetic */ BSContactInfo(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : bool, (i17 & 8) != 0 ? null : bool2, (i17 & 16) != 0 ? null : bool3);
    }
}
