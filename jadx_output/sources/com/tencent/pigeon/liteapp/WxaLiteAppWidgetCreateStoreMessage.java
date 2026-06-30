package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCreateStoreMessage;", "", "appId", "", "aliveSeconds", "", "waitDownload", "", "downloadTimeout", "(Ljava/lang/String;JZJ)V", "getAliveSeconds", "()J", "getAppId", "()Ljava/lang/String;", "getDownloadTimeout", "getWaitDownload", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetCreateStoreMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage.Companion(null);
    private final long aliveSeconds;
    private final java.lang.String appId;
    private final long downloadTimeout;
    private final boolean waitDownload;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCreateStoreMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCreateStoreMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj4).longValue();
            }
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage(str, j17, booleanValue, longValue2);
        }
    }

    public WxaLiteAppWidgetCreateStoreMessage(java.lang.String appId, long j17, boolean z17, long j18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.appId = appId;
        this.aliveSeconds = j17;
        this.waitDownload = z17;
        this.downloadTimeout = j18;
    }

    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage wxaLiteAppWidgetCreateStoreMessage, java.lang.String str, long j17, boolean z17, long j18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = wxaLiteAppWidgetCreateStoreMessage.appId;
        }
        if ((i17 & 2) != 0) {
            j17 = wxaLiteAppWidgetCreateStoreMessage.aliveSeconds;
        }
        long j19 = j17;
        if ((i17 & 4) != 0) {
            z17 = wxaLiteAppWidgetCreateStoreMessage.waitDownload;
        }
        boolean z18 = z17;
        if ((i17 & 8) != 0) {
            j18 = wxaLiteAppWidgetCreateStoreMessage.downloadTimeout;
        }
        return wxaLiteAppWidgetCreateStoreMessage.copy(str, j19, z18, j18);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAliveSeconds() {
        return this.aliveSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getWaitDownload() {
        return this.waitDownload;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDownloadTimeout() {
        return this.downloadTimeout;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage copy(java.lang.String appId, long aliveSeconds, boolean waitDownload, long downloadTimeout) {
        kotlin.jvm.internal.o.g(appId, "appId");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage(appId, aliveSeconds, waitDownload, downloadTimeout);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage wxaLiteAppWidgetCreateStoreMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage) other;
        return kotlin.jvm.internal.o.b(this.appId, wxaLiteAppWidgetCreateStoreMessage.appId) && this.aliveSeconds == wxaLiteAppWidgetCreateStoreMessage.aliveSeconds && this.waitDownload == wxaLiteAppWidgetCreateStoreMessage.waitDownload && this.downloadTimeout == wxaLiteAppWidgetCreateStoreMessage.downloadTimeout;
    }

    public final long getAliveSeconds() {
        return this.aliveSeconds;
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final long getDownloadTimeout() {
        return this.downloadTimeout;
    }

    public final boolean getWaitDownload() {
        return this.waitDownload;
    }

    public int hashCode() {
        return (((((this.appId.hashCode() * 31) + java.lang.Long.hashCode(this.aliveSeconds)) * 31) + java.lang.Boolean.hashCode(this.waitDownload)) * 31) + java.lang.Long.hashCode(this.downloadTimeout);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.appId, java.lang.Long.valueOf(this.aliveSeconds), java.lang.Boolean.valueOf(this.waitDownload), java.lang.Long.valueOf(this.downloadTimeout));
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetCreateStoreMessage(appId=" + this.appId + ", aliveSeconds=" + this.aliveSeconds + ", waitDownload=" + this.waitDownload + ", downloadTimeout=" + this.downloadTimeout + ')';
    }
}
