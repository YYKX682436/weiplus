package com.tencent.pigeon.finder;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/finder/FinderDislikeReasonFetchResult;", "", "dislikeReasonFetching", "", "dislikeReasonFetchFailed", "dislikeReasonsBuffers", "", "", "(ZZLjava/util/List;)V", "getDislikeReasonFetchFailed", "()Z", "getDislikeReasonFetching", "getDislikeReasonsBuffers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FinderDislikeReasonFetchResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.finder.FinderDislikeReasonFetchResult.Companion INSTANCE = new com.tencent.pigeon.finder.FinderDislikeReasonFetchResult.Companion(null);
    private final boolean dislikeReasonFetchFailed;
    private final boolean dislikeReasonFetching;
    private final java.util.List<byte[]> dislikeReasonsBuffers;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/finder/FinderDislikeReasonFetchResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/finder/FinderDislikeReasonFetchResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.finder.FinderDislikeReasonFetchResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.finder.FinderDislikeReasonFetchResult(booleanValue, ((java.lang.Boolean) obj2).booleanValue(), (java.util.List) list.get(2));
        }
    }

    public FinderDislikeReasonFetchResult(boolean z17, boolean z18, java.util.List<byte[]> list) {
        this.dislikeReasonFetching = z17;
        this.dislikeReasonFetchFailed = z18;
        this.dislikeReasonsBuffers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.finder.FinderDislikeReasonFetchResult copy$default(com.tencent.pigeon.finder.FinderDislikeReasonFetchResult finderDislikeReasonFetchResult, boolean z17, boolean z18, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = finderDislikeReasonFetchResult.dislikeReasonFetching;
        }
        if ((i17 & 2) != 0) {
            z18 = finderDislikeReasonFetchResult.dislikeReasonFetchFailed;
        }
        if ((i17 & 4) != 0) {
            list = finderDislikeReasonFetchResult.dislikeReasonsBuffers;
        }
        return finderDislikeReasonFetchResult.copy(z17, z18, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDislikeReasonFetching() {
        return this.dislikeReasonFetching;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDislikeReasonFetchFailed() {
        return this.dislikeReasonFetchFailed;
    }

    public final java.util.List<byte[]> component3() {
        return this.dislikeReasonsBuffers;
    }

    public final com.tencent.pigeon.finder.FinderDislikeReasonFetchResult copy(boolean dislikeReasonFetching, boolean dislikeReasonFetchFailed, java.util.List<byte[]> dislikeReasonsBuffers) {
        return new com.tencent.pigeon.finder.FinderDislikeReasonFetchResult(dislikeReasonFetching, dislikeReasonFetchFailed, dislikeReasonsBuffers);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.finder.FinderDislikeReasonFetchResult)) {
            return false;
        }
        com.tencent.pigeon.finder.FinderDislikeReasonFetchResult finderDislikeReasonFetchResult = (com.tencent.pigeon.finder.FinderDislikeReasonFetchResult) other;
        return this.dislikeReasonFetching == finderDislikeReasonFetchResult.dislikeReasonFetching && this.dislikeReasonFetchFailed == finderDislikeReasonFetchResult.dislikeReasonFetchFailed && kotlin.jvm.internal.o.b(this.dislikeReasonsBuffers, finderDislikeReasonFetchResult.dislikeReasonsBuffers);
    }

    public final boolean getDislikeReasonFetchFailed() {
        return this.dislikeReasonFetchFailed;
    }

    public final boolean getDislikeReasonFetching() {
        return this.dislikeReasonFetching;
    }

    public final java.util.List<byte[]> getDislikeReasonsBuffers() {
        return this.dislikeReasonsBuffers;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.dislikeReasonFetching) * 31) + java.lang.Boolean.hashCode(this.dislikeReasonFetchFailed)) * 31;
        java.util.List<byte[]> list = this.dislikeReasonsBuffers;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Boolean.valueOf(this.dislikeReasonFetching), java.lang.Boolean.valueOf(this.dislikeReasonFetchFailed), this.dislikeReasonsBuffers);
    }

    public java.lang.String toString() {
        return "FinderDislikeReasonFetchResult(dislikeReasonFetching=" + this.dislikeReasonFetching + ", dislikeReasonFetchFailed=" + this.dislikeReasonFetchFailed + ", dislikeReasonsBuffers=" + this.dislikeReasonsBuffers + ')';
    }

    public /* synthetic */ FinderDislikeReasonFetchResult(boolean z17, boolean z18, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, z18, (i17 & 4) != 0 ? null : list);
    }
}
