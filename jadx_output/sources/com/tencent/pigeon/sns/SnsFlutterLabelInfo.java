package com.tencent.pigeon.sns;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterLabelInfo;", "", "labelId", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "contactList", "", "Lcom/tencent/pigeon/sns/SnsFlutterContactInfo;", "(JLjava/lang/String;Ljava/util/List;)V", "getContactList", "()Ljava/util/List;", "getLabelId", "()J", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SnsFlutterLabelInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.sns.SnsFlutterLabelInfo.Companion INSTANCE = new com.tencent.pigeon.sns.SnsFlutterLabelInfo.Companion(null);
    private final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList;
    private final long labelId;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterLabelInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/sns/SnsFlutterLabelInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.sns.SnsFlutterLabelInfo fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.sns.SnsFlutterContactInfo?>");
            return new com.tencent.pigeon.sns.SnsFlutterLabelInfo(longValue, (java.lang.String) obj2, (java.util.List) obj3);
        }
    }

    public SnsFlutterLabelInfo(long j17, java.lang.String name, java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(contactList, "contactList");
        this.labelId = j17;
        this.name = name;
        this.contactList = contactList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.sns.SnsFlutterLabelInfo copy$default(com.tencent.pigeon.sns.SnsFlutterLabelInfo snsFlutterLabelInfo, long j17, java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = snsFlutterLabelInfo.labelId;
        }
        if ((i17 & 2) != 0) {
            str = snsFlutterLabelInfo.name;
        }
        if ((i17 & 4) != 0) {
            list = snsFlutterLabelInfo.contactList;
        }
        return snsFlutterLabelInfo.copy(j17, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getLabelId() {
        return this.labelId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> component3() {
        return this.contactList;
    }

    public final com.tencent.pigeon.sns.SnsFlutterLabelInfo copy(long labelId, java.lang.String name, java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(contactList, "contactList");
        return new com.tencent.pigeon.sns.SnsFlutterLabelInfo(labelId, name, contactList);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.sns.SnsFlutterLabelInfo)) {
            return false;
        }
        com.tencent.pigeon.sns.SnsFlutterLabelInfo snsFlutterLabelInfo = (com.tencent.pigeon.sns.SnsFlutterLabelInfo) other;
        return this.labelId == snsFlutterLabelInfo.labelId && kotlin.jvm.internal.o.b(this.name, snsFlutterLabelInfo.name) && kotlin.jvm.internal.o.b(this.contactList, snsFlutterLabelInfo.contactList);
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> getContactList() {
        return this.contactList;
    }

    public final long getLabelId() {
        return this.labelId;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.labelId) * 31) + this.name.hashCode()) * 31) + this.contactList.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.labelId), this.name, this.contactList);
    }

    public java.lang.String toString() {
        return "SnsFlutterLabelInfo(labelId=" + this.labelId + ", name=" + this.name + ", contactList=" + this.contactList + ')';
    }
}
