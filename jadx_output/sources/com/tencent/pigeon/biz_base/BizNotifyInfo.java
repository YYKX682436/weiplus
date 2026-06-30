package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/tencent/pigeon/biz_base/BizNotifyInfo;", "", "eventType", "", "msgInfo", "Lcom/tencent/pigeon/biz_base/MassSendCardMsg;", "items", "", "talker", "", "(Ljava/lang/Long;Lcom/tencent/pigeon/biz_base/MassSendCardMsg;Ljava/util/List;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getItems", "()Ljava/util/List;", "getMsgInfo", "()Lcom/tencent/pigeon/biz_base/MassSendCardMsg;", "getTalker", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Lcom/tencent/pigeon/biz_base/MassSendCardMsg;Ljava/util/List;Ljava/lang/String;)Lcom/tencent/pigeon/biz_base/BizNotifyInfo;", "equals", "", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizNotifyInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.BizNotifyInfo.Companion INSTANCE = new com.tencent.pigeon.biz_base.BizNotifyInfo.Companion(null);
    private final java.lang.Long eventType;
    private final java.util.List<com.tencent.pigeon.biz_base.MassSendCardMsg> items;
    private final com.tencent.pigeon.biz_base.MassSendCardMsg msgInfo;
    private final java.lang.String talker;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizNotifyInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/BizNotifyInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.BizNotifyInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(1);
            return new com.tencent.pigeon.biz_base.BizNotifyInfo(valueOf, list2 != null ? com.tencent.pigeon.biz_base.MassSendCardMsg.INSTANCE.fromList(list2) : null, (java.util.List) list.get(2), (java.lang.String) list.get(3));
        }
    }

    public BizNotifyInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz_base.BizNotifyInfo copy$default(com.tencent.pigeon.biz_base.BizNotifyInfo bizNotifyInfo, java.lang.Long l17, com.tencent.pigeon.biz_base.MassSendCardMsg massSendCardMsg, java.util.List list, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = bizNotifyInfo.eventType;
        }
        if ((i17 & 2) != 0) {
            massSendCardMsg = bizNotifyInfo.msgInfo;
        }
        if ((i17 & 4) != 0) {
            list = bizNotifyInfo.items;
        }
        if ((i17 & 8) != 0) {
            str = bizNotifyInfo.talker;
        }
        return bizNotifyInfo.copy(l17, massSendCardMsg, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getEventType() {
        return this.eventType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.biz_base.MassSendCardMsg getMsgInfo() {
        return this.msgInfo;
    }

    public final java.util.List<com.tencent.pigeon.biz_base.MassSendCardMsg> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTalker() {
        return this.talker;
    }

    public final com.tencent.pigeon.biz_base.BizNotifyInfo copy(java.lang.Long eventType, com.tencent.pigeon.biz_base.MassSendCardMsg msgInfo, java.util.List<com.tencent.pigeon.biz_base.MassSendCardMsg> items, java.lang.String talker) {
        return new com.tencent.pigeon.biz_base.BizNotifyInfo(eventType, msgInfo, items, talker);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.BizNotifyInfo)) {
            return false;
        }
        com.tencent.pigeon.biz_base.BizNotifyInfo bizNotifyInfo = (com.tencent.pigeon.biz_base.BizNotifyInfo) other;
        return kotlin.jvm.internal.o.b(this.eventType, bizNotifyInfo.eventType) && kotlin.jvm.internal.o.b(this.msgInfo, bizNotifyInfo.msgInfo) && kotlin.jvm.internal.o.b(this.items, bizNotifyInfo.items) && kotlin.jvm.internal.o.b(this.talker, bizNotifyInfo.talker);
    }

    public final java.lang.Long getEventType() {
        return this.eventType;
    }

    public final java.util.List<com.tencent.pigeon.biz_base.MassSendCardMsg> getItems() {
        return this.items;
    }

    public final com.tencent.pigeon.biz_base.MassSendCardMsg getMsgInfo() {
        return this.msgInfo;
    }

    public final java.lang.String getTalker() {
        return this.talker;
    }

    public int hashCode() {
        java.lang.Long l17 = this.eventType;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        com.tencent.pigeon.biz_base.MassSendCardMsg massSendCardMsg = this.msgInfo;
        int hashCode2 = (hashCode + (massSendCardMsg == null ? 0 : massSendCardMsg.hashCode())) * 31;
        java.util.List<com.tencent.pigeon.biz_base.MassSendCardMsg> list = this.items;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.String str = this.talker;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.eventType;
        com.tencent.pigeon.biz_base.MassSendCardMsg massSendCardMsg = this.msgInfo;
        objArr[1] = massSendCardMsg != null ? massSendCardMsg.toList() : null;
        objArr[2] = this.items;
        objArr[3] = this.talker;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "BizNotifyInfo(eventType=" + this.eventType + ", msgInfo=" + this.msgInfo + ", items=" + this.items + ", talker=" + this.talker + ')';
    }

    public BizNotifyInfo(java.lang.Long l17, com.tencent.pigeon.biz_base.MassSendCardMsg massSendCardMsg, java.util.List<com.tencent.pigeon.biz_base.MassSendCardMsg> list, java.lang.String str) {
        this.eventType = l17;
        this.msgInfo = massSendCardMsg;
        this.items = list;
        this.talker = str;
    }

    public /* synthetic */ BizNotifyInfo(java.lang.Long l17, com.tencent.pigeon.biz_base.MassSendCardMsg massSendCardMsg, java.util.List list, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : massSendCardMsg, (i17 & 4) != 0 ? null : list, (i17 & 8) != 0 ? null : str);
    }
}
