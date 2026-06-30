package com.tencent.pigeon.show_case;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/show_case/FLTShowCaseActionRequest;", "", "action", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "(Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FLTShowCaseActionRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.show_case.FLTShowCaseActionRequest.Companion INSTANCE = new com.tencent.pigeon.show_case.FLTShowCaseActionRequest.Companion(null);
    private final java.lang.String action;
    private final java.lang.String data;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/show_case/FLTShowCaseActionRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/show_case/FLTShowCaseActionRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.show_case.FLTShowCaseActionRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.show_case.FLTShowCaseActionRequest((java.lang.String) obj, (java.lang.String) list.get(1));
        }
    }

    public FLTShowCaseActionRequest(java.lang.String action, java.lang.String str) {
        kotlin.jvm.internal.o.g(action, "action");
        this.action = action;
        this.data = str;
    }

    public static /* synthetic */ com.tencent.pigeon.show_case.FLTShowCaseActionRequest copy$default(com.tencent.pigeon.show_case.FLTShowCaseActionRequest fLTShowCaseActionRequest, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = fLTShowCaseActionRequest.action;
        }
        if ((i17 & 2) != 0) {
            str2 = fLTShowCaseActionRequest.data;
        }
        return fLTShowCaseActionRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    public final com.tencent.pigeon.show_case.FLTShowCaseActionRequest copy(java.lang.String action, java.lang.String data) {
        kotlin.jvm.internal.o.g(action, "action");
        return new com.tencent.pigeon.show_case.FLTShowCaseActionRequest(action, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.show_case.FLTShowCaseActionRequest)) {
            return false;
        }
        com.tencent.pigeon.show_case.FLTShowCaseActionRequest fLTShowCaseActionRequest = (com.tencent.pigeon.show_case.FLTShowCaseActionRequest) other;
        return kotlin.jvm.internal.o.b(this.action, fLTShowCaseActionRequest.action) && kotlin.jvm.internal.o.b(this.data, fLTShowCaseActionRequest.data);
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        java.lang.String str = this.data;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.action, this.data);
    }

    public java.lang.String toString() {
        return "FLTShowCaseActionRequest(action=" + this.action + ", data=" + this.data + ')';
    }

    public /* synthetic */ FLTShowCaseActionRequest(java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : str2);
    }
}
