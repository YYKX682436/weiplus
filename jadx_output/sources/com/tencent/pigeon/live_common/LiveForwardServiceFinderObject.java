package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveForwardServiceFinderObject;", "", "buff", "", "ignoreOneTimeFlag", "", "lastGMsgID", "", "([BLjava/lang/Boolean;Ljava/lang/String;)V", "getBuff", "()[B", "getIgnoreOneTimeFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastGMsgID", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "([BLjava/lang/Boolean;Ljava/lang/String;)Lcom/tencent/pigeon/live_common/LiveForwardServiceFinderObject;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LiveForwardServiceFinderObject {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveForwardServiceFinderObject.Companion INSTANCE = new com.tencent.pigeon.live_common.LiveForwardServiceFinderObject.Companion(null);
    private final byte[] buff;
    private final java.lang.Boolean ignoreOneTimeFlag;
    private final java.lang.String lastGMsgID;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveForwardServiceFinderObject$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveForwardServiceFinderObject;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_common.LiveForwardServiceFinderObject fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.live_common.LiveForwardServiceFinderObject((byte[]) list.get(0), (java.lang.Boolean) list.get(1), (java.lang.String) list.get(2));
        }
    }

    public LiveForwardServiceFinderObject() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.live_common.LiveForwardServiceFinderObject copy$default(com.tencent.pigeon.live_common.LiveForwardServiceFinderObject liveForwardServiceFinderObject, byte[] bArr, java.lang.Boolean bool, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = liveForwardServiceFinderObject.buff;
        }
        if ((i17 & 2) != 0) {
            bool = liveForwardServiceFinderObject.ignoreOneTimeFlag;
        }
        if ((i17 & 4) != 0) {
            str = liveForwardServiceFinderObject.lastGMsgID;
        }
        return liveForwardServiceFinderObject.copy(bArr, bool, str);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getBuff() {
        return this.buff;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getIgnoreOneTimeFlag() {
        return this.ignoreOneTimeFlag;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLastGMsgID() {
        return this.lastGMsgID;
    }

    public final com.tencent.pigeon.live_common.LiveForwardServiceFinderObject copy(byte[] buff, java.lang.Boolean ignoreOneTimeFlag, java.lang.String lastGMsgID) {
        return new com.tencent.pigeon.live_common.LiveForwardServiceFinderObject(buff, ignoreOneTimeFlag, lastGMsgID);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_common.LiveForwardServiceFinderObject)) {
            return false;
        }
        com.tencent.pigeon.live_common.LiveForwardServiceFinderObject liveForwardServiceFinderObject = (com.tencent.pigeon.live_common.LiveForwardServiceFinderObject) other;
        return kotlin.jvm.internal.o.b(this.buff, liveForwardServiceFinderObject.buff) && kotlin.jvm.internal.o.b(this.ignoreOneTimeFlag, liveForwardServiceFinderObject.ignoreOneTimeFlag) && kotlin.jvm.internal.o.b(this.lastGMsgID, liveForwardServiceFinderObject.lastGMsgID);
    }

    public final byte[] getBuff() {
        return this.buff;
    }

    public final java.lang.Boolean getIgnoreOneTimeFlag() {
        return this.ignoreOneTimeFlag;
    }

    public final java.lang.String getLastGMsgID() {
        return this.lastGMsgID;
    }

    public int hashCode() {
        byte[] bArr = this.buff;
        int hashCode = (bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31;
        java.lang.Boolean bool = this.ignoreOneTimeFlag;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str = this.lastGMsgID;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.buff, this.ignoreOneTimeFlag, this.lastGMsgID);
    }

    public java.lang.String toString() {
        return "LiveForwardServiceFinderObject(buff=" + java.util.Arrays.toString(this.buff) + ", ignoreOneTimeFlag=" + this.ignoreOneTimeFlag + ", lastGMsgID=" + this.lastGMsgID + ')';
    }

    public LiveForwardServiceFinderObject(byte[] bArr, java.lang.Boolean bool, java.lang.String str) {
        this.buff = bArr;
        this.ignoreOneTimeFlag = bool;
        this.lastGMsgID = str;
    }

    public /* synthetic */ LiveForwardServiceFinderObject(byte[] bArr, java.lang.Boolean bool, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : bArr, (i17 & 2) != 0 ? null : bool, (i17 & 4) != 0 ? null : str);
    }
}
