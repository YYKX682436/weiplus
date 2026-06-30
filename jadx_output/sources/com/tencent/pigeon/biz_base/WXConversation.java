package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/biz_base/WXConversation;", "", "conversationName", "", "isMute", "", "isTop", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getConversationName", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tencent/pigeon/biz_base/WXConversation;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WXConversation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.WXConversation.Companion INSTANCE = new com.tencent.pigeon.biz_base.WXConversation.Companion(null);
    private final java.lang.String conversationName;
    private final java.lang.Boolean isMute;
    private final java.lang.Boolean isTop;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/WXConversation$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/WXConversation;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.WXConversation fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.biz_base.WXConversation((java.lang.String) list.get(0), (java.lang.Boolean) list.get(1), (java.lang.Boolean) list.get(2));
        }
    }

    public WXConversation() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.WXConversation copy$default(com.tencent.pigeon.biz_base.WXConversation wXConversation, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = wXConversation.conversationName;
        }
        if ((i17 & 2) != 0) {
            bool = wXConversation.isMute;
        }
        if ((i17 & 4) != 0) {
            bool2 = wXConversation.isTop;
        }
        return wXConversation.copy(str, bool, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getConversationName() {
        return this.conversationName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getIsMute() {
        return this.isMute;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getIsTop() {
        return this.isTop;
    }

    public final com.tencent.pigeon.biz_base.WXConversation copy(java.lang.String conversationName, java.lang.Boolean isMute, java.lang.Boolean isTop) {
        return new com.tencent.pigeon.biz_base.WXConversation(conversationName, isMute, isTop);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.WXConversation)) {
            return false;
        }
        com.tencent.pigeon.biz_base.WXConversation wXConversation = (com.tencent.pigeon.biz_base.WXConversation) other;
        return kotlin.jvm.internal.o.b(this.conversationName, wXConversation.conversationName) && kotlin.jvm.internal.o.b(this.isMute, wXConversation.isMute) && kotlin.jvm.internal.o.b(this.isTop, wXConversation.isTop);
    }

    public final java.lang.String getConversationName() {
        return this.conversationName;
    }

    public int hashCode() {
        java.lang.String str = this.conversationName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Boolean bool = this.isMute;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.isTop;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final java.lang.Boolean isMute() {
        return this.isMute;
    }

    public final java.lang.Boolean isTop() {
        return this.isTop;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.conversationName, this.isMute, this.isTop);
    }

    public java.lang.String toString() {
        return "WXConversation(conversationName=" + this.conversationName + ", isMute=" + this.isMute + ", isTop=" + this.isTop + ')';
    }

    public WXConversation(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.conversationName = str;
        this.isMute = bool;
        this.isTop = bool2;
    }

    public /* synthetic */ WXConversation(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : bool, (i17 & 4) != 0 ? null : bool2);
    }
}
