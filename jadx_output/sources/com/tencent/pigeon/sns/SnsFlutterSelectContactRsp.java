package com.tencent.pigeon.sns;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterSelectContactRsp;", "", "result", "", "contactList", "", "Lcom/tencent/pigeon/sns/SnsFlutterContactInfo;", "(ZLjava/util/List;)V", "getContactList", "()Ljava/util/List;", "getResult", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SnsFlutterSelectContactRsp {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.sns.SnsFlutterSelectContactRsp.Companion INSTANCE = new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp.Companion(null);
    private final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList;
    private final boolean result;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/SnsFlutterSelectContactRsp$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/sns/SnsFlutterSelectContactRsp;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.sns.SnsFlutterSelectContactRsp fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.sns.SnsFlutterContactInfo?>");
            return new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(booleanValue, (java.util.List) obj2);
        }
    }

    public SnsFlutterSelectContactRsp(boolean z17, java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList) {
        kotlin.jvm.internal.o.g(contactList, "contactList");
        this.result = z17;
        this.contactList = contactList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.sns.SnsFlutterSelectContactRsp copy$default(com.tencent.pigeon.sns.SnsFlutterSelectContactRsp snsFlutterSelectContactRsp, boolean z17, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = snsFlutterSelectContactRsp.result;
        }
        if ((i17 & 2) != 0) {
            list = snsFlutterSelectContactRsp.contactList;
        }
        return snsFlutterSelectContactRsp.copy(z17, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> component2() {
        return this.contactList;
    }

    public final com.tencent.pigeon.sns.SnsFlutterSelectContactRsp copy(boolean result, java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> contactList) {
        kotlin.jvm.internal.o.g(contactList, "contactList");
        return new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(result, contactList);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.sns.SnsFlutterSelectContactRsp)) {
            return false;
        }
        com.tencent.pigeon.sns.SnsFlutterSelectContactRsp snsFlutterSelectContactRsp = (com.tencent.pigeon.sns.SnsFlutterSelectContactRsp) other;
        return this.result == snsFlutterSelectContactRsp.result && kotlin.jvm.internal.o.b(this.contactList, snsFlutterSelectContactRsp.contactList);
    }

    public final java.util.List<com.tencent.pigeon.sns.SnsFlutterContactInfo> getContactList() {
        return this.contactList;
    }

    public final boolean getResult() {
        return this.result;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.result) * 31) + this.contactList.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Boolean.valueOf(this.result), this.contactList);
    }

    public java.lang.String toString() {
        return "SnsFlutterSelectContactRsp(result=" + this.result + ", contactList=" + this.contactList + ')';
    }
}
