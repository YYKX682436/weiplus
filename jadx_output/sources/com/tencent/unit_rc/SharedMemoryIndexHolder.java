package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/tencent/unit_rc/SharedMemoryIndexHolder;", "", ya.b.INDEX, "", "(I)V", "getIndex", "()I", "setIndex", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SharedMemoryIndexHolder {
    private int index;

    public SharedMemoryIndexHolder() {
        this(0, 1, null);
    }

    public static /* synthetic */ com.tencent.unit_rc.SharedMemoryIndexHolder copy$default(com.tencent.unit_rc.SharedMemoryIndexHolder sharedMemoryIndexHolder, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = sharedMemoryIndexHolder.index;
        }
        return sharedMemoryIndexHolder.copy(i17);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final com.tencent.unit_rc.SharedMemoryIndexHolder copy(int index) {
        return new com.tencent.unit_rc.SharedMemoryIndexHolder(index);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.unit_rc.SharedMemoryIndexHolder) && this.index == ((com.tencent.unit_rc.SharedMemoryIndexHolder) other).index;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.index);
    }

    public final void setIndex(int i17) {
        this.index = i17;
    }

    public java.lang.String toString() {
        return "SharedMemoryIndexHolder(index=" + this.index + ')';
    }

    public SharedMemoryIndexHolder(int i17) {
        this.index = i17;
    }

    public /* synthetic */ SharedMemoryIndexHolder(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
