package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FinderProfileLaunchRequest;", "", "finderUsername", "", "(Ljava/lang/String;)V", "getFinderUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FinderProfileLaunchRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest.Companion(null);
    private final java.lang.String finderUsername;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FinderProfileLaunchRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/FinderProfileLaunchRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest((java.lang.String) obj);
        }
    }

    public FinderProfileLaunchRequest(java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.finderUsername = finderUsername;
    }

    public static /* synthetic */ com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest copy$default(com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest finderProfileLaunchRequest, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = finderProfileLaunchRequest.finderUsername;
        }
        return finderProfileLaunchRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFinderUsername() {
        return this.finderUsername;
    }

    public final com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest copy(java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        return new com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest(finderUsername);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest) && kotlin.jvm.internal.o.b(this.finderUsername, ((com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest) other).finderUsername);
    }

    public final java.lang.String getFinderUsername() {
        return this.finderUsername;
    }

    public int hashCode() {
        return this.finderUsername.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(this.finderUsername);
    }

    public java.lang.String toString() {
        return "FinderProfileLaunchRequest(finderUsername=" + this.finderUsername + ')';
    }
}
