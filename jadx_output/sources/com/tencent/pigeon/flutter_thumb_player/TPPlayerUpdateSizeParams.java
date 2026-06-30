package com.tencent.pigeon.flutter_thumb_player;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerUpdateSizeParams;", "", "playerId", "", "width", "height", "x", "y", "(JJJJJ)V", "getHeight", "()J", "getPlayerId", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TPPlayerUpdateSizeParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams.Companion INSTANCE = new com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams.Companion(null);
    private final long height;
    private final long playerId;
    private final long width;
    private final long x;
    private final long y;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerUpdateSizeParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_thumb_player/TPPlayerUpdateSizeParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            long longValue3;
            long longValue4;
            long longValue5;
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
            if (obj3 instanceof java.lang.Integer) {
                longValue3 = ((java.lang.Number) obj3).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue3 = ((java.lang.Long) obj3).longValue();
            }
            long j19 = longValue3;
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue4 = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue4 = ((java.lang.Long) obj4).longValue();
            }
            long j27 = longValue4;
            java.lang.Object obj5 = list.get(4);
            if (obj5 instanceof java.lang.Integer) {
                longValue5 = ((java.lang.Number) obj5).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                longValue5 = ((java.lang.Long) obj5).longValue();
            }
            return new com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams(j17, j18, j19, j27, longValue5);
        }
    }

    public TPPlayerUpdateSizeParams(long j17, long j18, long j19, long j27, long j28) {
        this.playerId = j17;
        this.width = j18;
        this.height = j19;
        this.x = j27;
        this.y = j28;
    }

    /* renamed from: component1, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final long getX() {
        return this.x;
    }

    /* renamed from: component5, reason: from getter */
    public final long getY() {
        return this.y;
    }

    public final com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams copy(long playerId, long width, long height, long x17, long y17) {
        return new com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams(playerId, width, height, x17, y17);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams)) {
            return false;
        }
        com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams tPPlayerUpdateSizeParams = (com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams) other;
        return this.playerId == tPPlayerUpdateSizeParams.playerId && this.width == tPPlayerUpdateSizeParams.width && this.height == tPPlayerUpdateSizeParams.height && this.x == tPPlayerUpdateSizeParams.x && this.y == tPPlayerUpdateSizeParams.y;
    }

    public final long getHeight() {
        return this.height;
    }

    public final long getPlayerId() {
        return this.playerId;
    }

    public final long getWidth() {
        return this.width;
    }

    public final long getX() {
        return this.x;
    }

    public final long getY() {
        return this.y;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.playerId) * 31) + java.lang.Long.hashCode(this.width)) * 31) + java.lang.Long.hashCode(this.height)) * 31) + java.lang.Long.hashCode(this.x)) * 31) + java.lang.Long.hashCode(this.y);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.playerId), java.lang.Long.valueOf(this.width), java.lang.Long.valueOf(this.height), java.lang.Long.valueOf(this.x), java.lang.Long.valueOf(this.y));
    }

    public java.lang.String toString() {
        return "TPPlayerUpdateSizeParams(playerId=" + this.playerId + ", width=" + this.width + ", height=" + this.height + ", x=" + this.x + ", y=" + this.y + ')';
    }
}
