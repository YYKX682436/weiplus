package com.tencent.pigeon.flutter_thumb_player;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMediaProtoParams;", "", "playerId", "", "mediaType", "mediaProto", "", "startPlayPosition", "(JJ[BJ)V", "getMediaProto", "()[B", "getMediaType", "()J", "getPlayerId", "getStartPlayPosition", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TPPlayerSetMediaProtoParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams.Companion INSTANCE = new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams.Companion(null);
    private final byte[] mediaProto;
    private final long mediaType;
    private final long playerId;
    private final long startPlayPosition;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMediaProtoParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerSetMediaProtoParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams fromList(java.util.List<? extends java.lang.Object> list) {
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
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            long j18 = longValue2;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj3;
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue3 = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue3 = ((java.lang.Long) obj4).longValue();
            }
            return new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams(j17, j18, bArr, longValue3);
        }
    }

    public TPPlayerSetMediaProtoParams(long j17, long j18, byte[] mediaProto, long j19) {
        kotlin.jvm.internal.o.g(mediaProto, "mediaProto");
        this.playerId = j17;
        this.mediaType = j18;
        this.mediaProto = mediaProto;
        this.startPlayPosition = j19;
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMediaType() {
        return this.mediaType;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getMediaProto() {
        return this.mediaProto;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartPlayPosition() {
        return this.startPlayPosition;
    }

    public final com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams copy(long playerId, long mediaType, byte[] mediaProto, long startPlayPosition) {
        kotlin.jvm.internal.o.g(mediaProto, "mediaProto");
        return new com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams(playerId, mediaType, mediaProto, startPlayPosition);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams)) {
            return false;
        }
        com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams tPPlayerSetMediaProtoParams = (com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams) other;
        return this.playerId == tPPlayerSetMediaProtoParams.playerId && this.mediaType == tPPlayerSetMediaProtoParams.mediaType && kotlin.jvm.internal.o.b(this.mediaProto, tPPlayerSetMediaProtoParams.mediaProto) && this.startPlayPosition == tPPlayerSetMediaProtoParams.startPlayPosition;
    }

    public final byte[] getMediaProto() {
        return this.mediaProto;
    }

    public final long getMediaType() {
        return this.mediaType;
    }

    public final long getPlayerId() {
        return this.playerId;
    }

    public final long getStartPlayPosition() {
        return this.startPlayPosition;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.playerId) * 31) + java.lang.Long.hashCode(this.mediaType)) * 31) + java.util.Arrays.hashCode(this.mediaProto)) * 31) + java.lang.Long.hashCode(this.startPlayPosition);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.playerId), java.lang.Long.valueOf(this.mediaType), this.mediaProto, java.lang.Long.valueOf(this.startPlayPosition));
    }

    public java.lang.String toString() {
        return "TPPlayerSetMediaProtoParams(playerId=" + this.playerId + ", mediaType=" + this.mediaType + ", mediaProto=" + java.util.Arrays.toString(this.mediaProto) + ", startPlayPosition=" + this.startPlayPosition + ')';
    }
}
