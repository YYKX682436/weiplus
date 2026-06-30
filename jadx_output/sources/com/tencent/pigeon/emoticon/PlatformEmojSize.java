package com.tencent.pigeon.emoticon;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/emoticon/PlatformEmojSize;", "", "width", "", "height", "size", "(JJJ)V", "getHeight", "()J", "getSize", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlatformEmojSize {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.emoticon.PlatformEmojSize.Companion INSTANCE = new com.tencent.pigeon.emoticon.PlatformEmojSize.Companion(null);
    private final long height;
    private final long size;
    private final long width;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/emoticon/PlatformEmojSize$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/emoticon/PlatformEmojSize;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.emoticon.PlatformEmojSize fromList(java.util.List<? extends java.lang.Object> list) {
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
            return new com.tencent.pigeon.emoticon.PlatformEmojSize(j17, j18, longValue3);
        }
    }

    public PlatformEmojSize(long j17, long j18, long j19) {
        this.width = j17;
        this.height = j18;
        this.size = j19;
    }

    public static /* synthetic */ com.tencent.pigeon.emoticon.PlatformEmojSize copy$default(com.tencent.pigeon.emoticon.PlatformEmojSize platformEmojSize, long j17, long j18, long j19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = platformEmojSize.width;
        }
        long j27 = j17;
        if ((i17 & 2) != 0) {
            j18 = platformEmojSize.height;
        }
        long j28 = j18;
        if ((i17 & 4) != 0) {
            j19 = platformEmojSize.size;
        }
        return platformEmojSize.copy(j27, j28, j19);
    }

    /* renamed from: component1, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final com.tencent.pigeon.emoticon.PlatformEmojSize copy(long width, long height, long size) {
        return new com.tencent.pigeon.emoticon.PlatformEmojSize(width, height, size);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.emoticon.PlatformEmojSize)) {
            return false;
        }
        com.tencent.pigeon.emoticon.PlatformEmojSize platformEmojSize = (com.tencent.pigeon.emoticon.PlatformEmojSize) other;
        return this.width == platformEmojSize.width && this.height == platformEmojSize.height && this.size == platformEmojSize.size;
    }

    public final long getHeight() {
        return this.height;
    }

    public final long getSize() {
        return this.size;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.width) * 31) + java.lang.Long.hashCode(this.height)) * 31) + java.lang.Long.hashCode(this.size);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.width), java.lang.Long.valueOf(this.height), java.lang.Long.valueOf(this.size));
    }

    public java.lang.String toString() {
        return "PlatformEmojSize(width=" + this.width + ", height=" + this.height + ", size=" + this.size + ')';
    }
}
