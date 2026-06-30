package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/tencent/pigeon/ting/TingUserContactInfo;", "", "userName", "", "nickName", "headUrl", "hashUsername", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHashUsername", "()Ljava/lang/String;", "getHeadUrl", "getNickName", "getUserName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingUserContactInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingUserContactInfo.Companion INSTANCE = new com.tencent.pigeon.ting.TingUserContactInfo.Companion(null);
    private final java.lang.String hashUsername;
    private final java.lang.String headUrl;
    private final java.lang.String nickName;
    private final java.lang.String userName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingUserContactInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingUserContactInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingUserContactInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.ting.TingUserContactInfo((java.lang.String) list.get(0), (java.lang.String) list.get(1), (java.lang.String) list.get(2), (java.lang.String) list.get(3));
        }
    }

    public TingUserContactInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ting.TingUserContactInfo copy$default(com.tencent.pigeon.ting.TingUserContactInfo tingUserContactInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = tingUserContactInfo.userName;
        }
        if ((i17 & 2) != 0) {
            str2 = tingUserContactInfo.nickName;
        }
        if ((i17 & 4) != 0) {
            str3 = tingUserContactInfo.headUrl;
        }
        if ((i17 & 8) != 0) {
            str4 = tingUserContactInfo.hashUsername;
        }
        return tingUserContactInfo.copy(str, str2, str3, str4);
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
    public final java.lang.String getHeadUrl() {
        return this.headUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getHashUsername() {
        return this.hashUsername;
    }

    public final com.tencent.pigeon.ting.TingUserContactInfo copy(java.lang.String userName, java.lang.String nickName, java.lang.String headUrl, java.lang.String hashUsername) {
        return new com.tencent.pigeon.ting.TingUserContactInfo(userName, nickName, headUrl, hashUsername);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingUserContactInfo)) {
            return false;
        }
        com.tencent.pigeon.ting.TingUserContactInfo tingUserContactInfo = (com.tencent.pigeon.ting.TingUserContactInfo) other;
        return kotlin.jvm.internal.o.b(this.userName, tingUserContactInfo.userName) && kotlin.jvm.internal.o.b(this.nickName, tingUserContactInfo.nickName) && kotlin.jvm.internal.o.b(this.headUrl, tingUserContactInfo.headUrl) && kotlin.jvm.internal.o.b(this.hashUsername, tingUserContactInfo.hashUsername);
    }

    public final java.lang.String getHashUsername() {
        return this.hashUsername;
    }

    public final java.lang.String getHeadUrl() {
        return this.headUrl;
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
        java.lang.String str3 = this.headUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.hashUsername;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.userName, this.nickName, this.headUrl, this.hashUsername);
    }

    public java.lang.String toString() {
        return "TingUserContactInfo(userName=" + this.userName + ", nickName=" + this.nickName + ", headUrl=" + this.headUrl + ", hashUsername=" + this.hashUsername + ')';
    }

    public TingUserContactInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.userName = str;
        this.nickName = str2;
        this.headUrl = str3;
        this.hashUsername = str4;
    }

    public /* synthetic */ TingUserContactInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? null : str4);
    }
}
