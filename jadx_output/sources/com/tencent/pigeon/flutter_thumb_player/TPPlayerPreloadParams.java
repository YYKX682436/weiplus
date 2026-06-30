package com.tencent.pigeon.flutter_thumb_player;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerPreloadParams;", "", "commentScene", "", "mediaProto", "", "(J[B)V", "getCommentScene", "()J", "getMediaProto", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TPPlayerPreloadParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams.Companion INSTANCE = new com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams.Companion(null);
    private final long commentScene;
    private final byte[] mediaProto;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerPreloadParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerPreloadParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams fromList(java.util.List<? extends java.lang.Object> list) {
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
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
            return new com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams(longValue, (byte[]) obj2);
        }
    }

    public TPPlayerPreloadParams(long j17, byte[] mediaProto) {
        kotlin.jvm.internal.o.g(mediaProto, "mediaProto");
        this.commentScene = j17;
        this.mediaProto = mediaProto;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams copy$default(com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams tPPlayerPreloadParams, long j17, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = tPPlayerPreloadParams.commentScene;
        }
        if ((i17 & 2) != 0) {
            bArr = tPPlayerPreloadParams.mediaProto;
        }
        return tPPlayerPreloadParams.copy(j17, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCommentScene() {
        return this.commentScene;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getMediaProto() {
        return this.mediaProto;
    }

    public final com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams copy(long commentScene, byte[] mediaProto) {
        kotlin.jvm.internal.o.g(mediaProto, "mediaProto");
        return new com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams(commentScene, mediaProto);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams)) {
            return false;
        }
        com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams tPPlayerPreloadParams = (com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams) other;
        return this.commentScene == tPPlayerPreloadParams.commentScene && kotlin.jvm.internal.o.b(this.mediaProto, tPPlayerPreloadParams.mediaProto);
    }

    public final long getCommentScene() {
        return this.commentScene;
    }

    public final byte[] getMediaProto() {
        return this.mediaProto;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.commentScene) * 31) + java.util.Arrays.hashCode(this.mediaProto);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.commentScene), this.mediaProto);
    }

    public java.lang.String toString() {
        return "TPPlayerPreloadParams(commentScene=" + this.commentScene + ", mediaProto=" + java.util.Arrays.toString(this.mediaProto) + ')';
    }
}
