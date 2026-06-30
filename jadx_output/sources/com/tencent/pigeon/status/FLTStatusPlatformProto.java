package com.tencent.pigeon.status;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/status/FLTStatusPlatformProto;", "", "byteArray", "", "([B)V", "getByteArray", "()[B", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FLTStatusPlatformProto {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.status.FLTStatusPlatformProto.Companion INSTANCE = new com.tencent.pigeon.status.FLTStatusPlatformProto.Companion(null);
    private final byte[] byteArray;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/status/FLTStatusPlatformProto$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/status/FLTStatusPlatformProto;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.status.FLTStatusPlatformProto fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.status.FLTStatusPlatformProto((byte[]) list.get(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FLTStatusPlatformProto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.status.FLTStatusPlatformProto copy$default(com.tencent.pigeon.status.FLTStatusPlatformProto fLTStatusPlatformProto, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = fLTStatusPlatformProto.byteArray;
        }
        return fLTStatusPlatformProto.copy(bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getByteArray() {
        return this.byteArray;
    }

    public final com.tencent.pigeon.status.FLTStatusPlatformProto copy(byte[] byteArray) {
        return new com.tencent.pigeon.status.FLTStatusPlatformProto(byteArray);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.status.FLTStatusPlatformProto) && kotlin.jvm.internal.o.b(this.byteArray, ((com.tencent.pigeon.status.FLTStatusPlatformProto) other).byteArray);
    }

    public final byte[] getByteArray() {
        return this.byteArray;
    }

    public int hashCode() {
        byte[] bArr = this.byteArray;
        if (bArr == null) {
            return 0;
        }
        return java.util.Arrays.hashCode(bArr);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(this.byteArray);
    }

    public java.lang.String toString() {
        return "FLTStatusPlatformProto(byteArray=" + java.util.Arrays.toString(this.byteArray) + ')';
    }

    public FLTStatusPlatformProto(byte[] bArr) {
        this.byteArray = bArr;
    }

    public /* synthetic */ FLTStatusPlatformProto(byte[] bArr, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : bArr);
    }
}
