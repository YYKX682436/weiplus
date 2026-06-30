package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006 "}, d2 = {"Lcom/tencent/pigeon/flutter_voip/FLTextureInfo;", "", "textureId", "", "width", "height", "quarterTurns", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIRROR, "", "(JJJJZ)V", "getHeight", "()J", "getMirror", "()Z", "getQuarterTurns", "getTextureId", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FLTextureInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.FLTextureInfo.Companion INSTANCE = new com.tencent.pigeon.flutter_voip.FLTextureInfo.Companion(null);
    private final long height;
    private final boolean mirror;
    private final long quarterTurns;
    private final long textureId;
    private final long width;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/FLTextureInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/FLTextureInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip.FLTextureInfo fromList(java.util.List<? extends java.lang.Object> list) {
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
            java.lang.Object obj5 = list.get(4);
            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.flutter_voip.FLTextureInfo(j17, j18, j19, longValue4, ((java.lang.Boolean) obj5).booleanValue());
        }
    }

    public FLTextureInfo(long j17, long j18, long j19, long j27, boolean z17) {
        this.textureId = j17;
        this.width = j18;
        this.height = j19;
        this.quarterTurns = j27;
        this.mirror = z17;
    }

    /* renamed from: component1, reason: from getter */
    public final long getTextureId() {
        return this.textureId;
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
    public final long getQuarterTurns() {
        return this.quarterTurns;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getMirror() {
        return this.mirror;
    }

    public final com.tencent.pigeon.flutter_voip.FLTextureInfo copy(long textureId, long width, long height, long quarterTurns, boolean mirror) {
        return new com.tencent.pigeon.flutter_voip.FLTextureInfo(textureId, width, height, quarterTurns, mirror);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip.FLTextureInfo)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip.FLTextureInfo fLTextureInfo = (com.tencent.pigeon.flutter_voip.FLTextureInfo) other;
        return this.textureId == fLTextureInfo.textureId && this.width == fLTextureInfo.width && this.height == fLTextureInfo.height && this.quarterTurns == fLTextureInfo.quarterTurns && this.mirror == fLTextureInfo.mirror;
    }

    public final long getHeight() {
        return this.height;
    }

    public final boolean getMirror() {
        return this.mirror;
    }

    public final long getQuarterTurns() {
        return this.quarterTurns;
    }

    public final long getTextureId() {
        return this.textureId;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.textureId) * 31) + java.lang.Long.hashCode(this.width)) * 31) + java.lang.Long.hashCode(this.height)) * 31) + java.lang.Long.hashCode(this.quarterTurns)) * 31) + java.lang.Boolean.hashCode(this.mirror);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.textureId), java.lang.Long.valueOf(this.width), java.lang.Long.valueOf(this.height), java.lang.Long.valueOf(this.quarterTurns), java.lang.Boolean.valueOf(this.mirror));
    }

    public java.lang.String toString() {
        return "FLTextureInfo(textureId=" + this.textureId + ", width=" + this.width + ", height=" + this.height + ", quarterTurns=" + this.quarterTurns + ", mirror=" + this.mirror + ')';
    }
}
