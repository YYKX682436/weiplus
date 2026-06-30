package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/ting/TingWecoinSubscribeRequest;", "", "joinInfo", "", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "", "tingScene", "", "([BLjava/lang/String;Ljava/lang/Long;)V", "getJoinInfo", "()[B", "getSessionId", "()Ljava/lang/String;", "getTingScene", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "([BLjava/lang/String;Ljava/lang/Long;)Lcom/tencent/pigeon/ting/TingWecoinSubscribeRequest;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingWecoinSubscribeRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingWecoinSubscribeRequest.Companion INSTANCE = new com.tencent.pigeon.ting.TingWecoinSubscribeRequest.Companion(null);
    private final byte[] joinInfo;
    private final java.lang.String sessionId;
    private final java.lang.Long tingScene;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingWecoinSubscribeRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingWecoinSubscribeRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingWecoinSubscribeRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            byte[] bArr = (byte[]) list.get(0);
            java.lang.String str = (java.lang.String) list.get(1);
            java.lang.Object obj = list.get(2);
            return new com.tencent.pigeon.ting.TingWecoinSubscribeRequest(bArr, str, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    public TingWecoinSubscribeRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ting.TingWecoinSubscribeRequest copy$default(com.tencent.pigeon.ting.TingWecoinSubscribeRequest tingWecoinSubscribeRequest, byte[] bArr, java.lang.String str, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bArr = tingWecoinSubscribeRequest.joinInfo;
        }
        if ((i17 & 2) != 0) {
            str = tingWecoinSubscribeRequest.sessionId;
        }
        if ((i17 & 4) != 0) {
            l17 = tingWecoinSubscribeRequest.tingScene;
        }
        return tingWecoinSubscribeRequest.copy(bArr, str, l17);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getJoinInfo() {
        return this.joinInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getTingScene() {
        return this.tingScene;
    }

    public final com.tencent.pigeon.ting.TingWecoinSubscribeRequest copy(byte[] joinInfo, java.lang.String sessionId, java.lang.Long tingScene) {
        return new com.tencent.pigeon.ting.TingWecoinSubscribeRequest(joinInfo, sessionId, tingScene);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingWecoinSubscribeRequest)) {
            return false;
        }
        com.tencent.pigeon.ting.TingWecoinSubscribeRequest tingWecoinSubscribeRequest = (com.tencent.pigeon.ting.TingWecoinSubscribeRequest) other;
        return kotlin.jvm.internal.o.b(this.joinInfo, tingWecoinSubscribeRequest.joinInfo) && kotlin.jvm.internal.o.b(this.sessionId, tingWecoinSubscribeRequest.sessionId) && kotlin.jvm.internal.o.b(this.tingScene, tingWecoinSubscribeRequest.tingScene);
    }

    public final byte[] getJoinInfo() {
        return this.joinInfo;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.Long getTingScene() {
        return this.tingScene;
    }

    public int hashCode() {
        byte[] bArr = this.joinInfo;
        int hashCode = (bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31;
        java.lang.String str = this.sessionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l17 = this.tingScene;
        return hashCode2 + (l17 != null ? l17.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.joinInfo, this.sessionId, this.tingScene);
    }

    public java.lang.String toString() {
        return "TingWecoinSubscribeRequest(joinInfo=" + java.util.Arrays.toString(this.joinInfo) + ", sessionId=" + this.sessionId + ", tingScene=" + this.tingScene + ')';
    }

    public TingWecoinSubscribeRequest(byte[] bArr, java.lang.String str, java.lang.Long l17) {
        this.joinInfo = bArr;
        this.sessionId = str;
        this.tingScene = l17;
    }

    public /* synthetic */ TingWecoinSubscribeRequest(byte[] bArr, java.lang.String str, java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : bArr, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : l17);
    }
}
