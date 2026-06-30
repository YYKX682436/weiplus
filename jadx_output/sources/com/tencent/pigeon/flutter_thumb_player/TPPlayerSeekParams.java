package com.tencent.pigeon.flutter_thumb_player;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSeekParams;", "", "playerId", "", "timeMs", "isManualSeek", "", "(JJZ)V", "()Z", "getPlayerId", "()J", "getTimeMs", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TPPlayerSeekParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams.Companion INSTANCE = new com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams.Companion(null);
    private final boolean isManualSeek;
    private final long playerId;
    private final long timeMs;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSeekParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSeekParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
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
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams(j17, longValue2, ((java.lang.Boolean) obj3).booleanValue());
        }
    }

    public TPPlayerSeekParams(long j17, long j18, boolean z17) {
        this.playerId = j17;
        this.timeMs = j18;
        this.isManualSeek = z17;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams copy$default(com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams tPPlayerSeekParams, long j17, long j18, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = tPPlayerSeekParams.playerId;
        }
        long j19 = j17;
        if ((i17 & 2) != 0) {
            j18 = tPPlayerSeekParams.timeMs;
        }
        long j27 = j18;
        if ((i17 & 4) != 0) {
            z17 = tPPlayerSeekParams.isManualSeek;
        }
        return tPPlayerSeekParams.copy(j19, j27, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsManualSeek() {
        return this.isManualSeek;
    }

    public final com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams copy(long playerId, long timeMs, boolean isManualSeek) {
        return new com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams(playerId, timeMs, isManualSeek);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams)) {
            return false;
        }
        com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams tPPlayerSeekParams = (com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams) other;
        return this.playerId == tPPlayerSeekParams.playerId && this.timeMs == tPPlayerSeekParams.timeMs && this.isManualSeek == tPPlayerSeekParams.isManualSeek;
    }

    public final long getPlayerId() {
        return this.playerId;
    }

    public final long getTimeMs() {
        return this.timeMs;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.playerId) * 31) + java.lang.Long.hashCode(this.timeMs)) * 31) + java.lang.Boolean.hashCode(this.isManualSeek);
    }

    public final boolean isManualSeek() {
        return this.isManualSeek;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.playerId), java.lang.Long.valueOf(this.timeMs), java.lang.Boolean.valueOf(this.isManualSeek));
    }

    public java.lang.String toString() {
        return "TPPlayerSeekParams(playerId=" + this.playerId + ", timeMs=" + this.timeMs + ", isManualSeek=" + this.isManualSeek + ')';
    }
}
