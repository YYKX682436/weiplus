package com.tencent.pigeon.fav_list;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavItemUpdateAction;", "", "action", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FavItemUpdateAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.fav_list.FavItemUpdateAction.Companion INSTANCE = new com.tencent.pigeon.fav_list.FavItemUpdateAction.Companion(null);
    private final java.lang.String action;
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavItemUpdateAction$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/fav_list/FavItemUpdateAction;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.fav_list.FavItemUpdateAction fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.fav_list.FavItemUpdateAction((java.lang.String) obj, (java.lang.String) obj2);
        }
    }

    public FavItemUpdateAction(java.lang.String action, java.lang.String value) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(value, "value");
        this.action = action;
        this.value = value;
    }

    public static /* synthetic */ com.tencent.pigeon.fav_list.FavItemUpdateAction copy$default(com.tencent.pigeon.fav_list.FavItemUpdateAction favItemUpdateAction, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = favItemUpdateAction.action;
        }
        if ((i17 & 2) != 0) {
            str2 = favItemUpdateAction.value;
        }
        return favItemUpdateAction.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public final com.tencent.pigeon.fav_list.FavItemUpdateAction copy(java.lang.String action, java.lang.String value) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(value, "value");
        return new com.tencent.pigeon.fav_list.FavItemUpdateAction(action, value);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.fav_list.FavItemUpdateAction)) {
            return false;
        }
        com.tencent.pigeon.fav_list.FavItemUpdateAction favItemUpdateAction = (com.tencent.pigeon.fav_list.FavItemUpdateAction) other;
        return kotlin.jvm.internal.o.b(this.action, favItemUpdateAction.action) && kotlin.jvm.internal.o.b(this.value, favItemUpdateAction.value);
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + this.value.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.action, this.value);
    }

    public java.lang.String toString() {
        return "FavItemUpdateAction(action=" + this.action + ", value=" + this.value + ')';
    }
}
