package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterCgiRequest;", "", "funcId", "", "uri", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "longPolling", "", "longPollingTimeout", "(JLjava/lang/String;[BZJ)V", "getData", "()[B", "getFuncId", "()J", "getLongPolling", "()Z", "getLongPollingTimeout", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlutterCgiRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.FlutterCgiRequest.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.FlutterCgiRequest.Companion(null);
    private final byte[] data;
    private final long funcId;
    private final boolean longPolling;
    private final long longPollingTimeout;
    private final java.lang.String uri;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterCgiRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/FlutterCgiRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.FlutterCgiRequest fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
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
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj2;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj3;
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj4).booleanValue();
            java.lang.Object obj5 = list.get(4);
            if (obj5 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj5).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj5).longValue();
            }
            return new com.tencent.pigeon.mm_foundation.FlutterCgiRequest(j17, str, bArr, booleanValue, longValue2);
        }
    }

    public FlutterCgiRequest(long j17, java.lang.String uri, byte[] data, boolean z17, long j18) {
        kotlin.jvm.internal.o.g(uri, "uri");
        kotlin.jvm.internal.o.g(data, "data");
        this.funcId = j17;
        this.uri = uri;
        this.data = data;
        this.longPolling = z17;
        this.longPollingTimeout = j18;
    }

    /* renamed from: component1, reason: from getter */
    public final long getFuncId() {
        return this.funcId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUri() {
        return this.uri;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLongPolling() {
        return this.longPolling;
    }

    /* renamed from: component5, reason: from getter */
    public final long getLongPollingTimeout() {
        return this.longPollingTimeout;
    }

    public final com.tencent.pigeon.mm_foundation.FlutterCgiRequest copy(long funcId, java.lang.String uri, byte[] data, boolean longPolling, long longPollingTimeout) {
        kotlin.jvm.internal.o.g(uri, "uri");
        kotlin.jvm.internal.o.g(data, "data");
        return new com.tencent.pigeon.mm_foundation.FlutterCgiRequest(funcId, uri, data, longPolling, longPollingTimeout);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.FlutterCgiRequest)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.FlutterCgiRequest flutterCgiRequest = (com.tencent.pigeon.mm_foundation.FlutterCgiRequest) other;
        return this.funcId == flutterCgiRequest.funcId && kotlin.jvm.internal.o.b(this.uri, flutterCgiRequest.uri) && kotlin.jvm.internal.o.b(this.data, flutterCgiRequest.data) && this.longPolling == flutterCgiRequest.longPolling && this.longPollingTimeout == flutterCgiRequest.longPollingTimeout;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final long getFuncId() {
        return this.funcId;
    }

    public final boolean getLongPolling() {
        return this.longPolling;
    }

    public final long getLongPollingTimeout() {
        return this.longPollingTimeout;
    }

    public final java.lang.String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.funcId) * 31) + this.uri.hashCode()) * 31) + java.util.Arrays.hashCode(this.data)) * 31) + java.lang.Boolean.hashCode(this.longPolling)) * 31) + java.lang.Long.hashCode(this.longPollingTimeout);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.funcId), this.uri, this.data, java.lang.Boolean.valueOf(this.longPolling), java.lang.Long.valueOf(this.longPollingTimeout));
    }

    public java.lang.String toString() {
        return "FlutterCgiRequest(funcId=" + this.funcId + ", uri=" + this.uri + ", data=" + java.util.Arrays.toString(this.data) + ", longPolling=" + this.longPolling + ", longPollingTimeout=" + this.longPollingTimeout + ')';
    }
}
