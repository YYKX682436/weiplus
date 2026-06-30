package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage;", "", "appUuid", "", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "", "(JLjava/lang/String;)V", "getAppUuid", "()J", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage.Companion(null);
    private final long appUuid;
    private final java.lang.String sessionId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage(longValue, (java.lang.String) obj2);
        }
    }

    public WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage(long j17, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.appUuid = j17;
        this.sessionId = sessionId;
    }

    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage wxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage, long j17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = wxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage.appUuid;
        }
        if ((i17 & 2) != 0) {
            str = wxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage.sessionId;
        }
        return wxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage.copy(j17, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppUuid() {
        return this.appUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage copy(long appUuid, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage(appUuid, sessionId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage wxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage) other;
        return this.appUuid == wxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage.appUuid && kotlin.jvm.internal.o.b(this.sessionId, wxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage.sessionId);
    }

    public final long getAppUuid() {
        return this.appUuid;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.appUuid) * 31) + this.sessionId.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.appUuid), this.sessionId);
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage(appUuid=" + this.appUuid + ", sessionId=" + this.sessionId + ')';
    }
}
