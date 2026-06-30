package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizRect;", "", "left", "", "top", "right", "bottom", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getBottom", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/tencent/pigeon/biz_base/BizRect;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizRect {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.BizRect.Companion INSTANCE = new com.tencent.pigeon.biz_base.BizRect.Companion(null);
    private final java.lang.Double bottom;
    private final java.lang.Double left;
    private final java.lang.Double right;
    private final java.lang.Double top;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizRect$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/BizRect;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.BizRect fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.biz_base.BizRect((java.lang.Double) list.get(0), (java.lang.Double) list.get(1), (java.lang.Double) list.get(2), (java.lang.Double) list.get(3));
        }
    }

    public BizRect() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.BizRect copy$default(com.tencent.pigeon.biz_base.BizRect bizRect, java.lang.Double d17, java.lang.Double d18, java.lang.Double d19, java.lang.Double d27, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            d17 = bizRect.left;
        }
        if ((i17 & 2) != 0) {
            d18 = bizRect.top;
        }
        if ((i17 & 4) != 0) {
            d19 = bizRect.right;
        }
        if ((i17 & 8) != 0) {
            d27 = bizRect.bottom;
        }
        return bizRect.copy(d17, d18, d19, d27);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Double getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Double getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Double getBottom() {
        return this.bottom;
    }

    public final com.tencent.pigeon.biz_base.BizRect copy(java.lang.Double left, java.lang.Double top, java.lang.Double right, java.lang.Double bottom) {
        return new com.tencent.pigeon.biz_base.BizRect(left, top, right, bottom);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.BizRect)) {
            return false;
        }
        com.tencent.pigeon.biz_base.BizRect bizRect = (com.tencent.pigeon.biz_base.BizRect) other;
        return kotlin.jvm.internal.o.b(this.left, bizRect.left) && kotlin.jvm.internal.o.b(this.top, bizRect.top) && kotlin.jvm.internal.o.b(this.right, bizRect.right) && kotlin.jvm.internal.o.b(this.bottom, bizRect.bottom);
    }

    public final java.lang.Double getBottom() {
        return this.bottom;
    }

    public final java.lang.Double getLeft() {
        return this.left;
    }

    public final java.lang.Double getRight() {
        return this.right;
    }

    public final java.lang.Double getTop() {
        return this.top;
    }

    public int hashCode() {
        java.lang.Double d17 = this.left;
        int hashCode = (d17 == null ? 0 : d17.hashCode()) * 31;
        java.lang.Double d18 = this.top;
        int hashCode2 = (hashCode + (d18 == null ? 0 : d18.hashCode())) * 31;
        java.lang.Double d19 = this.right;
        int hashCode3 = (hashCode2 + (d19 == null ? 0 : d19.hashCode())) * 31;
        java.lang.Double d27 = this.bottom;
        return hashCode3 + (d27 != null ? d27.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.left, this.top, this.right, this.bottom);
    }

    public java.lang.String toString() {
        return "BizRect(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }

    public BizRect(java.lang.Double d17, java.lang.Double d18, java.lang.Double d19, java.lang.Double d27) {
        this.left = d17;
        this.top = d18;
        this.right = d19;
        this.bottom = d27;
    }

    public /* synthetic */ BizRect(java.lang.Double d17, java.lang.Double d18, java.lang.Double d19, java.lang.Double d27, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : d17, (i17 & 2) != 0 ? null : d18, (i17 & 4) != 0 ? null : d19, (i17 & 8) != 0 ? null : d27);
    }
}
