package com.tencent.pigeon.live_multiplatform;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductResult;", "", "action", "Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductAction;", "selectedProductsData", "", "Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductItem;", "(Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductAction;Ljava/util/List;)V", "getAction", "()Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductAction;", "getSelectedProductsData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SelectPendingProductResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_multiplatform.SelectPendingProductResult.Companion INSTANCE = new com.tencent.pigeon.live_multiplatform.SelectPendingProductResult.Companion(null);
    private final com.tencent.pigeon.live_multiplatform.SelectPendingProductAction action;
    private final java.util.List<com.tencent.pigeon.live_multiplatform.SelectPendingProductItem> selectedProductsData;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_multiplatform/SelectPendingProductResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_multiplatform.SelectPendingProductResult fromList(java.util.List<? extends java.lang.Object> list) {
            com.tencent.pigeon.live_multiplatform.SelectPendingProductAction selectPendingProductAction;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Integer num = (java.lang.Integer) list.get(0);
            if (num != null) {
                selectPendingProductAction = com.tencent.pigeon.live_multiplatform.SelectPendingProductAction.INSTANCE.ofRaw(num.intValue());
            } else {
                selectPendingProductAction = null;
            }
            java.lang.Object obj = list.get(1);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.live_multiplatform.SelectPendingProductItem?>");
            return new com.tencent.pigeon.live_multiplatform.SelectPendingProductResult(selectPendingProductAction, (java.util.List) obj);
        }
    }

    public SelectPendingProductResult(com.tencent.pigeon.live_multiplatform.SelectPendingProductAction selectPendingProductAction, java.util.List<com.tencent.pigeon.live_multiplatform.SelectPendingProductItem> selectedProductsData) {
        kotlin.jvm.internal.o.g(selectedProductsData, "selectedProductsData");
        this.action = selectPendingProductAction;
        this.selectedProductsData = selectedProductsData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.live_multiplatform.SelectPendingProductResult copy$default(com.tencent.pigeon.live_multiplatform.SelectPendingProductResult selectPendingProductResult, com.tencent.pigeon.live_multiplatform.SelectPendingProductAction selectPendingProductAction, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            selectPendingProductAction = selectPendingProductResult.action;
        }
        if ((i17 & 2) != 0) {
            list = selectPendingProductResult.selectedProductsData;
        }
        return selectPendingProductResult.copy(selectPendingProductAction, list);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.live_multiplatform.SelectPendingProductAction getAction() {
        return this.action;
    }

    public final java.util.List<com.tencent.pigeon.live_multiplatform.SelectPendingProductItem> component2() {
        return this.selectedProductsData;
    }

    public final com.tencent.pigeon.live_multiplatform.SelectPendingProductResult copy(com.tencent.pigeon.live_multiplatform.SelectPendingProductAction action, java.util.List<com.tencent.pigeon.live_multiplatform.SelectPendingProductItem> selectedProductsData) {
        kotlin.jvm.internal.o.g(selectedProductsData, "selectedProductsData");
        return new com.tencent.pigeon.live_multiplatform.SelectPendingProductResult(action, selectedProductsData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_multiplatform.SelectPendingProductResult)) {
            return false;
        }
        com.tencent.pigeon.live_multiplatform.SelectPendingProductResult selectPendingProductResult = (com.tencent.pigeon.live_multiplatform.SelectPendingProductResult) other;
        return this.action == selectPendingProductResult.action && kotlin.jvm.internal.o.b(this.selectedProductsData, selectPendingProductResult.selectedProductsData);
    }

    public final com.tencent.pigeon.live_multiplatform.SelectPendingProductAction getAction() {
        return this.action;
    }

    public final java.util.List<com.tencent.pigeon.live_multiplatform.SelectPendingProductItem> getSelectedProductsData() {
        return this.selectedProductsData;
    }

    public int hashCode() {
        com.tencent.pigeon.live_multiplatform.SelectPendingProductAction selectPendingProductAction = this.action;
        return ((selectPendingProductAction == null ? 0 : selectPendingProductAction.hashCode()) * 31) + this.selectedProductsData.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.pigeon.live_multiplatform.SelectPendingProductAction selectPendingProductAction = this.action;
        objArr[0] = selectPendingProductAction != null ? java.lang.Integer.valueOf(selectPendingProductAction.getRaw()) : null;
        objArr[1] = this.selectedProductsData;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "SelectPendingProductResult(action=" + this.action + ", selectedProductsData=" + this.selectedProductsData + ')';
    }

    public /* synthetic */ SelectPendingProductResult(com.tencent.pigeon.live_multiplatform.SelectPendingProductAction selectPendingProductAction, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : selectPendingProductAction, list);
    }
}
