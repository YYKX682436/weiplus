package com.tencent.pigeon.mega_video;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000eJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006#"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaVideoContact;", "", dm.i4.COL_USERNAME, "", "avatarUrl", "nickname", "isFollowed", "", "followState", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getAvatarUrl", "()Ljava/lang/String;", "getFollowState", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickname", "getUsername", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/tencent/pigeon/mega_video/MegaVideoContact;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MegaVideoContact {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mega_video.MegaVideoContact.Companion INSTANCE = new com.tencent.pigeon.mega_video.MegaVideoContact.Companion(null);
    private final java.lang.String avatarUrl;
    private final java.lang.Long followState;
    private final java.lang.Boolean isFollowed;
    private final java.lang.String nickname;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaVideoContact$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mega_video/MegaVideoContact;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mega_video.MegaVideoContact fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.String str3 = (java.lang.String) list.get(2);
            java.lang.Boolean bool = (java.lang.Boolean) list.get(3);
            java.lang.Object obj = list.get(4);
            return new com.tencent.pigeon.mega_video.MegaVideoContact(str, str2, str3, bool, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    public MegaVideoContact() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoContact copy$default(com.tencent.pigeon.mega_video.MegaVideoContact megaVideoContact, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = megaVideoContact.username;
        }
        if ((i17 & 2) != 0) {
            str2 = megaVideoContact.avatarUrl;
        }
        java.lang.String str4 = str2;
        if ((i17 & 4) != 0) {
            str3 = megaVideoContact.nickname;
        }
        java.lang.String str5 = str3;
        if ((i17 & 8) != 0) {
            bool = megaVideoContact.isFollowed;
        }
        java.lang.Boolean bool2 = bool;
        if ((i17 & 16) != 0) {
            l17 = megaVideoContact.followState;
        }
        return megaVideoContact.copy(str, str4, str5, bool2, l17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getNickname() {
        return this.nickname;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Boolean getIsFollowed() {
        return this.isFollowed;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Long getFollowState() {
        return this.followState;
    }

    public final com.tencent.pigeon.mega_video.MegaVideoContact copy(java.lang.String username, java.lang.String avatarUrl, java.lang.String nickname, java.lang.Boolean isFollowed, java.lang.Long followState) {
        return new com.tencent.pigeon.mega_video.MegaVideoContact(username, avatarUrl, nickname, isFollowed, followState);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mega_video.MegaVideoContact)) {
            return false;
        }
        com.tencent.pigeon.mega_video.MegaVideoContact megaVideoContact = (com.tencent.pigeon.mega_video.MegaVideoContact) other;
        return kotlin.jvm.internal.o.b(this.username, megaVideoContact.username) && kotlin.jvm.internal.o.b(this.avatarUrl, megaVideoContact.avatarUrl) && kotlin.jvm.internal.o.b(this.nickname, megaVideoContact.nickname) && kotlin.jvm.internal.o.b(this.isFollowed, megaVideoContact.isFollowed) && kotlin.jvm.internal.o.b(this.followState, megaVideoContact.followState);
    }

    public final java.lang.String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final java.lang.Long getFollowState() {
        return this.followState;
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
        java.lang.String str2 = this.avatarUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.nickname;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Boolean bool = this.isFollowed;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Long l17 = this.followState;
        return hashCode4 + (l17 != null ? l17.hashCode() : 0);
    }

    public final java.lang.Boolean isFollowed() {
        return this.isFollowed;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, this.avatarUrl, this.nickname, this.isFollowed, this.followState);
    }

    public java.lang.String toString() {
        return "MegaVideoContact(username=" + this.username + ", avatarUrl=" + this.avatarUrl + ", nickname=" + this.nickname + ", isFollowed=" + this.isFollowed + ", followState=" + this.followState + ')';
    }

    public MegaVideoContact(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Long l17) {
        this.username = str;
        this.avatarUrl = str2;
        this.nickname = str3;
        this.isFollowed = bool;
        this.followState = l17;
    }

    public /* synthetic */ MegaVideoContact(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? null : bool, (i17 & 16) != 0 ? null : l17);
    }
}
