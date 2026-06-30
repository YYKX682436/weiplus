package com.tencent.pigeon.flutter_thumb_player;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetStreamTypeParams;", "", "playerId", "", "streamType", "(JJ)V", "getPlayerId", "()J", "getStreamType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TPPlayerSetStreamTypeParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams.Companion INSTANCE = new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams.Companion(null);
    private final long playerId;
    private final long streamType;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetStreamTypeParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetStreamTypeParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams fromList(java.util.List<? extends java.lang.Object> list) {
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
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            return new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams(longValue, longValue2);
        }
    }

    public TPPlayerSetStreamTypeParams(long j17, long j18) {
        this.playerId = j17;
        this.streamType = j18;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams copy$default(com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams tPPlayerSetStreamTypeParams, long j17, long j18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = tPPlayerSetStreamTypeParams.playerId;
        }
        if ((i17 & 2) != 0) {
            j18 = tPPlayerSetStreamTypeParams.streamType;
        }
        return tPPlayerSetStreamTypeParams.copy(j17, j18);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStreamType() {
        return this.streamType;
    }

    public final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams copy(long playerId, long streamType) {
        return new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams(playerId, streamType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams)) {
            return false;
        }
        com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams tPPlayerSetStreamTypeParams = (com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams) other;
        return this.playerId == tPPlayerSetStreamTypeParams.playerId && this.streamType == tPPlayerSetStreamTypeParams.streamType;
    }

    public final long getPlayerId() {
        return this.playerId;
    }

    public final long getStreamType() {
        return this.streamType;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.playerId) * 31) + java.lang.Long.hashCode(this.streamType);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.playerId), java.lang.Long.valueOf(this.streamType));
    }

    public java.lang.String toString() {
        return "TPPlayerSetStreamTypeParams(playerId=" + this.playerId + ", streamType=" + this.streamType + ')';
    }
}
