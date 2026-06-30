package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetReleaseStoreMessage;", "", "appId", "", "(Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetReleaseStoreMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage.Companion(null);
    private final java.lang.String appId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetReleaseStoreMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetReleaseStoreMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage((java.lang.String) obj);
        }
    }

    public WxaLiteAppWidgetReleaseStoreMessage(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.appId = appId;
    }

    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage wxaLiteAppWidgetReleaseStoreMessage, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = wxaLiteAppWidgetReleaseStoreMessage.appId;
        }
        return wxaLiteAppWidgetReleaseStoreMessage.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage copy(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage(appId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage) && kotlin.jvm.internal.o.b(this.appId, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage) other).appId);
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public int hashCode() {
        return this.appId.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(this.appId);
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetReleaseStoreMessage(appId=" + this.appId + ')';
    }
}
