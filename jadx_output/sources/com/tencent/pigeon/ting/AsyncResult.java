package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/ting/AsyncResult;", "", "ret", "", "errorMessage", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "(JLjava/lang/String;[B)V", "getData", "()[B", "getErrorMessage", "()Ljava/lang/String;", "getRet", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AsyncResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.AsyncResult.Companion INSTANCE = new com.tencent.pigeon.ting.AsyncResult.Companion(null);
    private final byte[] data;
    private final java.lang.String errorMessage;
    private final long ret;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/AsyncResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/AsyncResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.AsyncResult fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.ting.AsyncResult(longValue, (java.lang.String) obj2, (byte[]) list.get(2));
        }
    }

    public AsyncResult(long j17, java.lang.String errorMessage, byte[] bArr) {
        kotlin.jvm.internal.o.g(errorMessage, "errorMessage");
        this.ret = j17;
        this.errorMessage = errorMessage;
        this.data = bArr;
    }

    public static /* synthetic */ com.tencent.pigeon.ting.AsyncResult copy$default(com.tencent.pigeon.ting.AsyncResult asyncResult, long j17, java.lang.String str, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = asyncResult.ret;
        }
        if ((i17 & 2) != 0) {
            str = asyncResult.errorMessage;
        }
        if ((i17 & 4) != 0) {
            bArr = asyncResult.data;
        }
        return asyncResult.copy(j17, str, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRet() {
        return this.ret;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public final com.tencent.pigeon.ting.AsyncResult copy(long ret, java.lang.String errorMessage, byte[] data) {
        kotlin.jvm.internal.o.g(errorMessage, "errorMessage");
        return new com.tencent.pigeon.ting.AsyncResult(ret, errorMessage, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.AsyncResult)) {
            return false;
        }
        com.tencent.pigeon.ting.AsyncResult asyncResult = (com.tencent.pigeon.ting.AsyncResult) other;
        return this.ret == asyncResult.ret && kotlin.jvm.internal.o.b(this.errorMessage, asyncResult.errorMessage) && kotlin.jvm.internal.o.b(this.data, asyncResult.data);
    }

    public final byte[] getData() {
        return this.data;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final long getRet() {
        return this.ret;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Long.hashCode(this.ret) * 31) + this.errorMessage.hashCode()) * 31;
        byte[] bArr = this.data;
        return hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr));
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.ret), this.errorMessage, this.data);
    }

    public java.lang.String toString() {
        return "AsyncResult(ret=" + this.ret + ", errorMessage=" + this.errorMessage + ", data=" + java.util.Arrays.toString(this.data) + ')';
    }

    public /* synthetic */ AsyncResult(long j17, java.lang.String str, byte[] bArr, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, str, (i17 & 4) != 0 ? null : bArr);
    }
}
