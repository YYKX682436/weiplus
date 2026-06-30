package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/tencent/pigeon/ting/TingWecoinSubscribeResult;", "", "status", "", "scheme", "", "succHalfPanel", "(J[B[B)V", "getScheme", "()[B", "getStatus", "()J", "getSuccHalfPanel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingWecoinSubscribeResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingWecoinSubscribeResult.Companion INSTANCE = new com.tencent.pigeon.ting.TingWecoinSubscribeResult.Companion(null);
    private final byte[] scheme;
    private final long status;
    private final byte[] succHalfPanel;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingWecoinSubscribeResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingWecoinSubscribeResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingWecoinSubscribeResult fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            return new com.tencent.pigeon.ting.TingWecoinSubscribeResult(longValue, (byte[]) list.get(1), (byte[]) list.get(2));
        }
    }

    public TingWecoinSubscribeResult(long j17, byte[] bArr, byte[] bArr2) {
        this.status = j17;
        this.scheme = bArr;
        this.succHalfPanel = bArr2;
    }

    public static /* synthetic */ com.tencent.pigeon.ting.TingWecoinSubscribeResult copy$default(com.tencent.pigeon.ting.TingWecoinSubscribeResult tingWecoinSubscribeResult, long j17, byte[] bArr, byte[] bArr2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = tingWecoinSubscribeResult.status;
        }
        if ((i17 & 2) != 0) {
            bArr = tingWecoinSubscribeResult.scheme;
        }
        if ((i17 & 4) != 0) {
            bArr2 = tingWecoinSubscribeResult.succHalfPanel;
        }
        return tingWecoinSubscribeResult.copy(j17, bArr, bArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getScheme() {
        return this.scheme;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getSuccHalfPanel() {
        return this.succHalfPanel;
    }

    public final com.tencent.pigeon.ting.TingWecoinSubscribeResult copy(long status, byte[] scheme, byte[] succHalfPanel) {
        return new com.tencent.pigeon.ting.TingWecoinSubscribeResult(status, scheme, succHalfPanel);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingWecoinSubscribeResult)) {
            return false;
        }
        com.tencent.pigeon.ting.TingWecoinSubscribeResult tingWecoinSubscribeResult = (com.tencent.pigeon.ting.TingWecoinSubscribeResult) other;
        return this.status == tingWecoinSubscribeResult.status && kotlin.jvm.internal.o.b(this.scheme, tingWecoinSubscribeResult.scheme) && kotlin.jvm.internal.o.b(this.succHalfPanel, tingWecoinSubscribeResult.succHalfPanel);
    }

    public final byte[] getScheme() {
        return this.scheme;
    }

    public final long getStatus() {
        return this.status;
    }

    public final byte[] getSuccHalfPanel() {
        return this.succHalfPanel;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.status) * 31;
        byte[] bArr = this.scheme;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.succHalfPanel;
        return hashCode2 + (bArr2 != null ? java.util.Arrays.hashCode(bArr2) : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.status), this.scheme, this.succHalfPanel);
    }

    public java.lang.String toString() {
        return "TingWecoinSubscribeResult(status=" + this.status + ", scheme=" + java.util.Arrays.toString(this.scheme) + ", succHalfPanel=" + java.util.Arrays.toString(this.succHalfPanel) + ')';
    }

    public /* synthetic */ TingWecoinSubscribeResult(long j17, byte[] bArr, byte[] bArr2, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? null : bArr, (i17 & 4) != 0 ? null : bArr2);
    }
}
