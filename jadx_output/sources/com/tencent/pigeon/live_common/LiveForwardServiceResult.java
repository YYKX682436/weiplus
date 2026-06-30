package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveForwardServiceResult;", "", "code", "Lcom/tencent/pigeon/live_common/LiveForwardResultCode;", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "", "toUsernames", "", "(Lcom/tencent/pigeon/live_common/LiveForwardResultCode;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Lcom/tencent/pigeon/live_common/LiveForwardResultCode;", "getMessage", "()Ljava/lang/String;", "getToUsernames", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LiveForwardServiceResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveForwardServiceResult.Companion INSTANCE = new com.tencent.pigeon.live_common.LiveForwardServiceResult.Companion(null);
    private final com.tencent.pigeon.live_common.LiveForwardResultCode code;
    private final java.lang.String message;
    private final java.util.List<java.lang.String> toUsernames;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveForwardServiceResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveForwardServiceResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_common.LiveForwardServiceResult fromList(java.util.List<? extends java.lang.Object> list) {
            com.tencent.pigeon.live_common.LiveForwardResultCode liveForwardResultCode;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Integer num = (java.lang.Integer) list.get(0);
            if (num != null) {
                liveForwardResultCode = com.tencent.pigeon.live_common.LiveForwardResultCode.INSTANCE.ofRaw(num.intValue());
            } else {
                liveForwardResultCode = null;
            }
            return new com.tencent.pigeon.live_common.LiveForwardServiceResult(liveForwardResultCode, (java.lang.String) list.get(1), (java.util.List) list.get(2));
        }
    }

    public LiveForwardServiceResult() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.live_common.LiveForwardServiceResult copy$default(com.tencent.pigeon.live_common.LiveForwardServiceResult liveForwardServiceResult, com.tencent.pigeon.live_common.LiveForwardResultCode liveForwardResultCode, java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            liveForwardResultCode = liveForwardServiceResult.code;
        }
        if ((i17 & 2) != 0) {
            str = liveForwardServiceResult.message;
        }
        if ((i17 & 4) != 0) {
            list = liveForwardServiceResult.toUsernames;
        }
        return liveForwardServiceResult.copy(liveForwardResultCode, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.live_common.LiveForwardResultCode getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.util.List<java.lang.String> component3() {
        return this.toUsernames;
    }

    public final com.tencent.pigeon.live_common.LiveForwardServiceResult copy(com.tencent.pigeon.live_common.LiveForwardResultCode code, java.lang.String message, java.util.List<java.lang.String> toUsernames) {
        return new com.tencent.pigeon.live_common.LiveForwardServiceResult(code, message, toUsernames);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_common.LiveForwardServiceResult)) {
            return false;
        }
        com.tencent.pigeon.live_common.LiveForwardServiceResult liveForwardServiceResult = (com.tencent.pigeon.live_common.LiveForwardServiceResult) other;
        return this.code == liveForwardServiceResult.code && kotlin.jvm.internal.o.b(this.message, liveForwardServiceResult.message) && kotlin.jvm.internal.o.b(this.toUsernames, liveForwardServiceResult.toUsernames);
    }

    public final com.tencent.pigeon.live_common.LiveForwardResultCode getCode() {
        return this.code;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.util.List<java.lang.String> getToUsernames() {
        return this.toUsernames;
    }

    public int hashCode() {
        com.tencent.pigeon.live_common.LiveForwardResultCode liveForwardResultCode = this.code;
        int hashCode = (liveForwardResultCode == null ? 0 : liveForwardResultCode.hashCode()) * 31;
        java.lang.String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.util.List<java.lang.String> list = this.toUsernames;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.pigeon.live_common.LiveForwardResultCode liveForwardResultCode = this.code;
        objArr[0] = liveForwardResultCode != null ? java.lang.Integer.valueOf(liveForwardResultCode.getRaw()) : null;
        objArr[1] = this.message;
        objArr[2] = this.toUsernames;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "LiveForwardServiceResult(code=" + this.code + ", message=" + this.message + ", toUsernames=" + this.toUsernames + ')';
    }

    public LiveForwardServiceResult(com.tencent.pigeon.live_common.LiveForwardResultCode liveForwardResultCode, java.lang.String str, java.util.List<java.lang.String> list) {
        this.code = liveForwardResultCode;
        this.message = str;
        this.toUsernames = list;
    }

    public /* synthetic */ LiveForwardServiceResult(com.tencent.pigeon.live_common.LiveForwardResultCode liveForwardResultCode, java.lang.String str, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : liveForwardResultCode, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : list);
    }
}
