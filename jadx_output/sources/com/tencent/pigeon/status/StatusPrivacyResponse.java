package com.tencent.pigeon.status;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J\u0013\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006%"}, d2 = {"Lcom/tencent/pigeon/status/StatusPrivacyResponse;", "", "confirmed", "", com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.KEY_AGREE_PRIVACY, "Lcom/tencent/pigeon/status/StatusPrivacyType;", "selectedContacts", "", "", "selectedTags", "", "isAllContactsSelected", "selectedTagUserCount", "(ZLcom/tencent/pigeon/status/StatusPrivacyType;Ljava/util/List;Ljava/util/List;ZJ)V", "getConfirmed", "()Z", "getPrivacy", "()Lcom/tencent/pigeon/status/StatusPrivacyType;", "getSelectedContacts", "()Ljava/util/List;", "getSelectedTagUserCount", "()J", "getSelectedTags", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StatusPrivacyResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.status.StatusPrivacyResponse.Companion INSTANCE = new com.tencent.pigeon.status.StatusPrivacyResponse.Companion(null);
    private final boolean confirmed;
    private final boolean isAllContactsSelected;
    private final com.tencent.pigeon.status.StatusPrivacyType privacy;
    private final java.util.List<java.lang.String> selectedContacts;
    private final long selectedTagUserCount;
    private final java.util.List<java.lang.Long> selectedTags;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/status/StatusPrivacyResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/status/StatusPrivacyResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.status.StatusPrivacyResponse fromList(java.util.List<? extends java.lang.Object> list) {
            com.tencent.pigeon.status.StatusPrivacyType statusPrivacyType;
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Integer num = (java.lang.Integer) list.get(1);
            if (num != null) {
                statusPrivacyType = com.tencent.pigeon.status.StatusPrivacyType.INSTANCE.ofRaw(num.intValue());
            } else {
                statusPrivacyType = null;
            }
            com.tencent.pigeon.status.StatusPrivacyType statusPrivacyType2 = statusPrivacyType;
            java.util.List list2 = (java.util.List) list.get(2);
            java.util.List list3 = (java.util.List) list.get(3);
            java.lang.Object obj2 = list.get(4);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
            java.lang.Object obj3 = list.get(5);
            if (obj3 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj3).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj3).longValue();
            }
            return new com.tencent.pigeon.status.StatusPrivacyResponse(booleanValue, statusPrivacyType2, list2, list3, booleanValue2, longValue);
        }
    }

    public StatusPrivacyResponse(boolean z17, com.tencent.pigeon.status.StatusPrivacyType statusPrivacyType, java.util.List<java.lang.String> list, java.util.List<java.lang.Long> list2, boolean z18, long j17) {
        this.confirmed = z17;
        this.privacy = statusPrivacyType;
        this.selectedContacts = list;
        this.selectedTags = list2;
        this.isAllContactsSelected = z18;
        this.selectedTagUserCount = j17;
    }

    public static /* synthetic */ com.tencent.pigeon.status.StatusPrivacyResponse copy$default(com.tencent.pigeon.status.StatusPrivacyResponse statusPrivacyResponse, boolean z17, com.tencent.pigeon.status.StatusPrivacyType statusPrivacyType, java.util.List list, java.util.List list2, boolean z18, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = statusPrivacyResponse.confirmed;
        }
        if ((i17 & 2) != 0) {
            statusPrivacyType = statusPrivacyResponse.privacy;
        }
        com.tencent.pigeon.status.StatusPrivacyType statusPrivacyType2 = statusPrivacyType;
        if ((i17 & 4) != 0) {
            list = statusPrivacyResponse.selectedContacts;
        }
        java.util.List list3 = list;
        if ((i17 & 8) != 0) {
            list2 = statusPrivacyResponse.selectedTags;
        }
        java.util.List list4 = list2;
        if ((i17 & 16) != 0) {
            z18 = statusPrivacyResponse.isAllContactsSelected;
        }
        boolean z19 = z18;
        if ((i17 & 32) != 0) {
            j17 = statusPrivacyResponse.selectedTagUserCount;
        }
        return statusPrivacyResponse.copy(z17, statusPrivacyType2, list3, list4, z19, j17);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.status.StatusPrivacyType getPrivacy() {
        return this.privacy;
    }

    public final java.util.List<java.lang.String> component3() {
        return this.selectedContacts;
    }

    public final java.util.List<java.lang.Long> component4() {
        return this.selectedTags;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAllContactsSelected() {
        return this.isAllContactsSelected;
    }

    /* renamed from: component6, reason: from getter */
    public final long getSelectedTagUserCount() {
        return this.selectedTagUserCount;
    }

    public final com.tencent.pigeon.status.StatusPrivacyResponse copy(boolean confirmed, com.tencent.pigeon.status.StatusPrivacyType privacy, java.util.List<java.lang.String> selectedContacts, java.util.List<java.lang.Long> selectedTags, boolean isAllContactsSelected, long selectedTagUserCount) {
        return new com.tencent.pigeon.status.StatusPrivacyResponse(confirmed, privacy, selectedContacts, selectedTags, isAllContactsSelected, selectedTagUserCount);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.status.StatusPrivacyResponse)) {
            return false;
        }
        com.tencent.pigeon.status.StatusPrivacyResponse statusPrivacyResponse = (com.tencent.pigeon.status.StatusPrivacyResponse) other;
        return this.confirmed == statusPrivacyResponse.confirmed && this.privacy == statusPrivacyResponse.privacy && kotlin.jvm.internal.o.b(this.selectedContacts, statusPrivacyResponse.selectedContacts) && kotlin.jvm.internal.o.b(this.selectedTags, statusPrivacyResponse.selectedTags) && this.isAllContactsSelected == statusPrivacyResponse.isAllContactsSelected && this.selectedTagUserCount == statusPrivacyResponse.selectedTagUserCount;
    }

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final com.tencent.pigeon.status.StatusPrivacyType getPrivacy() {
        return this.privacy;
    }

    public final java.util.List<java.lang.String> getSelectedContacts() {
        return this.selectedContacts;
    }

    public final long getSelectedTagUserCount() {
        return this.selectedTagUserCount;
    }

    public final java.util.List<java.lang.Long> getSelectedTags() {
        return this.selectedTags;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.confirmed) * 31;
        com.tencent.pigeon.status.StatusPrivacyType statusPrivacyType = this.privacy;
        int hashCode2 = (hashCode + (statusPrivacyType == null ? 0 : statusPrivacyType.hashCode())) * 31;
        java.util.List<java.lang.String> list = this.selectedContacts;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        java.util.List<java.lang.Long> list2 = this.selectedTags;
        return ((((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isAllContactsSelected)) * 31) + java.lang.Long.hashCode(this.selectedTagUserCount);
    }

    public final boolean isAllContactsSelected() {
        return this.isAllContactsSelected;
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Boolean.valueOf(this.confirmed);
        com.tencent.pigeon.status.StatusPrivacyType statusPrivacyType = this.privacy;
        objArr[1] = statusPrivacyType != null ? java.lang.Integer.valueOf(statusPrivacyType.getRaw()) : null;
        objArr[2] = this.selectedContacts;
        objArr[3] = this.selectedTags;
        objArr[4] = java.lang.Boolean.valueOf(this.isAllContactsSelected);
        objArr[5] = java.lang.Long.valueOf(this.selectedTagUserCount);
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "StatusPrivacyResponse(confirmed=" + this.confirmed + ", privacy=" + this.privacy + ", selectedContacts=" + this.selectedContacts + ", selectedTags=" + this.selectedTags + ", isAllContactsSelected=" + this.isAllContactsSelected + ", selectedTagUserCount=" + this.selectedTagUserCount + ')';
    }

    public /* synthetic */ StatusPrivacyResponse(boolean z17, com.tencent.pigeon.status.StatusPrivacyType statusPrivacyType, java.util.List list, java.util.List list2, boolean z18, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : statusPrivacyType, (i17 & 4) != 0 ? null : list, (i17 & 8) != 0 ? null : list2, z18, j17);
    }
}
