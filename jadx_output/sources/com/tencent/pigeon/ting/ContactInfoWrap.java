package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/ting/ContactInfoWrap;", "", "nickname", "", "headImgUrl", "contactId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContactId", "()Ljava/lang/String;", "getHeadImgUrl", "getNickname", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ContactInfoWrap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.ContactInfoWrap.Companion INSTANCE = new com.tencent.pigeon.ting.ContactInfoWrap.Companion(null);
    private final java.lang.String contactId;
    private final java.lang.String headImgUrl;
    private final java.lang.String nickname;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/ContactInfoWrap$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/ContactInfoWrap;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.ContactInfoWrap fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.ting.ContactInfoWrap((java.lang.String) list.get(0), (java.lang.String) list.get(1), (java.lang.String) list.get(2));
        }
    }

    public ContactInfoWrap() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ting.ContactInfoWrap copy$default(com.tencent.pigeon.ting.ContactInfoWrap contactInfoWrap, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = contactInfoWrap.nickname;
        }
        if ((i17 & 2) != 0) {
            str2 = contactInfoWrap.headImgUrl;
        }
        if ((i17 & 4) != 0) {
            str3 = contactInfoWrap.contactId;
        }
        return contactInfoWrap.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHeadImgUrl() {
        return this.headImgUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContactId() {
        return this.contactId;
    }

    public final com.tencent.pigeon.ting.ContactInfoWrap copy(java.lang.String nickname, java.lang.String headImgUrl, java.lang.String contactId) {
        return new com.tencent.pigeon.ting.ContactInfoWrap(nickname, headImgUrl, contactId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.ContactInfoWrap)) {
            return false;
        }
        com.tencent.pigeon.ting.ContactInfoWrap contactInfoWrap = (com.tencent.pigeon.ting.ContactInfoWrap) other;
        return kotlin.jvm.internal.o.b(this.nickname, contactInfoWrap.nickname) && kotlin.jvm.internal.o.b(this.headImgUrl, contactInfoWrap.headImgUrl) && kotlin.jvm.internal.o.b(this.contactId, contactInfoWrap.contactId);
    }

    public final java.lang.String getContactId() {
        return this.contactId;
    }

    public final java.lang.String getHeadImgUrl() {
        return this.headImgUrl;
    }

    public final java.lang.String getNickname() {
        return this.nickname;
    }

    public int hashCode() {
        java.lang.String str = this.nickname;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.headImgUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.contactId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.nickname, this.headImgUrl, this.contactId);
    }

    public java.lang.String toString() {
        return "ContactInfoWrap(nickname=" + this.nickname + ", headImgUrl=" + this.headImgUrl + ", contactId=" + this.contactId + ')';
    }

    public ContactInfoWrap(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.nickname = str;
        this.headImgUrl = str2;
        this.contactId = str3;
    }

    public /* synthetic */ ContactInfoWrap(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3);
    }
}
