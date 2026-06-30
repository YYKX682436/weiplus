package com.tencent.pigeon.live_multiplatform;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductItem;", "", "productId", "", "imgUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getImgUrl", "()Ljava/lang/String;", "getProductId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SelectPendingProductItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_multiplatform.SelectPendingProductItem.Companion INSTANCE = new com.tencent.pigeon.live_multiplatform.SelectPendingProductItem.Companion(null);
    private final java.lang.String imgUrl;
    private final java.lang.String productId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductItem$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductItem;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_multiplatform.SelectPendingProductItem fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.live_multiplatform.SelectPendingProductItem((java.lang.String) list.get(0), (java.lang.String) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectPendingProductItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.live_multiplatform.SelectPendingProductItem copy$default(com.tencent.pigeon.live_multiplatform.SelectPendingProductItem selectPendingProductItem, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = selectPendingProductItem.productId;
        }
        if ((i17 & 2) != 0) {
            str2 = selectPendingProductItem.imgUrl;
        }
        return selectPendingProductItem.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getImgUrl() {
        return this.imgUrl;
    }

    public final com.tencent.pigeon.live_multiplatform.SelectPendingProductItem copy(java.lang.String productId, java.lang.String imgUrl) {
        return new com.tencent.pigeon.live_multiplatform.SelectPendingProductItem(productId, imgUrl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_multiplatform.SelectPendingProductItem)) {
            return false;
        }
        com.tencent.pigeon.live_multiplatform.SelectPendingProductItem selectPendingProductItem = (com.tencent.pigeon.live_multiplatform.SelectPendingProductItem) other;
        return kotlin.jvm.internal.o.b(this.productId, selectPendingProductItem.productId) && kotlin.jvm.internal.o.b(this.imgUrl, selectPendingProductItem.imgUrl);
    }

    public final java.lang.String getImgUrl() {
        return this.imgUrl;
    }

    public final java.lang.String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        java.lang.String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.imgUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.productId, this.imgUrl);
    }

    public java.lang.String toString() {
        return "SelectPendingProductItem(productId=" + this.productId + ", imgUrl=" + this.imgUrl + ')';
    }

    public SelectPendingProductItem(java.lang.String str, java.lang.String str2) {
        this.productId = str;
        this.imgUrl = str2;
    }

    public /* synthetic */ SelectPendingProductItem(java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2);
    }
}
