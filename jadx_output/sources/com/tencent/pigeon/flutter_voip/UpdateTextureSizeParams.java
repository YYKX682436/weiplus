package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/UpdateTextureSizeParams;", "", "textureId", "", "width", "height", "(JJJ)V", "getHeight", "()J", "getTextureId", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateTextureSizeParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams.Companion INSTANCE = new com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams.Companion(null);
    private final long height;
    private final long textureId;
    private final long width;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/UpdateTextureSizeParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/UpdateTextureSizeParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams fromList(java.util.List<? extends java.lang.Object> list) {
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
            if (obj3 instanceof java.lang.Integer) {
                longValue3 = ((java.lang.Number) obj3).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue3 = ((java.lang.Long) obj3).longValue();
            }
            return new com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams(j17, j18, longValue3);
        }
    }

    public UpdateTextureSizeParams(long j17, long j18, long j19) {
        this.textureId = j17;
        this.width = j18;
        this.height = j19;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams copy$default(com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams updateTextureSizeParams, long j17, long j18, long j19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = updateTextureSizeParams.textureId;
        }
        long j27 = j17;
        if ((i17 & 2) != 0) {
            j18 = updateTextureSizeParams.width;
        }
        long j28 = j18;
        if ((i17 & 4) != 0) {
            j19 = updateTextureSizeParams.height;
        }
        return updateTextureSizeParams.copy(j27, j28, j19);
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

    public final com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams copy(long textureId, long width, long height) {
        return new com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams(textureId, width, height);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams updateTextureSizeParams = (com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams) other;
        return this.textureId == updateTextureSizeParams.textureId && this.width == updateTextureSizeParams.width && this.height == updateTextureSizeParams.height;
    }

    public final long getHeight() {
        return this.height;
    }

    public final long getTextureId() {
        return this.textureId;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.textureId) * 31) + java.lang.Long.hashCode(this.width)) * 31) + java.lang.Long.hashCode(this.height);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.textureId), java.lang.Long.valueOf(this.width), java.lang.Long.valueOf(this.height));
    }

    public java.lang.String toString() {
        return "UpdateTextureSizeParams(textureId=" + this.textureId + ", width=" + this.width + ", height=" + this.height + ')';
    }
}
