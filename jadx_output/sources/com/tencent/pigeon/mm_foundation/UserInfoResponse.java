package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006!"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/UserInfoResponse;", "", dm.i4.COL_USERNAME, "", "avatarPath", "displayName", "gender", "isOpenIM", "", "subName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAvatarPath", "()Ljava/lang/String;", "getDisplayName", "getGender", "()Z", "getSubName", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UserInfoResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.UserInfoResponse.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.UserInfoResponse.Companion(null);
    private final java.lang.String avatarPath;
    private final java.lang.String displayName;
    private final java.lang.String gender;
    private final boolean isOpenIM;
    private final java.lang.String subName;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/UserInfoResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/UserInfoResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.UserInfoResponse fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.Object obj2 = list.get(2);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str3 = (java.lang.String) obj2;
            java.lang.Object obj3 = list.get(3);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str4 = (java.lang.String) obj3;
            java.lang.Object obj4 = list.get(4);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj4).booleanValue();
            java.lang.Object obj5 = list.get(5);
            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.mm_foundation.UserInfoResponse(str, str2, str3, str4, booleanValue, (java.lang.String) obj5);
        }
    }

    public UserInfoResponse(java.lang.String username, java.lang.String str, java.lang.String displayName, java.lang.String gender, boolean z17, java.lang.String subName) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(displayName, "displayName");
        kotlin.jvm.internal.o.g(gender, "gender");
        kotlin.jvm.internal.o.g(subName, "subName");
        this.username = username;
        this.avatarPath = str;
        this.displayName = displayName;
        this.gender = gender;
        this.isOpenIM = z17;
        this.subName = subName;
    }

    public static /* synthetic */ com.tencent.pigeon.mm_foundation.UserInfoResponse copy$default(com.tencent.pigeon.mm_foundation.UserInfoResponse userInfoResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = userInfoResponse.username;
        }
        if ((i17 & 2) != 0) {
            str2 = userInfoResponse.avatarPath;
        }
        java.lang.String str6 = str2;
        if ((i17 & 4) != 0) {
            str3 = userInfoResponse.displayName;
        }
        java.lang.String str7 = str3;
        if ((i17 & 8) != 0) {
            str4 = userInfoResponse.gender;
        }
        java.lang.String str8 = str4;
        if ((i17 & 16) != 0) {
            z17 = userInfoResponse.isOpenIM;
        }
        boolean z18 = z17;
        if ((i17 & 32) != 0) {
            str5 = userInfoResponse.subName;
        }
        return userInfoResponse.copy(str, str6, str7, str8, z18, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAvatarPath() {
        return this.avatarPath;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getGender() {
        return this.gender;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOpenIM() {
        return this.isOpenIM;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSubName() {
        return this.subName;
    }

    public final com.tencent.pigeon.mm_foundation.UserInfoResponse copy(java.lang.String username, java.lang.String avatarPath, java.lang.String displayName, java.lang.String gender, boolean isOpenIM, java.lang.String subName) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(displayName, "displayName");
        kotlin.jvm.internal.o.g(gender, "gender");
        kotlin.jvm.internal.o.g(subName, "subName");
        return new com.tencent.pigeon.mm_foundation.UserInfoResponse(username, avatarPath, displayName, gender, isOpenIM, subName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.UserInfoResponse)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.UserInfoResponse userInfoResponse = (com.tencent.pigeon.mm_foundation.UserInfoResponse) other;
        return kotlin.jvm.internal.o.b(this.username, userInfoResponse.username) && kotlin.jvm.internal.o.b(this.avatarPath, userInfoResponse.avatarPath) && kotlin.jvm.internal.o.b(this.displayName, userInfoResponse.displayName) && kotlin.jvm.internal.o.b(this.gender, userInfoResponse.gender) && this.isOpenIM == userInfoResponse.isOpenIM && kotlin.jvm.internal.o.b(this.subName, userInfoResponse.subName);
    }

    public final java.lang.String getAvatarPath() {
        return this.avatarPath;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String getGender() {
        return this.gender;
    }

    public final java.lang.String getSubName() {
        return this.subName;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = this.username.hashCode() * 31;
        java.lang.String str = this.avatarPath;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.displayName.hashCode()) * 31) + this.gender.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isOpenIM)) * 31) + this.subName.hashCode();
    }

    public final boolean isOpenIM() {
        return this.isOpenIM;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, this.avatarPath, this.displayName, this.gender, java.lang.Boolean.valueOf(this.isOpenIM), this.subName);
    }

    public java.lang.String toString() {
        return "UserInfoResponse(username=" + this.username + ", avatarPath=" + this.avatarPath + ", displayName=" + this.displayName + ", gender=" + this.gender + ", isOpenIM=" + this.isOpenIM + ", subName=" + this.subName + ')';
    }

    public /* synthetic */ UserInfoResponse(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : str2, str3, str4, z17, str5);
    }
}
