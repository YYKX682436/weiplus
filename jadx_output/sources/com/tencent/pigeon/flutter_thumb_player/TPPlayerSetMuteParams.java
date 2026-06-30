package com.tencent.pigeon.flutter_thumb_player;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMuteParams;", "", "playerId", "", "mute", "", "(JZ)V", "getMute", "()Z", "getPlayerId", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TPPlayerSetMuteParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams.Companion INSTANCE = new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams.Companion(null);
    private final boolean mute;
    private final long playerId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMuteParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMuteParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams fromList(java.util.List<? extends java.lang.Object> list) {
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
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams(longValue, ((java.lang.Boolean) obj2).booleanValue());
        }
    }

    public TPPlayerSetMuteParams(long j17, boolean z17) {
        this.playerId = j17;
        this.mute = z17;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams copy$default(com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams tPPlayerSetMuteParams, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = tPPlayerSetMuteParams.playerId;
        }
        if ((i17 & 2) != 0) {
            z17 = tPPlayerSetMuteParams.mute;
        }
        return tPPlayerSetMuteParams.copy(j17, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMute() {
        return this.mute;
    }

    public final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams copy(long playerId, boolean mute) {
        return new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams(playerId, mute);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams)) {
            return false;
        }
        com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams tPPlayerSetMuteParams = (com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams) other;
        return this.playerId == tPPlayerSetMuteParams.playerId && this.mute == tPPlayerSetMuteParams.mute;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final long getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.playerId) * 31) + java.lang.Boolean.hashCode(this.mute);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.playerId), java.lang.Boolean.valueOf(this.mute));
    }

    public java.lang.String toString() {
        return "TPPlayerSetMuteParams(playerId=" + this.playerId + ", mute=" + this.mute + ')';
    }
}
