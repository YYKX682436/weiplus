package com.tencent.pigeon.sns;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003JI\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterSelectContactAndLabelRsp;", "", "result", "", "contactList", "", "Lcom/tencent/pigeon/sns/SnsFlutterContactInfo;", "labelList", "Lcom/tencent/pigeon/sns/SnsFlutterLabelInfo;", "excludeContactList", "(ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getContactList", "()Ljava/util/List;", "getExcludeContactList", "getLabelList", "getResult", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SnsFlutterSelectContactAndLabelRsp {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp.Companion INSTANCE = new com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp.Companion(null);
    private final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList;
    private final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> excludeContactList;
    private final java.util.List<com.tencent.pigeon.sns.SnsFlutterLabelInfo> labelList;
    private final boolean result;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterSelectContactAndLabelRsp$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/sns/SnsFlutterSelectContactAndLabelRsp;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.sns.SnsFlutterContactInfo?>");
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.sns.SnsFlutterLabelInfo?>");
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.sns.SnsFlutterContactInfo?>");
            return new com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp(booleanValue, (java.util.List) obj2, (java.util.List) obj3, (java.util.List) obj4);
        }
    }

    public SnsFlutterSelectContactAndLabelRsp(boolean z17, java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList, java.util.List<com.tencent.pigeon.sns.SnsFlutterLabelInfo> labelList, java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> excludeContactList) {
        kotlin.jvm.internal.o.g(contactList, "contactList");
        kotlin.jvm.internal.o.g(labelList, "labelList");
        kotlin.jvm.internal.o.g(excludeContactList, "excludeContactList");
        this.result = z17;
        this.contactList = contactList;
        this.labelList = labelList;
        this.excludeContactList = excludeContactList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp copy$default(com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp snsFlutterSelectContactAndLabelRsp, boolean z17, java.util.List list, java.util.List list2, java.util.List list3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = snsFlutterSelectContactAndLabelRsp.result;
        }
        if ((i17 & 2) != 0) {
            list = snsFlutterSelectContactAndLabelRsp.contactList;
        }
        if ((i17 & 4) != 0) {
            list2 = snsFlutterSelectContactAndLabelRsp.labelList;
        }
        if ((i17 & 8) != 0) {
            list3 = snsFlutterSelectContactAndLabelRsp.excludeContactList;
        }
        return snsFlutterSelectContactAndLabelRsp.copy(z17, list, list2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> component2() {
        return this.contactList;
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterLabelInfo> component3() {
        return this.labelList;
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> component4() {
        return this.excludeContactList;
    }

    public final com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp copy(boolean result, java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList, java.util.List<com.tencent.pigeon.sns.SnsFlutterLabelInfo> labelList, java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> excludeContactList) {
        kotlin.jvm.internal.o.g(contactList, "contactList");
        kotlin.jvm.internal.o.g(labelList, "labelList");
        kotlin.jvm.internal.o.g(excludeContactList, "excludeContactList");
        return new com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp(result, contactList, labelList, excludeContactList);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp)) {
            return false;
        }
        com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp snsFlutterSelectContactAndLabelRsp = (com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp) other;
        return this.result == snsFlutterSelectContactAndLabelRsp.result && kotlin.jvm.internal.o.b(this.contactList, snsFlutterSelectContactAndLabelRsp.contactList) && kotlin.jvm.internal.o.b(this.labelList, snsFlutterSelectContactAndLabelRsp.labelList) && kotlin.jvm.internal.o.b(this.excludeContactList, snsFlutterSelectContactAndLabelRsp.excludeContactList);
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> getContactList() {
        return this.contactList;
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> getExcludeContactList() {
        return this.excludeContactList;
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterLabelInfo> getLabelList() {
        return this.labelList;
    }

    public final boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.result) * 31) + this.contactList.hashCode()) * 31) + this.labelList.hashCode()) * 31) + this.excludeContactList.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Boolean.valueOf(this.result), this.contactList, this.labelList, this.excludeContactList);
    }

    public java.lang.String toString() {
        return "SnsFlutterSelectContactAndLabelRsp(result=" + this.result + ", contactList=" + this.contactList + ", labelList=" + this.labelList + ", excludeContactList=" + this.excludeContactList + ')';
    }
}
