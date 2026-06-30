package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fJ\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/tencent/pigeon/biz_base/BizChattingJumpInfo;", "", "userName", "", "openChattingFromScene", "", "chattingSubScene", "clickPos", "msgLocalId", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getChattingSubScene", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClickPos", "getMsgLocalId", "getOpenChattingFromScene", "getUserName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/biz_base/BizChattingJumpInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizChattingJumpInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.BizChattingJumpInfo.Companion INSTANCE = new com.tencent.pigeon.biz_base.BizChattingJumpInfo.Companion(null);
    private final java.lang.Long chattingSubScene;
    private final java.lang.Long clickPos;
    private final java.lang.Long msgLocalId;
    private final java.lang.Long openChattingFromScene;
    private final java.lang.String userName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizChattingJumpInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/BizChattingJumpInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.BizChattingJumpInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            java.lang.Long valueOf = obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2;
            java.lang.Object obj3 = list.get(2);
            java.lang.Long valueOf2 = obj3 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj3).intValue()) : (java.lang.Long) obj3;
            java.lang.Object obj4 = list.get(3);
            java.lang.Long valueOf3 = obj4 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj4).intValue()) : (java.lang.Long) obj4;
            java.lang.Object obj5 = list.get(4);
            return new com.tencent.pigeon.biz_base.BizChattingJumpInfo(str, valueOf, valueOf2, valueOf3, obj5 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj5).intValue()) : (java.lang.Long) obj5);
        }
    }

    public BizChattingJumpInfo(java.lang.String userName, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.userName = userName;
        this.openChattingFromScene = l17;
        this.chattingSubScene = l18;
        this.clickPos = l19;
        this.msgLocalId = l27;
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.BizChattingJumpInfo copy$default(com.tencent.pigeon.biz_base.BizChattingJumpInfo bizChattingJumpInfo, java.lang.String str, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = bizChattingJumpInfo.userName;
        }
        if ((i17 & 2) != 0) {
            l17 = bizChattingJumpInfo.openChattingFromScene;
        }
        java.lang.Long l28 = l17;
        if ((i17 & 4) != 0) {
            l18 = bizChattingJumpInfo.chattingSubScene;
        }
        java.lang.Long l29 = l18;
        if ((i17 & 8) != 0) {
            l19 = bizChattingJumpInfo.clickPos;
        }
        java.lang.Long l37 = l19;
        if ((i17 & 16) != 0) {
            l27 = bizChattingJumpInfo.msgLocalId;
        }
        return bizChattingJumpInfo.copy(str, l28, l29, l37, l27);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserName() {
        return this.userName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getOpenChattingFromScene() {
        return this.openChattingFromScene;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getChattingSubScene() {
        return this.chattingSubScene;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getClickPos() {
        return this.clickPos;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Long getMsgLocalId() {
        return this.msgLocalId;
    }

    public final com.tencent.pigeon.biz_base.BizChattingJumpInfo copy(java.lang.String userName, java.lang.Long openChattingFromScene, java.lang.Long chattingSubScene, java.lang.Long clickPos, java.lang.Long msgLocalId) {
        kotlin.jvm.internal.o.g(userName, "userName");
        return new com.tencent.pigeon.biz_base.BizChattingJumpInfo(userName, openChattingFromScene, chattingSubScene, clickPos, msgLocalId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.BizChattingJumpInfo)) {
            return false;
        }
        com.tencent.pigeon.biz_base.BizChattingJumpInfo bizChattingJumpInfo = (com.tencent.pigeon.biz_base.BizChattingJumpInfo) other;
        return kotlin.jvm.internal.o.b(this.userName, bizChattingJumpInfo.userName) && kotlin.jvm.internal.o.b(this.openChattingFromScene, bizChattingJumpInfo.openChattingFromScene) && kotlin.jvm.internal.o.b(this.chattingSubScene, bizChattingJumpInfo.chattingSubScene) && kotlin.jvm.internal.o.b(this.clickPos, bizChattingJumpInfo.clickPos) && kotlin.jvm.internal.o.b(this.msgLocalId, bizChattingJumpInfo.msgLocalId);
    }

    public final java.lang.Long getChattingSubScene() {
        return this.chattingSubScene;
    }

    public final java.lang.Long getClickPos() {
        return this.clickPos;
    }

    public final java.lang.Long getMsgLocalId() {
        return this.msgLocalId;
    }

    public final java.lang.Long getOpenChattingFromScene() {
        return this.openChattingFromScene;
    }

    public final java.lang.String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int hashCode = this.userName.hashCode() * 31;
        java.lang.Long l17 = this.openChattingFromScene;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.chattingSubScene;
        int hashCode3 = (hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Long l19 = this.clickPos;
        int hashCode4 = (hashCode3 + (l19 == null ? 0 : l19.hashCode())) * 31;
        java.lang.Long l27 = this.msgLocalId;
        return hashCode4 + (l27 != null ? l27.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.userName, this.openChattingFromScene, this.chattingSubScene, this.clickPos, this.msgLocalId);
    }

    public java.lang.String toString() {
        return "BizChattingJumpInfo(userName=" + this.userName + ", openChattingFromScene=" + this.openChattingFromScene + ", chattingSubScene=" + this.chattingSubScene + ", clickPos=" + this.clickPos + ", msgLocalId=" + this.msgLocalId + ')';
    }

    public /* synthetic */ BizChattingJumpInfo(java.lang.String str, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : l17, (i17 & 4) != 0 ? null : l18, (i17 & 8) != 0 ? null : l19, (i17 & 16) != 0 ? null : l27);
    }
}
