package com.tencent.pigeon.mj_template;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/mj_template/AlbumRequest;", "", "buffer", "", "([B)V", "getBuffer", "()[B", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AlbumRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mj_template.AlbumRequest.Companion INSTANCE = new com.tencent.pigeon.mj_template.AlbumRequest.Companion(null);
    private final byte[] buffer;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mj_template/AlbumRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mj_template/AlbumRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mj_template.AlbumRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            return new com.tencent.pigeon.mj_template.AlbumRequest((byte[]) obj);
        }
    }

    public AlbumRequest(byte[] buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.buffer = buffer;
    }

    public static /* synthetic */ com.tencent.pigeon.mj_template.AlbumRequest copy$default(com.tencent.pigeon.mj_template.AlbumRequest albumRequest, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = albumRequest.buffer;
        }
        return albumRequest.copy(bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getBuffer() {
        return this.buffer;
    }

    public final com.tencent.pigeon.mj_template.AlbumRequest copy(byte[] buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        return new com.tencent.pigeon.mj_template.AlbumRequest(buffer);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.mj_template.AlbumRequest) && kotlin.jvm.internal.o.b(this.buffer, ((com.tencent.pigeon.mj_template.AlbumRequest) other).buffer);
    }

    public final byte[] getBuffer() {
        return this.buffer;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.buffer);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(this.buffer);
    }

    public java.lang.String toString() {
        return "AlbumRequest(buffer=" + java.util.Arrays.toString(this.buffer) + ')';
    }
}
