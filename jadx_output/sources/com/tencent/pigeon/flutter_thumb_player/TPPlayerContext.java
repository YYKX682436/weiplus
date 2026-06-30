package com.tencent.pigeon.flutter_thumb_player;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fJ\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006#"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerContext;", "", "textureId", "", "prepared", "", "firstFrameRendered", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, "videHeight", "videoDuration", "(JZZJJJ)V", "getFirstFrameRendered", "()Z", "getPrepared", "getTextureId", "()J", "getVideHeight", "getVideoDuration", "getVideoWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TPPlayerContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_thumb_player.TPPlayerContext.Companion INSTANCE = new com.tencent.pigeon.flutter_thumb_player.TPPlayerContext.Companion(null);
    private final boolean firstFrameRendered;
    private final boolean prepared;
    private final long textureId;
    private final long videHeight;
    private final long videoDuration;
    private final long videoWidth;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerContext$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerContext;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_thumb_player.TPPlayerContext fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            long longValue3;
            long longValue4;
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
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj4).longValue();
            }
            long j18 = longValue2;
            java.lang.Object obj5 = list.get(4);
            if (obj5 instanceof java.lang.Integer) {
                longValue3 = ((java.lang.Number) obj5).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                longValue3 = ((java.lang.Long) obj5).longValue();
            }
            long j19 = longValue3;
            java.lang.Object obj6 = list.get(5);
            if (obj6 instanceof java.lang.Integer) {
                longValue4 = ((java.lang.Number) obj6).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Long");
                longValue4 = ((java.lang.Long) obj6).longValue();
            }
            return new com.tencent.pigeon.flutter_thumb_player.TPPlayerContext(j17, booleanValue, booleanValue2, j18, j19, longValue4);
        }
    }

    public TPPlayerContext(long j17, boolean z17, boolean z18, long j18, long j19, long j27) {
        this.textureId = j17;
        this.prepared = z17;
        this.firstFrameRendered = z18;
        this.videoWidth = j18;
        this.videHeight = j19;
        this.videoDuration = j27;
    }

    /* renamed from: component1, reason: from getter */
    public final long getTextureId() {
        return this.textureId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPrepared() {
        return this.prepared;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFirstFrameRendered() {
        return this.firstFrameRendered;
    }

    /* renamed from: component4, reason: from getter */
    public final long getVideoWidth() {
        return this.videoWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final long getVideHeight() {
        return this.videHeight;
    }

    /* renamed from: component6, reason: from getter */
    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final com.tencent.pigeon.flutter_thumb_player.TPPlayerContext copy(long textureId, boolean prepared, boolean firstFrameRendered, long videoWidth, long videHeight, long videoDuration) {
        return new com.tencent.pigeon.flutter_thumb_player.TPPlayerContext(textureId, prepared, firstFrameRendered, videoWidth, videHeight, videoDuration);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerContext)) {
            return false;
        }
        com.tencent.pigeon.flutter_thumb_player.TPPlayerContext tPPlayerContext = (com.tencent.pigeon.flutter_thumb_player.TPPlayerContext) other;
        return this.textureId == tPPlayerContext.textureId && this.prepared == tPPlayerContext.prepared && this.firstFrameRendered == tPPlayerContext.firstFrameRendered && this.videoWidth == tPPlayerContext.videoWidth && this.videHeight == tPPlayerContext.videHeight && this.videoDuration == tPPlayerContext.videoDuration;
    }

    public final boolean getFirstFrameRendered() {
        return this.firstFrameRendered;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final long getTextureId() {
        return this.textureId;
    }

    public final long getVideHeight() {
        return this.videHeight;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final long getVideoWidth() {
        return this.videoWidth;
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.textureId) * 31) + java.lang.Boolean.hashCode(this.prepared)) * 31) + java.lang.Boolean.hashCode(this.firstFrameRendered)) * 31) + java.lang.Long.hashCode(this.videoWidth)) * 31) + java.lang.Long.hashCode(this.videHeight)) * 31) + java.lang.Long.hashCode(this.videoDuration);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.textureId), java.lang.Boolean.valueOf(this.prepared), java.lang.Boolean.valueOf(this.firstFrameRendered), java.lang.Long.valueOf(this.videoWidth), java.lang.Long.valueOf(this.videHeight), java.lang.Long.valueOf(this.videoDuration));
    }

    public java.lang.String toString() {
        return "TPPlayerContext(textureId=" + this.textureId + ", prepared=" + this.prepared + ", firstFrameRendered=" + this.firstFrameRendered + ", videoWidth=" + this.videoWidth + ", videHeight=" + this.videHeight + ", videoDuration=" + this.videoDuration + ')';
    }
}
