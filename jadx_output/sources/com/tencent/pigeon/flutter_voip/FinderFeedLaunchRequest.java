package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/FinderFeedLaunchRequest;", "", "feedId", "", "nonceId", "", "fromRingtone", "", "(JLjava/lang/String;Z)V", "getFeedId", "()J", "getFromRingtone", "()Z", "getNonceId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FinderFeedLaunchRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest.Companion INSTANCE = new com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest.Companion(null);
    private final long feedId;
    private final boolean fromRingtone;
    private final java.lang.String nonceId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/FinderFeedLaunchRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/FinderFeedLaunchRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest fromList(java.util.List<? extends java.lang.Object> list) {
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
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest(longValue, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
        }
    }

    public FinderFeedLaunchRequest(long j17, java.lang.String nonceId, boolean z17) {
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.feedId = j17;
        this.nonceId = nonceId;
        this.fromRingtone = z17;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest copy$default(com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest finderFeedLaunchRequest, long j17, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = finderFeedLaunchRequest.feedId;
        }
        if ((i17 & 2) != 0) {
            str = finderFeedLaunchRequest.nonceId;
        }
        if ((i17 & 4) != 0) {
            z17 = finderFeedLaunchRequest.fromRingtone;
        }
        return finderFeedLaunchRequest.copy(j17, str, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFeedId() {
        return this.feedId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNonceId() {
        return this.nonceId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFromRingtone() {
        return this.fromRingtone;
    }

    public final com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest copy(long feedId, java.lang.String nonceId, boolean fromRingtone) {
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        return new com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest(feedId, nonceId, fromRingtone);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest finderFeedLaunchRequest = (com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest) other;
        return this.feedId == finderFeedLaunchRequest.feedId && kotlin.jvm.internal.o.b(this.nonceId, finderFeedLaunchRequest.nonceId) && this.fromRingtone == finderFeedLaunchRequest.fromRingtone;
    }

    public final long getFeedId() {
        return this.feedId;
    }

    public final boolean getFromRingtone() {
        return this.fromRingtone;
    }

    public final java.lang.String getNonceId() {
        return this.nonceId;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.feedId) * 31) + this.nonceId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.fromRingtone);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.feedId), this.nonceId, java.lang.Boolean.valueOf(this.fromRingtone));
    }

    public java.lang.String toString() {
        return "FinderFeedLaunchRequest(feedId=" + this.feedId + ", nonceId=" + this.nonceId + ", fromRingtone=" + this.fromRingtone + ')';
    }
}
