package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FinderFeedLaunchRequest;", "", "feedId", "", "nonceId", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "cardType", "(JLjava/lang/String;JJ)V", "getCardType", "()J", "getFeedId", "getNonceId", "()Ljava/lang/String;", "getScene", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FinderFeedLaunchRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest.Companion(null);
    private final long cardType;
    private final long feedId;
    private final java.lang.String nonceId;
    private final long scene;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FinderFeedLaunchRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/FinderFeedLaunchRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            long longValue3;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj2;
            java.lang.Object obj3 = list.get(2);
            if (obj3 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj3).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj3).longValue();
            }
            long j18 = longValue2;
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue3 = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue3 = ((java.lang.Long) obj4).longValue();
            }
            return new com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest(j17, str, j18, longValue3);
        }
    }

    public FinderFeedLaunchRequest(long j17, java.lang.String nonceId, long j18, long j19) {
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.feedId = j17;
        this.nonceId = nonceId;
        this.scene = j18;
        this.cardType = j19;
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
    public final long getScene() {
        return this.scene;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCardType() {
        return this.cardType;
    }

    public final com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest copy(long feedId, java.lang.String nonceId, long scene, long cardType) {
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        return new com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest(feedId, nonceId, scene, cardType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest finderFeedLaunchRequest = (com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest) other;
        return this.feedId == finderFeedLaunchRequest.feedId && kotlin.jvm.internal.o.b(this.nonceId, finderFeedLaunchRequest.nonceId) && this.scene == finderFeedLaunchRequest.scene && this.cardType == finderFeedLaunchRequest.cardType;
    }

    public final long getCardType() {
        return this.cardType;
    }

    public final long getFeedId() {
        return this.feedId;
    }

    public final java.lang.String getNonceId() {
        return this.nonceId;
    }

    public final long getScene() {
        return this.scene;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.feedId) * 31) + this.nonceId.hashCode()) * 31) + java.lang.Long.hashCode(this.scene)) * 31) + java.lang.Long.hashCode(this.cardType);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.feedId), this.nonceId, java.lang.Long.valueOf(this.scene), java.lang.Long.valueOf(this.cardType));
    }

    public java.lang.String toString() {
        return "FinderFeedLaunchRequest(feedId=" + this.feedId + ", nonceId=" + this.nonceId + ", scene=" + this.scene + ", cardType=" + this.cardType + ')';
    }
}
