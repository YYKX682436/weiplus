package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveForwardServiceImageObject;", "", "buff", "", "width", "", "height", "([BLjava/lang/Double;Ljava/lang/Double;)V", "getBuff", "()[B", "getHeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getWidth", "component1", "component2", "component3", "copy", "([BLjava/lang/Double;Ljava/lang/Double;)Lcom/tencent/pigeon/live_common/LiveForwardServiceImageObject;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LiveForwardServiceImageObject {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveForwardServiceImageObject.Companion INSTANCE = new com.tencent.pigeon.live_common.LiveForwardServiceImageObject.Companion(null);
    private final byte[] buff;
    private final java.lang.Double height;
    private final java.lang.Double width;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveForwardServiceImageObject$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveForwardServiceImageObject;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_common.LiveForwardServiceImageObject fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.live_common.LiveForwardServiceImageObject((byte[]) list.get(0), (java.lang.Double) list.get(1), (java.lang.Double) list.get(2));
        }
    }

    public LiveForwardServiceImageObject() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.live_common.LiveForwardServiceImageObject copy$default(com.tencent.pigeon.live_common.LiveForwardServiceImageObject liveForwardServiceImageObject, byte[] bArr, java.lang.Double d17, java.lang.Double d18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = liveForwardServiceImageObject.buff;
        }
        if ((i17 & 2) != 0) {
            d17 = liveForwardServiceImageObject.width;
        }
        if ((i17 & 4) != 0) {
            d18 = liveForwardServiceImageObject.height;
        }
        return liveForwardServiceImageObject.copy(bArr, d17, d18);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getBuff() {
        return this.buff;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Double getHeight() {
        return this.height;
    }

    public final com.tencent.pigeon.live_common.LiveForwardServiceImageObject copy(byte[] buff, java.lang.Double width, java.lang.Double height) {
        return new com.tencent.pigeon.live_common.LiveForwardServiceImageObject(buff, width, height);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_common.LiveForwardServiceImageObject)) {
            return false;
        }
        com.tencent.pigeon.live_common.LiveForwardServiceImageObject liveForwardServiceImageObject = (com.tencent.pigeon.live_common.LiveForwardServiceImageObject) other;
        return kotlin.jvm.internal.o.b(this.buff, liveForwardServiceImageObject.buff) && kotlin.jvm.internal.o.b(this.width, liveForwardServiceImageObject.width) && kotlin.jvm.internal.o.b(this.height, liveForwardServiceImageObject.height);
    }

    public final byte[] getBuff() {
        return this.buff;
    }

    public final java.lang.Double getHeight() {
        return this.height;
    }

    public final java.lang.Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        byte[] bArr = this.buff;
        int hashCode = (bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31;
        java.lang.Double d17 = this.width;
        int hashCode2 = (hashCode + (d17 == null ? 0 : d17.hashCode())) * 31;
        java.lang.Double d18 = this.height;
        return hashCode2 + (d18 != null ? d18.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.buff, this.width, this.height);
    }

    public java.lang.String toString() {
        return "LiveForwardServiceImageObject(buff=" + java.util.Arrays.toString(this.buff) + ", width=" + this.width + ", height=" + this.height + ')';
    }

    public LiveForwardServiceImageObject(byte[] bArr, java.lang.Double d17, java.lang.Double d18) {
        this.buff = bArr;
        this.width = d17;
        this.height = d18;
    }

    public /* synthetic */ LiveForwardServiceImageObject(byte[] bArr, java.lang.Double d17, java.lang.Double d18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : bArr, (i17 & 2) != 0 ? null : d17, (i17 & 4) != 0 ? null : d18);
    }
}
