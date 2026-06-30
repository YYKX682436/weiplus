package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterCgiResponse;", "", "errorType", "", com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "(JJ[B)V", "getData", "()[B", "getErrorCode", "()J", "getErrorType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlutterCgiResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.FlutterCgiResponse.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.FlutterCgiResponse.Companion(null);
    private final byte[] data;
    private final long errorCode;
    private final long errorType;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterCgiResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/FlutterCgiResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.FlutterCgiResponse fromList(java.util.List<? extends java.lang.Object> list) {
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
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.ByteArray");
            return new com.tencent.pigeon.mm_foundation.FlutterCgiResponse(j17, longValue2, (byte[]) obj3);
        }
    }

    public FlutterCgiResponse(long j17, long j18, byte[] data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.errorType = j17;
        this.errorCode = j18;
        this.data = data;
    }

    public static /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterCgiResponse copy$default(com.tencent.pigeon.mm_foundation.FlutterCgiResponse flutterCgiResponse, long j17, long j18, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = flutterCgiResponse.errorType;
        }
        long j19 = j17;
        if ((i17 & 2) != 0) {
            j18 = flutterCgiResponse.errorCode;
        }
        long j27 = j18;
        if ((i17 & 4) != 0) {
            bArr = flutterCgiResponse.data;
        }
        return flutterCgiResponse.copy(j19, j27, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getErrorType() {
        return this.errorType;
    }

    /* renamed from: component2, reason: from getter */
    public final long getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public final com.tencent.pigeon.mm_foundation.FlutterCgiResponse copy(long errorType, long errorCode, byte[] data) {
        kotlin.jvm.internal.o.g(data, "data");
        return new com.tencent.pigeon.mm_foundation.FlutterCgiResponse(errorType, errorCode, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.FlutterCgiResponse)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.FlutterCgiResponse flutterCgiResponse = (com.tencent.pigeon.mm_foundation.FlutterCgiResponse) other;
        return this.errorType == flutterCgiResponse.errorType && this.errorCode == flutterCgiResponse.errorCode && kotlin.jvm.internal.o.b(this.data, flutterCgiResponse.data);
    }

    public final byte[] getData() {
        return this.data;
    }

    public final long getErrorCode() {
        return this.errorCode;
    }

    public final long getErrorType() {
        return this.errorType;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.errorType) * 31) + java.lang.Long.hashCode(this.errorCode)) * 31) + java.util.Arrays.hashCode(this.data);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.errorType), java.lang.Long.valueOf(this.errorCode), this.data);
    }

    public java.lang.String toString() {
        return "FlutterCgiResponse(errorType=" + this.errorType + ", errorCode=" + this.errorCode + ", data=" + java.util.Arrays.toString(this.data) + ')';
    }
}
