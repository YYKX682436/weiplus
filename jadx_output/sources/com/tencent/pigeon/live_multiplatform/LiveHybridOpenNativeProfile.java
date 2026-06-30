package com.tencent.pigeon.live_multiplatform;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/tencent/pigeon/live_multiplatform/LiveHybridOpenNativeProfile;", "", "contactPBData", "", "feedPBData", "([B[B)V", "getContactPBData", "()[B", "getFeedPBData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LiveHybridOpenNativeProfile {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile.Companion INSTANCE = new com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile.Companion(null);
    private final byte[] contactPBData;
    private final byte[] feedPBData;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_multiplatform/LiveHybridOpenNativeProfile$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_multiplatform/LiveHybridOpenNativeProfile;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            return new com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile((byte[]) obj, (byte[]) list.get(1));
        }
    }

    public LiveHybridOpenNativeProfile(byte[] contactPBData, byte[] bArr) {
        kotlin.jvm.internal.o.g(contactPBData, "contactPBData");
        this.contactPBData = contactPBData;
        this.feedPBData = bArr;
    }

    public static /* synthetic */ com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile copy$default(com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile liveHybridOpenNativeProfile, byte[] bArr, byte[] bArr2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = liveHybridOpenNativeProfile.contactPBData;
        }
        if ((i17 & 2) != 0) {
            bArr2 = liveHybridOpenNativeProfile.feedPBData;
        }
        return liveHybridOpenNativeProfile.copy(bArr, bArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getContactPBData() {
        return this.contactPBData;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getFeedPBData() {
        return this.feedPBData;
    }

    public final com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile copy(byte[] contactPBData, byte[] feedPBData) {
        kotlin.jvm.internal.o.g(contactPBData, "contactPBData");
        return new com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile(contactPBData, feedPBData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile)) {
            return false;
        }
        com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile liveHybridOpenNativeProfile = (com.tencent.pigeon.live_multiplatform.LiveHybridOpenNativeProfile) other;
        return kotlin.jvm.internal.o.b(this.contactPBData, liveHybridOpenNativeProfile.contactPBData) && kotlin.jvm.internal.o.b(this.feedPBData, liveHybridOpenNativeProfile.feedPBData);
    }

    public final byte[] getContactPBData() {
        return this.contactPBData;
    }

    public final byte[] getFeedPBData() {
        return this.feedPBData;
    }

    public int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.contactPBData) * 31;
        byte[] bArr = this.feedPBData;
        return hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr));
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.contactPBData, this.feedPBData);
    }

    public java.lang.String toString() {
        return "LiveHybridOpenNativeProfile(contactPBData=" + java.util.Arrays.toString(this.contactPBData) + ", feedPBData=" + java.util.Arrays.toString(this.feedPBData) + ')';
    }

    public /* synthetic */ LiveHybridOpenNativeProfile(byte[] bArr, byte[] bArr2, int i17, kotlin.jvm.internal.i iVar) {
        this(bArr, (i17 & 2) != 0 ? null : bArr2);
    }
}
