package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/ting/TingFinderContactInfo;", "", dm.i4.COL_USERNAME, "", "nickname", "headImageUrl", "isFollow", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHeadImageUrl", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickname", "getUsername", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/tencent/pigeon/ting/TingFinderContactInfo;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingFinderContactInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingFinderContactInfo.Companion INSTANCE = new com.tencent.pigeon.ting.TingFinderContactInfo.Companion(null);
    private final java.lang.String headImageUrl;
    private final java.lang.Boolean isFollow;
    private final java.lang.String nickname;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingFinderContactInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingFinderContactInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingFinderContactInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.ting.TingFinderContactInfo((java.lang.String) list.get(0), (java.lang.String) list.get(1), (java.lang.String) list.get(2), (java.lang.Boolean) list.get(3));
        }
    }

    public TingFinderContactInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ting.TingFinderContactInfo copy$default(com.tencent.pigeon.ting.TingFinderContactInfo tingFinderContactInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = tingFinderContactInfo.username;
        }
        if ((i17 & 2) != 0) {
            str2 = tingFinderContactInfo.nickname;
        }
        if ((i17 & 4) != 0) {
            str3 = tingFinderContactInfo.headImageUrl;
        }
        if ((i17 & 8) != 0) {
            bool = tingFinderContactInfo.isFollow;
        }
        return tingFinderContactInfo.copy(str, str2, str3, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getHeadImageUrl() {
        return this.headImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Boolean getIsFollow() {
        return this.isFollow;
    }

    public final com.tencent.pigeon.ting.TingFinderContactInfo copy(java.lang.String username, java.lang.String nickname, java.lang.String headImageUrl, java.lang.Boolean isFollow) {
        return new com.tencent.pigeon.ting.TingFinderContactInfo(username, nickname, headImageUrl, isFollow);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingFinderContactInfo)) {
            return false;
        }
        com.tencent.pigeon.ting.TingFinderContactInfo tingFinderContactInfo = (com.tencent.pigeon.ting.TingFinderContactInfo) other;
        return kotlin.jvm.internal.o.b(this.username, tingFinderContactInfo.username) && kotlin.jvm.internal.o.b(this.nickname, tingFinderContactInfo.nickname) && kotlin.jvm.internal.o.b(this.headImageUrl, tingFinderContactInfo.headImageUrl) && kotlin.jvm.internal.o.b(this.isFollow, tingFinderContactInfo.isFollow);
    }

    public final java.lang.String getHeadImageUrl() {
        return this.headImageUrl;
    }

    public final java.lang.String getNickname() {
        return this.nickname;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        java.lang.String str = this.username;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.nickname;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.headImageUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Boolean bool = this.isFollow;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.Boolean isFollow() {
        return this.isFollow;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, this.nickname, this.headImageUrl, this.isFollow);
    }

    public java.lang.String toString() {
        return "TingFinderContactInfo(username=" + this.username + ", nickname=" + this.nickname + ", headImageUrl=" + this.headImageUrl + ", isFollow=" + this.isFollow + ')';
    }

    public TingFinderContactInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool) {
        this.username = str;
        this.nickname = str2;
        this.headImageUrl = str3;
        this.isFollow = bool;
    }

    public /* synthetic */ TingFinderContactInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? null : bool);
    }
}
