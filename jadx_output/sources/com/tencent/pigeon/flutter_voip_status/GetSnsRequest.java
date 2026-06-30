package com.tencent.pigeon.flutter_voip_status;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetSnsRequest;", "", dm.i4.COL_USERNAME, "", "timeLimit", "", "(Ljava/lang/String;J)V", "getTimeLimit", "()J", "getUsername", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetSnsRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip_status.GetSnsRequest.Companion INSTANCE = new com.tencent.pigeon.flutter_voip_status.GetSnsRequest.Companion(null);
    private final long timeLimit;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetSnsRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip_status/GetSnsRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip_status.GetSnsRequest fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            return new com.tencent.pigeon.flutter_voip_status.GetSnsRequest(str, longValue);
        }
    }

    public GetSnsRequest(java.lang.String username, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.username = username;
        this.timeLimit = j17;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip_status.GetSnsRequest copy$default(com.tencent.pigeon.flutter_voip_status.GetSnsRequest getSnsRequest, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = getSnsRequest.username;
        }
        if ((i17 & 2) != 0) {
            j17 = getSnsRequest.timeLimit;
        }
        return getSnsRequest.copy(str, j17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeLimit() {
        return this.timeLimit;
    }

    public final com.tencent.pigeon.flutter_voip_status.GetSnsRequest copy(java.lang.String username, long timeLimit) {
        kotlin.jvm.internal.o.g(username, "username");
        return new com.tencent.pigeon.flutter_voip_status.GetSnsRequest(username, timeLimit);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip_status.GetSnsRequest)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip_status.GetSnsRequest getSnsRequest = (com.tencent.pigeon.flutter_voip_status.GetSnsRequest) other;
        return kotlin.jvm.internal.o.b(this.username, getSnsRequest.username) && this.timeLimit == getSnsRequest.timeLimit;
    }

    public final long getTimeLimit() {
        return this.timeLimit;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (this.username.hashCode() * 31) + java.lang.Long.hashCode(this.timeLimit);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, java.lang.Long.valueOf(this.timeLimit));
    }

    public java.lang.String toString() {
        return "GetSnsRequest(username=" + this.username + ", timeLimit=" + this.timeLimit + ')';
    }
}
